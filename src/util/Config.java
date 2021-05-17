package util;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Config {
	
	private File file;
	private ArrayList<String> configLines = new ArrayList<String>();
	
	public Config() {
		
		try {
			
			file = new File("resources/config.txt");
			
			if(!file.exists()) file.createNewFile();
			
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			
			while(bufferedReader.ready()) {
				configLines.add(bufferedReader.readLine());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
