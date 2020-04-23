package op;
import java.util.Scanner;

public class RoomSearch {

	public static void main(String[] args) {
		int stuNum = 1;
		
		int roomNum = 0;  
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 번호는 무엇입니까?");
		
		stuNum = sc.nextInt();
		
		roomNum = stuNum % 10;
		
		System.out.println("room#: "+ roomNum); 
		
		}
		
	}


