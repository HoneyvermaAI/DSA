package GetterSetterPractice;

public class User2 {
    private String title;
    private String author;
    private double price;

    public User2() {
    }

    public User2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;

    }
}