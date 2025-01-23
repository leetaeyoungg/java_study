package test.com;

public class StudentDAO {


    public String create(StudentVO vo) {
        System.out.println("creat()...");
        System.out.println(vo);
        return "create return 1";
    }

    public String update(StudentVO vo) {
        System.out.println("update()...");
        System.out.println(vo);

        return "update return 1";
    }

    public String delate(StudentVO vo) {
        System.out.println("delate()...");
        System.out.println(vo);

        return "delate return 1";
    }


    public StudentVO selectOne(StudentVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);
        StudentVO vo2 = new StudentVO();
        vo2.setNum(2);
        vo2.setName("lee2");
        vo2.setKor(11);
        vo2.setEng(22);
        vo2.setMath(33);

        return vo2;
    }

    public StudentVO[] selectAll() {
        System.out.println("selectAll()...");
        StudentVO[] vos = new StudentVO[3];
        for (int i = 0; i < vos.length; i++) {
            StudentVO vo2 = new StudentVO();
            vo2.setNum(2+i);
            vo2.setName("lee2"+i);
            vo2.setKor(11+i);
            vo2.setEng(22+i);
            vo2.setMath(33+i);
            vos[i] = vo2;
        }
        return vos;

    }

    public StudentVO[] searchList(String searchName, String searchClass) {
        System.out.println("searchList(String searchName, String searchClass)...");
        System.out.println(searchName);
        System.out.println(searchClass);
        StudentVO[] vos = new StudentVO[3];
        for (int i = 0; i < vos.length; i++) {
            StudentVO vo2 = new StudentVO();
            vo2.setNum(2+i);
            vo2.setName("lee2"+i);
            vo2.setKor(11+i);
            vo2.setEng(22+i);
            vo2.setMath(33+i);
            vos[i] = vo2;
        }
        return vos;
    }
}
