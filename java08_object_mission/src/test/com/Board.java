package test.com;

public class Board {

    private int num;
    private String title;
    private String content;
    private String writer;
    private String wdate;

    public Board() {
    }

    public Board(int num, String title, String content, String writer, String wdate) {
        this.num = num;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.wdate = wdate;
    }

    @Override
    public String toString() {
        return "Board{" +
                "게시글번호=" + num +
                ", 제목='" + title + '\'' +
                ", 내용='" + content + '\'' +
                ", 작성자='" + writer + '\'' +
                ", 작성일자='" + wdate + '\'' +
                '}';
    }
}
