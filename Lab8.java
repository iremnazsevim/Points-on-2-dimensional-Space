import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) throws FileNotFoundException {

		// create a new File object and give Scanner object this file object as the
		// input stream
		Scanner input = new Scanner(new File("point-data.txt"));

		// read the number of points in the file
		int nPoints = Integer.valueOf(input.nextLine());


		// create arrays to store x and y coordinates and colors
		// TO-DO
		Point[] points = new Point[nPoints];

		// read the points data line by line
		for (int i = 0; i < nPoints; i++) {

			// check if there is a line to read
			if (input.hasNextLine()) {

				String line = input.nextLine();
				
				// TO-DO: process your line here
				// store the data in your arrays
				Scanner scan = new Scanner(line);
				
				points[i]=new Point(scan.nextDouble(),scan.nextDouble(),scan.next());
			} // end if

		} // end for

		// TO-DO: compute the maximum and minimum distance between points, display it on
		// console
		double maxDistance = 0;
		double minDistance = Double.MAX_VALUE;
		for(int i=0 ; i<nPoints ; i++)
		{
			for(int k=1 ; k<nPoints ;k++)
			{
				double d=Math.hypot(points[i].getX()-points[k].getX(), points[i].getY()-points[k].getY());
				if(d >  maxDistance )
					 maxDistance=d;
				if(d<minDistance)
					minDistance=d;
			}
		}
		
		

		System.out.println("The maximum distance between two points is " + maxDistance);
		System.out.println("The minimum distance between two points is " + minDistance);

		// TO-DO: find the northmost, eastmost, southmost, westmost points, display it on console
		int north = 0, east = 0, south = 0, west = 0; 
		
		for (int i = 0; i < nPoints; i++) {
			if(north < points[i].getY())
			{
				north=i;
			}
			if(south > points[i].getY())
			{
				south=i;
			}
			if(west < points[i].getY())
			{
				west=i;
			}
			if(east < points[i].getY())
			{
				east=i;
			}
		}
				
		System.out.println("The northmost point is " + points[north].toString());
		System.out.println("The southmost point is " + points[south].toString());
		System.out.println("The eastmost point is " + points[east].toString());
		System.out.println("The westmost point is " + points[west].toString());

	}
}