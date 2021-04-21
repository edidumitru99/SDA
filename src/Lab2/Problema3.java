package Lab2;

public class Problema3 {

	public static void main(String args[]) {
		
		Address address= new Address ("Al. Ioan Cuza" , "Brasov" , 85);
		PaymentMethod pm = new PaymentMethod ("Cash");
		Customer c = new Customer ("Marian" , "Popescu" , pm , address , 22);
		
		
		System.out.println(c.getCompleteName());
		System.out.println(c.getAddress().getFullAdress());
		System.out.println(c.getPaymentMethod().getType());
		
		
		

	}
	
	
	
	
}
