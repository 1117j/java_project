package ex;

public class LinkedTest {

	public static void main(String[] args) {
	
		String str1 = "one";
		String str2 = "Two";
		String str3 = "Three";
		
		Data d1 = new Data(str1, str2);
		Data d2 = new Data(str2, str3);
		Data d3 = new Data(str3, str1);
	}

}

	
class Data{
	
	Object value; 
	Object nextValue;
	
	Data(Object obj, Object something)
	
}
