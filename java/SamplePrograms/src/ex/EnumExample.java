package ex;

enum Mobile
{
	APPLE(100),SAMSUNG(50),HTC(60);
	int price;
	Mobile(int p)
	{
		price=p;
		System.out.println("Constructor");
	}
		public int getPrice()
		{
			return price;
		}
	}

public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m[]= Mobile.values();
		for(Mobile mobile:m)
		{
			System.out.println(mobile);
		}
System.out.println(Mobile.APPLE.getPrice());	

	}

}
