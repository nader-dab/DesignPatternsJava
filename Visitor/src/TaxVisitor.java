import java.text.DecimalFormat;


public class TaxVisitor implements Visitor {

	DecimalFormat df = new DecimalFormat("#.##");
	
	public TaxVisitor(){
		
		
	}
	
	@Override
	public double visit(Liquor liquorItem){
		
		System.out.println("Liquor item: Price with Tax");
		
		return Double.parseDouble(df.format(liquorItem.getPrice() * .18 + liquorItem.getPrice()));
	}

	@Override
	public double visit(Tabacco tabaccoItem) {
		
		System.out.println("Tabacco item: Price with Tax");
		
		return Double.parseDouble(df.format(tabaccoItem.getPrice() * .32 + tabaccoItem.getPrice()));
	}

	@Override
	public double visit(Necessity necessityItem) {
		
		System.out.println("Necessity item: Price with Tax");
		
		return Double.parseDouble(df.format(necessityItem.getPrice() * 0 + necessityItem.getPrice()));
	}
}
