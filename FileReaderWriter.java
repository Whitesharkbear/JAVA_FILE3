package ch17;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("src/ch17/files/c.txt");
		int buf;
		System.out.println("바이트 단위로 읽었을 때");
		while ((buf = fis.read()) != -1) {
			System.out.print((char) buf);
		}
		fis.close();

		FileReader fr = new FileReader("src/ch17/files/c.txt");
		FileWriter fw = new FileWriter("src/ch17/files/d.txt");
		System.out.println("\n\n문자단위(2바이트 단위)로 읽었을 때");
		while ((buf = fr.read()) != -1) {
			System.out.print((char) buf);
			fw.write(buf);
		}
		fr.close();
		fw.close();
	}

}
