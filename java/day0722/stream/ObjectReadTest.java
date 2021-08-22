package day0722.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadTest {

    public static void main(String[] args)  throws IOException{

    FileInputStream fileInputStream = null;
    ObjectInputStream objectInputStream = null;
        //밖에서 선언하는 이유 : close()하려고
        //초기화 하지 않으면 안 닫힘
//        ->null로 초기화
        //null 선언하고 그냥 닫으면 nullPointException 발생
//        ->if로 null 체크

    {
        try {
            fileInputStream = new FileInputStream("day0722.dat");
            System.out.println("파일 존재");
            objectInputStream = new ObjectInputStream(fileInputStream);
            Member member = (Member)objectInputStream.readObject();
            System.out.println(member.toString());
//            원하는 타입으로 읽어들이기 위해서 는 read~() 사용
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) { //try/catch 중복일땐 add catch
            e.printStackTrace();
        }finally {
            //예외 발생하든 안하든 꼭 거쳐가야 하는 것들
            if(objectInputStream != null)   objectInputStream.close();
            if (fileInputStream != null)    fileInputStream.close();
            //연 순서와 반대로 닫음
        }
    }
    }
}
