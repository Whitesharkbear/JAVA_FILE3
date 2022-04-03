package ch17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectStream {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		ArrayList<Student> data = new ArrayList<Student>();
		data.add(new Student("aaa", 56, 45, 34));
		data.add(new Student("bbb", 99, 87, 65));
		data.add(new Student("ccc", 32, 65, 89));

		String path = "src/ch17/files/MemData.ser";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oout = new ObjectOutputStream(fos);
		int i;
		for (i = 0; i < data.size(); i++) {
			Student s = data.get(i);
			s.eval_avg();
			oout.writeObject(s);
		}

		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream oin = new ObjectInputStream(fis);
		Student s2;
		while ((s2 = (Student) oin.readObject()) != null) {
			System.out.println(s2);
			if (fis.available() == 0) {
				break;
			}
		}

		oout.close();
		oin.close();
	}

}
