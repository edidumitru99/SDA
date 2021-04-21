package Lab2;

public class Customer {

	private String lastName;
	private String firstName;
	private PaymentMethod paymentMethod;
	private Address address;
	private int age;
	
	public Customer (String lName,String fName,PaymentMethod pm ,Address address,int age)
	{
		this.lastName=lName;
		this.firstName=fName;
		this.paymentMethod=pm;
		this.address=address;
		this.age=age;
		
		
	}
	
	
	
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public Address getAddress() {
		return address;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getAge() {
		return age;
	}

	public String getCompleteName() {
		
		return getFirstName() + " " + getLastName() ;
	}
	


	
	
	
}
