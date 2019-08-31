package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth dOB = new DateAndPlaceOfBirth(1999, 3, 9, "Islip", "New York", "USA");
		StreetUSAddress aDD = new StreetUSAddress("321 Earl Blvd", "101 CS Rd", "West Islip", "New York", "11795");
		Person personX = new Person("Nick", "Dags", "111-22-3333", dOB, aDD);
	
		Computer comp1 = new Computer("Mac", "intel CORE i7", 16, 2000, true, 1599.99);
		Computer comp2 = new Computer("Mac", "intel CORE i5", 8, 750, true, 699.99);
		Computer comp3 = new Computer("Mac", "intel CORE i5", 8, 500, false, 499.99);
		Computer comp4 = new Computer("Mac", "intel CORE i7", 16, 1500, false, 1199.99);

		ComputerOwner compOwn = new ComputerOwner(personX);
		compOwn.addComputer(comp1);
		compOwn.addComputer(comp2);
		compOwn.addComputer(comp3);
		compOwn.addComputer(comp4);
		System.out.println(compOwn);
		compOwn.removeComputer(1);
		compOwn.removeComputer(2);
		System.out.println(compOwn);

		try(var output =new PrintWriter(new FileOutputStream(
				new File("output.txt"), true /*true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println

		DateAndPlaceOfBirth dOB2 = new DateAndPlaceOfBirth(1999, 3, 9, "Islip", "New York", "USA");
		StreetUSAddress aDD2 = new StreetUSAddress("321 Earl Blvd", "101 CS Rd", "West Islip", "New York", "11795");
		Person personX2 = new Person("Nick", "Dags", "111-22-3333", dOB2, aDD2);
	
		Computer comp12 = new Computer("Mac", "intel CORE i7", 16, 2000, true, 1599.99);
		Computer comp22 = new Computer("Mac", "intel CORE i5", 8, 750, true, 699.99);
		Computer comp32 = new Computer("Mac", "intel CORE i5", 8, 500, false, 499.99);
		Computer comp42 = new Computer("Mac", "intel CORE i7", 16, 1500, false, 1199.99);

		ComputerOwner compOwn2 = new ComputerOwner(personX2);
		compOwn2.addComputer(comp12);
		compOwn2.addComputer(comp22);
		compOwn2.addComputer(comp32);
		compOwn2.addComputer(comp42);
		output.println(compOwn2);
		compOwn2.removeComputer(1);
		compOwn2.removeComputer(2);
		output.println(compOwn2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}