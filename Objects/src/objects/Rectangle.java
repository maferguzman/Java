package objects;

//The class Rectangle act as a blueprint, is made to be a general representation, that we can later make more specific in other classes.
//So if you we're going to have a general rectangle object it would have a length and a width.
public class Rectangle {
	//To ENCAPSULATE our class, add private access modifiers to the fields and public access modifiers to the methods we would like to expose.
	
	//We declare global variables (FIELDS)
	private double length;  
	private double width;
	
	//Actions that can be performed on a rectangle (METHODS)
	public double calculatePerimeter() {
		return (2 * length) + (2 * width);
	}
	
	public double calculateArea() {
		return length * width;
	}
	
	//CONSTRUCTOR
	//Constructors are used to initialize a field or fields in an object or set up its state in some way.
	//ALL OBJECTS HAVE A CONSTRUCTOR
	
	//Constructors start with:
	//Access modifier + name of the constructor (IT MUST BE THE SAME NAME AS THE CLASS) + Parentheses (PARAMETERS ARE OPTIONAL)
	public Rectangle() { //DEFAULT CONSTRUCTOR = a constructor with no parameters.
		//Assign default values to fields
		length = 0;
		width = 0;
	}
	//MORE ABOUT CONSTRUCTORS
	//There's no return type on constructors (because they're not a method).
	//You can have as many constructors as you like
	//All of their names must be exactly the same as the class name...
	//...what differs is the parameters that they accept.
	
	public Rectangle(double length, double width) { //In this CONSTRUCTOR, we add the length and width as parameters.
	
		//To set the FIELDS, we'll simply call the setter methods and pass them the parameters that were passed in above in the header of the constructor.
			setLength(length); //call the setLength method and pass it the length parameter (LOCAL VARIABLE).
			setWidth(width); //call the setWidth method and pass it the width parameter(LOCAL VARIABLE).
	}
	
	
	//We have fields with no values for them. So we have to provide some methods that will allow whoever's using...
	//...the rectangle class as an object to set the length and the width to wherever value they want it to be.
	//One way of doing this is to provide GETTER AND SETTER METHODS for each of the fields.
	
	public double getLength() { //We create a method that allows anyone who wants to use a rectangle object to get or set the length and the width.
		return length; //We'll simply return the length from the GLOBAL VARIABLE
	}
	
	public void setLength(double length) { //setLength will take in a value for length which is a LOCAL VARIABLE to this method.
		this.length = length; //We'll assign it to the GLOBAL VARIABLE length of this class.
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) { //we take the width and...
		this.width = width; //...set the local instance to the global one
	}
	
	//ENCAPSULATION
	//Classes should provide encapsulation. ENCAPSULATION specifies that the data of a class (which are fields)...
	//...should be private and the behavior of the class (which are the methods) can be public to other classes to use.
	//To ENCAPSULATE our class, add private access modifiers to the fields and public access modifiers to the methods we would like to expose.
	

}


