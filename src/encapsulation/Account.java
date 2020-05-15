package encapsulation;

public class Account
{
	public static void main(String[] args)
	
	{
		Priavate_Dm_Public_method p= new Priavate_Dm_Public_method(500);
		int manju=p.getAmount();
		System.out.println(manju);
		
		
		Priavate_Dm_Public_method a= new Priavate_Dm_Public_method(100000);
		int billgates=a.getAmount();
		System.out.println(billgates);
	}

}
