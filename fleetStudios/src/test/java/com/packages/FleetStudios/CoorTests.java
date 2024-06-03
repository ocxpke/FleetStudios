package com.packages.FleetStudios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoorTests {

	Coordenadas x;

	@BeforeEach
	public void init() {

	}

	@AfterEach
	public void terminate() {
		x = null;
	}

	@Test
	public void wellInit() {
		x = new Coordenadas(7, 8);
		assertEquals("7,8", x.toString());
	}

	@Test
	public void eqCoor() {
		x = new Coordenadas(7, 8);
		Coordenadas y = new Coordenadas(8, 7);
		assertFalse(x.iguales(y));
	}

	@Test
	public void posValid() {
		x = new Coordenadas(7, 8);
		Coordenadas y = new Coordenadas(7, 7);
		assertTrue(x.posValid(y));
	}

}
