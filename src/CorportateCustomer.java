
public class CorportateCustomer extends Customer
{
	private String contactName;
	
	public CorportateCustomer(String name, String address, float creditRaing, float discountRating, String contactName)
	{
		this.setname(name);
		this.setAddress(address);
		this.setCreditRating(creditRaing);
		this.setDiscountRating(discountRating);
		this.contactName = contactName;
	}
//private String contactName;


}
