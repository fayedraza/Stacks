////////////////Created by Fayed Raza
public class Burger {
	//purpose is to make and check a burger using Stacks
String original = "";
	String layers[] = {"bottombun", "patty", "condiments","vegetables","topbun"};
	
	String burger[];
	final int layer;
	
	
	public Burger() {
		layer =5;
		
		burger = new String[layer];
	}
	
	
	//adds item to the top of the list
	public void push(String s) {
		try {
			System.out.println();
	makeBurger:	for(int x=0;x<burger.length;x++) {
			if(burger[x] == null) {
				burger[x] = s;
				System.out.println(s  + " has been added to the top of the burger");
				break makeBurger;
			}
		}
		}catch(NullPointerException e) {
			System.out.println();
			System.out.println("Burger has already been made properly");
		}
	}
	
	//pops of the item that is top of the list
	public void pop() {
		try {
		if(isEmpty()) {
			System.out.println();
			System.out.println("Burger does not exist");
			}else {
				System.out.println();
		removeLayer:	for(int x=(burger.length-1);x>=0;) {
			if(burger[x] == null) {
			x--;
			}else {
				System.out.println(burger[x] +  " has been removed");
				burger[x] = null;
				break removeLayer; 
			}
		}
			}
		}catch(NullPointerException e) {
			System.out.println();
			System.out.println("Method currently does not work");
		}
	}
	
	/*checks if list is empty
	 * and used by other methods
	 * 
	 */
	private boolean isEmpty() {
		System.out.println();
		if(burger[0] == null)
		return true;
		
		return false;
		
	}
	
	//returns the top of the item
	private void peak() {
		System.out.println();
		try {
		if(isEmpty()) {
			System.out.println("Burger does not exist");
			}else {
		topLayer:	for(int x=(burger.length-1);x>=0;) {
			if(burger[x] == null) {
			x--;
			}else {
				
				System.out.println("The top layer of the burger is the  " + burger[x]);
				
				break topLayer; 
			}
		}
			}
		}catch(NullPointerException e) {
			System.out.println("Method currently does not work");
		}
	}
	
	//checks if the burger has all proper layers
	public void checkBurger() {
		System.out.println();
		Boolean s = false;
		original = "";
		if(isEmpty()) {
			System.out.println("Burger does not exist");
			}else {
				for(int x=0; x<layers.length; x++) {
					if(burger[x] == null) {
						
				}else {
					original += (burger[x] + " ");
				}
					if(burger[x] == layers[x]) {
						
						
						continue;
						
					}else {
						s=true;
					}
					burger[x] =layers[x];
				}
				if(s) {
					System.out.println();
					System.out.println("Burger is not structured correctly");
					printOA();
				}else {
					System.out.println("Burger has been made correctly");
				}
				
				
			}
		
	}
	
	/*used in the check burger method to print original burger and
	 * new burger if the burger is not layered
	 * correctly 
	 */
		private void printOA() {
		System.out.println();
		System.out.print("Original Burger: ");
		System.out.print(original);
		System.out.println();
		System.out.println();
		System.out.print("Actual: ");
		for(int x=0;x<layers.length;x++) {
			System.out.print(layers[x] +" ");
		}
	}
	
	//print all the layers of the burger
	public void printLayers() {
		System.out.println();
		System.out.println();
		System.out.println("Burger: ");
		for(int x=0;x<burger.length;x++) {
			if(burger[x] == null) {
				continue;
		}
			System.out.println(burger[x]);
		}
		
	}
	
	 public static void main (String[] args) {
  	   
		 Burger burger1 = new Burger();
		 Burger burger2 = new Burger();
		 burger1.push("bottombun");
		 burger1.push("patty");
		 burger1.push("condiments");
		 burger1.push("vegetables");
		 burger1.push("topbun");
	
		 
		 burger1.checkBurger();
		 burger1.printLayers();
		 burger1.pop();
		 burger1.printLayers();

		 burger2.push("bottombun");
		 burger2.push("patty");
		 burger2.push("patty");
		 burger2.push("vegetables");
		 burger2.push("topbun");
		 burger2.checkBurger();
		 burger2.push("patty");
  	   
     }
	
}
