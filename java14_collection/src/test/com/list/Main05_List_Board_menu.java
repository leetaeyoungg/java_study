package test.com.list;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main05_List_Board_menu {
    public static void main(String[] args) {
        System.out.println("hello");

        Scanner s = new Scanner(System.in);
        String menu = "";
        BoardDAO dao = new BoardDAOimpl();
        //더미데이터입력
        int result = 0;
        for (int i = 0; i < 3; i++) {
            BoardVO vo = new BoardVO();
            vo.setTitle("title.."+(i+1));
            vo.setContent("content.."+(i+1));
            vo.setWriter("lee.."+(i+1));
            vo.setWdate(new Date().toString());
            result = dao.insert(vo);
            System.out.println("insert result:"+result);
            if(result == 1) System.out.println("insert successed...");
            else System.out.println("insert failed...");
        }//end for

        System.out.println("=====================");


        do{
            System.out.println("1. 입력" +
                    " 2. 수정" +
                    " 3. 삭제" +
                    " 4. 번호검색" +
                    " 5. 모두검색" +
                    " 6. 검색어검색" +
                    " x. 종료");
            menu = s.nextLine();
            switch(menu) {
                case "1": // insert

                    System.out.println("insert ===========");
                    BoardVO vo = new BoardVO();
                    System.out.println("title:");
                    String title = s.nextLine();
                    System.out.println("content:");
                    String content = s.nextLine();
                    System.out.println("writer:");
                    String writer = s.nextLine();


                    vo.setTitle(title);
                    vo.setContent(content);
                    vo.setWriter(writer);
                    vo.setWdate(new Date().toString());
                    result = dao.insert(vo);

                    System.out.println("insert result:"+result);
                    if(result == 1) System.out.println("insert successed...");
                    else System.out.println("insert failed...");
                    break;


                case "2": //update
                    System.out.println("update ===========");
                    System.out.println("num:");
                    String num = s.nextLine();
                    System.out.println("title:");
                    title = s.nextLine();
                    System.out.println("content:");
                    content = s.nextLine();
                    System.out.println("writer:");
                    writer = s.nextLine();
                    vo = new BoardVO();
                    vo.setNum(Integer.parseInt(num));
                    vo.setTitle(title);
                    vo.setContent(content);
                    vo.setWriter(writer);
                    vo.setWdate(new Date().toString());
                    result = dao.update(vo);
                    System.out.println("update result : "+result);
                    if(result == 1) System.out.println("update successed...");
                    else System.out.println("update failed...");
                    System.out.println("==============");
                    break;


                case "3": //delete
                    System.out.println("delete ===========");
                    vo = new BoardVO();
                    System.out.println("num:");
                    num = s.nextLine();
                    vo.setNum(Integer.parseInt(num));
                    result = dao.delete(vo);
                    System.out.println("delete result:"+result);
                    if(result == 1) System.out.println("delete successed...");
                    else System.out.println("delete failed...");
                    System.out.println("==============");
                    break;


                case "4": //searchOne
                    System.out.println("searchOne ===========");
                    vo = new BoardVO();
                    System.out.println("num:");
                    num = s.nextLine();
                    vo.setNum(Integer.parseInt(num));
                    BoardVO vo2 = dao.selectOne(vo);
                    System.out.println(num+":"+vo2);
                    if(vo2 != null) System.out.println("selectOne successed...");
                    else System.out.println("selectOne failed...");
                    System.out.println("==============");
                    break;


                case "5": //searchAll
                    System.out.println("searchAll ===========");
                    List<BoardVO> vos = dao.selectAll();
                    System.out.println(vos);
                    for (int i = 0; i < vos.size(); i++) {
                        System.out.print(vos.get(i).getNum()+" ");
                        System.out.print(vos.get(i).getTitle()+" ");
                        System.out.print(vos.get(i).getContent()+" ");
                        System.out.print(vos.get(i).getWriter()+" ");
                        System.out.println(vos.get(i).getWdate());
                    }

                    System.out.println("=====================");
                    break;


                case "6": //searchList
                    System.out.println("searchList ===========");
                    System.out.println("searchKey[title,content]");
                    String searchKey = s.nextLine();
                    System.out.println("searchWord:");
                    String searchWord = s.nextLine();
                    vos = dao.searchList(searchKey,searchWord);
                    //vos = dao.searchList("content","cont");
                    System.out.println(vos);
                    for (int i = 0; i < vos.size(); i++) {
                        System.out.print(vos.get(i).getNum()+" ");
                        System.out.print(vos.get(i).getTitle()+" ");
                        System.out.print(vos.get(i).getContent()+" ");
                        System.out.print(vos.get(i).getWriter()+" ");
                        System.out.println(vos.get(i).getWdate());
                    }if(vos.size()==0) System.out.println("잘못입력하셨습니다.");
                    break;
                case "x":
                    System.out.println("program exit..");

                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                    break;
            }
        }while(!menu.equals("x"));

    }//end main
}//end class