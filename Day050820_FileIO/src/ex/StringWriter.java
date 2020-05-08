package ex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriter {

	public static void main(String[] args) throws IOException {

		//라이터는 문자기반의 스트림이다.
		FileWriter fw = new FileWriter("news.txt");
		BufferedWriter bw = new BufferedWriter(fw);
	
		bw.write("안녕하세요 이혜진입니다.");
		bw.newLine();
		bw.write("저는 전역을 하지 않았습니다.");
		bw.newLine();
		bw.write("왜나면 미필이기 때문이죠ㅋㅋㄷㅋㄷ");
		
		bw.close();
		System.out.println("기사작성완료 ");

	}

}
