//this is for read file as well read file by line by line 

package Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileRead {
	
public static void main(String[] args) throws IOException {
 
	File f=new File("/Users/udaisinghrathore/Downloads/aman.txt");
	FileReader fr=new FileReader(f);
	BufferedReader b=new BufferedReader(fr);
	// run loop 
	String s;
	while ((s=b.readLine())!=null) //to read the data of full file
	{
		System.out.println(s);
		}
}
}
