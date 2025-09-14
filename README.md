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



\\\&nbsp;	public static void main(String\\\\\\\[] args) {

\\\&nbsp;		

\\\&nbsp;		//1

\\\&nbsp;		String password = "qwer1234";

\\\&nbsp;		

\\\&nbsp;		if (password.equals ("qwer1234")) {

\\\&nbsp;			System.out.println("비밀번호가 맞아요!!");

\\\&nbsp;		} else {

\\\&nbsp;			System.out.println("비밀번호가 틀렸어요");

\\\&nbsp;		}



\\\&nbsp;		System.out.println("==================================");

\\\&nbsp;		

\\\&nbsp;		//2

\\\&nbsp;		Scanner sc = new Scanner(System.in);

\\\&nbsp;		String password1 = sc.nextLine();

\\\&nbsp;		

\\\&nbsp;		if (password1.equals("qwer1234")) {

\\\&nbsp;			

\\\&nbsp;			System.out.println("비밀번호가 맞아요!!");

\\\&nbsp;			

\\\&nbsp;		} else {

\\\&nbsp;			

\\\&nbsp;			System.out.println("비밀번호가 틀렸어요");



\\\&nbsp;		}

\\\&nbsp;		

\\\&nbsp;		System.out.println("==================================");

\\\&nbsp;		

\\\&nbsp;		//3

\\\&nbsp;		

\\\&nbsp;		String animal = "강아지";

\\\&nbsp;		

\\\&nbsp;		if (animal.equals("강아지")) {

\\\&nbsp;			

\\\&nbsp;			System.out.println("멍멍");

\\\&nbsp;			

\\\&nbsp;		} else if (animal.equals("고양이")) {

\\\&nbsp;			

\\\&nbsp;			System.out.println("야옹");



\\\&nbsp;		} else {

\\\&nbsp;			

\\\&nbsp;			System.out.println("무슨 동물이야?");

\\\&nbsp;			

\\\&nbsp;		}

\\\&nbsp;		

\\\&nbsp;		System.out.println("==================================");

\\\&nbsp;		

\\\&nbsp;		//4

\\\&nbsp;		Scanner sc1 = new Scanner(System.in);

\\\&nbsp;		String animal1 = sc1.nextLine();

\\\&nbsp;		

\\\&nbsp;		if (animal1.equals("강아지")) {

\\\&nbsp;			System.out.println("멍멍");

\\\&nbsp;			

\\\&nbsp;		} else if (animal1.equals("고양이")) {

\\\&nbsp;			

\\\&nbsp;			System.out.println("야옹");

\\\&nbsp;			

\\\&nbsp;		} else {

\\\&nbsp;			

\\\&nbsp;			System.out.println("무슨 동물이야?");

\\\&nbsp;			

\\\&nbsp;		}

\\\&nbsp;		

\\\&nbsp;		System.out.println("==================================");

\\\&nbsp;		

\\\&nbsp;		//5

\\\&nbsp;		int day = 6;

\\\&nbsp;		char result = 0;

\\\&nbsp;		

\\\&nbsp;		switch (day) {

\\\&nbsp;		case 0: 

\\\&nbsp;			result = '일';

\\\&nbsp;			break;

\\\&nbsp;		case 1:

\\\&nbsp;			result = '월';

\\\&nbsp;			break;

\\\&nbsp;		case 2:

\\\&nbsp;			result = '화';

\\\&nbsp;			break;

\\\&nbsp;		case 3:

\\\&nbsp;			result = '수';

\\\&nbsp;			break;

\\\&nbsp;		case 4:

\\\&nbsp;			result = '목';

\\\&nbsp;			break;

\\\&nbsp;		case 5:

\\\&nbsp;			result = '금';

\\\&nbsp;			break;

\\\&nbsp;		case 6:

\\\&nbsp;			result = '토';

\\\&nbsp;			break;

\\\&nbsp;		default:

\\\&nbsp;			System.out.println("정해진 숫자만 입력하세요.");

\\\&nbsp;			return; //main 메서드 종료

\\\&nbsp;	  }

\\\&nbsp;		

\\\&nbsp;	  if (day == 0) {

\\\&nbsp;		  

\\\&nbsp;		  System.out.println("주말이야");

\\\&nbsp;		  

\\\&nbsp;	  } else if (day == 6) {

\\\&nbsp;		  

\\\&nbsp;		  System.out.println("주말이야");

\\\&nbsp;		  

\\\&nbsp;	  } else {

\\\&nbsp;		  

\\\&nbsp;		 System.out.println("평일이야");

\\\&nbsp;	  }

\\\&nbsp;		

\\\&nbsp;	  System.out.println("==================================");

\\\&nbsp;	  

\\\&nbsp;	  //6

\\\&nbsp;	  Scanner sc2 = new Scanner(System.in);

\\\&nbsp;	  int day1 = sc2.nextInt();

\\\&nbsp;	  

\\\&nbsp;	  if(day1 == 1 || day1 == 6) {

\\\&nbsp;		  

\\\&nbsp;		  System.out.println("주말이야");

\\\&nbsp;		  

\\\&nbsp;	  } else if (day1 >=2 \\\\\\\&\\\\\\\& day1 <=5) {

\\\&nbsp;		  

\\\&nbsp;		  System.out.println("평일이야");

\\\&nbsp;	  }

\\\&nbsp;		

\\\&nbsp;		System.out.println("==================================");

\\\&nbsp;		

\\\&nbsp;		//7

\\\&nbsp;		Scanner sc4 = new Scanner(System.in);

\\\&nbsp;		int age = sc4.nextInt();

\\\&nbsp;		

\\\&nbsp;		if (age >= 19) {

\\\&nbsp;			

\\\&nbsp;			System.out.println("성인입니다");

\\\&nbsp;			

\\\&nbsp;		} else {

\\\&nbsp;			

\\\&nbsp;			System.out.println("미성년자입니다");

\\\&nbsp;			

\\\&nbsp;		}

\\\&nbsp;		

\\\&nbsp;		System.out.println("==================================");

\\\&nbsp;		

\\\&nbsp;		//8

\\\&nbsp;		

\\\&nbsp;		System.out.println("오늘 마신 커피 수를 입력하세요");

\\\&nbsp;		

\\\&nbsp;		Scanner sc5 = new Scanner(System.in);

\\\&nbsp;		int coffee = sc5.nextInt();

\\\&nbsp;		

\\\&nbsp;		if (coffee == 0) {

\\\&nbsp;			

\\\&nbsp;			System.out.println("여긴 어디?");

\\\&nbsp;			

\\\&nbsp;		} else if (coffee >= 1 \\\\\\\&\\\\\\\& coffee <= 2) {

\\\&nbsp;			

\\\&nbsp;			System.out.println("완전 맑은 정신~");

\\\&nbsp;			

\\\&nbsp;		} else if (coffee >= 3) {

\\\&nbsp;			

\\\&nbsp;			System.out.println("기분 좋은 상태~");

\\\&nbsp;		}

\\\&nbsp;		

\\\&nbsp;		System.out.println("==================================");

\\\&nbsp;		

\\\&nbsp;		//9

\\\&nbsp;		Scanner sc6 = new Scanner(System.in);

\\\&nbsp;		int num = sc6.nextInt();

\\\&nbsp;		int num1 = num%2;

\\\&nbsp;		

\\\&nbsp;		if (num1 == 0) {

\\\&nbsp;			

\\\&nbsp;			System.out.println("짝수입니다");

\\\&nbsp;			

\\\&nbsp;		} else {

\\\&nbsp;			

\\\&nbsp;			System.out.println("홀수입니다");

\\\&nbsp;		}

\\\&nbsp;   }

}	

```



## -------------------------------------------------------------------------------------------------------------------------------------------



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









