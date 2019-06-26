package ex;

enum Mobile1
{
	APPLE,SAMSUNG,HTC;
}
public class EnumExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile1 m = Mobile1.SAMSUNG;
switch(m)
{
case APPLE:
System.out.println("Apple is best");
break; 
case  SAMSUNG:
System.out.println("1st copy of Apple");
break;		
}
	}

}
