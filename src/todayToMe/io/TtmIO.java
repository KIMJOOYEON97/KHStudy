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
	public static String name = "";
	
	File f = new File("todayToMe.txt");
			
	public String insertName(String inputname) {
		name = inputname;
		return name;	
	}
	
	public String loadName() {
		return name;
	}
}
