import java.util.*;
public class CaptureInSuperClass {
  static class Box<A> {
    A a;
    Box(A a) { this.a = a; }

    class Inner {
      void setA(A newA) {
        a = newA;
      }

      A getA() {
        return a;
      }
    }
  }

  static Object prev;
  public static void main(String[] args) {
    Box<String> stringBox = new Box<>("1");
    for (Box<?> box : List.of(stringBox, new Box<>(1))) {
      box.new Inner() {{
        if (prev == null) prev = this;
        else this.getClass().cast(prev).setA(this.getA());
      }};
    }

    // ClassCastException
   // String s = stringBox.a;

    // GenericSignatureFormatError
   // ((Box<?>)stringBox).new Inner(){}.getClass().getGenericSuperclass();
  }
}