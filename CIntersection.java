  class C<T> {}
  class CIntersection{
  <X> void m(C<? super X> arg) {}
  void test(C<?> arg) {
    m(arg);
  }}