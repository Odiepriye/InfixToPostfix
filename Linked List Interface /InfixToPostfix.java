/**
 * Name: O’Diepriye Graham-Douglas 
 * MODULE: DATA STRUCTURES & ALGORITHMS & DATA STRUCTURES 
 * Student ID: AGD626 
 * Student Number: @00592983
 * @30th November, 2021.
 */

class InfixToPostfix 
{
    //Shows Predence for the converter.
    static int Precedence(char ch)
    {
        switch (ch)
        {
        case '+':
        case '-':
            return 1;
      
        case '*':
        case '/':
            return 2;
      
        case '^':
            return 3;
        }
        return -1;
    }
      
    public String infixToPostfix(String exp)
    {
        
        String result = new String("");
        
        Stack stack = new LinkedStack();
         
        for (int i = 0; i<exp.length(); ++i)
        {
            char c = exp.charAt(i);
             
            // If the scanned character is an
            // operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;
              
            // If the scanned character is an '(',
            // push it to the stack.
            else if (c == '(')
                stack.push(c);
             
            //  If the scanned character is an ')',
            // pop and output from the stack
            // until an '(' is encountered.
            else if (c == ')')
            {
                while (!stack.isEmpty() &&
                        !stack.peek().equals('('))
                    result += stack.pop();
                 if(stack.isEmpty() && stack.peek().equals('(')){
                     throw new IllegalArgumentException("Invalid expression");
                    }
                    else{
                        stack.pop();
                    }
                    //stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty() && Precedence(c)
                         <= Precedence((Character)stack.peek())){
                   
                    result += stack.pop();
             }
                stack.push(c);
            }
      
        }
      
        // pop all the operators from the stack
        while (!stack.isEmpty()){
            result = result+stack.pop();
         }
        return result;
    }
   
    // Driver method
    
}