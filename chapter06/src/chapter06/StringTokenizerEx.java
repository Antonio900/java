package chapter06;
import java.util.StringTokenizer;
public class StringTokenizerEx {

	public static void main(String[] args) {
				StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����","/");
				int n = st.countTokens();
				System.out.println(n);
				
				while(st.hasMoreTokens())
					System.out.println(st.nextToken());

			}

		}
