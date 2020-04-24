package ex2;

		class Box{
			public void simpleWrap()
			{System.out.println("simple wrap");}
			}
		
		class PaperBox extends Box{
			public void paperWrap() 
			{System.out.println("paper wrap");}
			}
		class GoldPaperBox extends PaperBox{
			public void goldWrap() 
			{System.out.println("gold wrap");}
			}