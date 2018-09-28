package polymorphism;

public class MainMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Inside main method");  //prints only the method which has string array as arguments
	}
	public static void main(){
		System.out.println("No parameters");   
	}
   public static void main(String s){
	   System.out.println("String as parameter");
   }
}

//main method can also be overloaded 