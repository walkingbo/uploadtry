package java_0228;

import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormatStringMain {

	public static void main(String[] args) {
		//Caledar �ν��Ͻ��� �̿��� Date �ν��Ͻ� ����
		Calendar cal = Calendar.getInstance();
		Date today = new Date(cal.getTimeInMillis());
		
		//��¥ ������ ����
		SimpleDateFormat sdf = new SimpleDateFormat("G YYYY-MM-DD hh:mm:ss (EEEE)");
		//��¥�� ���ڿ��� ��ȯ
		String formatString = sdf.format(today);
		System.out.printf("%s\n", formatString);
		
		double number = 469849.848415;
		//���� ���ڴ� \469,849.85�� ����ϱ�
		DecimalFormat df=
				new DecimalFormat("\u00A4 #,###.00");
		formatString = df.format(number);
		System.out.printf("%s\n",formatString);
		
		//ChoiceFormat�� �Ǽ� �迭�� ���ڿ� �迭�� �̿��ؼ� ����
		// �Ǻ� �迭���� ���� ������ �ش��ϴ� ���ڿ��� �����ϴ� Ŭ����
		double [] score = {0,60,70,80,90};
		String [] grade = {"��","��","��","��","��"};
		
		double[] jumsu = {49,79,21,60,89,88};
		//ChoiceFormat �ν��Ͻ� ����
		ChoiceFormat cf = new ChoiceFormat(score,grade);
		for(double temp : jumsu) {
			System.out.printf("%s\n", cf.format(temp));
			
		}
		//���˹��ڿ� ����
		String msg ="�̸�:{0} ����:{1}";
		Object [] p1 = {"�ڹ���","50"};
		Object [] p2 = {"����","54"};
		
		System.out.printf("%S\n", MessageFormat.format(msg, p1));
		System.out.printf("%S\n", MessageFormat.format(msg, p2));
		
		
	}

}
