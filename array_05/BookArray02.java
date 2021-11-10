package array_05;

public class BookArray02 {

	public static void main(String[] args) {
		Book[] library =new Book[5];					//Book 객체 배열을 저장할 index 5개 생성 	=>배열은 stack 영역에 
		library[0] = new Book("태백산맥","조정래");			
		library[1] = new Book("데미안","헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가","유시민");
		library[3] = new Book("토지","박경리");
		library[4] = new Book("어린왕자","생택쥐페리");
		
		for(int i=0;i<library.length;i++) {
			library[i].showBookInfo();				//=> 객체에 저장되어있는 정보를 method로 출력
		}
		
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i]);			//=> 객체의 주소값만 저장되어있다.
		}
	}

}
