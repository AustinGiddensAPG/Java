public class Cat {
	int catAge;
	
	public Cat(String name) {
		// This contructor has one parameter, name.
	  System.out.println("Name chosen is :" + name );
	}
	
	public void setAge( int age ) {
		catAge = age;
	}
	
	public int getAge( ) {
		System.out.println("Cat's age is :" + catAge );
		return catAge;
	}
	
	public static void main(String []a) {
		/* Object creation */
		Cat myCat = new Cat( "Mack" );
	
		/* Call class method to set cat's age */
		myCat.setAge( 2 );
	
		/* Call another class method to get cat's age */
		myCat.getAge( );
	
		/* You can access instance variable as follows as well */
		System.out.println("Variable Value :" + myCat.catAge );
	}
}
