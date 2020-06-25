//read line from the file 1

package Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class FileReadMethod {
	
	public void ReadData(int line) throws IOException {
		File f=new File("/Users/udaisinghrathore/Downloads/aman.txt");
		FileReader fr=new FileReader(f);
		BufferedReader bf=new BufferedReader(fr);
		String s;
		int count=0;
		
		 while ((s=bf.readLine())!=null) /** reading data line by line */
		 {
			 count=count+1; //will read the line number
			 
			 if (count==line) {
				 System.out.println("***Printing line***");
				 System.out.println(s);
		
			 }
			 }
			bf.close();
	}
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the line no. to print: ");
		Scanner s1=new Scanner(System.in);
		int line=s1.nextInt();
		FileReadMethod ref=new FileReadMethod();
		
		ref.ReadData(line);
		// s1.close();
		
	
	} 
}

	

	
