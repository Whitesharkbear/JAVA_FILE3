package ch20.productDb;

import java.util.Scanner;
import java.util.Vector;

public class ServiceImpl implements Service {
	Scanner sc = new Scanner(System.in);
	Dao dao = new OracleDao();

	@Override
	public void addProduct() {
		// TODO Auto-generated method stub
		System.out.print("��ǰ�̸�:");
		String name = sc.next();
		System.out.print("��ǰ����:");
		int price = sc.nextInt();

		dao.insert(new Product(0, name, price));

	}

	@Override
	public void editProduct() {
		// TODO Auto-generated method stub
		System.out.print("������ ��ǰ��ȣ:");
		int num = sc.nextInt();
		Product p = dao.select(num);
		if (p == null) {
			System.out.println("�ش� ��ǰ�� ����.");
		} else {
			System.out.println(p);
			System.out.print("�� ��ǰ�̸�:");
			String name = sc.next();
			System.out.print("�� ��ǰ����:");
			int price = sc.nextInt();

			p.setName(name);
			p.setPrice(price);
			dao.update(p.getNum(), p);
		}
	}

	@Override
	public void delProduct() {
		// TODO Auto-generated method stub
		System.out.print("������ ��ǰ��ȣ:");
		int num = sc.nextInt();
		dao.delete(num);
	}

	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		System.out.print("�˻��� ��ǰ��ȣ:");
		int num = sc.nextInt();
		Product p = dao.select(num);
		return p;
	}

	@Override
	public Vector<Product> getProducts() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

}
