package testPjt;

public class MainClass05 {

	public static void main(String[] args) {
		
		/*
		 * �ּ��ּ�
		 * ��
		 * ��
		 * �ּ��� �����, �ڸ�Ʈ �뵵
		 */
	
		// Ư������
	System.out.println("good\tmorning~");
	System.out.println("good\t\tmorning~");
	System.out.println("good\n\n\nmorning~");
	System.out.println("good\nmorning~");
	System.out.println("good\'morning~\'");
	System.out.println("good\"morning~\"");
	System.out.println("good\\morning~");
		

		// ���Ĺ���
	System.out.println("������ ����� 10�� �Դϴ�.");
	System.out.printf("������ ����� %d�� �Դϴ�.\n", 10);
	
	char c1 = 'a';
	char c2 = 'A';
	
	System.out.printf("�ҹ��� \'%c\'�� �빮�ڴ� \'%c\'�Դϴ�.\n", c1, c2);

	int num1 = 20;
	System.out.println("������ ����� " + num1 +"�� �Դϴ�.");
	System.out.printf("������ ����� %d�� �Դϴ�.\n", num1);
		
	System.out.printf("ȫ�浿's Info. : %d�г� %d�� %d��\n", 6, 1, 41);
	
	
		// ����
	int num2 = 30;
	System.out.printf("num2(10����) : %d\n", num2);
	System.out.printf("num2(8����) : %o\n", num2);
	System.out.printf("num2(16����) : %x\n", num2);
	
		// ����
	System.out.printf("�ҹ��� \'%c\'�� �빮�ڴ� \'%c\'�Դϴ�.\n", 'a', 'A');
	System.out.printf("�ҹ��� \'%c\'�� �빮�ڴ� \'%c\'�Դϴ�.\n", 'f', 'F');
	
	
		// ���ڿ�
	System.out.printf("\'%s\'�� �빮�ڷ� �ٲٸ� \'%s\'�Դϴ�.\n", "java", "JAVA");
	
	
		// �Ǽ�
	float f = 1.23f;
	System.out.printf("f = %f\n", f);
	
	double d = 1.23456d;
	System.out.printf("d = %f\n", d);
	

		// ���Ĺ��� ���ı��
	System.out.printf("%d\n", 123);
	System.out.printf("%d\n", 1234);
	System.out.printf("%d\n", 12345);
	
	System.out.println();
	
	System.out.printf("%5d\n", 123);
	System.out.printf("%5d\n", 1234);
	System.out.printf("%5d\n", 12345);
	
	System.out.println();
	
	// ���Ĺ��� �Ҽ������� ���
	System.out.printf("%f\n", 1.23);
	System.out.printf("%.0f\n", 1.23);
	System.out.printf("%.1f\n", 1.23);
	System.out.printf("%.2f\n", 1.23);
	System.out.printf("%.3f\n", 1.23);
	
	
	}
	
}
