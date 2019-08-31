package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth object1 = new DateAndPlaceOfBirth(2000, 9, 3, "West Islip", "New York", "USA");
		System.out.println(object1);

		DateAndPlaceOfBirth object2 = new DateAndPlaceOfBirth(2000, 9, 3, "New York", "New York", "USA");
		System.out.println(object2);

		DateAndPlaceOfBirth object3 = new DateAndPlaceOfBirth(1998, 9, 3, "Binghamton", "New York", "USA");
		System.out.println(object3);

		DateAndPlaceOfBirth object4 = new DateAndPlaceOfBirth(1999, 7, 21, "Rome", "Italy");
		System.out.println(object4);

		DateAndPlaceOfBirth object5 = new DateAndPlaceOfBirth(2001, 10, 13, "Paris", "France");		
		System.out.println(object5);

		//object1
		System.out.println(object1.olderThan(object2));
		System.out.println(object1.olderThan(object3));
		System.out.println(object1.olderThan(object4));
		System.out.println(object1.olderThan(object5));
		System.out.println(object1.youngerThan(object2));
		System.out.println(object1.youngerThan(object3));
		System.out.println(object1.youngerThan(object4));
		System.out.println(object1.youngerThan(object5));
		System.out.println(object1.hasSameBirthDateAs(object2));
		System.out.println(object1.hasSameBirthDateAs(object3));
		System.out.println(object1.hasSameBirthDateAs(object4));
		System.out.println(object1.hasSameBirthDateAs(object5));
		System.out.println(object1.hasSameBirthDayAs(object2));
		System.out.println(object1.hasSameBirthDayAs(object3));
		System.out.println(object1.hasSameBirthDayAs(object4));
		System.out.println(object1.hasSameBirthDayAs(object5));
		//object2
		System.out.println(object2.olderThan(object1));
		System.out.println(object2.olderThan(object3));
		System.out.println(object2.olderThan(object4));
		System.out.println(object2.olderThan(object5));
		System.out.println(object2.youngerThan(object1));
		System.out.println(object2.youngerThan(object3));
		System.out.println(object2.youngerThan(object4));
		System.out.println(object2.youngerThan(object5));
		System.out.println(object2.hasSameBirthDateAs(object1));
		System.out.println(object2.hasSameBirthDateAs(object3));
		System.out.println(object2.hasSameBirthDateAs(object4));
		System.out.println(object2.hasSameBirthDateAs(object5));
		System.out.println(object2.hasSameBirthDayAs(object1));
		System.out.println(object2.hasSameBirthDayAs(object3));
		System.out.println(object2.hasSameBirthDayAs(object4));
		System.out.println(object2.hasSameBirthDayAs(object5));
		//object3
		System.out.println(object3.olderThan(object1));
		System.out.println(object3.olderThan(object2));
		System.out.println(object3.olderThan(object4));
		System.out.println(object3.olderThan(object5));
		System.out.println(object3.youngerThan(object1));
		System.out.println(object3.youngerThan(object2));
		System.out.println(object3.youngerThan(object4));
		System.out.println(object3.youngerThan(object5));
		System.out.println(object3.hasSameBirthDateAs(object1));
		System.out.println(object3.hasSameBirthDateAs(object2));
		System.out.println(object3.hasSameBirthDateAs(object4));
		System.out.println(object3.hasSameBirthDateAs(object5));
		System.out.println(object3.hasSameBirthDayAs(object1));
		System.out.println(object3.hasSameBirthDayAs(object2));
		System.out.println(object3.hasSameBirthDayAs(object4));
		System.out.println(object3.hasSameBirthDayAs(object5));
		//object4
		System.out.println(object4.olderThan(object1));
		System.out.println(object4.olderThan(object2));
		System.out.println(object4.olderThan(object3));
		System.out.println(object4.olderThan(object5));
		System.out.println(object4.youngerThan(object1));
		System.out.println(object4.youngerThan(object2));
		System.out.println(object4.youngerThan(object3));
		System.out.println(object4.youngerThan(object5));
		System.out.println(object4.hasSameBirthDateAs(object1));
		System.out.println(object4.hasSameBirthDateAs(object2));
		System.out.println(object4.hasSameBirthDateAs(object3));
		System.out.println(object4.hasSameBirthDateAs(object5));
		System.out.println(object4.hasSameBirthDayAs(object1));
		System.out.println(object4.hasSameBirthDayAs(object2));
		System.out.println(object4.hasSameBirthDayAs(object3));
		System.out.println(object4.hasSameBirthDayAs(object5));
		//object5
		System.out.println(object5.olderThan(object1));
		System.out.println(object5.olderThan(object2));
		System.out.println(object5.olderThan(object3));
		System.out.println(object5.olderThan(object4));
		System.out.println(object5.youngerThan(object1));
		System.out.println(object5.youngerThan(object2));
		System.out.println(object5.youngerThan(object3));
		System.out.println(object5.youngerThan(object4));
		System.out.println(object5.hasSameBirthDateAs(object1));
		System.out.println(object5.hasSameBirthDateAs(object2));
		System.out.println(object5.hasSameBirthDateAs(object3));
		System.out.println(object5.hasSameBirthDateAs(object4));
		System.out.println(object5.hasSameBirthDayAs(object1));
		System.out.println(object5.hasSameBirthDayAs(object2));
		System.out.println(object5.hasSameBirthDayAs(object3));
		System.out.println(object5.hasSameBirthDayAs(object4));



		try(var output =new PrintWriter(new FileOutputStream(
				new File("output.txt"), true /*true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println

		
		DateAndPlaceOfBirth object12 = new DateAndPlaceOfBirth(2000, 9, 3, "West Islip", "New York", "USA");
		output.println(object12);

		DateAndPlaceOfBirth object22 = new DateAndPlaceOfBirth(2000, 9, 3, "New York", "New York", "USA");
		output.println(object22);

		DateAndPlaceOfBirth object32 = new DateAndPlaceOfBirth(1998, 9, 3, "Binghamton", "New York", "USA");
		output.println(object32);

		DateAndPlaceOfBirth object42 = new DateAndPlaceOfBirth(1999, 7, 21, "Rome", "Italy");
		output.println(object42);

		DateAndPlaceOfBirth object52 = new DateAndPlaceOfBirth(2001, 10, 13, "Paris", "France");		
		output.println(object52);


		//object1
		output.println(object12.olderThan(object2));
		output.println(object12.olderThan(object3));
		output.println(object12.olderThan(object4));
		output.println(object12.olderThan(object5));
		output.println(object12.youngerThan(object2));
		output.println(object12.youngerThan(object3));
		output.println(object12.youngerThan(object4));
		output.println(object12.youngerThan(object5));
		output.println(object12.hasSameBirthDateAs(object2));
		output.println(object12.hasSameBirthDateAs(object3));
		output.println(object12.hasSameBirthDateAs(object4));
		output.println(object12.hasSameBirthDateAs(object5));
		output.println(object12.hasSameBirthDayAs(object2));
		output.println(object12.hasSameBirthDayAs(object3));
		output.println(object12.hasSameBirthDayAs(object4));
		output.println(object12.hasSameBirthDayAs(object5));
		//object2
		output.println(object22.olderThan(object12));
		output.println(object22.olderThan(object32));
		output.println(object22.olderThan(object42));
		output.println(object22.olderThan(object52));
		output.println(object22.youngerThan(object12));
		output.println(object22.youngerThan(object32));
		output.println(object22.youngerThan(object42));
		output.println(object22.youngerThan(object52));
		output.println(object22.hasSameBirthDateAs(object12));
		output.println(object22.hasSameBirthDateAs(object32));
		output.println(object22.hasSameBirthDateAs(object42));
		output.println(object22.hasSameBirthDateAs(object52));
		output.println(object22.hasSameBirthDayAs(object12));
		output.println(object22.hasSameBirthDayAs(object32));
		output.println(object22.hasSameBirthDayAs(object42));
		output.println(object22.hasSameBirthDayAs(object52));
		//object3
		output.println(object32.olderThan(object12));
		output.println(object32.olderThan(object22));
		output.println(object32.olderThan(object42));
		output.println(object32.olderThan(object52));
		output.println(object32.youngerThan(object12));
		output.println(object32.youngerThan(object22));
		output.println(object32.youngerThan(object42));
		output.println(object32.youngerThan(object52));
		output.println(object32.hasSameBirthDateAs(object12));
		output.println(object32.hasSameBirthDateAs(object22));
		output.println(object32.hasSameBirthDateAs(object42));
		output.println(object32.hasSameBirthDateAs(object52));
		output.println(object32.hasSameBirthDayAs(object12));
		output.println(object32.hasSameBirthDayAs(object22));
		output.println(object32.hasSameBirthDayAs(object42));
		output.println(object32.hasSameBirthDayAs(object52));
		//object4
		output.println(object42.olderThan(object12));
		output.println(object42.olderThan(object22));
		output.println(object42.olderThan(object32));
		output.println(object42.olderThan(object52));
		output.println(object42.youngerThan(object12));
		output.println(object42.youngerThan(object22));
		output.println(object42.youngerThan(object32));
		output.println(object42.youngerThan(object52));
		output.println(object42.hasSameBirthDateAs(object12));
		output.println(object42.hasSameBirthDateAs(object22));
		output.println(object42.hasSameBirthDateAs(object32));
		output.println(object42.hasSameBirthDateAs(object52));
		output.println(object42.hasSameBirthDayAs(object12));
		output.println(object42.hasSameBirthDayAs(object22));
		output.println(object42.hasSameBirthDayAs(object32));
		output.println(object42.hasSameBirthDayAs(object52));
		//object5
		output.println(object52.olderThan(object12));
		output.println(object52.olderThan(object22));
		output.println(object52.olderThan(object32));
		output.println(object52.olderThan(object42));
		output.println(object52.youngerThan(object12));
		output.println(object52.youngerThan(object22));
		output.println(object52.youngerThan(object32));
		output.println(object52.youngerThan(object42));
		output.println(object52.hasSameBirthDateAs(object12));
		output.println(object52.hasSameBirthDateAs(object22));
		output.println(object52.hasSameBirthDateAs(object32));
		output.println(object52.hasSameBirthDateAs(object42));
		output.println(object52.hasSameBirthDayAs(object12));
		output.println(object52.hasSameBirthDayAs(object22));
		output.println(object52.hasSameBirthDayAs(object32));
		output.println(object52.hasSameBirthDayAs(object42));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}