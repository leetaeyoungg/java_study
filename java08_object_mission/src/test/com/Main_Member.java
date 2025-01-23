package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.DriverPropertyInfo;
import java.util.concurrent.BrokenBarrierException;

public class Main_Member {
    private static DriverPropertyInfo[] ads;

    public static void main(String[] args) throws IOException {
        System.out.println("Member...");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //1.회원가입프로그램
        //번호(num),아이디(id),비밀번호(pw),이름(name),phone(tel)
        //회원 3명의 정보를 입력받아서 회원배열에 할당하고 출력하기
        Admin[] ads = new Admin[3];



            for (int i = 0; i < ads.length; i++) {
                System.out.println("ID :");
                String id = br.readLine();
                System.out.println("PW :");
                String pw = br.readLine();
                System.out.println("NAME :");
                String name = br.readLine();
                System.out.println("TEL :");
                String tel = br.readLine();


                Admin ad = new Admin(1+i,id,pw,name,tel);

                ads[i]= ad;


            }//end for


            for (Admin x : ads){
                System.out.println(x);
            }


            //2. Main_Board 생성하기
            //게시글(Board) 프로그램 작성하기
            //번호(num),제목(title),내용(content),작성자(writer),작성일자(wdate)








        }//end main


    }//end class