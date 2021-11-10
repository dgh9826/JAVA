package gnenric_12;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> gpowder = new GenericPrinter<Powder>();
		gpowder.setMaterial(new Powder());
		
		Powder powder = gpowder.getMaterial();
		System.out.println(gpowder);
		
		GenericPrinter<Plastic> gplastic = new GenericPrinter<Plastic>();
		gplastic.setMaterial(new Plastic());
		
		Plastic plastic = gplastic.getMaterial();
		System.out.println(gplastic);
		
		GenericPrinter<Water> gwater = new GenericPrinter<Water>();
		gwater.setMaterial(new Water());
		
		Water water = gwater.getMaterial();
		System.out.println(gwater);
	}
}
