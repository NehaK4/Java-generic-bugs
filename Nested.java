  
  class Nested {
  static class C<T> {
        class Inner {}
    }
   
    void test(C<?> arg) {
        class Sub extends C<?>.Inner { // no error in javac 17
            public Sub() { arg.super(); }
        }
    }
	 public static void main(String ar[]){ 
	 
	 Nested obj=new Nested();
	 obj.test(new C<Integer>());
	}}