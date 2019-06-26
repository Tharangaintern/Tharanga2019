package oopsconcepts;

class animal{
	public void animalsound() {
		System.out.println("animal makes a sound");
	}
}
class pig extends animal{
	public void animalsound() {
		System.out.println("pig says:  wee wee");
	}
}
class dog extends animal{
	public void animalsound() {
		System.out.println("dog says:  bow bow");
	}
}

public class Polumorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
animal myanimal=new animal();
animal mypig= new pig();
animal mydog=new dog();
myanimal.animalsound();
mypig.animalsound();
mydog.animalsound();


	}

}
