package day0722.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteTest {

    public static void main(String[] args) throws IOException{

        Member member = new Member(123, "kim malja", "123");

        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;

        {
            try {
                //ioexception이 아니므로 try/catch
                fileOutputStream = new FileOutputStream("day0722.dat");
                //idexception이므로 throws
                //-> 주도권을 os에 넘김
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(member);
                objectOutputStream.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
