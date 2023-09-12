public class Test10 {
   interface I<T extends U, U> { }
    interface J<U, T extends U> { }

    void test() {
     //   I<? extends Integer, ? super Number> i = null; // error
        J<? super Number, ? extends Integer> j = null; // no error
    }
}