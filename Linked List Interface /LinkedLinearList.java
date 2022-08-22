  
/**
 * Name: O’Diepriye Graham-Douglas 
 * MODULE: DATA STRUCTURES & ALGORITHMS & DATA STRUCTURES 
 * Student ID: AGD626 
 * Student Number: @00592983
 * @30th November, 2021.
 */
public class LinkedLinearList implements LinkedList
{
    private LinkNode head;
    private int size;
    
    //constuctor for class LinkedLinearList
    public LinkedLinearList()
    {
        size = 0;
        head = null;
    }

    
    //returns if the list is empty or not.
    public boolean isEmpty(){
        return false;
    }
    
    //returns current size of list
    public int size(){
        return size;
    }
    
    //checks if correct index is given
     public void checkIndex(int index){
        if (index< 0 || index>=size)
        throw new IndexOutOfBoundsException
        ("Index =" + index + " size = " + size + "."); 
    }
    
    //Returns the object in the list
    public Object get(int index){
        checkIndex(index);
        LinkNode current = head;
        
    for(int i= 0; i < index-1; i++){
        current = current.next;
            }
        return current.theObject;
    }
    
    
    public int indexOf(Object object){
    LinkNode current = head;
    int index = 0;
    while (current != null &&
    !current.theObject.equals(object))
    {
      current = current.next;
      index++;
     }
    if (current == null)
    {
    return -1;
    }
    else
    {
    return index; 
     }   
    }
    
    //removes objects from the list
    public Object remove(int index){
        checkIndex(index);
        LinkNode current = head;
        Object removedObject;
    if(index == 0){
        removedObject = head.theObject;
        head = head.next;
    }
    
    for(int i= 0; i < index-1; i++){
        current = current.next;
            }
        removedObject = current.next.next;
        size --;
        return removedObject;
    }
    
    //adds items to the list
    public void add(int index, Object theObject){
        checkIndex(index);
    if(size == 0){
        addFirst(theObject);
            }
            
    if(index == size)
         {
        addLast(theObject) ;
         }
        LinkNode current = head;
    for(int i= 0; i < index-1; i++){
        current = current.next;
            }
        LinkNode newNode = new LinkNode(theObject,current.next);
        newNode = current.next;
        size ++;
    }   
    
    //adds the first item to an empty list
    public void addFirst(Object theObject){
        LinkNode newNode = new LinkNode(theObject,head);
        head = newNode;
        size ++;
    }
    
    //adds the last item to a list
    public void addLast(Object theObject){
        LinkNode current = head;
        LinkNode newNode = new LinkNode(theObject,null);
    while(current.next != null){
        current = current.next;
        current.next = newNode;
    }
        size ++;
    }
    
    @Override
    public String outputList(){
        String output = "[";
        LinkNode current = head;
    while(current !=null){
        output += current.theObject + ",";
        current = current.next;
    }
    
    if(size > 0){
        output = output.substring(0, output.length() - 2);
    }
        return output + "]";
    }
}
