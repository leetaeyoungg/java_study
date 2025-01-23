package test.com.map;

import test.com.set.Car;
import test.com.set.PersonVO;

import java.util.*;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("hello");

        //Map<Key 객체,Value 객체> - Key는 유니크, Value는 중복허용 : HashMap
        //Key 보통 문자열로 표기

        Map<String,Object> map = new HashMap<>();
        map.put("kor",99);
        map.put("eng",88);
        map.put("eng",66); // 나중에 put된 키로 값이 덮어쓴다.
        map.put("math",77);
        map.put("name","kim");
        map.put("car",new Car());
        map.put("person",new PersonVO());
        map.put("list", Arrays.asList(11,22,33));
        map.put("set",new HashSet<>());

        System.out.println("map.size():" +map.size());
        System.out.println(map.get("kor"));
        System.out.println(map.get("eng"));
        System.out.println(map.get("math"));
        System.out.println(map.get("name"));
        System.out.println(map.get("car"));
        System.out.println(map.get("person"));

        System.out.println("Key 정보 : " +map.keySet());

        for (String key : map.keySet()){
            System.out.println(key+ " : "+ map.get(key));
        }

        System.out.println("=============");
        //1.Map<String,Car>
        Map<String, Car> carMap = new HashMap<>();
        carMap.put("model",new Car("BMW"));
        carMap.put("color",new Car("white"));
        System.out.println(carMap);
        System.out.println(carMap.get("model"));
        System.out.println(carMap.get("color"));
        System.out.println("=============");

        //2.Map<String,Person>
        Map<String, PersonVO> personVOMap = new HashMap<>();
        personVOMap.put("p1",new PersonVO());
        personVOMap.put("p2",new PersonVO(11,"lee",33));
        System.out.println(personVOMap);
        System.out.println(personVOMap.get("p1"));
        System.out.println(personVOMap.get("p2"));

        System.out.println("=============");
        //3.Map<String,List<Person>
        Map<String,List<PersonVO>> ListMap = new HashMap<>();
        List<PersonVO> list1 = new ArrayList<>();
        list1.add(new PersonVO());
        list1.add(new PersonVO(22,"kim",22));
        ListMap.put("list1",list1);

        List<PersonVO> list2 = new ArrayList<>();
        list2.add(new PersonVO());
        list2.add(new PersonVO(33,"kim33",33));
        ListMap.put("list2",list2);

        System.out.println(ListMap);
        System.out.println(ListMap.get("list1"));
        System.out.println(ListMap.get("list2"));
        System.out.println("=============");

        for (PersonVO x :ListMap.get("list1")){
            System.out.print(x.getNum()+" ");
            System.out.print(x.getName()+" ");
            System.out.println(x.getAge());
        }
        for (PersonVO x :ListMap.get("list2")){
            System.out.print(x.getNum()+" ");
            System.out.print(x.getName()+" ");
            System.out.println(x.getAge());
        }
        System.out.println("=============");

        for (String key : ListMap.keySet()){
            for (PersonVO x : ListMap.get(key)){
                System.out.print(x.getNum()+" ");
                System.out.print(x.getName()+" ");
                System.out.println(x.getAge());
            }
        }

    }//end main
}//end class
