package ch16;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<String>();
		data.add("aaa");
		data.add("bbb");
		data.add("ccc");
		Iterator<String> i = data.iterator();//iterator�����ڵ�� �÷�����
		//iterator()�޼���� ȣ���� �÷��� ��ҿ� ����� Iterator�� ��ȯ.
		
		while (i.hasNext()) {//while�� �������� hasNext()�� ����ߴµ�,
		//�����Ͱ� �ִ� ������ true�� ��ȯ�ϹǷ� �÷��ǿ� ����� �������� ������ŭ �ݺ�.	
			
			System.out.println(i.next());//next()�� ȣ���� �÷��� ��Ҹ�
										//�ϳ��� �о�� �ֿܼ� ����Ѵ�.
		}
		
	}

}
