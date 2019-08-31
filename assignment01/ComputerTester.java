package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
		Computer comp1 = new Computer("Mac", "intel CORE i7", 16, 2000, true, 1599.99);
		System.out.println(comp1);

		Computer comp2 = new Computer("Mac", "intel CORE i5", 8, 750, true, 699.99);
		System.out.println(comp2);

		Computer comp3 = new Computer("Mac", "intel CORE i5", 8, 500, false, 499.99);
		System.out.println(comp3);

		Computer comp4 = new Computer("Mac", "intel CORE i7", 16, 1500, false, 1199.99);
		System.out.println(comp4);



		try(var output =new PrintWriter(new FileOutputStream(
				new File("output.txt"), true /*true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println

		Computer comp12 = new Computer("Mac", "intel CORE i7", 16, 2000, true, 1599.99);
		output.println(comp12);

		Computer comp22 = new Computer("Mac", "intel CORE i5", 8, 750, true, 699.99);
		output.println(comp22);

		Computer comp32 = new Computer("Mac", "intel CORE i5", 8, 500, false, 499.99);
		output.println(comp32);

		Computer comp42 = new Computer("Mac", "intel CORE i7", 16, 1500, false, 1199.99);
		output.println(comp42);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}