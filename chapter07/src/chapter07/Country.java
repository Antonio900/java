package chapter07;
import java.util.*;
public class Country {

	public static void main(String[] args) {
		HashMap<String, Integer> dic = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 5개 입력하세요(예 : Korea 5000)");
		
		for(int i=0;i<5;i++){
			System.out.print("나라이름, 인구>>");
			String nation = scan.next();
			int people = scan.nextInt();
			dic.put(nation,people);
		}
		
		Set<String> keys = dic.keySet();
		Iterator<String> moon = keys.iterator();
		int max = 0;
		String nation = "";
		while(moon.hasNext()){
			String key = moon.next();
			int num = dic.get(key);
			
			if(num>max){
				max=num;
				nation = key;
			}
				
		}
		System.out.println("제일 인구가 많은 나라는 " + "(" + nation + "," + max + ")" );
	}

}
