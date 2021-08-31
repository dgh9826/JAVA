public class AccountingApp{
	public static void main(String[] args) {
		Accounting a1= new Accounting(10000.0);
		Accounting a2 = new Accounting(20000);
		
//		Accounting.valueOfSupply=10000.0;
		System.out.println("Value Of Supply: "+a1.valueOfSupply);
		System.out.println("Value Of Supply: "+a2.valueOfSupply);
		
		System.out.println("VAT: "+a1.getVat());
		System.out.println("VAT: "+a2.getVat());
		
		System.out.println("Total: "+a1.getTotal());
		System.out.println("Total: "+a2.getTotal());
	
	}
}