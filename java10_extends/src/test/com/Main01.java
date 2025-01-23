package test.com;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello...");
        //1. 클래스와 클래스간의 상속
        // - 단일상속만 가능 (동시에 2개이상의 클래스 상속받는것 불가)
        // - 모든클래스의 최상위클래스는 Object / 명시하지 않아도 된다.




        //자동차(Car) = field(model,price) method(start : void)
        Car car = new Car();
        System.out.println(car.model);
        System.out.println(car.price);
        car.start();
        System.out.println("============");

        //버스(Bus) = field(count,pay), method(open : void)
        //버스속성에도 모델명과 가격을 추가하고 싶을때 상속을 통해서 구현가능
        //기능도 마찬가지로 상속을 통해서 구현가능
        Bus bus = new Bus();
        System.out.println(bus.count);
        System.out.println(bus.pay);
        System.out.println(bus.model);
        System.out.println(bus.price);
        bus.open();
        bus.start();
        System.out.println("============");

        //상속관계성립 문법
        //1. extends (객체명) 예약어 사용
        //2. 익명내부클래스(무명중첩클래스) 문법 사용 :
        // 객체생성시 생성자+{}

        Car car2 = new Car(){
           String name = "lee";
           int age = 31;
           public void sleep(){
               System.out.println("sleep()");
               System.out.println(model);
               System.out.println(price);
               System.out.println(age);
               System.out.println(name);
               start();
           }

            @Override
            public void start() {
                System.out.println("inner start()");
            }
        };

        //상속이 전제로된 다형성
        //car2가 사용가능한 자원은 Car클래스의 자원만 사용가능
        //익명클래스 내부의 자원은 외부접근 불가
        car2.start();
        System.out.println(car2.price);
        System.out.println(car2.model);
        System.out.println("============");


        Car car3 = new Bus(){};
        //car3가 사용가능한 자원은 Car클래스의 자원만 사용가능
        //버스의 자원은 접근불가
        car3.start();
        System.out.println(car3.price);
        System.out.println(car3.model);
        System.out.println("============");

        Car car4 = new Taxi(){};
        System.out.println(car4.model);
        System.out.println(car4.price);
        car4.start();
        System.out.println("============");
        //다형성의 활용
        // 1. 객체초기화
        // 2. 매개변수 인자할당
        test(new Car());
        test(new Bus());
        test(new Taxi());
        test(new Car(){
            @Override
            public void start() {
                System.out.println("inner start()");
            }
        });
        System.out.println("================");
        //3. 리턴문 할당
        Car car5 = test2();
        car5.start();








    }//end main

    private static Car test2() {
        //return new Car();
        //return new Bus();
        //return new Taxi();
        return new Car(){
            @Override
            public void start() {
                System.out.println("return inner start()");
            }
        };
    }

    private static void test(Car car) {
        car.start();
    }


}//end class
