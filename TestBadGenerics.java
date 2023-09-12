import java.util.*;
public class TestBadGenerics {
    static abstract class GenericClass<T> {
        abstract List<Integer> getList();
    }
    static class DerivedRaw extends GenericClass/*RAW*/ {
        List<String> getList() {
            return Arrays.asList("abc", "def");
        }
    }
    public static void main(String[] args) {
        GenericClass<?> g = new DerivedRaw();
        List<Integer> timeBomb = g.getList();
        int num = timeBomb.iterator().next();
        System.out.println("Very strange: " + num);
    }
}