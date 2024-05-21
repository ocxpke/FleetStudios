package com.packages.FleetStudios;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseCon {

	// Connectamos la base de datos
	protected static Connection connect() {
		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:sqlite:database.db");
		} catch (SQLException e) {
			System.err.println(e);
		}

		return conn;
	}

	// Connectamos el statement
	protected static Statement statement(Connection conn) {
		Statement sta = null;
		try {
			sta = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sta;
	}

	// Para selects
	protected static ResultSet getQuery(Connection conn, Statement sta, String q) {
		ResultSet rs = null;

		if (conn == null || sta == null) {
			return rs;
		}

		try {
			sta = conn.createStatement();
			rs = sta.executeQuery(q);
		} catch (SQLException e) {
			System.err.println(e);
		}

		return rs;
	}

	// Para insertar, modificar, o borrar
	protected static int insertQuery(Connection conn, Statement sta, String q) {
		int ret = -1;

		if (conn == null || sta == null) {
			return ret;
		}

		try {
			ret = sta.executeUpdate(q);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ret;
	}
}
