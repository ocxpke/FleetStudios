package com.packages.FleetStudios;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseCon {

	protected static Connection connect() {
		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:sqlite:database.db");
		} catch (SQLException e) {
			System.err.println(e);
		}

		return conn;
	}

	protected static ResultSet getQuery(Connection conn, String q) {
		ResultSet rs = null;
		Statement sta = null;
		
		if (conn == null) {
			return rs;
		}
		
		try {
			sta = conn.createStatement();
			rs = sta.executeQuery(q);
		} catch (SQLException e) {
			System.out.println(e);
		}

		return rs;
	}
}
