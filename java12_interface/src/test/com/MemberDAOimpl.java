package test.com;


import java.lang.reflect.Member;

public class MemberDAOimpl implements MemberDAO{

    public MemberDAOimpl() {
        System.out.println("MemberDAOimpl()");
    }

    @Override
    public int insert(MemberVO vo) {
        System.out.println("insert()");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getId());
        System.out.println(vo.getPw());
        System.out.println(vo.getName());
        System.out.println(vo.getTel());
        return 0;
    }

    @Override
    public int update(MemberVO vo) {
        System.out.println("update()");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getId());
        System.out.println(vo.getPw());
        System.out.println(vo.getName());
        System.out.println(vo.getTel());
        return 0;
    }

    @Override
    public int delete(MemberVO vo) {
        System.out.println("delete()");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getId());
        System.out.println(vo.getPw());
        System.out.println(vo.getName());
        System.out.println(vo.getTel());
        return 0;
    }

    @Override
    public MemberVO selectOne(MemberVO vo) {
        System.out.println("selectOne()");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getId());
        System.out.println(vo.getPw());
        System.out.println(vo.getName());
        System.out.println(vo.getTel());
        MemberVO vo2 = new MemberVO();
        vo2.setNum(11);
        vo2.setId("admin1");
        vo2.setPw("lee111");
        vo2.setName("lee11");
        vo2.setTel("011");

        return vo2;
    }

    @Override
    public MemberVO[] selectAll() {
        System.out.println("selectAll()");
        MemberVO[] vos = new MemberVO[3];
        for (int i = 0; i < vos.length; i++) {
            MemberVO vo2 = new MemberVO();
            vo2.setNum(2 + i);
            vo2.setId("admin2" + i);
            vo2.setPw("lee222" + i);
            vo2.setName("lee22" + i);
            vo2.setTel("022" + i);
            vos[i] = vo2;

        }
        return vos;
    }

    @Override
    public MemberVO[] searchList(String searchKey, String searchWord) {
        System.out.println("searchList()");
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
