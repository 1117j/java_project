package ex;

public class HashSetTest2 {

	public static void main(String[] args) {
		
		HashSet<SimpleNumber> set = new HashSet<SimpleNumber>();
		
		class SimpleNumber{
			int num;
					}
		
		public SimpleNumber(int num)
		
		
		
		
		
		public String toString(){
			return String.valueOf(num);
		}
		
		public boolean equals(Object obj){
			boolean result = false;
			
			//num의 값을 비교 
			
			if(obj instanceof SimpleNumber) {
				SimpleNumber sm = (SimpleNumber)obj;
				result = this.num == sm.num;
			
			}						
			
			return result;
			
			
		}
		
		

	}

}
