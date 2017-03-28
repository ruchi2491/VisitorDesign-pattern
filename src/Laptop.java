
public class Laptop implements Visitable {
private double price;
	
	Laptop(double price)
	{
		this.price=price;
	}
	public double getPrice() {
		return price;
	}

	@Override
	public double accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
}
