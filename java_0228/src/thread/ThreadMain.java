package thread;

public class ThreadMain {

	public static void main(String[] args) {
		//SampleThread t1 = new SampleThread();
		//SampleThread t2 = new SampleThread();
		
		//�Ϲ� �޼ҵ� ȣ��-> �ϳ����� ���Ŀ� �ϳ� ���� �� 20 �� �ɸ�
		//t1.run();
		//t2.run();
		
		//������ ����-> 10�ʸ��� ����
		//t1.start();
		//t2.start();
		/*
		//������ Ŭ������ ���� ��ӹ޴� �ν��Ͻ� ����
		ThreadEx th1 = new ThreadEx();
		th1.start();
		
		
		//anonymous class �̿�
		//�޸𸮸� ������ �� ������ �������� �ν��Ͻ��� ���� ����
		Thread th2 = new Thread() {
			public void run() {
				try {
					for(int i =0;i<20;i=i+1) {
						Thread.sleep(500);
						System.out.printf("AnonymousClass�̿�\n");
					}
				}catch(Exception e) {
					System.out.printf("%s\n",e.getMessage());
				}
			}
		};
		th2.start();
		
		//Runnable �������̽��� �̿��� ������ ���� �� ����
		Runnable th3 = new Runnable() {

			@Override
			public void run() {
				try {
					for(int i =0;i<20;i=i+1) {
						Thread.sleep(500);
						System.out.printf("Runnable �������̽� �̿�\n");
					}
				}catch(Exception e) {
					System.out.printf("%s\n",e.getMessage());
				}
			}
				
			};
			Thread th4 = new Thread(th3);//�ٷ� start �Ұ�
			th4.start();
			*/
		
			
//			Thread foregroundThread = new Thread() {
//				public void run() {
//					try {
//						for(int i=0;i<5;i=i+1) {
//							Thread.sleep(1000);
//							System.out.printf("���׶��� ������\n");
//						}
//						
//					}catch(Exception e) {
//						
//					}
//					
//				}
//			};
			//���󽺷��尡 �ƴϱ� ������ ������ ���� ��Ű�� �ʴ� �̻�
			//5�� ���� �۾��� ����
			//�켱����-�������� ������ �ƴϴ� ���������� �ٸ� ����� ���� �� �ִ�.
//			foregroundThread.setPriority(Thread.MIN_PRIORITY);
//			foregroundThread.start();

		Thread backgroundThread = new Thread() {
			public void run() {
				try {
					for (int i = 0; i < 10; i = i + 1) {
						Thread.sleep(1000);
						System.out.printf("���� ������\n");
					}

				} catch (InterruptedException e) {
					//���ܰ� �߻����� �� �����带 ������ �� �ֵ��� return�� �ۼ�
					return;
				}

			}

		};
		//���� ������� ���� - �ٸ� �����尡 �������� �ƴϸ� �ڵ�����
		//start ȣ���ϱ� ���� ����
		//�¶��ΰ��ӿ��� ������ ���۵ ���� ���
		backgroundThread.setPriority(Thread.MAX_PRIORITY);
		backgroundThread.setDaemon(true);
		backgroundThread.start();
		
		Thread foregroundThread = new Thread() {
			public void run() {
				try {
					for(int i=0;i<5;i=i+1) {
						Thread.sleep(1000);
						System.out.printf("���׶��� ������\n");
						if(i==2) {
							//backgroundThread�� InterruptedException�� ������
							//�߻���Ű�� ����
							backgroundThread.interrupt();
						}
					}
					
				}catch(Exception e) {
					
				}
				
			}
		};
		//���󽺷��尡 �ƴϱ� ������ ������ ���� ��Ű�� �ʴ� �̻�
		//5�� ���� �۾��� ����
		//�켱����-�������� ������ �ƴϴ� ���������� �ٸ� ����� ���� �� �ִ�.
		foregroundThread.setPriority(Thread.MIN_PRIORITY);
		foregroundThread.start();
	}
}
