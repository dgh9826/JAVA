package Exception10.custom_Exception;

public class IDFormatTest {

	private String userID;			//userID: Null값을 넣을 경우 : 사용자 정의 Exception 발생
									// => 8이상 20이하가 아닌 경우 : 사용자 정의 Exception 발생
	public String getUserID() {
		return userID;
	}
	
	//throw : 강제로 Exception을 발생 시킬때 사용
	//throws : Exception을 미룰때 사용
	public void setUserID(String userID) throws IDFormatException {
		if(userID ==null) {	
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		}else if(userID.length() < 8 || userID.length()>20) {
			throw new IDFormatException ("아이디는 8자 이상 20자 이하로 쓰세요");
		}
		this.userID=userID;
	}
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		String userID=null;
		try {
			test.setUserID(userID);
		}catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userID="1234567";
		try {
			test.setUserID(userID);
		}catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
