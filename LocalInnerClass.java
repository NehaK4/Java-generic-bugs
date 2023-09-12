import java.util.*;
public class LocalInnerClass {
  static Object prev;
  static <T> T go(T t) {
    class A extends ArrayList<T> { }
    if (prev == null) { // first execution
      A a = new A();
      a.add(t);
      prev = a;
      return null;
    } else { // second execution
      return ((A) prev).get(0);
    }
  }

  public static void main(String[] args) {
    go(1);
    String s = go(""); // ClassCastException
  }
}

