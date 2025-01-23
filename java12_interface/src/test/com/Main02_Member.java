package test.com;

public class Main02_Member {



    public static void main(String[] args) {
        System.out.println("hello");

        //지난시간에 했었던 MemberDAO(추상클래스) >>> MemberDAO(인터페이스)로 변경
        //MemberVO + MemberDAOimpl(MemberDAO상속)

        MemberDAO dao = new MemberDAOimpl();


        MemberVO vo = new MemberVO();


        //1.insert
        vo.setNum(11);
        vo.setId("admin1");
        vo.setPw("lee111");
        vo.setName("lee11");
        vo.setTel("011");
        int result = dao.insert(vo);
        System.out.println("insert result :"+result);
        System.out.println("==========================");

        //2.update
        vo.setNum(22);
        vo.setId("admin2");
        vo.setPw("lee222");
        vo.setName("lee22");
        vo.setTel("022");
        result = dao.update(vo);
        System.out.println("update result :"+result);
        System.out.println("==========================");

        //3.delete
        vo.setNum(33);
        vo.setId("admin3");
        vo.setPw("lee333");
        vo.setName("lee33");
        vo.setTel("033");
        result = dao.delete(vo);
        System.out.println("delete result :"+result);
        System.out.println("==========================");

        //4.selectOne
        vo.setNum(44);
        vo.setId("admin4");
        vo.setPw("lee444");
        vo.setName("lee44");
        vo.setTel("044");
        MemberVO vo2 = dao.selectOne(vo);
        System.out.println("selectOne result :"+vo2);
        System.out.println(vo2.getNum());
        System.out.println(vo2.getId());
        System.out.println(vo2.getPw());
        System.out.println(vo2.getName());
        System.out.println(vo2.getTel());
        System.out.println("==========================");

        //5.selectAll
        MemberVO[] vos = dao.selectAll();
            for (int i = 0; i < vos.length; i++) {
                System.out.println(vos[i]);
                System.out.println(vos[i].getNum());
                System.out.println(vos[i].getId());
                System.out.println(vos[i].getPw());
                System.out.println(vos[i].getName());
            System.out.println(vos[i].getTel());
        }

        //6.searchList
        vos = dao.searchList("name","le");
        for (int i = 0; i < vos.length; i++) {
            System.out.println(vos[i]);
            System.out.println(vos[i].getNum());
            System.out.println(vos[i].getId());
            System.out.println(vos[i].getPw());
            System.out.println(vos[i].getName());
            System.out.println(vos[i].getTel());
        }



    }//end main
}//end class
