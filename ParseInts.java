import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args)
    {
	//initialize sum
    int sum = 0;

    //create scanner
	Scanner scan = new Scanner(System.in);
	
    //prompt user to enter information
	System.out.println("Enter a line of text");

    //create new scanner
	Scanner scanLine = new Scanner(scan.nextLine());

    //loop through each line
	while (scanLine.hasNext())
	    try{		
        sum += Integer.parseInt(scanLine.next());
        } catch (NumberFormatException e){
           // if not a valid integer, catch the exception
    }
    //print out sum of integers
    System.out.println("The sum of the integers on this line is " + sum);
	}
    }



