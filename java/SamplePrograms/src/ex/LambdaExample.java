package ex;

public class LambdaExample {

	public static void main(String[] args) {

B obj = () ->System.out.println("Hello");
obj.show();
	}

}

@FunctionalInterface
interface B{
	 void show();
	 
}