package ex;

import javax.swing.JOptionPane;

public class ThreadMain3 {
	
	public static void main(String[]args) {
		
		System.out.println("프로그램을 시작합니다. ");
		
		//사용자로부터 값을 받고싶을경우 JOptionPane 사용
		String input = JOptionPane.showInputDialog("사용자의 이름을 입력해주세요. ");
		
		//카운트 다운을 위한 for문
		for(int i = 0 ; i >0; i--) {
			System.out.println(i);
		
			//Thread의 sleep메서드 사용, 10초동안
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(input);
		
	}

}
