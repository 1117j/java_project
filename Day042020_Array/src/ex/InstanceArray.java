package ex;

public class InstanceArray {

	public static void main(String[] args) {
		
		String[] strArr= new String[3];
		strArr[0] = new String("JAVA");
		strArr[1] = new String("sucks");
		strArr[2] = new String("the worst");
		
		for(int i = 0; i < strArr.length; i++) {
		System.out.println(strArr[i]);}

	}

}
