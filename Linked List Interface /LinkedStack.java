import java.util.EmptyStackException;
/**
 * Name: O’Diepriye Graham-Douglas 
 * MODULE: DATA STRUCTURES & ALGORITHMS & DATA STRUCTURES 
 * Student ID: AGD626 
 * Student Number: @00592983
 * @30th November, 2021.
 */
public class LinkedStack implements Stack
{
    // instance variables - replace the example below with your own
    protected LinkNode top;

   /**
    * Constructor for objects of class LinkedStack
    */
    public LinkedStack()
    {
       // initialise instance variables
       top = null;
    }
   
   //return true if list is empty
   public boolean isEmpty(){
       return top == null;
    }
   
   //return top element of stack
   public Object peek(){
       if (isEmpty()) throw new EmptyStackException();
       return top.theObject;
    }
   
   // adds the new element to the top of the stack.
   public void push(Object object){
       top = new LinkNode(object, top);
    }
   
   //removes top element of stack and returns it
   public Object pop(){
       if (isEmpty()) throw new EmptyStackException(); 
       Object topObject = top.theObject;
       top = top.next;
       return topObject;
    }
}