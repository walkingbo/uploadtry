package practice;

public class AnswerPerfetionNumber {

	public static void main(String[] args) {
		// ���� ������ ������ ������ ������ ���� ����
		int count =0;
		//1���� 1000����
		for(int i=1;i<=1000;i=i+1) {
			//����� ���� ������ ���� 
			int sum =0;
			//����� ���ϱ� ���ؼ� 1���� �ڽ��� ���ݱ��� 
			for(int j=1; j<=i/2;j=j+1) {
				//����� ����� �������� ���� ��
				if(i%j==0) {
					sum=sum+j;
				}
			}
			
			//�ڽ��� ������ ����� ���� �ڽŰ� ���ٸ�
			if(i==sum) {
				System.out.printf("������:%d\n", i);
				count = count + 1;
			}
		}
		System.out.printf("����������:%d\n", count);
	}

}
