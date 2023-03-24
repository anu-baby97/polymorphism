package polymorphism;

public class MethodOverridingMain {

	public static void main(String[] args) {
		Children c =new Children();
		c.properties();
		c.marriage(); // method in derived class or child class overrides the method of same name in base class or parent class

	}

}
