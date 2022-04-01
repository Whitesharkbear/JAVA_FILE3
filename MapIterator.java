package ch16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterator {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("학교명", "대한민국학교");//10~13맵을 생성하고,3쌍의 값을 저장
		map.put("학과명", "컴퓨터 공학과");
		map.put("학년", "3학년");

		String key, value;
		System.out.println("iterator를 key에 연결");//17번줄은 key에 연결된
		Iterator<String> keyIterator = map.keySet().iterator();//Iterator를 생성
		while (keyIterator.hasNext()) {//key가 있을때까지 반복하라는 의미.
			key = keyIterator.next();//key를 하나씩 읽어 변수 key에 저장.
			value = map.get(key); //key의 값을 읽어 변수 value에 저장.
			System.out.println(key + ":" + value);//19~20저장한 key와 value 출력.
		}

		System.out.println("\niterator를 value에 연결");//25번줄은 value에 연결된
		Iterator<String> valueIterator = map.values().iterator();//Iterator를생성
		while (valueIterator.hasNext()) {//26~28줄은value가 있는 한 반복하여 value를
			System.out.println(valueIterator.next());//하나씩 읽어 출력.
		}
		
	}

}
