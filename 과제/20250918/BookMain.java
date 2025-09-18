package Hw;

public class BookMain {
    public static void main(String[] args) {
        // 전공서적
        Textbook tb = new Textbook();
        tb.setTitle("자바 프로그래밍");
        tb.setAuthor("홍길동");
        tb.setPrice(25000);
        tb.setSubject("컴퓨터공학");

        // 소설
        Novel nv = new Novel();
        nv.setTitle("해리포터");
        nv.setAuthor("J.K. 롤링");
        nv.setPrice(15000);
        nv.setGenre("판타지");

        // 출력
        System.out.println("=== 전공서적 정보 ===");
        tb.printInfo();

        System.out.println("\n=== 소설 정보 ===");
        nv.printInfo();
    }
}
