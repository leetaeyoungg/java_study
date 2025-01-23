package test.com;

import java.util.Arrays;

public class Main04_Board {


    public static void main(String[] args) {
        System.out.println("hello!");


        //객체사용시 데이터 전달목적 또는 값세팅 목적으로 사용하고자 한다.
        //객체명+DTO or 객체명+VO = 클래스명 지정
        //모든속성은 은닉(private) + getters/setters method 구현

        //게시글객체(BoardVO,BoardDTO) - num, title, content, writer, wdate
        //게시글처리객체(BoardDAO)
        //MemberDAO 사용되는 모든 함수형식으로 작성하고 출력하세요.
        BoardVO vo = new BoardVO();
        BoardDAO dao = new BoardDAO();


        vo.setNum(11);
        vo.setTitle("title");
        vo.setContent("content");
        vo.setWriter("lee");
        vo.setWdate("2025");
        System.out.println(vo);


        int result = dao.create(vo);
        System.out.println("create result : " + result);
        String result2 = dao.update(vo);
        System.out.println("update result : " + result2);
        result = dao.delete(vo);
        System.out.println("delete result : " + result);
        BoardVO vo2 = dao.selectOne(vo);
        System.out.println("vo2 : " + vo2);

        BoardVO[] vos = dao.selectAll();
        System.out.println(Arrays.toString(vos));
        for (int i = 0; i < vos.length; i++) {
            System.out.println(vos[i]);
            System.out.println(vos[i].getNum());
            System.out.println(vos[i].getTitle());
            System.out.println(vos[i].getContent());
            System.out.println(vos[i].getWriter());
            System.out.println(vos[i].getWdate());


        }

        vos = dao.searchList("title", "t1");
        System.out.println(Arrays.toString(vos));
        for (int i = 0; i < vos.length; i++) {
            System.out.println(vos[i]);
            System.out.println(vos[i].getNum());
            System.out.println(vos[i].getTitle());
            System.out.println(vos[i].getContent());
            System.out.println(vos[i].getWriter());
            System.out.println(vos[i].getWdate());
        }


    }// end main


}// end class
