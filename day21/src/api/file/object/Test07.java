package api.file.object;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test07 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Player p = new Player("박진희");
		
		File target = new File("sample/Player.kh");
		FileOutputStream stream = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(stream);
		ObjectOutputStream obj = new ObjectOutputStream(buffer);
		
		obj.writeObject(p);
		
		obj.close();
		
		Player p1 = new Player("박진희");
		
		File target1 = new File("sample/Player.kh");
		FileInputStream stream1 = new FileInputStream(target1);
		BufferedInputStream buffer1 = new BufferedInputStream(stream1);
		ObjectInputStream obj1 = new ObjectInputStream(buffer1);
		
		obj1.readObject();
		
		
		
		
		
		
		
	}

}
