package test.com;

import java.util.Arrays;

public class Main03_Member {


    public static void main(String[] args) {
        System.out.println("hello!");


        //객체사용시 데이터 전달목적 또는 값세팅 목적으로 사용하고자 한다.
        //객체명+DTO or 객체명+VO = 클래스명 지정
        //모든속성은 은닉(private) + getters/setters method 구현

        //회원객체(MemberVO,MemberDTO)
        MemberVO vo = new MemberVO();


        vo.setNum(11);
        vo.setId("admin");
        vo.setPw("hi111");
        vo.setName("lee");
        vo.setTel("010");
        System.out.println(vo);


        //특정객체가 정해지면 반드시 이를 처리하는 객체를 별도로 만들어 사용해주길 권장
        //이런 객체의 대부분은 데이터베이스 연동해서 구현 => 클래스명+DAO
        MemberDAO dao = new MemberDAO();
        int result = dao.insert(vo);
        System.out.println("insert result : " + result);
        String result2 = dao.update(vo);
        System.out.println("update result : " + result2);
        result = dao.delete(vo);
        System.out.println("delete result : " + result);
        MemberVO vo2 = dao.selectOne(vo);
        System.out.println("vo2 : " + vo2);

        MemberVO[] vos = dao.selectAll();
        System.out.println(Arrays.toString(vos));
        for (int i = 0; i < vos.length; i++) {
            System.out.println(vos[i]);
            System.out.println(vos[i].getNum());
            System.out.println(vos[i].getName());
            System.out.println(vos[i].getId());
            System.out.println(vos[i].getPw());
            System.out.println(vos[i].getTel());

        }

        vos = dao.searchList("name", "kim");
        System.out.println(Arrays.toString(vos));


        //게시글객체(BoardVO,BoardDTO)


    }// end main


}// end class
