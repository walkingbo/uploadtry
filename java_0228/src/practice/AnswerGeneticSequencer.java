package practice;

public class AnswerGeneticSequencer {
//�ϳ��� ���Ͽ��� �κ� ������ ã�Ƴ��� ���� ���⼭�� �м��̶�� �մϴ�.
	public static void main(String[] args) {
		String str ="AOPSOAOAJSHDKSAOAOAAJSKS";
		String msg ="AOA";
		
		int size = str.length();
		for(int i =0; i<size-2;i=i+1) {
			//str�� ù���� ��������
			char start = str.charAt(i);
			//str�� ù���ڿ� msg�� ù���ڰ� �����ϴٸ�
			if(start == msg.charAt(0)) {
				boolean flag =false;
				for(int j =1; j<3;j=j+1) {
					if(str.charAt(i+j)!=msg.charAt(j)) {
						flag = true;
						break;
					}
				}
				//��� ���ڰ� ���� ���
				if(flag==false) {
					System.out.printf("������ ������ ��ġ:%d\n", i);
					//���� ������ �������� �ѱ�� ���ؼ�
					i=i+2;
				}
			}
		}

	}

}
