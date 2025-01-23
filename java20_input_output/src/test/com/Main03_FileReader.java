package test.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main03_FileReader {
    public static void main(String[] args) {
        System.out.println("hello");

        //파일의 상대경로를 사용할 수 있다.
        //String path = "C:\\MULTI_EDU_01\\java\\work\\java20_input_output\\src\\test\\com\\test.txt";
        Class<?> clazz = Main03_FileReader.class;
        String path = clazz.getResource("test.txt").getPath();



        System.out.println("================");

        //파일이 존재한다면 해당파일의 정보를 읽기
        if (new File(path).exists()){

            FileReader fr = null;
            BufferedReader br = null;

            //파일의 내용을 한줄씩 StringBuilder에 추가하기
            StringBuilder sb = new StringBuilder();

            try{
                fr = new FileReader(path);
                br = new BufferedReader(fr);
                while(true){
                    String txt = br.readLine();
                    System.out.println(txt);

                    if(txt == null) break;
                    sb.append(txt);
                    sb.append(":");
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


            //list를 필요로 하는 곳으로 전달해서 처리할 수 있다.
            test(sb);
            
            
        }//end if



    }//end main

    private static void test(StringBuilder sb) {
        System.out.println("================");
        System.out.println(sb);
        System.out.println("================");
    }
}//end class
