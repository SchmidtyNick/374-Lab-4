
public class Customer 
{
private String name;
private String address;
private float creditRating;
private float discountRating;

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

public void setname(String n)
{
	this.name = n;
}
//Address Getter
public String getAddress()
{
	return this.address;
}

public void setAddress(String a)
{
	this.address= a;
}
//DiscountRating getter
public float getDiscountRating()
{
	return this.discountRating;
}

public void setDiscountRating( float dr)
{
	this.discountRating = dr;
}
}
