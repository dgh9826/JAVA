import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Arrays;

public class AuthApp {
	public static String user[][]={{"egoing","1111"},{"jinhyck","2222"},{"youbin","3333"}};
	public static String inputId;
	public static String inputPassword;
	public static boolean isLogined = false;
	public static void ID_PSW_IN(){
			System.out.print("입력한 PASSWORD: ");
			for(int a=0;a<inputPassword.length();a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	public static void CheckID_PSW() {
		String current[][] =user;
		for(int i=0; i<user.length; i++) {
			int j=0;
			if(current[i][j].equals(inputId)&&
					current[i][j+1].equals(inputPassword)) { 
				isLogined=true;
				break;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));		

		//System.out.println(user.length);
		System.out.print("ID:");
		inputId = in.readLine();
		
		System.out.printf("PASSWORD:");
		inputPassword = in.readLine();
		
		System.out.println("입력한 ID: "+inputId);
		ID_PSW_IN();
		CheckID_PSW();
		if(isLogined) {
			System.out.println("Hello Master\nWellcom.");
		}else {
			System.out.println("Who are you?");
		}
	}

}
