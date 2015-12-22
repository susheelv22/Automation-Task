package groupTestNG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class getDataConnection {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			String connectionUrl = "jdbc:sqlserver://172.16.3.211;"
					+ "databaseName=TestDB;user=IWIS;password=Espire@4321;";
			Connection con = DriverManager.getConnection(connectionUrl);

			String SQL = "select id,name,age,salary from salesperson";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);

			while (rs.next()) {
				int Empid = rs.getInt("id");
				String FirstName = rs.getString("name");
				int age = rs.getInt("Age");
				String salary = rs.getString("salary");

				System.out.print("customer : " + Empid + " name :" + FirstName
						+ "  age :" + age + "salary :" + salary + "\n");

			}

			while (rs.next()) {
				/* System.out.println(rs.getString("name")); */

			}
			rs.close();
			stmt.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
