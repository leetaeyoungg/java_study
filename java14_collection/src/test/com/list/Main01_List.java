package test.com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main01_List {

    List<TestVO> vos= new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("hello");

        //컬렉션 객체 - 자바의 자료구조 객체들
        //특징 - 배열의 길이가 가변적
        //구분 - index 순서 O : List 계열
        //      index 순서 X : Set, Map 계열

        //1.List<> , '<>' = 제네릭 : 객체타입명시
        //제네릭<>을 명시하지 않으면 모든타입의 배열을 할당 할 수 있다.
        //그렇지만 아래와 같은 코드는 실무에서는 권장하지 않는다
        //ArrayList,Vector ...
        //특징 : 순서가있고, 중복데이터허용
        ArrayList list = new ArrayList();//[]
        list.add(1);
        list.add(2);
        list.add(3);
        list.add("Kim");
        list.add(new int[]{11, 22, 33});
        System.out.println(list);
        System.out.println("=================");


        ArrayList<Integer> list2 = new ArrayList<>();//[]
        list2.add(1111);
        list2.add(1111);
        list2.add(2222);
        list2.add(2222);
        //list2.add("Kim"); *error
        //list2.add(new int[]{11,22,33}); *error
        System.out.println("List2.size() : " + list2.size()); // 배열의길이
        System.out.println(list2);
        System.out.println(list2.get(0)); //데이터획득
        System.out.println(list2.get(2));
        list2.set(0, 999); //데이터변경
        list2.set(1, 888);
        System.out.println(list2);
        list2.remove(2);//데이터제거
        System.out.println(list2);
        list2.clear();//모두제거 = []
        System.out.println(list2);

        System.out.println("=================");
        ArrayList<String> strs = new ArrayList<>();
        strs.add("kim1");
        strs.add("kim1");
        strs.add("kim11");
        strs.add("kim111");

        for (int i = 0; i < strs.size(); i++) {
            System.out.println(strs.get(i));
        }
        System.out.println("=================");

        for (String x : strs) {
            System.out.println(x);
        }

        System.out.println("=================");
        //Arrays.asList = 사이즈변경불가 배열생성
        //List<Integer> datas = Arrays.asList(11,22,33,44,55,66);
        Integer[] sus = new Integer[]{11, 22, 33, 44, 55, 66};
        List<Integer> datas = Arrays.asList(sus);
        System.out.println(datas);
        //datas.add(55); *배열데이터 추가하면 실행시 Error
        datas.set(0, 33); // 데이터변경은 가능
        System.out.println(datas);
        System.out.println("=================");

        //List<String> datas2 = Arrays.asList("kim","lee","han","park");
        List<String> datas2 = Arrays.asList(new String[]{"kim", "lee", "han", "park"});

        System.out.println(datas2);
        System.out.println("=================");
    //ArrayList<TestVO> vos= new ArrayList<>();
    List<TestVO> vos= new ArrayList<>(); //다형성
    vos.add(new TestVO(11,"lee",22));
    vos.add(new TestVO(33,"kim",44));
    vos.add(new TestVO());
    TestVO vo = new TestVO();
    vo.setNum(55);
    vo.setName("han");
    vo.setAge(66);
        System.out.println(vos);

        for (TestVO x : vos){
            System.out.println(x);
            System.out.println(x.getNum());
            System.out.println(x.getAge());
            System.out.println(x.getName());
        }

        Main01_List main = new Main01_List();

        main.vos.add(new TestVO(1122,"lee",3344));
        System.out.println(main.vos);


    }//end main
}//end class
