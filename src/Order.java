import java.util.*;

public class Order 
{

private Date dateReceieved;
private double price;
private int orderID;
private Customer customer;
public ArrayList<OrderLine> OL = new ArrayList<OrderLine>(); 

public Order(Customer customer) 
{
			dateReceieved = new Date();
	 		price = 0;
	 		orderID = 1;
	 		this.customer = customer;
	 	}
public Date getDateReceieved()
{
	return this.dateReceieved;
}
public double calculatePrice()
{
	Iterator<OrderLine> iterator = OL.iterator();	
	OrderLine currentOrder;							
	Product currentProduct;							
	 double currentPrice;							
	 		
	
	 while(iterator.hasNext()) 
	 	{
	 		currentOrder = iterator.next();
	 		currentProduct = currentOrder.getProduct();
	 		currentPrice = currentProduct.getPrice();
	 		currentPrice *= currentOrder.getQuantity();
	 		price += currentPrice;
	 	}
	 		price -= price * customer.getDiscountRating();	
	  		return price;		  
}

public void add(Product product, int quantity)
{
	OrderLine newOrder = new OrderLine(product, quantity, product.getPrice());
	OL.add(newOrder);
}
}
