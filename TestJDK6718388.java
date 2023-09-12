class TestJDK6718388 {
   static interface I {}
   static class C1 {}
   static class C2 extends C1 implements I {}

   static class C3 extends C1 implements I {}

   public <T> T m1(T t1, T t2) { return t1; }

   public void test(C2 c2, C3 c3) {
       m1(c2, c3);         }
}