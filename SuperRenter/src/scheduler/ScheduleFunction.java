package scheduler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ScheduleFunction {
	
	private static String databasePath = "/home/alex/JAVA/DB.txt";
	
	public static void save(String filename, List<String> x) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
		
		for (String s : x) {
			writer.write(s);
			writer.newLine();
		}
		writer.flush();
		writer.close();
	}
	
	public static List<String> load(String fileName) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		List<String> lines = new ArrayList<String>();
		String line = null;
		while ((line = reader.readLine()) != null) {
			lines.add(line);
		}
		reader.close();
		return lines;
	}
	
	public static Boolean updateTime(String date) throws IOException {
		Integer i = Integer.parseInt(date);
		List<String> schedule = load(databasePath);
		
		//Expands the schedule to be at least as long as the date
		while (schedule.size() <= i) {
			schedule.add("0");
		}
		
		//If the date supplied is free or equal to zero
			//Change the entry to 1 and return true for success
		if (schedule.get(i).equals("0")) {
			schedule.set(i,"1");
			save(databasePath,schedule);
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void clear() throws IOException {
		List<String> blank = new ArrayList<String>();
		save(databasePath, blank);
	}
	

}
