package oopsconcepts;

interface X
{
	void Xdisplay();
}
interface Y
{
 void Ydisplay();
}
class XY implements X,Y{
	public void Xdisplay()
	{
		System.out.println("Xdisplay");
	}
	public void Ydisplay()
	{
		System.out.println("Ydisplay");
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
XY obj = new XY();
obj.Xdisplay();
obj.Ydisplay();
	}

}
