package todayToMe.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TtmIO {
	static File f = new File("todayToMe.txt");
			
	public static String insertName(String name) {
		List<String> nameList =new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(f));
			){
				while(true) {
					nameList.add(String.valueOf(br));
				}
			}catch(Exception e1) {
				e1.printStackTrace();
			}
		return name;
		
	}
	
	public List<String> loadName() {
		List<String> list = new ArrayList<String>();
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			){
			 	while(true) {
			 		String name = String.valueOf(bw);
			 		list.add(name);
			 	}
			}catch(IOException e) {
				e.printStackTrace();
			}
		return list;
		
	}
}
