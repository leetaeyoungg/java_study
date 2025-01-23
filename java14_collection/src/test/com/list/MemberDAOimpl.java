package test.com.list;


import java.util.ArrayList;
import java.util.List;

import static javax.swing.UIManager.get;

public class MemberDAOimpl implements MemberDAO {

    public MemberDAOimpl() {
        System.out.println("MemberDAOimpl()");


    }

    List<MemberVO> list = new ArrayList<>();


    @Override
    public int insert(MemberVO vo) {
        System.out.println("insert()");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getId());
        System.out.println(vo.getPw());
        System.out.println(vo.getName());
        System.out.println(vo.getTel());
        int flag = 0;

        if(list.size()==0){
            vo.setNum(1);
        }else{
            vo.setNum(list.get(list.size()-1).getNum()+1);
        }

        list.add(vo);
        flag = 1;
        return flag;
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
        int flag = 0;

        for (int i = 0; i < list.size(); i++) {
            if (vo.getNum() == list.get(i).getNum()) {
                list.set(i, vo);
                flag = 1;
            }
        }

        return flag;
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
        int flag = 0;
        for (int i = 0; i < list.size(); i++) {
            if (vo.getNum() == list.get(i).getNum()) {
                list.remove(i);
                flag = 1;
            }
        }

        return flag;
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
        MemberVO vo2 = null;
        for (int i = 0; i < list.size(); i++) {
            if (vo.getNum() == list.get(i).getNum()) {
                vo2 = list.get(i);
            }
        }
        return vo2;
    }

    @Override
    public MemberVO[] selectAll() {
        System.out.println("selectAll()...");
        MemberVO[] vos = new MemberVO[list.size()];
        for (int i = 0; i < vos.length; i++) {
            vos[i] = list.get(i);
        }
        return vos;
    }

    @Override
    public List<MemberVO> selectAll2() {
        return list;
    }

    @Override
    public List<MemberVO> searchList(String searchKey, String searchWord) {
        System.out.println("searchList()");
        System.out.println(searchKey);
        System.out.println(searchWord);
        List<MemberVO> vos = new ArrayList<>();
        if(searchKey.equals("name")){
        for (int i = 0; i < list.size(); i++) {
            if((list.get(i).getName()).contains(searchWord)){
                vos.add(list.get(i));
                }
            }
        }else if(searchKey.equals("tel")){
            for (int i = 0; i < list.size(); i++) {
                if((list.get(i).getTel()).contains(searchWord)){
                    vos.add(list.get(i));
                }
            }
        }


        return vos;


    }


}
