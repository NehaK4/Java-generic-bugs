public class LocalInnerClassWithException {
  static <T> T go(T in, Object other) {
    class A extends RuntimeException {
      T t;
    }
    if (other != null) { // first execution
      try {
        go(other, null);
      } catch (A a) {
        return a.t; // returns other
      }
      throw new AssertionError(); // unreachable
    } else {
      A a = new A();
      a.t = in;
      throw a;
    }
  }

  public static void main(String[] args) {
    String s = go("", 1); // ClassCastException
  }
}