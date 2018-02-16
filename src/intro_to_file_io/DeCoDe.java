package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

import javax.swing.JOptionPane;

public class DeCode {
	public static void main(String[] args) {
		String moosage = JOptionPane.showInputDialog("Give Me A Message");
		byte[] encodedBytes = Base64.getEncoder().encode(moosage.getBytes());
		System.out.println("encodedBytes " + new String(encodedBytes));
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/Encryption.txt");
			fw.write(new String(encodedBytes));
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
//		byte[] decodedBytes = Base64.getDecoder().decode(encodedBytes);
//		System.out.println("decodedBytes " + new String(decodedBytes));
	}
	
}

 //Copyright 2018 Ugandan Knuckles and Sanic