package com.packages.FleetStudios;
import java.sql.*;
public class test {

	public static void main(String[] args) {
		
		Connection conn = DatabaseCon.connect();
		/*
		ResultSet rs = DatabaseCon.getQuery(conn, "SELECT * FROM paco");
		
		try {
			System.out.println(rs.getString("pepe"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		Tablero t =new Tablero();
		System.out.println(t.toString());
		
	}

}
