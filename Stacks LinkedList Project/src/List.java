//created by Fayed Raza
public class List {
	int x;
items head;
//purpose is to make a stack using linked lists
public void push(Object s) { //adds an object to the top of the stack

	items object = new items(s);
	if(x==0) {
		object.next = null;
		head=object;
		x++;
	}else  {
		items currentObject = head;
		
		while(currentObject.next != null)
			currentObject=currentObject.next;
		
		object.next = null;
		currentObject.next = object;	
		
	}
}

public void pop() throws Exception { //deletes the object that is on top of the stack
	if(isEmpty()) { //throws an exception if the objects in a stack are empty
		throw new Exception("List does not have any items");
		
	}
	
	
	items currentObject = head;
	
	while(currentObject.next.next != null)
		currentObject=currentObject.next;
	
	currentObject.next = null;
	
}


public void peak() throws Exception { //returns the object that is on the top of the stack
	if(isEmpty()) {//throws an exception if a stack is empty
		throw new Exception("List does not have any items");
		
	}
	items currentObject = head;
	
	while(currentObject.next != null)
		currentObject=currentObject.next;
	
	System.out.print("The top of the stack is " + currentObject.item);
	
}

private Boolean isEmpty() { //returns if a stack is empty
	
	return head == null;
	
}
public void printList() throws Exception {//prints all of the objects in a stack
	if(isEmpty()) {
		throw new Exception("List does not have any items");
		
	}
	items currentObject = head;
	System.out.println();
	System.out.println("Items");
	while(currentObject != null) {
		System.out.println(currentObject.item);
		currentObject=currentObject.next;
	}
}

public static void main (String [] args) throws Exception {
	List list = new List();
	List list2 = new List();
	list.push(1);
	list.push("hi");
	list.push('a');
	list.push(0b101);
	list.push(0XF);
	list.printList();
	list.pop();
	list.printList();
	list.push(0XFBA);
	list.printList();
	list2.pop();
}





}
