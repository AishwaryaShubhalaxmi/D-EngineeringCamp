package polymorphism;
class Animal{
	 String color= "White";
	
}
class Dog extends Animal{
	String color="Black";
	void printcolor(){
		System.out.println(color);
		System.out.println(super.color);  //refers to immediate parent class instance variable
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Dog d= new Dog();
     d.printcolor();
	}

}
