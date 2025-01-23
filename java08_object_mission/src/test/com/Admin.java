package test.com;

public class Admin {

    private int num;
    private String id;
    private String pw;
    private String name;
    private String tel;
    private final String tel2 = "010";
    // 전역변수의 final은 반드시 선언시 초기화
    // 값변경 불가


    public Admin() {
    }

    public Admin(int num, String id, String pw, String name, String tel) {
        this.num = num;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "num=" + num +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
