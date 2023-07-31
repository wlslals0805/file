package jdbc.dto;

import java.sql.Date;

public class BookDto {
	private int bookId ;
	private String bookTitle;
	private String bookAuthor ;
	private Date bookPublicationDate ;
	private float bookPrice ;
	private String bookPublisher ;
	private int bookPageCount ;
	private String bookGenre ;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public Date getBookPublicationDate() {
		return bookPublicationDate;
	}
	public void setBookPublicationDate(Date bookPublicationDate) {
		this.bookPublicationDate = bookPublicationDate;
	}
	public float getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	public int getBookPageCount() {
		return bookPageCount;
	}
	public void setBookPageCount(int bookPageCount) {
		this.bookPageCount = bookPageCount;
	}
	public String getBookGenre() {
		return bookGenre;
	}
	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}
	@Override
	public String toString() {
		return "BookDto [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor
				+ ", bookPublicationDate=" + bookPublicationDate + ", bookPrice=" + bookPrice + ", bookPublisher="
				+ bookPublisher + ", bookPageCount=" + bookPageCount + ", bookGenre=" + bookGenre + "]";
	}
	public BookDto() {
		super();
	}


}
