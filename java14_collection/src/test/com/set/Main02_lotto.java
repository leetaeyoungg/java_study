package test.com.set;

import java.util.*;

public class Main02_lotto {
    public static void main(String[] args) {
        System.out.println("hello");

        Random random = new Random();
        Set<Integer> lotto = new HashSet<>();


        while (lotto.size() < 6) { // 0~5 까지 6개를 획득할때까지 무한으로 실행
            int lottoNum = random.nextInt(45) + 1; // (0~44)+1: 1부터 45까지의 랜덤 값 생성
            lotto.add(lottoNum); // lotto=set특성상 중복을 자동으로 제거
        }//end while
        System.out.println(lotto);

        //Set 데이터들을 오름차순으로 정렬해보자.
        //Set 자체로는 정렬기능이 없다.
        //정렬이 가능한 객체에 할당해서 정렬
        //1.Object[]을 이용하기.
        Object[] arr = lotto.toArray();
        Arrays.sort(arr); // Object 오름차순 정렬
        System.out.println(Arrays.toString(arr));
        System.out.println("===================================");

        //2.List + Collections 이용하기
        List<Integer> list = new ArrayList<>(lotto);
        System.out.println(list);
        Collections.sort(list);// 컬렉션 오름차순 정렬 (순정렬)
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());// 컬렉션 내림차순 정렬 (역정렬)
        System.out.println(list);
        System.out.println("===================================");

        //익명중첩클래스 : 오름차순과 내림차순을 리턴값의 설정에 따라 결정가능
        list = Arrays.asList(32, 19, 4, 38, 24, 28);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //return o1 - o2;// 순정렬(asc)
                return o2 - o1;// 역정렬(desc)
            }
        });
        System.out.println(list);
        System.out.println("===================================");

        //문자열정렬 가능
        List<String> strs = Arrays.asList("ccc","bbb","ddd","aaa");
        Collections.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //return o1.compareTo(o2); // asc 순정렬
                return o2.compareTo(o1); // desc 역정렬
            }
        });
        System.out.println(strs);


        //3. list 내부 정렬기능 사용가능
        strs = Arrays.asList("ccc","bbb","ddd","aaa");
        strs.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //return o1.compareTo(o2); // asc 순정렬
                return o2.compareTo(o1); // desc 역정렬
            }
        });

        //4. 객체의 속성값들로 정렬가능
        PersonVO vo1 = new PersonVO(3,"bbb",33);
        PersonVO vo2 = new PersonVO(111,"aaa",11);
        PersonVO vo3 = new PersonVO(22,"ccc",22);

        Set<PersonVO> set = new HashSet<>();
        set.add(vo1);
        set.add(vo2);
        set.add(vo3);
        System.out.println(set);

        List<PersonVO> sets = new ArrayList<>(set);
        System.out.println(sets);

        //Num 으로 순정렬
        sets.sort(new Comparator<PersonVO>() {
            @Override
            public int compare(PersonVO o1, PersonVO o2) {
                return o1.getNum() - o2.getNum();
            }
        });
        System.out.println(sets);

        //Name 으로 순정렬
        sets.sort(new Comparator<PersonVO>() {
            @Override
            public int compare(PersonVO o1, PersonVO o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(sets);






    }//end main
}//end class
