class Wild{
 static class C<T> { 
        class Inner {} 
    } 
     
    void test(C<?> arg) { 
        class Sub extends C<T>.Inner { // no error in javac 10
            public Sub() { arg.super(); } 
        } 
    }
}