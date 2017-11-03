
public class Product 
{
private String name;
private double price;
private int productID;

public Product(String name, double price, int ID)
{
	this.name = name;
	this.price = price;
	this.productID = ID;
}

public String getName()
{
	return this.name;
}
public double getPrice()
{
	return this.price;
}
public int getProductID()
{
	return this.productID;
}
}
