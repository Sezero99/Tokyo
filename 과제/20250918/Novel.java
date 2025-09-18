package Hw;

public class Novel extends Book {
    private String genre; // 장르

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void printInfo() {
        super.printInfo(); // 부모 정보 출력
        System.out.println("장르: " + genre);
    }
}