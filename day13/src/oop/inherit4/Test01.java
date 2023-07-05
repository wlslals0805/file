package oop.inherit4;

public class Test01 {

	public static void main(String[] args) {
		Mp4 a=  new Mp4();
		Mp3 b= new Mp3();
		Hwp c= new Hwp();
		Ppt d = new Ppt();
		
		a.setFilename("상속.mp4");
		a.setFilesize(100000L);
		a.setSpeed(1.2f);
		a.execute();
		a.forward();
		a.rewind();
		System.out.println();
		b.execute();
		b.forward();
		b.rewind();
		System.out.println();
		c.execute();
		c.preview();
		System.out.println();
		d.execute();
		d.slideShow();
	}

}
