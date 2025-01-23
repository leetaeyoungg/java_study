package test.com;

import java.util.Arrays;

public class Main03_Board {



    public static void main(String[] args) {
        System.out.println("hello");

        //지난시간에 했었던 BoardDAO(추상클래스) >>> MemberDAO(인터페이스)로 변경
        //BoardVO + BoardDAOimpl(BoardDAO상속)

        BoardVO vo = new BoardVO();
        BoardDAO dao = new BoardDAOimpl();


        System.out.println("=================");
        //insert
        vo.setNum(11);
        vo.setTitle("title11");
        vo.setContent("content11");
        vo.setWriter("lee11");
        vo.setWdate("202511");
        int result = dao.insert(vo);
        System.out.println("create result : " + result);
        System.out.println("=================");

        //insert
        vo.setNum(22);
        vo.setTitle("title22");
        vo.setContent("content22");
        vo.setWriter("lee22");
        vo.setWdate("202522");
        result = dao.insert(vo);
        System.out.println("insert result : " + result);
        System.out.println("=================");

        //delete
        vo.setNum(33);
        vo.setTitle("title33");
        vo.setContent("content33");
        vo.setWriter("lee33");
        vo.setWdate("202533");
        result = dao.delete(vo);
        System.out.println("delete result : " + result);
        System.out.println("=================");

        //selectOne
        BoardVO vo2 = dao.selectOne(vo);
        System.out.println("vo2 : " + vo2);
        System.out.println("=================");

        //selectAll
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
        System.out.println("=================");

        //searchList
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





    }//end main
}//end class
