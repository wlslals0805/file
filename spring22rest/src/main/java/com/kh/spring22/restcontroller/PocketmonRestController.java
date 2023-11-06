package com.kh.spring22.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring22.dao.PocketmonDao;
import com.kh.spring22.dto.PocketmonDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

//문서용 annotation
@Tag(name = "포켓몬스터 리액트용 백엔드", description = "피카츄~")

@CrossOrigin
//@CrossOrigin(value = {"http://localhost:3000", "http://localhost:5500"})
@RestController
@RequestMapping("/pocketmon")
public class PocketmonRestController {

//	아래 다섯 개의 매핑을 이용하여 프론트엔드에 대응하는 Rest 기능을 구현
//	@GetMapping - 조회
//	@PostMapping - 등록
//	@PutMapping - 전체 수정
//	@PatchMapping - 일부 수정
//	@DeleteMapping - 삭제
	
	@Autowired
	private PocketmonDao pocketmonDao;
	
	//목록 매핑에 대한 설명용 annotation
	@Operation(
		description = "포켓몬스터 조회",
		responses = {
			@ApiResponse(
				responseCode = "200",
				description = "조회 성공",
				content = {
					@Content(
						mediaType = "application/json",
						array = @ArraySchema(
							schema = @Schema(implementation = PocketmonDto.class)
						)
					)
				}
			),
			@ApiResponse(
				responseCode = "500",
				description = "서버 오류",
				content = @Content(
					mediaType = "text/plain",
					schema = @Schema(implementation = String.class),
					examples = @ExampleObject("server error")
				)
			)
		}
	)
	
	
	@GetMapping("/")
	public List<PocketmonDto> list() {
		return pocketmonDao.selectList();
	}
	
	//등록 매핑에 대한 설명용 annotation
	@Operation(
		description = "포켓몬스터 신규 생성",
		responses = {
			@ApiResponse(
				responseCode = "200",
				description = "포켓몬스터 생성 완료"
			),
			@ApiResponse(
				responseCode = "400",
				description = "전송한 파라미터가 서버에서 요구하는 값과 다름"
			), 
			@ApiResponse(
				responseCode = "500",
				description = "서버 오류 발생"
			)
		}
	)
	
	@PostMapping("/")
	//public void insert(@ModelAttribute PocketmonDto pocketmonDto) {//form-data 수신용
	public void insert(
			@Parameter(
				description = "생성할 몬스터명/타입 객체",
				required = true,
				schema = @Schema(implementation = PocketmonDto.class)
			)
			@RequestBody 
			PocketmonDto pocketmonDto) {//request body 직접 해석(ex : JSON)
		pocketmonDao.insert(pocketmonDto);
	}
	
	@Operation(
			description = "포켓몬스터 삭제",
			responses = {
				@ApiResponse(
					responseCode = "200",
					description = "삭제 성공",
					content = @Content(
						schema = @Schema(implementation = Void.class)
					)
				),
				@ApiResponse(
					responseCode = "404",
					description = "대상을 찾을 수 없음",
					content = @Content(
						schema = @Schema(implementation = Void.class)
					)
				),
				@ApiResponse(
					responseCode = "500",
					description = "서버 오류",
					content = @Content(
						mediaType = "text/plain", 
						schema = @Schema(implementation = String.class),
						examples = @ExampleObject("server error")
					)
				)
			}
		)

	//파라미터는 주소가 매우 지저분해지므로 최대한 경로변수를 활용
	@DeleteMapping("/{no}")
	//public boolean delete(@PathVariable int no) {//데이터를 반환하면 상태설정이 불가능
	public ResponseEntity<String> delete(
			@Parameter(description = "삭제할 몬스터 번호")
			@PathVariable int no) {//상태 설정이 가능한 객체를 반환
		boolean result = pocketmonDao.delete(no);
		if(result) {
			//return ResponseEntity.ok().build();
			return ResponseEntity.status(200).build();
		}
		else {
			//return ResponseEntity.notFound().build();
			return ResponseEntity.status(404).build();
		}
	}
	
	@Operation(
		description = "포켓몬스터 상세조회",
		responses = {
			@ApiResponse(
				responseCode = "200",
				description = "조회 성공",
				content = @Content(
					schema = @Schema(implementation = PocketmonDto.class)
				)
			),
			@ApiResponse(
				responseCode = "404",
				description = "대상을 찾을 수 없음",
				content = @Content(
					schema = @Schema(implementation = Void.class)
				)
			),
			@ApiResponse(
				responseCode = "500",
				description = "서버 오류",
				content = @Content(
					mediaType = "text/plain", 
					schema = @Schema(implementation = String.class),
					examples = @ExampleObject("server error")
				)
			)
		}
	)
	
	@GetMapping("/{no}")
	public ResponseEntity<PocketmonDto> find(
			@Parameter(description = "조회할 몬스터 번호")
			@PathVariable int no) {
		PocketmonDto pocketmonDto = pocketmonDao.selectOne(no);
		if(pocketmonDto != null) {
			//return ResponseEntity.ok(pocketmonDto);
			return ResponseEntity.ok().body(pocketmonDto);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@Operation(
			description = "포켓몬스터 전체 정보 수정",
			responses = {
				@ApiResponse(
					responseCode = "200",
					description = "수정 성공",
					content = @Content(
						schema = @Schema(implementation = Void.class)
					)
				),
				@ApiResponse(
					responseCode = "404",
					description = "대상을 찾을 수 없음",
					content = @Content(
						schema = @Schema(implementation = Void.class)
					)
				),
				@ApiResponse(
					responseCode = "500",
					description = "서버 오류",
					content = @Content(
						mediaType = "text/plain", 
						schema = @Schema(implementation = String.class),
						examples = @ExampleObject("server error")
					)
				)
			}
		)
	
	@PutMapping("/{no}")
	public ResponseEntity<String> edit(
			@Parameter(description = "수정할 몬스터번호")
			@PathVariable int no, 
			@Parameter(description = "수정할 몬스터정보")
			@RequestBody PocketmonDto pocketmonDto) {
		boolean result = pocketmonDao.edit(no, pocketmonDto);
		return result ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
	}
	
	@Operation(
			description = "포켓몬스터 항목별 수정",
			responses = {
				@ApiResponse(
					responseCode = "200",
					description = "수정 성공",
					content = @Content(
						schema = @Schema(implementation = Void.class)
					)
				),
				@ApiResponse(
					responseCode = "404",
					description = "대상을 찾을 수 없음",
					content = @Content(
						schema = @Schema(implementation = Void.class)
					)
				),
				@ApiResponse(
					responseCode = "500",
					description = "서버 오류",
					content = @Content(
						mediaType = "text/plain", 
						schema = @Schema(implementation = String.class),
						examples = @ExampleObject("server error")
					)
				)
			}
		)
	
	@PatchMapping("/{no}")
	public ResponseEntity<String> editUnit(
			@Parameter(description = "수정할 몬스터번호")
			@PathVariable int no,
			@Parameter(description = "수정할 몬스터정보")
			@RequestBody PocketmonDto pocketmonDto) {
		if(pocketmonDto.isEmpty()) {
			return ResponseEntity.badRequest().build();
		}
		
		boolean result = pocketmonDao.editUnit(no, pocketmonDto);
		return result ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
	}
	
}