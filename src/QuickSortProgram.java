import java.io.*;
import java.util.*;

public class QuickSortProgram {
	
	// reads the array from file
	private static Station[] readFromFile(){
		UserInterface user = new UserInterface();
		try {
			
			// used to read from the file
			String n = user.getString("enter file namee here: ");
			File stationFile = new File(n);
			Scanner scStatoin = new Scanner(stationFile); 
			// read the first line
			int size = Integer.parseInt(scStatoin.nextLine());

			// create the array
			Station[] array = new Station[size];

			// read in each line and convert it to our object
			for (int i = 0; i < size; i++) {
				String line = scStatoin.nextLine();
				//we split the line
				Scanner lineReader = new Scanner(line);
				array[i] = new Station(lineReader.next(), lineReader.nextInt(), lineReader.nextInt(), lineReader.nextInt());
			}
			// return the array
			return array;

			// handle exception
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	// prints the array
	private static void printArray(Station[] array) {		
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}

	public static void main(String[] args) {
		QuickSort sort = new QuickSort();
	
		//read in array from file
		Station[] array = readFromFile();
		
		// print before sort
		System.out.println("Stations: ");
		QuickSortProgram.printArray(array);

		// sort the array
		sort.quickSort(array, 0, array.length - 1);

		// print after sort
		System.out.println("\nStations in increasing order of distance:: ");		
		QuickSortProgram.printArray(array);

	}
}
