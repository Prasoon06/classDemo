import java.util.Scanner;

public class PizzaAppApplicationStartup {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Pizza p1=new Pizza();
		System.out.println("Enter the name of the pizza");
	    p1.setName(sc.nextLine());
		System.out.println("Enter the size of the pizza");
		p1.setSize(sc.nextLine());
		System.out.println("Enter the crust of the pizza");
		p1.setCrust(sc.nextLine());

		orderPizza(p1);
		
		//addNonVegToppings(p1);
		addVegToppings(p1);
		
		displayOrder(p1);
		
		sc.close();
	}

	public static void orderPizza(Pizza p1)
	{
		if(p1.getName().equalsIgnoreCase("VEGEXTRAVAGANZA"))
		{
			p1.setToppings(PizzaConstants.VEGEXTRAVAGANZA_TOPPINGS);
			if(p1.getSize().equalsIgnoreCase(PizzaConstants.MEDIUM_SIZE_PIZZA))
				p1.setPrice(PizzaConstants.VEGEXTRAVAGANZA_MEDIUM_PRICE);
			else if(p1.getSize().equalsIgnoreCase(PizzaConstants.LARGE_SIZE_PIZZA))
				p1.setPrice(PizzaConstants.VEGEXTRAVAGANZA_LARGE_PRICE);
			else
				p1.setPrice(PizzaConstants.VEGEXTRAVAGANZA_REGULAR_PRICE);
		}
		else if(p1.getName().equalsIgnoreCase("DELUX VEGGIE"))
		{
			p1.setToppings(PizzaConstants.DELUX_VEGGIE_TOPPINGS);
			if(p1.getSize().equalsIgnoreCase(PizzaConstants.MEDIUM_SIZE_PIZZA))
				p1.setPrice(PizzaConstants.DELUX_VEGGIE_MEDIUM_PRICE);
			else if(p1.getSize().equalsIgnoreCase(PizzaConstants.LARGE_SIZE_PIZZA))
				p1.setPrice(PizzaConstants.DELUX_VEGGIE_LARGE_PRICE);
			else
				p1.setPrice(PizzaConstants.DELUX_VEGGIE_REGULAR_PRICE);
		}
		else if(p1.getName().equalsIgnoreCase("IDLI TANDOORI PANEER"))
		{
			p1.setToppings(PizzaConstants.IDLI_TANDOORI_PANEER_TOPPINGS);
			if(p1.getSize().equalsIgnoreCase(PizzaConstants.MEDIUM_SIZE_PIZZA))
				p1.setPrice(PizzaConstants.IDLI_TANDOORI_PANEER_MEDIUM_PRICE);
			else if(p1.getSize().equalsIgnoreCase(PizzaConstants.LARGE_SIZE_PIZZA))
				p1.setPrice(PizzaConstants.IDLI_TANDOORI_PANEER_LARGE_PRICE);
			else
				p1.setPrice(PizzaConstants.IDLI_TANDOORI_PANEER_REGULAR_PRICE);
		}
		else if(p1.getName().equalsIgnoreCase("FARMHOUSE"))
		{
			p1.setToppings(PizzaConstants.FARMHOUSE_TOPPINGS);
			if(p1.getSize().equalsIgnoreCase(PizzaConstants.MEDIUM_SIZE_PIZZA))
				p1.setPrice(PizzaConstants.FARMHOUSE_MEDIUM_PRICE);
			else if(p1.getSize().equalsIgnoreCase(PizzaConstants.LARGE_SIZE_PIZZA))
				p1.setPrice(PizzaConstants.FARMHOUSE_LARGE_PRICE);
			else
				p1.setPrice(PizzaConstants.FARMHOUSE_REGULAR_PRICE);
		}
		else if(p1.getName().equalsIgnoreCase("MEXICAN GREEN WAVE"))
		{
			p1.setToppings(PizzaConstants.MEXICAN_GREEN_WAVE_TOPPINGS);
			if(p1.getSize().equalsIgnoreCase(PizzaConstants.MEDIUM_SIZE_PIZZA))
				p1.setPrice(PizzaConstants.MEXICAN_GREEN_WAVE_MEDIUM_PRICE);
			else if(p1.getSize().equalsIgnoreCase(PizzaConstants.LARGE_SIZE_PIZZA))
				p1.setPrice(PizzaConstants.MEXICAN_GREEN_WAVE_LARGE_PRICE);
			else
				p1.setPrice(PizzaConstants.MEXICAN_GREEN_WAVE_REGULAR_PRICE);
		}
		else if(p1.getName().equalsIgnoreCase("PEPPY PANEER"))
		{
			p1.setToppings(PizzaConstants.PEPPY_PANEER_TOPPINGS);
			if(p1.getSize().equalsIgnoreCase(PizzaConstants.REGULAR_SIZE_PIZZA))
		    p1.setPrice(PizzaConstants.PEPPY_PANEER_REGULAR_PRICE);
			else
				System.out.println("Medium and large sized pizza is not available in peppy panner");
		}
		else
		{
			System.out.println("Please provide the correct name of the pizza");
		}
		
	}
	
	public static void displayOrder(Pizza p1)
	{
		System.out.println("Pizza name:"+p1.getName());
		System.out.println("Size:"+p1.getSize());
		System.out.println("Toppings:"+p1.getToppings());
		System.out.println("Crust:"+p1.getCrust());
		System.out.println("Price:"+p1.getPrice());
		System.out.println("Veg toppings:"+p1.getVegToppings());
		System.out.println("Non veg toppings:"+p1.getNonVegToppings());
		
	}
	
	public static void addVegToppings(Pizza p1)
	{
		Scanner sc=new Scanner(System.in);
		String vegToppings="";
		System.out.println("Do yoou want to add any veg toppings: Press y/n");
		char choice=sc.next().charAt(0);
		if(choice=='y')
		{
			System.out.println("How many toppings do u want to add.(MAX-3)");
			int a=sc.nextInt();
			if(a<4)
			{
				System.out.println("Enter the names of the toppings you want to add");
				for(int i=0;i<a;i++)
				vegToppings=vegToppings+sc.next()+"  ";
				p1.setVegToppings(vegToppings);
				double price=p1.getPrice()+60*a;
				p1.setPrice(price);
			}
			else
				System.out.println("Invalid input");
		}	
		
		String nonVegToppings="";
		System.out.println("Do yoou want to add any non-veg toppings: Press y/n");
		choice=sc.next().charAt(0);
		if(choice=='y')
		{
			System.out.println("How many toppings do u want to add.(MAX-3)");
			int a=sc.nextInt();
			if(a<4)
			{
				System.out.println("Enter the names of the toppings you want to add");
				for(int i=0;i<a;i++)
					nonVegToppings=nonVegToppings+sc.next()+"  ";
					p1.setNonVegToppings(nonVegToppings);
				double price=p1.getPrice()+75*a;
				p1.setPrice(price);
			}
			else
				System.out.println("Invalid input");
		}	
		sc.close();
	}
	
	


}
