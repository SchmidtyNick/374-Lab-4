
public class OrderLine
{
private int quantity;
private double price;
private Product product;

public OrderLine(Product product, int quantity, double price)
{
	this.product = product;
	this.price = price;
	this.quantity = quantity;
}
public Product getProduct()
{
	return product;
}
public int getQuantity()
{
	return this.quantity;
}
public double getPrice()
{
	return this.price;
}
}
