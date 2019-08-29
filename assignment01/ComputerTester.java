package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
		Computer computer1 = new computer("Mac", "intel CORE i7", 16, 2000, true, 1599.99);
		System.out.println(computer1);

		Computer computer2 = new computer("Mac", "intel CORE i5", 8, 750, true, 699.99);
		System.out.println(comuter2);

		Computer computer3 = new computer("Mac", "intel CORE i5", 8, 500, false, 499.99);
		System.out.println(computer3);

		Computer computer4 = new computer("Mac", "intel CORE i7", 16, 1500, false, 1199.99);
		System.out.println(computer4);



		try(var output =new PrintWriter(new FileOutputStream(
				new File("output.txt"), true /*true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println

		Computer computer12 = new computer("Mac", "intel CORE i7", 16, 2000, true, 1599.99);
		output.println(computer12);

		Computer computer22 = new computer("Mac", "intel CORE i5", 8, 750, true, 699.99);
		output.println(comuter22);

		Computer computer32 = new computer("Mac", "intel CORE i5", 8, 500, false, 499.99);
		output.println(computer32);

		Computer computer42 = new computer("Mac", "intel CORE i7", 16, 1500, false, 1199.99);
		output.println(computer42);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}