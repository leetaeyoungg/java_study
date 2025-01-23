package test.com;

public class Phone {
    String model;
    double size;
    int price;

    Phone(){
        this.model = "IOS"; //this. = class 안에 있는 자원
        this.size = 10.2; //this. 생략가능
        this.price = 120; //this. 생략가능
    }

    //생성자의 오버로딩(인자의 개수,인자의 타입,인자의 타입순서 확실하게 입력)
    public Phone(String model, double size, int price) {
        this.model = model; //this. = class 안에 있는 자원
        this.size = size; //this. 생략가능
        this.price = price;
    }
    public Phone(String model, double size) {
        this.model = model; //this. = class 안에 있는 자원
        this.size = size; //this. 생략가능

    }

    public Phone(double size, String model) {
        this.model = model; //this. = class 안에 있는 자원
        this.size = size; //this. 생략가능

    }

    @Override // 오버라이딩
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
