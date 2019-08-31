package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester {
	public static void main(String[] args) {
		SimpleDate simDate = SimpleDate.of(2019, 8, 3);
		SimpleDate other = SimpleDate.of(2020, 8, 3);
		System.out.println(simDate.before(other));


		try(var output =new PrintWriter(new FileOutputStream(
				new File("output.txt"), true /*true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

		SimpleDate simDate2 = SimpleDate.of(2019, 8, 3);
		SimpleDate other2 = SimpleDate.of(2020, 8, 3);
		output.println(simDate.before(other2));


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}