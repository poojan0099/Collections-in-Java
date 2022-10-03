import java.util.*; 

class Collections {
    public static void main(String[] args) {
    //The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.

    //Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.
    
    ArrayList <String> list = new ArrayList<String>();
    
    LinkedList <String> ll = new LinkedList<String>();
    
    Vector <String> v = new Vector<String>();
    
    list.add("Array List");
    list.add("AL 1");
    list.add("AL 2");
    
    ll.add("Linked List");
    ll.add("LL 1");
    ll.add("LL 2");
    
    v.add("Vector");
    v.add("v 1");
    v.add("v 2");
    
    System.out.println(list);
    System.out.println(ll);
    System.out.println(v);
    
    Iterator<String> i = ll.iterator();  // iterator
    while(i.hasNext()){
            System.out.println(i.next());
    }
    
    Stack<String> stack = new Stack<String>();  
    stack.push("Ayush");  
    stack.push("Garvit");  
    stack.push("Amit");  
    stack.push("Ashish");  
    stack.push("Garima");  
    stack.pop();  
    
    System.out.println(stack);
}
}
