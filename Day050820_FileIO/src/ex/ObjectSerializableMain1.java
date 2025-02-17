package ex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class ObjectSerializableMain1 {

	
	public static void main(String[]args) throws FileNotFoundException{
	
	//객체 저장
	FileOutputStream fo = new FileOutputStream("object.ser");
	
	ObjectOutputStream out = new ObjectOutputStream(fo);
	
	out.writeObject(new Circle(1, 2, 1.2));
	
	out.writeObject(new Circle(3, 6, 3.6));
	
	out.writeObject(new String("String implements Serializable"));
	
	out.close();
	
	System.out.println("인스턴스 데이터가 저장되었습니다. ");
	
	}
	
}
