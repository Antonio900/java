package chapter07;
import java.util.*;
public class Country {

	public static void main(String[] args) {
		HashMap<String, Integer> dic = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �̸��� �α��� 5�� �Է��ϼ���(�� : Korea 5000)");
		
		for(int i=0;i<5;i++){
			System.out.print("�����̸�, �α�>>");
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
		System.out.println("���� �α��� ���� ����� " + "(" + nation + "," + max + ")" );
	}

}
