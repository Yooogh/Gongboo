package day0722.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharReadTest {
//    readme.txt -> char stream
//    File Reader 1:1
//    BufferReader
    public static void main(String[] args) throws IOException {

        File file = new File("c:/datas/readme.txt");

        if (!file.exists()) {
            if (file.createNewFile()){
                System.out.println("ok");
            }else{
                System.out.println("예치지 않은 문제 발생");
            }
        }
        System.out.println("----파일 있을유----");

//        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        System.out.println(bufferedReader.readLine());
    }
}
