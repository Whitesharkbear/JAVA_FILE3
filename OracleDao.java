package ch20.productDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class OracleDao implements Dao {

	private Connection conn;
	private PreparedStatement pstmt = null;

	public OracleDao() {
		DBConnect dbconn = DBConnect.getInstance();
		conn = dbconn.getConnection();
	}

	public Connection getConn() {
		return conn;
	}

	@Override
	public void insert(Product p) {
		// TODO Auto-generated method stub
		String sql = "insert into product(num, name, price) values(product_seq.nextval,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			// pstmt.setInt(1, p.getNum());
			pstmt.setString(1, p.getName());
			pstmt.setInt(2, p.getPrice());
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		String sql = "delete product where num=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			num = pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update(int num, Product p) {
		// TODO Auto-generated method stub
		String sql = "update product set name=?, price=? where num=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getName());
			pstmt.setInt(2, p.getPrice());
			pstmt.setInt(3, p.getNum());
			num = pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Product select(int num) {
		// TODO Auto-generated method stub
		Product p = null;
		ResultSet rs = null;
		String sql = "select * from product where num=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3));
			}
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public Vector<Product> selectAll() {
		// TODO Auto-generated method stub
		System.out.println("oracle selectAll");
		Vector<Product> v = new Vector<Product>();
		ResultSet rs = null;
		String sql = "select * from product";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				v.add(new Product(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return v;
	}

}
