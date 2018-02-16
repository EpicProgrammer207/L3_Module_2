package intro_to_file_io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CopyrightNotice {
public static void main(String[] args) {
	File flie = new File("src/intro_to_file_io");
	for(File f: flie.listFiles()) {
		
			try {
				FileWriter fw = new FileWriter(f, true);
			fw.write("\n //Copyright 2018 Ugandan Knuckles and Sanic");
			fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
}

 //Copyright 2018 Ugandan Knuckles and Sanic