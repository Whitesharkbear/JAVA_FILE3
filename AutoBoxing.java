package ch14;

public class AutoBoxing {

	public static void main(String[] args) {
		Object[] arr = new Object[5];
		int i;
		arr[0] = 15;
		arr[1] = 3.445f;
		arr[2] = 'x';
		arr[3] = "abc";
		arr[4] = true;
		for (i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}//13~15는 배열의 값을 출력하는데, 여기서도 마찬가지로 원래 객체를 출력하면
		//참조값이 출력되지만, 자동언박싱이 처리되어 기본 타입의 값을 꺼내 출력.
	
	}

}
//자동박싱-기본 타입을 객체로 변환하는 것을 컴파일러가 자동으로 해주는 것.
//자동언박싱-래퍼클래스를 자동으로 기본 타입으로 변환 하는 것.