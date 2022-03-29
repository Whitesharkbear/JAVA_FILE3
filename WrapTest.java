package ch14;

public class WrapTest {
	public Object[] arr = new Object[10];//object타입의 배열을 생성
	//object는 모든 클래스의 상위 클래스이므로 모든 클래스의 객체를 
	//업캐스팅하여 이배열에 저장할 수 있다.
	public int cnt; //배열에 저장되는 데이터의 개수를 카운트 할 변수.

	public void add(Object obj) {//arr배열에 object객체를 추가한다.
		arr[cnt++] = obj;
	}

	public void print() {//arr배열에 저장된 데이터를 출력한다.
		int i;
		for (i = 0; i < cnt; i++) {
			Object o = arr[i];//배열에서 객체를 하나씩 꺼내 객체 o에저장
			if (o instanceof Integer) {//꺼낸객체가 Integer형 객체인지 확인
				System.out.println(((Integer) o).intValue());
			} else if (o instanceof Float) {//꺼낸객체가 Float형이면
				System.out.println(((Float) o).floatValue());
				//floatValue()메서드로 Float객체를 float형 기본타입으로 변환.
			}
		}
	}
}
