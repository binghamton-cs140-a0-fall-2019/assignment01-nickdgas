package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth doB = new DateAndPlaceOfBirth(2000, 9, 3, "West Islip", "New York", "USA");
		StreetUSAddress add = new StreetUSAddress("123 Python Ln", "321 Java Rd", "West Islip", "New York", "11795");
		Person person1 = new Person("Nick", "Dagostino", "333-22-1111", doB, add);
		System.out.println(person1);	



		try(var output =new PrintWriter(new FileOutputStream(
				new File("output.txt"), true /*true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println

		DateAndPlaceOfBirth doB2 = new DateAndPlaceOfBirth(2000, 9, 3, "West Islip", "New York", "USA");
		StreetUSAddress add2 = new StreetUSAddress("123 Python Ln", "321 Java Rd", "West Islip", "New York", "11795");
		Person person12 = new Person("Nick", "Dagostino", "333-22-1111", doB2, add2);
		output.println(person12);	

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}