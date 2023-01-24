package variablescope;

public class ThisKeyword {
	//If you are within a local scope and explicitly want to reference the global variable as opposed to the local one...
	//...that will be used by default, you can do so by using the reserved word THIS.
	
	String myVariable = "THIS is a global variable";
	
	public void method1() {
		String myVariable = "a local var"; //defining local variable
		System.out.println("local " + myVariable); //referencing local variable
		//If we want to reference the global version
		System.out.println("global " + this.myVariable); //referencing global variable
	}
	
	//NOTE: the editor uses different colors to distinguish between global and local variables.

	//When using the keyword --  this. --, we're letting the compiler know that we want to use the version that belongs to THIS class.
}
