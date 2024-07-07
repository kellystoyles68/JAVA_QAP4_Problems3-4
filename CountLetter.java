import java.util.Scanner;
public class CountLetter
{
    public static void main(String[ ] args)
    {
	int[ ] counts = new int[26];
        //get word from user
        try (Scanner scan = new Scanner(System.in)) {
            //get word from user
            System.out.print("Enter a single word (letters only, please): ");
            String word = scan.nextLine( );
            
            //convert to all upper case
            word = word.toUpperCase( );
            
            //count frequency of each letter in string
            for (int i=0; i < word.length( ); i++){
                char currentChar = word.charAt(i);
                try {
                    counts[currentChar - 'A']++;
                } catch (ArrayIndexOutOfBoundsException e) {
                    // Print a useful message 
                    System.out.println("Not a letter: " + currentChar);
                }
            }
            //print frequencies
            System.out.println( );
            for (int i=0; i < counts.length; i++)
                if (counts [i] != 0)
                    System.out.println((char)(i +'A') + ": " + counts[i]);
        }
    }
    }