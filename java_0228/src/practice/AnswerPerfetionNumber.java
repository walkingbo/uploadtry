package practice;

public class AnswerPerfetionNumber {

	public static void main(String[] args) {
		// 개수 문제가 나오면 개수를 저장할 변수 생성
		int count =0;
		//1부터 1000까지
		for(int i=1;i<=1000;i=i+1) {
			//약수의 합을 저장할 변수 
			int sum =0;
			//약수를 구하기 위해서 1부터 자신의 절반까지 
			for(int j=1; j<=i/2;j=j+1) {
				//약수는 나누어서 나머지가 없는 수
				if(i%j==0) {
					sum=sum+j;
				}
			}
			
			//자신을 제외한 약수의 합이 자신과 같다면
			if(i==sum) {
				System.out.printf("완전수:%d\n", i);
				count = count + 1;
			}
		}
		System.out.printf("완전수개수:%d\n", count);
	}

}
