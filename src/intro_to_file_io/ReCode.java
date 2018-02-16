package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Base64;

import javax.swing.JFileChooser;

public class ReCode {
public static void main(String[] args) {

	JFileChooser jfc = new JFileChooser();
	int returnVal = jfc.showOpenDialog(null);
	if (returnVal == JFileChooser.APPROVE_OPTION) {
		String fileName = jfc.getSelectedFile().getAbsolutePath();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String Read = br.readLine();
			byte[] decodedBytes = Base64.getDecoder().decode(Read);
			System.out.println("decodedBytes " + new String(decodedBytes));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
}

 //Copyright 2018 Ugandan Knuckles and Sanic