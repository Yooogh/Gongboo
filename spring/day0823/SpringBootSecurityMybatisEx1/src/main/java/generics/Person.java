package generics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
public class Person {
    private String id;
    private String name;
    private String addr;

    public Person() {
    }

    public Person(String id, String name, String addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }
}
