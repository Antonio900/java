package chapter06;

public class MathEx {
	public static void main(String[] args){
		double a = -2.78987434;
		System.out.println(Math.abs(a)); // 절댓값 구하기
		System.out.println(Math.ceil(a)); // ceil
		System.out.println(Math.floor(a)); // floor
		System.out.println(Math.sqrt(9.0)); // 제곱근
		System.out.println(Math.exp(1.5)); //exp
		System.out.println(Math.rint(3.141592)); // rint
		System.out.println("이번주 행운의 번호는");
		//[1,45] 사이의 난수 5개 생성
		for(int i=0;i<5;i++)
			System.out.print(Math.round(1+ Math.random() *44)+" ");//난수생성
		System.out.println("입니다.");
	}
}
