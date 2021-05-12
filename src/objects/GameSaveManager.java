package objects;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

import org.omg.CORBA.portable.ValueInputStream;

public class GameSaveManager {

	public GameSaveManager() {
		
	}
	
	/*
	 * Load game
	 */
	
	public Game getGame(String uuid) {
		HashMap<String, Integer> values = new HashMap<>();
		
		try {
		
		File file = fileExists(uuid);
		
		if(file == null) 
			return null;
		
		System.out.println("file found " + file.getPath());
			
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		while(bufferedReader.ready()) {
			String[] line = bufferedReader.readLine().split(":");
			
			values.put(line[0], Integer.parseInt(line[1]));
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//returns game
		return new Game(UUID.fromString(uuid), values.get("cadens"), 
				values.get("worker1amount"), 
				values.get("worker2amount"),
				values.get("worker3amount"),
				values.get("worker4amount"),
				values.get("worker5amount"));
		
	}
	
	private File fileExists(String uuid) {
				
		try {
			System.out.println("resources/games/"+uuid);
			File file = new File("resources/games/"+uuid+".txt");
			if(file.exists())
				return file;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}
	
	/*
	 * Save game
	 */
	
	public void saveGame(Game game) {
		
	}
}
