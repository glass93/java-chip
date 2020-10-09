package testPjt;

public class MainClass05 {

	public static void main(String[] args) {
		
		/*
		 * 주석주석
		 * 주
		 * 석
		 * 주석은 디버깅, 코멘트 용도
		 */
	
		// 특수문자
	System.out.println("good\tmorning~");
	System.out.println("good\t\tmorning~");
	System.out.println("good\n\n\nmorning~");
	System.out.println("good\nmorning~");
	System.out.println("good\'morning~\'");
	System.out.println("good\"morning~\"");
	System.out.println("good\\morning~");
		

		// 서식문자
	System.out.println("오늘의 기온은 10도 입니다.");
	System.out.printf("오늘의 기온은 %d도 입니다.\n", 10);
	
	char c1 = 'a';
	char c2 = 'A';
	
	System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.\n", c1, c2);

	int num1 = 20;
	System.out.println("오늘의 기온은 " + num1 +"도 입니다.");
	System.out.printf("오늘의 기온은 %d도 입니다.\n", num1);
		
	System.out.printf("홍길동's Info. : %d학년 %d반 %d번\n", 6, 1, 41);
	
	
		// 정수
	int num2 = 30;
	System.out.printf("num2(10진수) : %d\n", num2);
	System.out.printf("num2(8진수) : %o\n", num2);
	System.out.printf("num2(16진수) : %x\n", num2);
	
		// 문자
	System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.\n", 'a', 'A');
	System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.\n", 'f', 'F');
	
	
		// 문자열
	System.out.printf("\'%s\'를 대문자로 바꾸면 \'%s\'입니다.\n", "java", "JAVA");
	
	
		// 실수
	float f = 1.23f;
	System.out.printf("f = %f\n", f);
	
	double d = 1.23456d;
	System.out.printf("d = %f\n", d);
	

		// 서식문자 정렬기능
	System.out.printf("%d\n", 123);
	System.out.printf("%d\n", 1234);
	System.out.printf("%d\n", 12345);
	
	System.out.println();
	
	System.out.printf("%5d\n", 123);
	System.out.printf("%5d\n", 1234);
	System.out.printf("%5d\n", 12345);
	
	System.out.println();
	
	// 서식문자 소수점제한 기능
	System.out.printf("%f\n", 1.23);
	System.out.printf("%.0f\n", 1.23);
	System.out.printf("%.1f\n", 1.23);
	System.out.printf("%.2f\n", 1.23);
	System.out.printf("%.3f\n", 1.23);
	
	
	}
	
}
