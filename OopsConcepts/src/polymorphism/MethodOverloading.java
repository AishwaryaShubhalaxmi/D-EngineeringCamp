package polymorphism;
class Solution1{
	static int add(int a, int b){
	   return a+b;
	}
	static int add(int a,int b,int c){    //Method overloading--> same name, different number of parameters
		return a+b+c;
	}
	static double add(int a, double b){   //method overloading by changing the type of parameters
		  return a+b;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int  sum= Solution1.add(10, 15);
      System.out.println(sum);
       int sum1=  Solution1.add(10, 20, 30);
       System.out.println(sum1);
       double sum2= Solution1.add(10, 20);
       System.out.println(sum2);
	}

}
 //method overloading cannot be achieved by just changing the return type of method