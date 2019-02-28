package thread;
//Thread 클래스로부터 상속받는 클래스
public class ThreadEx extends Thread {
	//오버라이딩 된 메소드인지 확인해주는 어노테이션
	//이 구문이 에러이면 오버라이딩 된 메소드가 아니다.
	
	
	@Override
	public void run() {
		try {
			//예외 발생 가능성이 있는 코드
			for(int i=0;i<15;i=i+1) {
				Thread.sleep(1000);
				System.out.printf("Thread Create Execute\n");
			}
		}catch(Exception e) {
			//예외가 발생했을 때 수행할 내용
			//예외 내용 출력
			System.out.printf("예외 내용:%s\n",e.getMessage());
		}finally {
			//예외 발생여부에 상관없이 수행할 내용
		}
	}
}
