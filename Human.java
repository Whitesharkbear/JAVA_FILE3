package Test;

//��� Ŭ����(Ver.2)
public class Human {
	private String name;	//�̸�
	private int height;		//����
	private int weight;		//ü��

	//--������ --//
	Human(String n, int h, int w){
		name = n; height = h; weight=w;
	}
	
	String getName() { return name;}	//�̸� ��������
	int getHeight()  { return height;}	//���� �ҷ�����
	int getWeight()	 { return weight;}	//ü�� �ҷ�����
	
	void gainWeight(int w)	{weight += w;}//���� ���
	void reduceWeight(int w) {weight -= w;}//���� ������
	}