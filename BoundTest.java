class BoundTest {
/* interface I<X1,X2> {}
  class C<T> implements I<T,T> {}

  <X> void m(I<? extends X, X> arg) {}

  void test(C<?> arg) {
    m(arg);
  }  */
 /*  static class D<T> {
    void inject(T arg) {}
    static <T> D<T> make(Class<? extends T> c) { return new D<T>(); }
  }

  void test(Object o) {
    D.make(o.getClass()).inject(o);
  } */
  
  interface A {}

abstract class B<X> {
    abstract X m();
}

abstract class C<Y> extends B<Y> {
    @Override
    abstract Y m();
}

class MyBug<Z extends C<?> & A> {}
}