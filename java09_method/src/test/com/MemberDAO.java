package test.com;

public class MemberDAO {

    public int insert(MemberVO vo) {
        System.out.println("insert()...");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getId());
        System.out.println(vo.getPw());
        System.out.println(vo.getName());
        System.out.println(vo.getTel());

        return 1;
    }

    public String update(MemberVO vo) {
        System.out.println("update()...");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getId());
        System.out.println(vo.getPw());
        System.out.println(vo.getName());
        System.out.println(vo.getTel());
        return "complete";
    }

    public int delete(MemberVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getId());
        System.out.println(vo.getPw());
        System.out.println(vo.getName());
        System.out.println(vo.getTel());
        return 1;
    }


    public MemberVO selectOne(MemberVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getId());
        System.out.println(vo.getPw());
        System.out.println(vo.getName());
        System.out.println(vo.getTel());
        MemberVO vo2 = new MemberVO();
        vo2.setNum(2);
        vo2.setId("admin2");
        vo2.setPw("lee222");
        vo2.setName("lee21");
        vo2.setTel("9521");

        return vo2;
    }

    public MemberVO[] selectAll() {
        System.out.println("selectAll()...");
        MemberVO[] vos = new MemberVO[3];
        for (int i = 0; i < vos.length; i++) {
            MemberVO vo2 = new MemberVO();
            vo2.setNum(2 + i);
            vo2.setId("admin2" + i);
            vo2.setPw("lee222" + i);
            vo2.setName("lee21" + i);
            vo2.setTel("9521" + i);
            vos[i] = vo2;

        }
        return vos;
    }

    public MemberVO[] searchList(String searchKey, String searchWord) {
        System.out.println("searchList(String searchKey, String searchWord)...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        MemberVO[] vos = new MemberVO[3];
        for (int i = 0; i < vos.length; i++) {
            MemberVO vo2 = new MemberVO();
            vo2.setNum(3 + i);
            vo2.setId("admin3" + i);
            vo2.setPw("lee333" + i);
            vo2.setName("lee33" + i);
            vo2.setTel("033" + i);
            vos[i] = vo2;

        }
        return vos;
    }
}
