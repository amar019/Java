

public class Pizza {
	
	private int price;
	private boolean veg;
	
	private int ExtraCheesePrice=100;
	private int ExtraToppingPrice=100;
	private int backPackPrice=20;
	
	
	private int basePizzaPrice;
	
	private boolean isExtraCheeseAdded=false;
	private boolean isExtraToppingAdded=false;
	private boolean isTakeAwayAdded=false;
	
	Pizza(boolean veg)
	{
		this.veg=veg;
		
		if(this.veg)
		{
			this.price=300; // for veg pizza
		}else
		{
			this.price=400;// for Non-veg pizza
		}
		
		basePizzaPrice=this.price;
	}
	
	public void getPrice()
	{
		System.out.println(this.price);
	}
	
	
	public void addExtraCheese()
	{
		isExtraCheeseAdded=true;
		
		this.price +=ExtraCheesePrice;
	}
	
	public void addExtraTopping()
	{
		isExtraToppingAdded=true;
		
		this.price +=ExtraToppingPrice;
	}
	
	public void takeAway()
	{
		isTakeAwayAdded=true;
		
		this.price +=backPackPrice;
	}
	
	public void getBill()
	{
		String bill=" ";
		System.out.println("Pizza : "+basePizzaPrice);
		
		if(isExtraCheeseAdded)
		{
			bill+="Extra Cheese Added : " +ExtraCheesePrice +"\n";
		}
		
		if(isExtraToppingAdded)
		{
			bill +="Extra Topping Added : " +ExtraToppingPrice +"\n";
		}
		
		if(isTakeAwayAdded)
		{
			bill +="Is take away  : " +backPackPrice+"\n";
		}
		
		bill +="Total Bill: RS."+this.price+"\n";
		System.out.println(bill);
	}
	
	

	

}
