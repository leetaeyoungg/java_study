package test.com;

public class NoteBook {

    int price;
    String color;
    double size;

    @Override
    public String toString() {
        return "NoteBook{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
