1. #### 프로그래밍 언어와 자바



<프로그래밍 언어>



1. 고급언어 - 컴퓨터와 대화할 수 있도록 만든 언어 중 사람이 가장 쉽게 이해할 수 있는 언어 ex) 파이썬, 자바, C, C++, C# ..
2. 저급언어 - 기계어에 가까운 언어 ex) 어셈블리어



<소스작성>

package ch01.sec06; //바이트코드 파일이 위치할 패키지 선언



public class Hello {  //Hello클래스 선언

  public static void main(String\[] args) { //main() 메소드 선언

    System.out.println("Hello, Java"); //콘솔에 출력하는 코드 +) Syso하고 ctrl + space 하면 자동완성

   }

}



## ---------------------------------------------------------------------------------------------------



#### <20250911 - 과제>

```java

package ch1;



import java.util.Scanner;



public class homework2 {



public static void main(String\\\\\\\[] args) {

		

//1

String password = "qwer1234";

	

if (password.equals ("qwer1234")) {

System.out.println("비밀번호가 맞아요!!");

} else {

	System.out.println("비밀번호가 틀렸어요");

}



		System.out.println("==================================");

		

		//2

		Scanner sc = new Scanner(System.in);

		String password1 = sc.nextLine();

		

		if (password1.equals("qwer1234")) {

			

			System.out.println("비밀번호가 맞아요!!");

			

		} else {

			

			System.out.println("비밀번호가 틀렸어요");



		}

		

		System.out.println("==================================");

		

		//3

		

		String animal = "강아지";

		

		if (animal.equals("강아지")) {



			System.out.println("멍멍");

			

		} else if (animal.equals("고양이")) {

			

			System.out.println("야옹");



		} else {

			

			System.out.println("무슨 동물이야?");

	

		}

		

		System.out.println("==================================");

		

		//4

		Scanner sc1 = new Scanner(System.in);

		String animal1 = sc1.nextLine();

		

		if (animal1.equals("강아지")) {

			System.out.println("멍멍");

			

		} else if (animal1.equals("고양이")) {

			

			System.out.println("야옹");

			

		} else {

			

			System.out.println("무슨 동물이야?");

			

		}

		

		System.out.println("==================================");

		

		//5

		int day = 6;

		char result = 0;

		

		switch (day) {

		case 0: 

			result = '일';

			break;

		case 1:

			result = '월';

			break;

		case 2:

			result = '화';

			break;

		case 3:

			result = '수';

			break;

		case 4:

			result = '목';

			break;

		case 5:

			result = '금';

			break;

		case 6:

			result = '토';

			break;

		default:

			System.out.println("정해진 숫자만 입력하세요.");

			return; //main 메서드 종료

	  }

		

	  if (day == 0) {

  

		  System.out.println("주말이야");

		  

	  } else if (day == 6) {

		  

		  System.out.println("주말이야");

		  

	  } else {

		  

		 System.out.println("평일이야");

	  }

		

	  System.out.println("==================================");

	  

	  //6

	  Scanner sc2 = new Scanner(System.in);

	  int day1 = sc2.nextInt();

  

   if(day1 == 1 || day1 == 6) {

		  

		  System.out.println("주말이야");

		  

	  } else if (day1 >=2 \\\\\\\&\\\\\\\& day1 <=5) {

		  

		  System.out.println("평일이야");

	  }

	

		System.out.println("==================================");

		

		//7

		Scanner sc4 = new Scanner(System.in);

		int age = sc4.nextInt();

		

		if (age >= 19) {

			

			System.out.println("성인입니다");

			

		} else {

			

			System.out.println("미성년자입니다");

			

		}

		

		System.out.println("==================================");

		

		//8

		

		System.out.println("오늘 마신 커피 수를 입력하세요");

		

		Scanner sc5 = new Scanner(System.in);

		int coffee = sc5.nextInt();

		

		if (coffee == 0) {

			

			System.out.println("여긴 어디?");

			

		} else if (coffee >= 1 \\\\\\\&\\\\\\\& coffee <= 2) {

			

			System.out.println("완전 맑은 정신~");

			

		} else if (coffee >= 3) {

			

			System.out.println("기분 좋은 상태~");

		}

		

		System.out.println("==================================");

		

		//9

		Scanner sc6 = new Scanner(System.in);

		int num = sc6.nextInt();

		int num1 = num%2;

		

		if (num1 == 0) {

			

			System.out.println("짝수입니다");

			

		} else {

			

			System.out.println("홀수입니다");

		}

   }

}	

```



## -------------------------------------------------------------------------------------------------



#### <20250912 과제>



1. ##### 배열

* 배열은 같은 타입의 값만 관리한다
* 배열의 길이는 늘리거나 줄일 수 없다



##### 2\. 배열 선언

* 타입\[] 변수; or 타입 변수\[];

ex) int\[] intArray; / double doubleArray\[];



##### 3\.  값 목록으로 배열 생성

* 배열에 저장할 값의 목록이 있다면

-> 타입\[] 변수 = {값0, 값1, 값2, ... };

+) 문자열은 String season = {"Spring", "Summer", "Fall", "Winter"};



+) 만약 season\[1]을 "여름" 으로 바꾸고 싶다면 season\[1] = "여름";



* 배열 변수 미리 선언한 경우에는 값 목록을 변수에 대입할 수 없음

타입\[] 변수;

변수 = {값0, 값1, 값2 ... }  //컴파일 에러



이런 경우에는 

-> 변수 = new 타입 \[] {값0, 값1, 값2 ...}; 로 new를 붙여야함



* new 연산자로 배열 생성

-> 타입\[] 변수 = new 타입\[길이];



+) 이미 배열 변수 선언된 경우에는

-> 타입\[] 변수 = null;

변수 = new 타입\[길이];



ex) 길이 5인 int\[] 배열 생성하고, 배열 번지 intArray 변수에 대입

-> int\[] intArray = new int\[5];



+)  int 배열 처음으로 생성했다면 항목은 모두 0으로 초기화, String 배열로 생성했다면 항목 모두 null로 초기화



##### 4\. 배열 길이

* 배열에 저장할 수 있는 항목의 수

-> 배열변수.length;



* 배열의 length 필드는 읽기만 가능해서 

int Array.length = 10; //컴파일 에러



ex) length 예시

int scores = {84, 90, 96}; //배열 변수 선언과 배열 대입

int sum = 0;

for (int = 0; i < scores.length; i++) {

&nbsp;           sumn += scores\[i];

}

Syso ("총합 : " + sum);

---------------------------------------------------------------------------------------------

package ch1;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		
		//1
		System.out.print("주문할 치킨 수를 입력해주세요 : ");
		Scanner sc1 = new Scanner(System.in);
		int ch = sc1.nextInt();
		for (int i = 1; i <= ch; i++) {
			
			System.out.println("치킨 " + i + "마리 주문이요~");
			
		}
		
		System.out.println("==========");
		
		//2
		System.out.print("스쿼트 몇 번 할까요? : ");
		Scanner sc2 = new Scanner(System.in);
		int sq = sc2.nextInt();
		
		for (int i = 1; i <= sq; i++) {
			
			System.out.println("스쿼트 " + i + "회 완료");
			
		}
		
		System.out.println("오늘 운동 끝~");
		
		System.out.println("==========");
		
		//3
		System.out.print("수를 입력하여주세요 : ");
		Scanner sc3 = new Scanner(System.in);
		int num = sc3.nextInt();
		
		for (int i = 0; i <= num; i++) {
			
			if (i%2 == 0) {
				
				System.out.println(i);
				
			}
		}
		
		System.out.println("==========");
		
		//4
		Scanner sc4 = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		int num4 = sc4.nextInt();
		
		System.out.print("두번째 숫자 입력 : ");
		int num5 = sc4.nextInt();
		
		if (num4 <= num5) {
			
			for (int i = num4+1; i < num5; i++) {
			
			System.out.println(i);
			
		}
			
			
		} else {
			
			for (int i = num5+1; i < num4; i++) {
				
				System.out.println(i);
				
			}

		}
		
		
		System.out.println("==========");
		
		//5
		for (int i = 1; i <= 9; i++) {
			System.out.println(3*i);
			
		}
		
		System.out.println("==========");
		
		//6
		System.out.print("숫자 하나를 입력해주세요 : ");
		Scanner sc6 = new Scanner(System.in);
		
		int num6 = sc6.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			
			System.out.println(num6 + "*" + i + "=" + num6*i);
			
		}
		
		System.out.println("==========");
		
		//7
		System.out.print("숫자 하나를 입력해주세요 : ");
		Scanner sc7 = new Scanner(System.in);
		int num7 = sc7.nextInt();
		
		if (num7 % 3 == 0) {
			
			System.out.println("점프!");
			
		} else {
			
			System.out.println("패스~");

		}
		
		System.out.println("==========");
		
		//8
		System.out.print("숫자 하나를 입력해주세요 : ");
		Scanner sc8 = new Scanner(System.in);
		int num8 = sc8.nextInt();
		
		for (int i = 0; i < num8; i++) {           // 행 반복 ex) i = 0일 때 j = 0,1,2 / i = 1일 때 j = 0,1,2 / i = 2일 때 j = 0,1,2
            for (int j = 0; j < num8; j++) {       // 열 반복
            	
                System.out.print("*");
            }
            
            System.out.println();               // 한 행 끝나면 줄바꿈
        }
		
		 System.out.println("==========");
		
		//9
		 Scanner sc9 = new Scanner(System.in);
		
		 System.out.print("피자 조각 수 입력 : ");
	     int slices = sc9.nextInt();

	     System.out.print("사람 수 입력 : ");
	     int people = sc9.nextInt();

		
		int p = slices/people;
		int z = slices%people;
		
		System.out.println("한 사람이 먹을 수 있는 피자 조각 : " + p);
		System.out.println("남은 피자 조각 : " + z);
		
		System.out.println("==========");
		
		//10
		Scanner sc10 = new Scanner(System.in);
		
		System.out.print("첫번째 주사위 수 : ");
		int di = sc10.nextInt();
		
		System.out.print("두번째 주사위 수 : ");
		int ce = sc10.nextInt();
		
		System.out.println("두 수의 합은 : " + (di + ce));
		
		System.out.println("==========");
		
		//11
	    Random ran = new Random(); //랜덤 변수
				
	    int result = ran.nextInt(50) + 1; // 0~49에서 +1해서 1~50까지의 수로 맞추기
	    
	    Scanner sc11 = new Scanner(System.in);
	    
	    int guess = 0; // 뒤에 while문에서 target 값과 비교해야하니 임의로 guess값을 0으로 선언
	    
	    System.out.print("1~50 사이의 숫자를 맞춰보세요");
	    
	    while (guess != result) { // 'for문'은 보통 횟수가 정해진 반복문 , 'while문'은 언제 끝날지 모르는 반복
	    	                      // 'while'문은 무한반복인데 guess == result 값이 되면 빠져나옴
	    	
	    	System.out.print("숫자 입력 : ");
	    	guess = sc11.nextInt(); //이미 선언했으니 'int' 할 필요가 없음
			
	    	if (guess < result) {
	    		
	    		System.out.println("UP!");
				
			} else if (guess > result) {
				
				System.out.println("DOWN!");

			} else {
				
				System.out.println("정답입니다!");
			}
		}
	    
	    sc1.close();
	    sc2.close();
	    sc3.close();
	    sc4.close();
	    sc6.close();
	    sc7.close();
	    sc8.close();
	    sc9.close();
	    sc10.close();
	    sc11.close();
	}
}

----------------------------------------------------------------------------------------------------------------------------------
<20250915 과제>

package ch2;

import java.util.Scanner;

public class Deposit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int num = 0;
		int money = 0; // 입출금액
		int balance = 0; // 잔고
		
		while (run) { // 원하는 바를 이룰 때까지 프로그램 진행
			
			System.out.println("==================================");
			System.out.println("1: 예금 | 2: 출금 | 3: 잔고 | 4: 종료 ");
			System.out.println("==================================");
			System.out.print("번호를 입력하세요 : ");
			num = sc.nextInt();
			
			switch (num) {
			case 1: {
				System.out.print("입금액을 입력해주세요 : ");
				money = sc.nextInt();
				balance += money;
				System.out.println(money + " 입금되었습니다");
				break;
			}
			
			case 2: {
				System.out.print("출금액을 입력해주세요 : ");
				money = sc.nextInt();
				if (balance < money) {
					System.out.println("출금할 수 없습니다");
				} else {
					
					balance -= money;
					System.out.println(money + " 출금되었습니다");
				}
				
				
				break;
			}
			
			case 3: {
				
				System.out.println("잔고 : " + balance);
				break;
				
			}
			
			case 4: {
				
				run = false;
				break;
			}

			default:
				System.out.println("잘못된 입력입니다");
				break;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}








