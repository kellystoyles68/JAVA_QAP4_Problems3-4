import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args)
    {
	
    int sum = 0;
	Scanner scan = new Scanner(System.in);
	

	System.out.println("Enter a line of text");
	Scanner scanLine = new Scanner(scan.nextLine());

	while (scanLine.hasNext())
	    try{		
        sum += Integer.parseInt(scanLine.next());
        } catch (NumberFormatException e){
           
    }
    System.out.println("The sum of the integers on this line is " + sum);
	}
    }



