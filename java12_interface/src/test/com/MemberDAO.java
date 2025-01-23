package test.com;

public interface MemberDAO {

    public int insert(MemberVO vo);
    public int update(MemberVO vo);
    public int delete(MemberVO vo);
    public MemberVO selectOne(MemberVO vo);
    public MemberVO[] selectAll();
    public MemberVO[] searchList(String searchKey,String searchWord);

}
