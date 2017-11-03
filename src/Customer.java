
public class Customer 
{
private String name;
private String address;
private float creditRating;
private float discountRating;

Customer(String name, String address, float creditRating, float discountRating) 
{
	 	this.name = name;
	 	this.address = address;
	 	this.creditRating = creditRating;
	 	this.discountRating = discountRating;
}

//CreditRating getter
public float getCreditRating()
{
	return this.creditRating;
}
public void setCreditRating(float cr)
{
	this.creditRating = cr;
}
//Name Getter
public String getName()
{
	return this.name;
}

//Address Getter
public String getAddress()
{
	return this.address;
}


//DiscountRating getter
public float getDiscountRating()
{
	return this.discountRating;
}

}
