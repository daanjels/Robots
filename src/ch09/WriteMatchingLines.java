package ch09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteMatchingLines {

	public static void main(String[] args) {
		Scanner in = null;
		PrintWriter out = null;
		try {
			in = new Scanner(new File("the-file-name.txt"));
			FileWriter fw = new FileWriter("becker.txt", true);
			out = new PrintWriter(fw);
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
			System.out.println("in " + System.getProperty("user.dir"));
			System.exit(1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (in.hasNextLine()) {
			String record = in.nextLine();
			out.println(record);
			System.out.println(record);
		}
		
		in.close();
		out.close();
		try {
			PrintWriter writer = new PrintWriter("/home/lejos/the-file-name.txt", "UTF-8");
			writer.println("The first line");
			writer.println("The second line");
			writer.close();
		} catch (IOException e) {
			// do something
		}
	}

}
