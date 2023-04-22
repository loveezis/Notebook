package ex2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ex3 {

	public static void main(String[] args) {
		DataResult dr = new DataResult();
		try {
			dr.result();
		} catch (Exception e) {
			System.out.println("메소드오류");
			e.printStackTrace();
		}
	}

}

class DataResult {

	public void result() throws Exception {
		try(
		BufferedInputStream inputBuff = new BufferedInputStream(
				new FileInputStream("C:\\sajin\\herin.jpg"));
		BufferedOutputStream outputBuff = new BufferedOutputStream(
				new FileOutputStream("C:\\sajin\\cuteherin.jpg"))){
		
		byte[] data = new byte[1024];
		int length = 0;
		
		while((length = inputBuff.read(data)) > 0 ) {
			outputBuff.write(data,0,length);
			
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

