package thread;

public class ThreadMain {

	public static void main(String[] args) {
		//SampleThread t1 = new SampleThread();
		//SampleThread t2 = new SampleThread();
		
		//일반 메소드 호출-> 하나끝난 이후에 하나 시작 총 20 초 걸림
		//t1.run();
		//t2.run();
		
		//스레드 시작-> 10초만에 끝남
		//t1.start();
		//t2.start();
		/*
		//스레드 클래스로 부터 상속받는 인스턴스 생성
		ThreadEx th1 = new ThreadEx();
		th1.start();
		
		
		//anonymous class 이용
		//메모리를 절약할 수 있지만 여러개의 인스턴스를 생성 못함
		Thread th2 = new Thread() {
			public void run() {
				try {
					for(int i =0;i<20;i=i+1) {
						Thread.sleep(500);
						System.out.printf("AnonymousClass이용\n");
					}
				}catch(Exception e) {
					System.out.printf("%s\n",e.getMessage());
				}
			}
		};
		th2.start();
		
		//Runnable 인터페이스를 이용한 스레드 생성 및 시작
		Runnable th3 = new Runnable() {

			@Override
			public void run() {
				try {
					for(int i =0;i<20;i=i+1) {
						Thread.sleep(500);
						System.out.printf("Runnable 인터페이스 이용\n");
					}
				}catch(Exception e) {
					System.out.printf("%s\n",e.getMessage());
				}
			}
				
			};
			Thread th4 = new Thread(th3);//바로 start 불가
			th4.start();
			*/
		
			
//			Thread foregroundThread = new Thread() {
//				public void run() {
//					try {
//						for(int i=0;i<5;i=i+1) {
//							Thread.sleep(1000);
//							System.out.printf("포그라운드 스레드\n");
//						}
//						
//					}catch(Exception e) {
//						
//					}
//					
//				}
//			};
			//데몬스레드가 아니기 때문에 강제로 중지 시키지 않는 이상
			//5초 동안 작업을 수행
			//우선순위-절대적인 개념이 아니다 설정했지만 다른 결과가 나올 수 있다.
//			foregroundThread.setPriority(Thread.MIN_PRIORITY);
//			foregroundThread.start();

		Thread backgroundThread = new Thread() {
			public void run() {
				try {
					for (int i = 0; i < 10; i = i + 1) {
						Thread.sleep(1000);
						System.out.printf("데몬 스레드\n");
					}

				} catch (InterruptedException e) {
					//예외가 발생했을 때 스레드를 종료할 수 있도록 return을 작서
					return;
				}

			}

		};
		//데몬 스레드로 생성 - 다른 스레드가 동작중이 아니면 자동중지
		//start 호출하기 전에 설정
		//온라인게임에서 데이터 전송등에 많이 사용
		backgroundThread.setPriority(Thread.MAX_PRIORITY);
		backgroundThread.setDaemon(true);
		backgroundThread.start();
		
		Thread foregroundThread = new Thread() {
			public void run() {
				try {
					for(int i=0;i<5;i=i+1) {
						Thread.sleep(1000);
						System.out.printf("포그라운드 스레드\n");
						if(i==2) {
							//backgroundThread에 InterruptedException을 강제로
							//발생시키는 구문
							backgroundThread.interrupt();
						}
					}
					
				}catch(Exception e) {
					
				}
				
			}
		};
		//데몬스레드가 아니기 때문에 강제로 중지 시키지 않는 이상
		//5초 동안 작업을 수행
		//우선순위-절대적인 개념이 아니다 설정했지만 다른 결과가 나올 수 있다.
		foregroundThread.setPriority(Thread.MIN_PRIORITY);
		foregroundThread.start();
	}
}
