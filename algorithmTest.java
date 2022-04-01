package ch16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class algorithmTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();//10~13은
		list.add("sd");	//ArrayList를 생성하여 문자열 세 개를 저장한다.
		list.add("abr");
		list.add("tu");

		System.out.println("정렬");
		Collections.sort(list);//메서드는 파라메터로 전달한 리스트의 값을 오름차순로정렬
		Iterator<String> i = list.iterator();
		while (i.hasNext()) {//18~20정렬된 결과를 확인하기 위해 리스트 요소를 출력
			System.out.println(i.next()); //이때 Iterator를 사용.
		}

		System.out.println("\n검색");
		int idx = -1;
		idx = Collections.binarySearch(list, "abr");//메서드는 검색메서드로 
//첫번째 파라메터인 리스트에서 두 번째 파라메터의 값을 검색. 검색 결과는 위치값을 반환.
		if (idx < 0) {//26~30검색 결과가 음수이면 없다는 메시지를 출력하고,
			System.out.println("없다.");//0이상이면 위치와 값을 출력한다.
		} else {
			System.out.println(idx + "위치에 데이타 " + list.get(idx) + "가 있다.");
		}

		System.out.println("\n섞기(shuffle)");
		Iterator<String> i2 = list.iterator();
		Collections.shuffle(list);//리스트 요소를 섞는다.
		while (i2.hasNext()) {//35~37은 섞은 결과를 확인하기 위해 리스트 요소를 모두 출력.
			System.out.println(i2.next());
		}

	}

}
