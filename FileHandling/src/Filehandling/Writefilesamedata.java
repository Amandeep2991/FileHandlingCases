//create new file if not exit 

package Filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class Writefilesamedata {

	public static void main(String[] args) throws IOException {
		 
		File f=new File("/Users/udaisinghrathore/Downloads/aman1.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter b= new BufferedWriter(fw); // to add space or move file to next line 
		// same data we use loop
		
		for (int i=0; i<5; i++) {
			b.write("Aman Thakur");
			b.newLine();
		}
		
		b.close();
		
		}}