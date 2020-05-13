package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
	// Read the csv file and return it as a list
	
	public static List<String[]> read(String file){
		List<String[]> data = new LinkedList<String[]>();
		String row;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((row = br.readLine()) != null) {
				String[] datarecords = row.split(",");
				data.add(datarecords);
			}
		} catch (FileNotFoundException e) {
			System.out.println("COULD NOT FIND A FILE!!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("COULD NOT READ THE FILE!!");
			e.printStackTrace();
		}
		return data;
	}
	
}
