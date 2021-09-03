class Accounting {
	public double valueOfSupply;//공급가액
	public static double vatRate=0.1;//부가가치세율
	public Accounting(double valueOfSupply){ //생성자
			this.valueOfSupply = valueOfSupply;
	}
		
		public double getVat() {//부가가치세 호출
			return  this.valueOfSupply*vatRate;
		}
		public double getTotal() {//총합 호출
			return this.valueOfSupply + getVat();
		}
}
