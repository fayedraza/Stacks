import java.util.Stack;

//created by Fayed Raza
public class Stacks {
   
	public static void main (String [] args)
	{
		//purpose is to introduce stacks
		
		Stack<String> stack = new Stack<String> ();
		
		stack.push("bottom"); //adds to the top of the stack
		printStack(stack);
		stack.push("middle");
		printStack(stack);
		stack.push("top");
		printStack(stack);
		
		stack.pop(); //top of the stacks gets taken off
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
	}
	private static void printStack(Stack<String> s) { //private can be used since only the class is using it
		if(s.isEmpty()) {
			System.out.print("There is nothing");
		}else {
			System.out.printf("%s \n", s);
		}
	}
	
}
