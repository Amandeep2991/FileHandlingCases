package Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadfileRange {
 public void ReadDataofRange(int Startline, int lastline) throws IOException {
	File f=new File("/Users/udaisinghrathore/Downloads/aman.txt");
	FileReader fr= new FileReader(f);
	BufferedReader bf=new BufferedReader(fr);
	
	String s; 
	int count=0; 
	for (int i=Startline; i<=lastline; i++) {
		while ((s=bf.readLine())!=null)
		{
			count =count+1;
		if (count==i) 
		{
			System.out.println(s);
			break;
		}
		}
	}
		bf.close();
	}
 
		
	public static void main(String[] args)throws IOException{
	Scanner scan=new Scanner(System.in);
    System.out.println("Enter the start line ");
	int n= scan.nextInt();

	System.out.println("Enter the last line ");
	int m=scan.nextInt();
	
	ReadfileRange rg=new ReadfileRange();
	rg.ReadDataofRange(n, m);
	
}
}
