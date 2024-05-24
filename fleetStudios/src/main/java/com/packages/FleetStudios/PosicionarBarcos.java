package com.packages.FleetStudios;

import java.util.Arrays;

public class PosicionarBarcos {
	private static final int TAMANO = 10;
	private char[][] tablero;
	
	public PosicionarBarcos() {
		tablero = new char[TAMANO][TAMANO];
		for(int x = 0; x < TAMANO; x++) {
			for(int y = 0; y < TAMANO; y++) {
				tablero[x][y] = '0';
			}
		}
	}
	
	public boolean colocarBarco(int x, int y, int shipSize, char shipDirection) {
		boolean paco = true;
		if(shipDirection == 'H') {
			if(y + shipSize > TAMANO) { //caso en el que se intente colocar un barco y no quepa en el tablero
				System.out.print("El barco se sale del tablero");//se convertiria en un mensaje
				return false;
			}
			
			for(int i = 0; i < shipSize; i++) { //caso que se intente colocar un barco dnde ya haya un barco xd
				if(tablero[x][y + i] != '0') {
					System.out.print("Ya hay un barco en esta posición"); 
					paco = false;
				}else if(tablero[x][y - i] != '0') {
					System.out.print("Ya hay un barco en esta posición"); 
					paco= false;
				}
			}
			
			for (int i = 0; i < shipSize && paco; i++) { //caso en  el que se pueda colocar los barcos
				tablero[x][y + i] = '1';
			}
		}else if (shipDirection == 'V') {
			if(x + shipSize > TAMANO) {
				System.out.print("El barco se sale del tablero"); 
			}
			
			for (int i = 0; i < shipSize; i++) {
				if(tablero[x + i][y] != '1'){
					System.out.print("Ya hay un barco en esta posición");
				}else if(tablero[x - i][y] != '1'){
					System.out.print("Ya hay un barco en esta posición");
				}
			}
			
			for (int i = 0; i < shipSize; i++) { //caso en  el que se pueda colocar los barcos
				tablero[x + i][y] = '1';
			}
			
		}else {
			System.out.println("Dirección no válida");
			return false;
		}
		
		return true;
	}

}
