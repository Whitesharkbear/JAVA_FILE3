package ch12;

public class AnimalAction {
	public void action(Animal animal) { // �Ķ���Ϳ��� ��ĳ����
		animal.cry();
		if (animal instanceof Dog) { // ��ü Ÿ�� ��
			((Dog) animal).run(); // �ٿ�ĳ����
		} else if (animal instanceof Cat) { // ��ü Ÿ�� ��
			((Cat) animal).grooming(); // �ٿ�ĳ����
		}
	}
}
