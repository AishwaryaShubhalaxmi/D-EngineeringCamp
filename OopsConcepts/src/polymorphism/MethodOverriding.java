package polymorphism;
class Riding{
	static void display(){
		System.out.println("Parent class");
	}
}
public class MethodOverriding extends Riding {    //same method in child class as well as in parent class
	static void display(){
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         display();   //prints child class text
	}

}
