package com.packages.FleetStudios;

public class AllTests {

	public static void main(String[] args) {
		AppTest at = new AppTest();
		at.birthDateNotNull();
		at.emailNotNull();
		at.isMusicNull();
		at.nickNotNull();
		at.passwordNotNull();
		at.testEscucharMusica();
		at.testIniciarSesionElCorreoNoEstaVacio();
		at.testIniciarSesionLaContrasenaNoEstaVacia();

		
		CardsTest ct = new CardsTest();
		ct.getAmount();
		ct.getDesc();
		ct.getName();
		
		DatabaseTests dt = new DatabaseTests();
		//dt.getRs();
		dt.getUpdateSql();
		dt.isValidCon();
		//dt.isValidSta();
		
		CoorTests ctt = new CoorTests();
		ctt.eqCoor();
		ctt.wellInit();
		ctt.posValid();
	}

}
