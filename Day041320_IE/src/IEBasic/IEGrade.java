package IEBasic;

public class IEGrade {

	public static void main(String[] args) {
		int score = 99;
		
		String Grade = "";
		
		// 100~98: A+,  97~94: A,  93~90: A-,)  
//		if (score >=98 && score <= 100) {
//			Grade = "A+";
//		}
//		if(score >=94 && score <=97) {
//			Grade = "A";					
//		}
//		if(score >=90 && score <=93) {
//			Grade = "A-";
//		}
		if (score>=90) {
			Grade = "A";
			
			if (score >= 98) {
				Grade = Grade +"+";
			} else if (score < 94) { //90이상
				Grade += "-";
		}else if (score>= 80) {// 90 >score>= 80
			Grade = "B";
			if(score >=88) {
				Grade += "+";
			}else if (score <88) {
				Grade += "-";
			}
			else { 
				Grade = "C";
		}
		}	
		}

	}

}
