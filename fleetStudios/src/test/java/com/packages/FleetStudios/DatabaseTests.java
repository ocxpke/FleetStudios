package com.packages.FleetStudios;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DatabaseTests {

	private Connection con;
	private Statement sta;

	@BeforeEach
	public void init() {

	}

	@AfterEach
	public void terminate() {
		try {
			con.close();
			sta.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	@Test
	public void isValidCon() {
		con = DatabaseCon.connect();
		try {
			assertEquals(con.isValid(500), DatabaseCon.connect().isValid(500));
		} catch (SQLException e) {
			System.err.println(e);
		}
	}
	/*
	 * @Test public void isValidSta() { con = DatabaseCon.connect(); try {
	 * assertEquals(sta = DatabaseCon.statement(con), DatabaseCon.statement(con)); }
	 * catch (Exception e) { System.err.println(e); } }
	 * 
	 * 
	 * @Test public void getRs() { con = DatabaseCon.connect(); sta =
	 * DatabaseCon.statement(con); ResultSet rs; ResultSet rs1 =
	 * DatabaseCon.getQuery(DatabaseCon.connect(),
	 * DatabaseCon.statement(DatabaseCon.connect()), "SELECT * FROM USERS"); try {
	 * assertEquals(rs = DatabaseCon.getQuery(con, sta, "SELECT * FROM USERS"),
	 * rs1); } catch (Exception e) { System.err.println(e); } }
	 */

	@Test
	public void getUpdateSql() {
		con = DatabaseCon.connect();
		sta = DatabaseCon.statement(con);
		int i;
		int i1 = DatabaseCon.modifyQuery(DatabaseCon.connect(), DatabaseCon.statement(DatabaseCon.connect()),
				"SELECT * FROM USERS");
		try {
			assertEquals(i = DatabaseCon.modifyQuery(con, sta, "SELECT * FROM USERS"), i1);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
