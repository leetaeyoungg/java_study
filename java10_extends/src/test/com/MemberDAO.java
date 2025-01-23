package test.com;

public abstract class MemberDAO {

    public abstract int insert(MemberVO vo);

    public abstract int update(MemberVO vo);

    public abstract int delete(MemberVO vo);

    public abstract MemberVO selectOne(MemberVO vo);

    public abstract MemberVO[] selectAll();

    public abstract MemberVO[] searchList(String searchKey, String searchWord);

}
