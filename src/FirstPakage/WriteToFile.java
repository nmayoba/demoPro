package FirstPakage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//create file in D: Drive
		String TestFile = "C:\\autoProgram\\Notes.txt";
		
		System.out.println("I'm here");
		File FC = new File(TestFile);//Created object of java File class
		FC.createNewFile();//Create file.
		
		//Write In to file
		//Create Object of java FileWriter and BufferedWriter class
		FileWriter FW = new FileWriter(TestFile);
		BufferedWriter BW = new BufferedWriter(FW); 
		BW.write("This is First Line.");//Write in to file
		BW.newLine();//To write next string on new line
		BW.write("This is Second Line.");//Write in to file
		BW.newLine();//To write next string on new line
		BW.write("This is Third Line.");//Write in to file
		
		//Read from file
		//Create Object of java FileReader and BufferedReader class
		FileReader FR = new FileReader(TestFile);
		BufferedReader BR = new BufferedReader(FR);
		String Content = "";
		BW.close();
		
		//Loop to read all lines one by one from file and print it
		while((Content = BR.readLine())!= null) {
			System.out.println(Content);
			
	
	}
		
		BR.close();
		
}

}