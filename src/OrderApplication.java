import java.io.*;
 import java.nio.file.Paths;
 import java.util.*;
 
public class OrderApplication
{
private static ArrayList<Product> products = new ArrayList<Product>();
public static void main(String[] args) throws IOException
{

	OrderApplication OA = new OrderApplication();
	Customer customer = new Customer( "Nickolas", "5621 Gordon", 0, 0);
	Order order = new Order(customer);
	
	OA.createOrder(order);
	order.calculatePrice();
}
private static boolean importCatalogue() throws IOException 
{
	boolean items = false;
	Scanner in = null;
	try {
		in = new Scanner(Paths.get("Catalogue.txt"));
		while (in.hasNextLine())
		{
			String[] data = in.nextLine().split(",");
			Product product = new Product(data[0], Double.parseDouble(data[1]), Integer.parseInt(data[2]));
			products.add(product);
		}
	}
	finally
	{
		if( in != null)
		{
			in.close();
			items = true;
		}
	}
	return items;
}
public static boolean createOrder(Order order) throws IOException
{
	boolean items = importCatalogue();
	
	if(items)
	{
		Iterator<Product> iterator = products.iterator();
		
		while(iterator.hasNext())
		{
			Product product = iterator.next();
			System.out.println("Please enter a quantity for the item: " + product);
			Scanner scanner = new Scanner(System.in);
			int quantity = scanner.nextInt();
			order.add(product, quantity);
		}
	}
	return items;
}

}
