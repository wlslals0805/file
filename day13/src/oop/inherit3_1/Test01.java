package oop.inherit3_1;

public class Test01 {

	public static void main(String[] args) {
		
		//Browser는 생성하면 안된다

				Chrome c = new Chrome();
				c.setUrl("https://www.google.com");
				c.move();
				c.refresh();
				c.developer();
				c.chromeStore();

				Edge e = new Edge();
				e.setUrl("https://www.google.com");
				e.move();
				e.refresh();
				e.fullScreen();

				Whale w = new Whale();
				w.setUrl("https://www.google.com");
				w.move();
				w.refresh();
				w.papago();
				w.naverSearch();
	}

}
