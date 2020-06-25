// over write the data in the file txt

package Filehandling;

//import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

		public static void main(String[] args) throws IOException {
	 
		File f=new File("/Users/udaisinghrathore/Downloads/aman.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter b= new BufferedWriter(fw); // to add space or move file to next line 
		b.write("Aman Thakur");
		b.newLine();
		b.write("Miss Thakur");
	    b.newLine();
		b.write("Miss Aman Thakur");
		
		b.close();  //mandate
		
		}}