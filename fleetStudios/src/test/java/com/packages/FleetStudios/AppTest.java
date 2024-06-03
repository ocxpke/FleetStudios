package com.packages.FleetStudios;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */


	@BeforeEach
	public void init() {
		
	}
	
	@AfterEach
	public void terminate() {
		
	}
	
	@Test
	public void testIniciarSesionElCorreoNoEstaVacio() {
		Clip musicTheme = null;
		IniciarSesion is = new IniciarSesion(musicTheme);
		String resultado = is.getDatosLogin("", "aaa");
		assertEquals("El campo correo electronico no puede estar vacio", resultado);
	}
	
	@Test
	public void testIniciarSesionLaContrasenaNoEstaVacia() {
		Clip musicTheme = null;
		IniciarSesion is = new IniciarSesion(musicTheme);
		String resultado = is.getDatosLogin("aaa", "");
		assertEquals("El campo contraseña no puede estar vacio", resultado);
	}

	@Test
	public void testEscucharMusica() {
		String ruta = "./src/main/java/images/musicaJuego.wav";
		try {
			AudioInputStream audStream = AudioSystem.getAudioInputStream(new File(ruta));
			Clip musicTheme = AudioSystem.getClip();
		} catch (Exception e) {
			fail("No se pudo poner la música");
		}
    
    @Test
    public void testCrearCuentaElNickNoEstaVacio() {
        CrearCuenta cc = new CrearCuenta(null);
        cc.nick.setText("");
        cc.email.setText("email@example.com");
        cc.fecNac.setText("1990-01-01");
        cc.contra.setText("password");

        String resultado = cc.crearCuenta();
        assertEquals("El campo nick no puede estar vacío", resultado);
    }
    
    @Test
   public void testCrearCuentaElCorreoNoEstaVacio() {
        CrearCuenta cc = new CrearCuenta(null);
        cc.nick.setText("nick");
        cc.email.setText("");
        cc.fecNac.setText("1990-01-01");
        cc.contra.setText("password");

        String resultado = cc.crearCuenta();
        assertEquals("El campo correo electrónico no puede estar vacío", resultado);
    }

    @Test
   public void testCrearCuentaLaContrasenaNoEstaVacia() {
        CrearCuenta cc = new CrearCuenta(null);
        cc.nick.setText("nick");
        cc.email.setText("email@example.com");
        cc.fecNac.setText("1990-01-01");
        cc.contra.setText("");

        String resultado = cc.crearCuenta();
        assertEquals("El campo contraseña no puede estar vacío", resultado);
    }
}
