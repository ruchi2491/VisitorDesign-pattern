
public class VisitorTest {
	public static void main(String[] args) {
		DiscountVisitor discountVisitor=new DiscountVisitor();
		Laptop laptop=new Laptop(35000.00);
		System.out.println("laptop before discount:"+laptop.getPrice());
		System.out.println("laptop after discount:"+laptop.accept(discountVisitor));
		
		
	}

}
