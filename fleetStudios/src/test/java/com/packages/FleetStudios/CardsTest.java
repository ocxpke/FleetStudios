package com.packages.FleetStudios;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.ImageIcon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CardsTest {

	PanelItemInv pi;

	@BeforeEach
	void setUp() throws Exception {
		byte[] b = { (byte) 111111 };
		ImageIcon im = new ImageIcon(b);
		pi = new PanelItemInv("PepePaco", im, "Es un objeto", 7);
	}

	@AfterEach
	void tearDown() throws Exception {
		pi = null;
	}

	@Test
	void getName() {
		byte[] b = { (byte) 111111 };
		ImageIcon im = new ImageIcon(b);
		pi = new PanelItemInv("PepePaco", im, "Es un objeto", 7);
		assertEquals(pi.titulo.titulo.getText(), "PepePaco");
	}

	@Test
	void getAmount() {
		byte[] b = { (byte) 111111 };
		ImageIcon im = new ImageIcon(b);
		pi = new PanelItemInv("PepePaco", im, "Es un objeto", 7);
		assertEquals(pi.bttInv.amount.getText(), (7 + ""));
	}
	
	@Test
	void getDesc() {
		byte[] b = { (byte) 111111 };
		ImageIcon im = new ImageIcon(b);
		pi = new PanelItemInv("PepePaco", im, "Es un objeto", 7);
		assertEquals(pi.cont.desc.getText(), "<html>Es un objeto<html>");
	}

}
