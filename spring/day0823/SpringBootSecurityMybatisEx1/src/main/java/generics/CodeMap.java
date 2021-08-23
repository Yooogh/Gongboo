package generics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class CodeMap<K, V> {
    private K key;
    private V value;

    public void put(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V get(K key) throws Exception {
        if (this.key==key) return value;
        else throw new Exception("원하는 데이터 없음");
    }
    public static <K, V> boolean valueCompare(CodeMap<K, V> c1, CodeMap<K, V> c2) {
        return c1.key.equals(c2.key) && c1.value.equals(c2.value);
    }
}
