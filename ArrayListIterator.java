package ch16;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<String>();
		data.add("aaa");
		data.add("bbb");
		data.add("ccc");
		Iterator<String> i = data.iterator();//iterator생성코드로 컬렉션이
		//iterator()메서드는 호출한 컬렉션 요소에 연결된 Iterator를 반환.
		
		while (i.hasNext()) {//while의 조건으로 hasNext()를 사용했는데,
		//데이터가 있는 동안은 true를 반환하므로 컬렉션에 저장된 데이터의 개수만큼 반복.	
			
			System.out.println(i.next());//next()를 호출해 컬렉션 요소를
										//하나씩 읽어와 콘솔에 출력한다.
		}
		
	}

}
