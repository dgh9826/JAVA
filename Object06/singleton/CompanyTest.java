package Object06.singleton;

public class CompanyTest {

	public static void main(String[] args) {
//		Company myCompany1 = new Company();				//Company() 생성자가 private 로 설정되어있어 선언불가
		
		Company myCompnay2 = Company.getInstance();		//getInstance method로 선언
		Company myCompany3 = Company.getInstance();		//static 
		
		System.out.println(myCompany3==myCompnay2);
	}

}
