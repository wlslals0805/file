package oop.inherit3;

public class Test01 {

	public static void main(String[] args) {
		
		Chrome a= new Chrome();
		
		a.refresh();
		a.move();
		a.develop();
		a.chromeStore();
		
		Edge b =new Edge();
		
		b.refresh();
		b.move();
		b.fullScreen();
		
		Whale c= new Whale();
		c.refresh();
		c.move();
		c.naverSearch();
		c.papago();
	}

}
