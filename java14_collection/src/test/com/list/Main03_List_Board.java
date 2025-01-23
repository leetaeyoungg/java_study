package test.com.list;

import java.util.List;

public class Main03_List_Board {


    public static void main(String[] args) {
        System.out.println("hello");

        //MemberVO
        //MemberDAO <--- MemberDAOimpl
        //List컬렉션이 MemberDAOimpl안에 전역변수로 존재합니다.
        //메인에서 insert메소드를 통해서 List컬렉션에 vo객체를 추가하는 코딩
        BoardDAO dao = new BoardDAOimpl();
        int result = 0;

        //1.insert
        BoardVO vo = new BoardVO();
        for (int i = 0; i < 3; i++) {
            vo = new BoardVO();
            vo.setNum(i+1);
            vo.setTitle("title11.."+(i+1));
            vo.setContent("content11.."+(i+1));
            vo.setWriter("admin11"+(i+1));
            vo.setWdate("2025-05-0"+(i+1));
            result = dao.insert(vo);
            System.out.println("insert result : "+result);
            if(result == 1) System.out.println("insert successed...");
            else System.out.println("insert failed...");
        }

        System.out.println("=====================");


        //2.update
        vo = new BoardVO();
        vo.setNum(2);
        vo.setTitle("title22..");
        vo.setContent("content22..");
        vo.setWriter("admin22");
        vo.setWdate("2025-05-22");
        result = dao.update(vo);
        System.out.println("update result : "+result);
        if(result == 1) System.out.println("update successed...");
        else System.out.println("update failed...");
        System.out.println("==============");

        //3.delete
        vo = new BoardVO();
        vo.setNum(3);
        result = dao.delete(vo);
        System.out.println("delete result:"+result);
        if(result == 1) System.out.println("delete successed...");
        else System.out.println("delete failed...");
        System.out.println("==============");

        //4.selectOne
        vo = new BoardVO();
        vo.setNum(2);
        BoardVO vo2 = dao.selectOne(vo);
        System.out.println("vo2:"+vo2);
        if(vo2 != null) System.out.println("selectOne successed...");
        else System.out.println("selectOne failed...");
        System.out.println("==============");

        //5.selectAll
        List<BoardVO> vos = dao.selectAll();
        System.out.println(vos);
        for (int i = 0; i < vos.size(); i++) {
            System.out.println(vos.get(i));
            System.out.println(vos.get(i).getNum());
            System.out.println(vos.get(i).getTitle());
            System.out.println(vos.get(i).getContent());
            System.out.println(vos.get(i).getWriter());
            System.out.println(vos.get(i).getWdate());
        }

        System.out.println("=====================");
        //6.searchList
        vos = dao.searchList("title","e2");
        //vos = dao.searchList("content","cont");
        System.out.println(vos);
        for (int i = 0; i < vos.size(); i++) {
            System.out.println(vos.get(i));
            System.out.println(vos.get(i).getNum());
            System.out.println(vos.get(i).getTitle());
            System.out.println(vos.get(i).getContent());
            System.out.println(vos.get(i).getWriter());
            System.out.println(vos.get(i).getWdate());
        }if(vos.size()==0) System.out.println("잘못입력하셨습니다.");
    }//end main
}//end class