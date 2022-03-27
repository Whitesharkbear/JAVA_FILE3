package ch12;

public class AnimalAction {
	public void action(Animal animal) { // 파라메터에서 업캐스팅
		animal.cry();
		if (animal instanceof Dog) { // 객체 타입 비교
			((Dog) animal).run(); // 다운캐스팅
		} else if (animal instanceof Cat) { // 객체 타입 비교
			((Cat) animal).grooming(); // 다운캐스팅
		}
	}
}
