
public class CorportateCustomer extends Customer
{
	
private String contactName;

public CorportateCustomer(String name, String address, float creditRating, float discountRating, String contactName)
{
	 		super(name, address, creditRating, discountRating);
	 		this.contactName = contactName;
}
}
