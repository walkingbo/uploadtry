package java_0228;

import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatStringMain {

	public static void main(String[] args) {
		//Caledar 인스턴스를 이용한 Date 인스턴스 생성
		Calendar cal = Calendar.getInstance();
		Date today = new Date(cal.getTimeInMillis());
		
		//날짜 서식을 생성
		SimpleDateFormat sdf = new SimpleDateFormat("G YYYY-MM-DD hh:mm:ss (EEEE)");
		//날짜를 문자열로 전환
		String formatString = sdf.format(today);
		System.out.printf("%s\n", formatString);
		
		double number = 469849.848415;
		//위의 숫자는 \469,849.85로 출력하기
		DecimalFormat df=
				new DecimalFormat("\u00A4 #,###.00");
		formatString = df.format(number);
		System.out.printf("%s\n",formatString);
		
		//ChoiceFormat은 실수 배열과 문자열 배열을 이용해서 생서
		// 실부 배열만의 숫자 범위에 해당하는 문자열을 리턴하는 클래스
		double [] score = {0,60,70,80,90};
		String [] grade = {"가","양","미","우","수"};
		
		double[] jumsu = {49,79,21,60,89,88};
		//ChoiceFormat 인스턴스 생성
		ChoiceFormat cf = new ChoiceFormat(score,grade);
		for(double temp : jumsu) {
			System.out.printf("%s\n", cf.format(temp));
			
		}
		//포맷문자열 생성
		String msg ="이름:{0} 나이:{1}";
		Object [] p1 = {"박문선","50"};
		Object [] p2 = {"박희선","54"};
		
		System.out.printf("%S\n", MessageFormat.format(msg, p1));
		System.out.printf("%S\n", MessageFormat.format(msg, p2));
		
		
	}

}
