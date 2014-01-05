// Allows you to add  methods to classes of different types without
// much altering to those classes
// You can make completely different methods depending on the class used
// Allows you to define external classes that can extend other classes
// without majorly editing them

public class Main {

	public static void main(String[] args) {
		
		TaxVisitor taxCalc = new TaxVisitor();
		
		TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();
		
		Necessity milk = new Necessity(3.47);
		Liquor vodka = new Liquor(11.99);
		Tabacco cigars = new Tabacco(19.99);
		
		System.out.println(milk.accept(taxCalc) + "\n");
		System.out.println(vodka.accept(taxCalc) + "\n");
		System.out.println(cigars.accept(taxCalc) + "\n");
		
		System.out.println("Holiday Prces\n");
		
		System.out.println(milk.accept(taxHolidayCalc) + "\n");
		System.out.println(vodka.accept(taxHolidayCalc) + "\n");
		System.out.println(cigars.accept(taxHolidayCalc) + "\n");
	}
}
