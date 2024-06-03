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

import org.junit.Test;

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
