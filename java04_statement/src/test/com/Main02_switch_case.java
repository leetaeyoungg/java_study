package test.com;

public class Main02_switch_case {
    public static void main(String[] args) {
        System.out.println("hello");

        String key = "java";
        switch (key){
            case "java":
                System.out.println("java");
                break;
            case "html":
                System.out.println("html..");
                break;
            default:
                System.out.println("other..");
                break;

        }//end switch

        int su1 = 10 , su2 = 20; //같은타입 변수선언시 연결해서 선언가능
        char c = '-';
        switch (c) {
            case '-':
                System.out.println(su1 - su2);
                break;
            case '+':
                System.out.println(su1 + su2);
                break;
            default:
                System.out.println("other..");
                break;
        }//end switch

    }//end main
}// end class