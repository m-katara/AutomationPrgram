package AbstractPackage;

//Interface defining a method related to Animal
interface Animal 
{
 void Tiger(); // Interface with abstract method
}

//Class defining a method related to Human
class Human 
{
 void Men()
 {
     System.out.println("Human");
 }
}

//Subclass extending Human and implementing Animal interface

public class Assignment53 extends Human implements Animal
{

 // Implementing the method from Animal interface
 @Override
 
 public void Tiger()
 {
     System.out.println("Tiger");
 }

 public static void main(String[] args) 
 {
     // Creating an Object of the subclass
 	
     Assignment53 A1 = new Assignment53();

     // Calling methods from the subclass
     
     A1.Tiger(); // Method from Animal interface
     A1.Men();   // Method from Human class
 }
}