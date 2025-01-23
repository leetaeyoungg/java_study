package test.com;

import java.util.Arrays;

public class Main05_Student {
    public static void main(String[] args) {
        System.out.println("Student...");
        //학생객체(StudentVO) - num, name, kor, eng, math
        //학생처리객체(StudentDAO)
        //CRUD 핵심로직 6종 작성하고 출력하세요.

        StudentVO vo = new StudentVO();
        StudentDAO dao = new StudentDAO();

        vo.setNum(11);
        vo.setName("lee");
        vo.setKor(99);
        vo.setEng(88);
        vo.setMath(77);
        System.out.println(vo);

        String result = dao.create(vo);
        System.out.println(result);
        result = dao.update(vo);
        System.out.println(result);
        result = dao.delate(vo);
        System.out.println(result);
        StudentVO vo2 = dao.selectOne(vo);
        System.out.println(vo2);
        StudentVO[] vos = dao.selectAll();
        System.out.println(Arrays.toString(vos));
        vos = dao.searchList("leetaeyoung","kor");
        System.out.println(Arrays.toString(vos));







    }//end main
}//end class
