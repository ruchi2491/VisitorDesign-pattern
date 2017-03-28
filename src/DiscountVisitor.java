
public class DiscountVisitor implements Visitor {

	@Override
	public double visit(Mobile mobile) {
		System.out.println("Mobile Item with discount");
		
		return mobile.getPrice()-1000;
	}

	@Override
	public double visit(Laptop laptop) {
System.out.println("Laptop Item with discount");
		
		return laptop.getPrice()-3000;
	}

	@Override
	public double visit(Television television) {
System.out.println("Television Item with discount");
		
		return television.getPrice()-2000;
	}
	

}
