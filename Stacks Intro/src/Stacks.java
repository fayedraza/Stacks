import java.util.Stack;

//created by Fayed Raza
public class Stacks {
   
	public static void main (String [] args)
	{
		//purpose is to introduce stacks
		
		Stack<String> stack = new Stack<String> ();
		
		stack.push("bottom"); //adds item to the top of the stack
		printStack(stack);
		stack.push("middle");
		printStack(stack);
		stack.push("top");
		printStack(stack);
		
		stack.pop(); //item that is on top of the stacks gets taken off
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
	}
	private static void printStack(Stack<String> s) { //only this class can use this method
		if(s.isEmpty()) {
			System.out.print("There is nothing");
		}else {
			System.out.printf("%s \n", s);
		}
	}
	
}
