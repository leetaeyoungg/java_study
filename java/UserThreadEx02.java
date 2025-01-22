package test.com;

public class UserThreadEx02 extends Thread{
    private Calculator cal;

    public Calculator getCal() {
        return cal;
    }

    public void setCal(Calculator cal) {
        this.cal = cal;
        this.setName("UserThreadEx02");//Thread 이름 변경
    }

    @Override
    public void run() {
        System.out.println("UserThreadEx02 run()...");
        cal.setMoney(50);
    }
}
