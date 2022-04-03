package ch17;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("src/ch17/files/c.txt");
		int buf;
		System.out.println("����Ʈ ������ �о��� ��");
		while ((buf = fis.read()) != -1) {
			System.out.print((char) buf);
		}
		fis.close();

		FileReader fr = new FileReader("src/ch17/files/c.txt");
		FileWriter fw = new FileWriter("src/ch17/files/d.txt");
		System.out.println("\n\n���ڴ���(2����Ʈ ����)�� �о��� ��");
		while ((buf = fr.read()) != -1) {
			System.out.print((char) buf);
			fw.write(buf);
		}
		fr.close();
		fw.close();
	}

}
