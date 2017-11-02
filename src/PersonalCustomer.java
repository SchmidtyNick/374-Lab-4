
public class PersonalCustomer extends Customer
{
private int creditCardNumber;

public PersonalCustomer(String name, String address, float creditRaing, float discountRating, int creditCard)
{
	this.setname(name);
	this.setAddress(address);
	this.setCreditRating(creditRaing);
	this.setDiscountRating(discountRating);
	this.creditCardNumber = creditCard;
}
}
