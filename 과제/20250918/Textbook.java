package Hw;

public class Textbook extends Book {
    private String subject; // 과목명

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void printInfo() {
        super.printInfo(); // 부모 정보 출력
        System.out.println("과목명: " + subject);
    }
}
