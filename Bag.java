public class bag {
	private String color;
	private double weight;
	private static int count=0;
	private static double total_weight=0;

	public bag()
	{
		color="red";
		weight=56.7;
		count++;
		total_weight+=weight;
	}
	// taking color 
	public bag(String color)
	{
		this.color=color;
		weight=67.9;
		count++;
		total_weight+=weight;
	}
	// taking weight 
	public bag(double weight) {
		color="Blue";
		this.weight=weight;
		count++;
		total_weight+=weight;
	}
	// taking both color and weight
	public bag(String color,double weight)
	{
		this.color=color;
		this.weight=weight;
		count++;
		total_weight+=weight;
	}
	
	public void display()
	{
		System.out.println("Color: "+color+"\n"+"Weight: "+weight);
	}
	
	public void decrement()
	{
		bag.count--;
		bag.total_weight-=weight;
	}
	public static int get_count() 
	{
		return count;
	}
	public static double get_total_weight()
	{
		return total_weight;
	}
}
