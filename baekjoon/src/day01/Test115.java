package day01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Test115 {
	public List<Integer> solution(int k, int[] score) {

		List<Integer> list = new ArrayList<>();
		List<Integer> answer = new ArrayList<>();

		for (int i = 0; i < score.length; i++) {

			list.add(score[i]);

			Collections.sort(list);
			Collections.reverse(list);

			if (list.size() >= k) {
				list = list.subList(0, k);

			}

			answer.add(list.get(list.size() - 1));

		}

		return answer;
	}
	
	

	public List<Integer> solution2(int k, int[] score) {
	    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	    List<Integer> answer = new ArrayList<>();

	    for (int s : score) {
	        if (minHeap.size() < k) { 
	            minHeap.add(s);
	        } else if (s > minHeap.peek()) { 
	            minHeap.poll();
	            minHeap.add(s);
	        }
	        
	        if (minHeap.size() == k) {
	            answer.add(minHeap.peek());
	        } else {
	           
	            answer.add(-1); 
	        }
	    }
	    return answer;
	}

}
