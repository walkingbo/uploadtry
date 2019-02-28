package java_0228;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateMain {

	public static void main(String[] args) {
		//���� ��¥ �� �ð��� ����  Date �ν��Ͻ� �����ϱ�
		Date today = new Date();
		//toString�� ������ �Ǿ� �־ �ٷ� ����ϸ� ����� ������ Ȯ���� ����
		System.out.printf("%s\n", today);
		
		//������� ���� �Է��ؼ� ���� - Deprecated
		//�⵵�� 1900�� ������ ������ �⵵ ���� 0���� ����
		//1972�� 6�� 29�� �� ���� �ȿ� 72, 5�� �־����
		Date birth = new Date(72,5,29);
		System.out.printf("%s\n", birth);
		
		Calendar now = Calendar.getInstance();
		Calendar cal = new GregorianCalendar();
		System.out.printf("%s\n", now);
		System.out.printf("%s\n", cal);
		
		//Ư���� ��¥ �� �ð� �����
		//1986�� 5�� 5�� 13�� 00�� 00�� �����
		//GregorianCalendar�� �����ڸ� �̿��ؼ� �ѹ��� ��������
		cal.set(Calendar.YEAR,1980);
		cal.set(Calendar.MONTH,1);
		cal.set(Calendar.DAY_OF_MONTH,9);
		cal.set(Calendar.HOUR,00);
		
		//now���� cal���� ������ ��¥ �� ���
		long gap = now.getTimeInMillis()-cal.getTimeInMillis();
		gap =gap/1000/86400;
		System.out.printf("�¾ �� %d���� �������ϴ�.", gap);
	}

}
