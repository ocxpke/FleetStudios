package com.packages.FleetStudios;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConvertBlob {

	public static void main(String[] args) throws SQLException {
		Connection con = DatabaseCon.connect();
		System.out.println("Comenzando...");
		//Cambia la ruta para cada objeto
		File imgFile = new File("./src/main/java/images/atras.png");
		try {
			FileInputStream fis = new FileInputStream(imgFile);
			try {
				byte[] imageBytes = new byte[(int) imgFile.length()];
				int bytesRead = fis.read(imageBytes);
				if (imgFile.length() != bytesRead) {
					System.err.println("Error transforming file");
					return;
				} else {
					PreparedStatement ps = con.prepareStatement(
							//Cambia la sentencia para cada objeto
							"INSERT INTO ITEMS (name, type, value, damage, image) values ('aaa','2222', 33, 2, ? )");
					ps.setBytes(1, imageBytes);
					int rs = ps.executeUpdate();
					System.out.println(rs);
					ps.close();
				}
			} catch (Exception e) {
				System.err.println(e);
			} finally {
				fis.close();
				con.close();
			}
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
