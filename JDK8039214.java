 
class JDK8039214 {
 static class D<T> {
    void inject(T arg) {}
    static <T> D<T> make(Class<? extends T> c) { return new D<T>(); }
  }

  void test(Object o) {
    D.make(o.getClass()).inject(o);
  }}