package ch17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/ch17/files/a.txt");
		BufferedInputStream bin = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("src/ch17/files/b.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fos);
		int buf;
		while ((buf = bin.read()) != -1) {
			System.out.print((char) buf);
			bout.write(buf);
		}

		bin.close();
		bout.close();

		FileReader fr = new FileReader("src/ch17/files/c.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("src/ch17/files/d.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println("\n\n���ڴ���(2����Ʈ ����)�� �о��� ��");
		while ((buf = br.read()) != -1) {
			System.out.print((char) buf);
			bw.write(buf);
		}

		br.close();
		bw.close();
	}

}
