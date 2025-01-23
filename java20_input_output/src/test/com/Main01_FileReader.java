package test.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main01_FileReader {
    public static void main(String[] args) {
        System.out.println("hello");

        //test.txt 파일에 작성된 내용들을 메인에서 읽어서 List<String>에 출력하고
        //test(List) 전달해서 출력하기
        String path = "C:\\MULTI_EDU_01\\java\\work\\java20_input_output\\src\\test\\com\\test.txt";

        //경로확인
        System.out.println(new File(path));

        //디렉토리확인
        System.out.println(new File(path).isDirectory());

        //파일확인
        System.out.println(new File(path).isFile());

        //파일존재유무확인
        System.out.println(new File(path).exists());

        System.out.println("================");

        //파일이 존재한다면 해당파일의 정보를 읽기
        if (new File(path).exists()){

            FileReader fr = null;
            BufferedReader br = null;

            //파일의 내용을 한줄씩 배열에 할당할 List
            List<String> list = new ArrayList<>();

            try{
                //fr = new FileReader(path);
                fr = new FileReader(new File("test02.txt"));
                br = new BufferedReader(fr);
                while(true){
                    String txt = br.readLine();
                    System.out.println(txt);
                    if(txt == null) break;
                    list.add(txt);
                }
            }catch (IOException e){

            }finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {

                    }
                }if (fr != null) {
                    try {
                        br.close();
                    } catch (IOException e) {

                    }
                }
            }//end finally
            System.out.println("================");
            for (String x : list){
                System.out.println(x);
            }
            System.out.println("================");
            
            //list를 필요로 하는 곳으로 전달해서 처리할 수 있다.
            test(list);
            
            
        }//end if



    }//end main

    private static void test(List<String> list) {
        System.out.println("================");
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("================");
    }
}//end class
