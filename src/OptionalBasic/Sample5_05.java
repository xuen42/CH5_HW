package OptionalBasic;

public class Sample5_05 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();
		
		try
		{
			car1.setCar(1234,-10.0);
		}
		catch(CarException e)
		{
			System.out.println("抛出了"+e+"了");
		}
		
		car1.show();
	}

}
