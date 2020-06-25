//Read file 

package Filehandling;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RnW {
 public void readandwrite() throws IOException {
	 File f= new File("/Users/udaisinghrathore/Downloads/aman.txt");
	 FileReader fr= new FileReader(f);
	 BufferedReader br=new BufferedReader(fr);
	 
	 
	 String l;
	 File f1=new File("/Users/udaisinghrathore/Downloads/aman1.txt");
	 FileWriter fw=new FileWriter(f1);
	 BufferedWriter bw=new BufferedWriter(fw);
	 
	 while((l=br.readLine())!=null){
		 
		 System.out.println(l);
		 bw.write(l);
		 bw.newLine();
		 
	 }
	 bw.close();
 }
 
 public static void main(String[] args) throws IOException {
	 RnW r=new RnW();
	 
	 System.out.println("** Copying**");
	 r.readandwrite();
	 
}
	 
 }
 

