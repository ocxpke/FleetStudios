package com.packages.FleetStudios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class convertBlob {

	public static void main(String[] args) throws SQLException {
		Connection conn = DatabaseCon.connect();
		Statement sta = DatabaseCon.statement(conn);
		int i = DatabaseCon.insertQuery(conn, sta,
				"Insert into USERS (nick, email, password, dateBirth, coins) values ( 'joseR', 'jose@gmail.com','1234', '01/01/2000', 77);");
		System.out.println(i);

		ResultSet rs = DatabaseCon.getQuery(conn, sta, "Select * from users");
		System.out.println(rs.getRow());
		while (rs.next()) {
			System.out.println(rs.getString("nick"));
		}
		
		sta.close();
		conn.close();

		System.out.println("Insert into USERS (nick, email, password, dateBirth, coins)"
				+ " values ( 'joseR', 'jose@gmail.com','1234', '01/01/2000', 77);");

	}

}
