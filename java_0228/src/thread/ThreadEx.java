package thread;
//Thread Ŭ�����κ��� ��ӹ޴� Ŭ����
public class ThreadEx extends Thread {
	//�������̵� �� �޼ҵ����� Ȯ�����ִ� ������̼�
	//�� ������ �����̸� �������̵� �� �޼ҵ尡 �ƴϴ�.
	
	
	@Override
	public void run() {
		try {
			//���� �߻� ���ɼ��� �ִ� �ڵ�
			for(int i=0;i<15;i=i+1) {
				Thread.sleep(1000);
				System.out.printf("Thread Create Execute\n");
			}
		}catch(Exception e) {
			//���ܰ� �߻����� �� ������ ����
			//���� ���� ���
			System.out.printf("���� ����:%s\n",e.getMessage());
		}finally {
			//���� �߻����ο� ������� ������ ����
		}
	}
}
