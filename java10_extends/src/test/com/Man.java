package test.com;

public class Man extends Person{
    int money = 300;
    double eye = 1.1;

    public void eat(){
        System.out.println("Man eat()");
    }

    public Man() {
    }

    @Override
    public void sleep() {
        System.out.println("Man sleep()");
    }
}
