package java_0228;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		//키보드로부터 입력받는 스캐너 만들기
		Scanner sc = new Scanner(System.in);
		//문자열입력받기
		System.out.printf("문자를 입력:");
		String str = sc.nextLine();
		System.out.printf("입력한 문자 값:%s\n",str);
		
		//정수 1개를 입력받기
		System.out.printf("정수를 입력:");
		int n = sc.nextInt();
		System.out.printf("입력한 정수 값:%d\n",n);
		
		//문자열입력받기
		//숫자열 뒤에 문자열을 입력받으면 문제가 발생
				System.out.printf("문자를 입력:");
				//이전 입력에서 넘어온 Enter를 없애기 위해서 호출
				sc.nextLine();// 이거 삽입 시 문제 해결
				String str1 = sc.nextLine();
				System.out.printf("입력한 문자 값:%s\n",str1);
				
		int su = 0;
		for(int i = 0; i<str1.length(); i=i+1) {
			char ch = str1.charAt(i);
			if(ch>= '0' && ch<='9') {
				su = su*10+(ch-48);
			}else {
				break;
			}
		}
		System.out.printf("변환된 숫자:%d\n", su);
				
		sc.close();

	}

}
