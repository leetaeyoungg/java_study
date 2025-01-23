package test.com;

public class BoardDAO {
    public int create(BoardVO vo) {
        System.out.println("create()...");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getTitle());
        System.out.println(vo.getContent());
        System.out.println(vo.getWriter());
        System.out.println(vo.getWdate());

        return 1;
    }

    public String update(BoardVO vo) {
        System.out.println("update()...");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getTitle());
        System.out.println(vo.getContent());
        System.out.println(vo.getWriter());
        System.out.println(vo.getWdate());
        return "complete";
    }

    public int delete(BoardVO vo) {
        System.out.println("delete()...");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getTitle());
        System.out.println(vo.getContent());
        System.out.println(vo.getWriter());
        System.out.println(vo.getWdate());
        return 1;
    }


    public BoardVO selectOne(BoardVO vo) {
        System.out.println("selectOne()...");
        System.out.println(vo);
        System.out.println(vo.getNum());
        System.out.println(vo.getTitle());
        System.out.println(vo.getContent());
        System.out.println(vo.getWriter());
        System.out.println(vo.getWdate());
        BoardVO vo2 = new BoardVO();
        vo2.setNum(2);
        vo2.setTitle("title2");
        vo2.setContent("content222");
        vo2.setWriter("lee21");
        vo2.setWdate("20250113");

        return vo2;
    }

    public BoardVO[] selectAll() {
        System.out.println("selectAll()...");
        BoardVO[] vos = new BoardVO[3];
        for (int i = 0; i < vos.length; i++) {
            BoardVO vo2 = new BoardVO();
            vo2.setNum(2 + i);
            vo2.setTitle("title3" + i);
            vo2.setContent("content333" + i);
            vo2.setWriter("lee21" + i);
            vo2.setWdate("20250113" + i);
            vos[i] = vo2;

        }
        return vos;
    }

    public BoardVO[] searchList(String searchKey, String searchWord) {
        System.out.println("searchList(String searchKey, String searchWord)...");
        System.out.println(searchKey);
        System.out.println(searchWord);
        BoardVO[] vos = new BoardVO[3];
        for (int i = 0; i < vos.length; i++) {
            BoardVO vo2 = new BoardVO();
            vo2.setNum(3 + i);
            vo2.setTitle("title4" + i);
            vo2.setContent("lee444" + i);
            vo2.setWriter("lee21" + i);
            vo2.setWdate("20250113" + i);
            vos[i] = vo2;

        }
        return vos;
    }

}
