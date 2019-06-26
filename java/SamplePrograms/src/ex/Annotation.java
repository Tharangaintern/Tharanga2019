package ex;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone
{
	String os() default "Simbian";
	int version() default 1;
}
@SmartPhone(os="Gionee", version=6)
class NokiaASeries
{
	String model;
	int size;
	
	public NokiaASeries(String model,int size){
		this.model = model;
		this.size = size;
	}
}
public class Annotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NokiaASeries obj = new NokiaASeries("Fire",5);
Class c = obj.getClass();
java.lang.annotation.Annotation an =  c.getAnnotation(SmartPhone.class);
SmartPhone s = (SmartPhone)an;
System.out.println(s.version());
	}

}
