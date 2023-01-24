package variablescope;

public class VariableScopes {
	
	
	String myGlobalVar; //GLOBAL VARIABLE
	//The Scope of a global variable is the entire class.
	//Since the immediate curly braces a global variable is defined within, belongs to the class.
	//Global variables can be referenced from anywhere in the class.
	
	public void method1() {
		String myLocalVariable = "abc"; //LOCAL VARIABLE, this method --method1()-- is the only place in which it can be used.
		System.out.println(myLocalVariable); 
	}
	
	public void method2() {
		//System.out.println(myLocalVariable); 
		//If we try to reference myLocalVariable from method1, we get a compilation error indicating that the symbol cannot be resolved...
		//...because myVariable is NOT KNOWN OUTSIDE OF THE SCOPE of method1
	}
	
	
	//Scope can be even narrower than the method level
	public void method3() {
		int number = 5;
		if(number < 5) {
			String myLocalVariable = "def"; //We could also limit a variable's Scope to any block of code.
			System.out.println(myLocalVariable); //CORRECT
		}
		
		//Cannot use my2variable outside the --if decision structure--, since it was declared inside the --if-- block.
		//System.out.println(my2Variable);  ---->ERROR
	}
	
	//REMEMBER: A variable scope is determined by the curly braces in which the variable is defined
	
	//Variables can have the same name if they are within a different scope. 
	//myLocalVariable in method1() is a totally different variable in ---memory location--- than myVariable in method2().
	
	
	public class VariableScopeExample{
		String myVar = "first declared global variable"; //declaring global variable at the class level.
		
		public void method4() {
			System.out.println("global " + myVar); //referencing global variable
			String myVar = "new variable"; //defining local variable
			System.out.println("local " + myVar); //referencing local variable
		}
	
		
		
		
	//NOTE: When a global and local variable have the same name, the one with the lesser scope is used when referenced.
		
		
		
		public void method5() {
			System.out.println("global " + myVar); //referencing global variable
			myVar = "update already declared global variable"; //updating global variable
			System.out.println("global " + myVar); //referencing global variable
		}
	
		
	//NOTE: see the difference in color from the editor when it's using global vs local variable (blue vs brown).
		
	}
	
	
}
