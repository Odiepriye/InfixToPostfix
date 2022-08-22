import java.util.Scanner;
/**
 * Name: O’Diepriye Graham-Douglas 
 * MODULE: DATA STRUCTURES & ALGORITHMS & DATA STRUCTURES 
 * Student ID: AGD626 
 * Student Number: @00592983
 * @30th November, 2021.
 */
public class Convert
{
    // instance variables - replace the example below with your own
  

    /**
     * Constructor for objects of class Convert
     */
    public void Convert()
    {
        // initialise instance variables
        Scanner scanner = new Scanner(System.in);
        String exp = scanner.nextLine();
        if(exp.length() > 20)
        {
            System.out.println("Too many characters.");
        }
        else{
        InfixToPostfix postfix = new InfixToPostfix();
        System.out.println(postfix.infixToPostfix(exp));
    }
    }

    
}
