package java_0228;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		//Ű����κ��� �Է¹޴� ��ĳ�� �����
		Scanner sc = new Scanner(System.in);
		//���ڿ��Է¹ޱ�
		System.out.printf("���ڸ� �Է�:");
		String str = sc.nextLine();
		System.out.printf("�Է��� ���� ��:%s\n",str);
		
		//���� 1���� �Է¹ޱ�
		System.out.printf("������ �Է�:");
		int n = sc.nextInt();
		System.out.printf("�Է��� ���� ��:%d\n",n);
		
		//���ڿ��Է¹ޱ�
		//���ڿ� �ڿ� ���ڿ��� �Է¹����� ������ �߻�
				System.out.printf("���ڸ� �Է�:");
				//���� �Է¿��� �Ѿ�� Enter�� ���ֱ� ���ؼ� ȣ��
				sc.nextLine();// �̰� ���� �� ���� �ذ�
				String str1 = sc.nextLine();
				System.out.printf("�Է��� ���� ��:%s\n",str1);
				
		int su = 0;
		for(int i = 0; i<str1.length(); i=i+1) {
			char ch = str1.charAt(i);
			if(ch>= '0' && ch<='9') {
				su = su*10+(ch-48);
			}else {
				break;
			}
		}
		System.out.printf("��ȯ�� ����:%d\n", su);
				
		sc.close();

	}

}
