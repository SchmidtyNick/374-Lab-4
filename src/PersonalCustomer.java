
public class PersonalCustomer extends Customer
{
private int creditCardNumber;

public PersonalCustomer(String name, String address, float creditRating, float discountRating, int creditCardNumber) 
{
	 		super(name, address, creditRating, discountRating);
	 		this.creditCardNumber = creditCardNumber;
}
}