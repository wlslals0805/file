package day01;

public class Test92 {

	public static void main(String[] args) {

	}

	public int[] solution(String[] park, String[] routes) {

		int startIndex1 = 0;
		int startIndex2 = 0;


		for (int i = 0; i < park.length; i++) {
			for (int a = 0; a < park[i].length(); a++) {


				if (String.valueOf(park[i].charAt(a)).equals("S")) {
					startIndex1 = i;
					startIndex2 = a;
				}
			}
		}

		int[] result = new int[2];

		for (int i = 0; i < routes.length; i++) {

			String direction = routes[i].substring(0, 1);
			int n = Integer.parseInt(routes[i].substring(2));
			boolean pass = false;

			if (direction.equals("E")) {

				if (startIndex2 + n <= park[startIndex1].length() - 1) {

				
					for (int a = startIndex2; a <= startIndex2+n; a++) {

						if (String.valueOf(park[startIndex1].charAt(a)).equals("X")) {
							pass = true;
							break;
						}

					}

					if (!pass) {
						startIndex2 += n;
					}
				}
			} else if (direction.equals("W")) {
				if (startIndex2 - n >= 0) {
				
					for (int a = startIndex2; a >= startIndex2-n; a--) {

						if (String.valueOf(park[startIndex1].charAt(a)).equals("X")) {
							pass = true;
							break;
						}
					}
					if (!pass) {
						startIndex2 = startIndex2-n;
					}
				}
			} else if (direction.equals("S")) {
				if (startIndex1 + n <= park.length - 1) {
				
					for (int b = startIndex1; b <= startIndex1+n; b++) {

						if (String.valueOf(park[b].charAt(startIndex2)).equals("X")) {
							pass = true;
							
							break;
						}

					}
					if (!pass) {
						startIndex1 += n;
					}
				}
			} else if(direction.equals("N")){
				if (startIndex1 - n >= 0) {
				
					for (int b = startIndex1; b >=startIndex1- n; b--) {

						if (String.valueOf(park[b].charAt(startIndex2)).equals("X")) {
							pass = true;
							break;
						}

					}
					if (!pass) {
						startIndex1 = startIndex1-n;
					}
				}
				
			}
		}

		result[0] = startIndex1;
		result[1] = startIndex2;

		return result;

	}

}
