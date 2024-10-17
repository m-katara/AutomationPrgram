package AbstractPackage;

		abstract class Monitor
		{
		 abstract void Keyboard();
		 abstract void Mouse();
		}

		//Concrete class extending the abstract class
		public class Assignment22 extends Monitor 
		{

		 // Implementing the abstract method Keyboard()
		 void Keyboard()
		 {
		     System.out.println("This is KeyBoard");
		 }

		 // Implementing the abstract method Mouse()
		 void Mouse() 
		 {
		     System.out.println("This is Mouse");
		 }

		 // Concrete method
		 void concreteMethod()
		 {
		     System.out.println("This is a concrete method in the concrete class.");
		 }

		 public static void main(String[] args)
		 {
		     // Create an instance of the concrete class
			 
		     Assignment22 ac = new Assignment22();

		     // Call the implemented abstract methods
		     ac.Keyboard();
		     ac.Mouse();

		     // Call the concrete method
		     ac.concreteMethod();
		 }
		
	}


