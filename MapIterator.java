package ch16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterator {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("�б���", "���ѹα��б�");//10~13���� �����ϰ�,3���� ���� ����
		map.put("�а���", "��ǻ�� ���а�");
		map.put("�г�", "3�г�");

		String key, value;
		System.out.println("iterator�� key�� ����");//17������ key�� �����
		Iterator<String> keyIterator = map.keySet().iterator();//Iterator�� ����
		while (keyIterator.hasNext()) {//key�� ���������� �ݺ��϶�� �ǹ�.
			key = keyIterator.next();//key�� �ϳ��� �о� ���� key�� ����.
			value = map.get(key); //key�� ���� �о� ���� value�� ����.
			System.out.println(key + ":" + value);//19~20������ key�� value ���.
		}

		System.out.println("\niterator�� value�� ����");//25������ value�� �����
		Iterator<String> valueIterator = map.values().iterator();//Iterator������
		while (valueIterator.hasNext()) {//26~28����value�� �ִ� �� �ݺ��Ͽ� value��
			System.out.println(valueIterator.next());//�ϳ��� �о� ���.
		}
		
	}

}
