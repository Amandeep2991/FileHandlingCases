package Filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writedatainrowcount {
	
	public void writedatacount(int line) throws IOException {
		File f=new File("/Users/udaisinghrathore/Downloads/aman.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		
		String s = null;
		Scanner s1=new Scanner(System.in);
		for(int i=1; i<=line; i++) {
		System.out.println("Enter the data to print");
			String l=s1.nextLine();
	
			bw.write(l);
			bw.newLine();
			
			}
		bw.close();
		}
		
	public static void main(String[] args) throws IOException {
		
		
		Writedatainrowcount wc=new Writedatainrowcount();
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the value");
		int v=s2.nextInt();
		wc.writedatacount(v);
		
	
		
	}
	}


