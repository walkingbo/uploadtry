package java_0228;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateMain {

	public static void main(String[] args) {
		//현재 날짜 및 시간을 갖는  Date 인스턴스 생성하기
		Date today = new Date();
		//toString이 재정의 되어 있어서 바로 출력하면 저장된 데이터 확인이 가능
		System.out.printf("%s\n", today);
		
		//년월일을 직접 입력해서 생성 - Deprecated
		//년도는 1900년 이후의 지나온 년도 월은 0부터 시작
		//1972년 6월 29일 할 때는 안에 72, 5를 넣어야함
		Date birth = new Date(72,5,29);
		System.out.printf("%s\n", birth);
		
		Calendar now = Calendar.getInstance();
		Calendar cal = new GregorianCalendar();
		System.out.printf("%s\n", now);
		System.out.printf("%s\n", cal);
		
		//특정한 날짜 및 시간 만들기
		//1986년 5월 5일 13시 00분 00초 만들기
		//GregorianCalendar의 생성자를 이용해서 한번에 생성가능
		cal.set(Calendar.YEAR,1980);
		cal.set(Calendar.MONTH,1);
		cal.set(Calendar.DAY_OF_MONTH,9);
		cal.set(Calendar.HOUR,00);
		
		//now에서 cal까지 지나온 날짜 수 계산
		long gap = now.getTimeInMillis()-cal.getTimeInMillis();
		gap =gap/1000/86400;
		System.out.printf("태어난 지 %d일이 지났습니다.", gap);
	}

}
