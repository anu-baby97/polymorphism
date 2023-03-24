package overridingExample;

public class ChildClass extends ParentClass{
	public void print() {
		System.out.println("This is Child class");
		super.print();
	}
}
