package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.JDBCUtil;

public class TestJDBCUtil {
	public static void main(String[] args) {
		try {
			//Bước 1: Tạo kết nối
			Connection connection = JDBCUtil.getConnection();
			
			//Bước 2: Tạo ra đối tượng statment
			Statement st = connection.createStatement();
			
			//Bước 3: Thực thi câu lệnh sql
			String sql = "insert into student (id, username, address) value (7,'harry porter','hai phong city');";
			int check = st.executeUpdate(sql);
			
			//Bước 4: Xử lý kết quả
			System.out.println("số dòng thay đổi: " + check);
			if(check>0) {
				System.out.println("Thêm dữ liệu thành công");
			}else System.out.println("Thêm dữ liệu thất bại");
			//Bước 5: Ngắt kết nối
			JDBCUtil.closeConnection(connection);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
