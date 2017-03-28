
public class Television implements Visitable {
	private double price;
	Television(double price)
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
