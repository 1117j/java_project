package card;

public class CardMain2 {

	public static void main(String[] args) {
		
		for (int i=0; i<4; i++) {
			for(int j=1; j<14; j++) {
				
				String kind = " ";
				
				switch(i) {
				case 0:
					kind = "spade";
				break;
				case 1:
					kind = "heart";
				break;
				case 2:
					kind = "diamond";
				break;
				case 3:
					kind = "clover";
				break;
				}
			Card cc= new Card();
			cc.kind = kind;
			cc.number = j;
			System.out.println(cc.kind+"와"+cc.number);
	}	
			
	}
 }
}
		
