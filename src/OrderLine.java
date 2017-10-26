
public class OrderLine extends Order
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
private Product getProduct()
{
	return product;
}
private int getQuantity()
{
	return this.quantity;
}
private double getPrice()
{
	return this.price;
}
}
