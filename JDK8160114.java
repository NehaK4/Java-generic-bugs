 
 class JDK8160114{
 interface I<X> {}
    <T> T make(I<T> ts) { return null; }
    <E extends CharSequence> E take(I<? extends E> arg) { return null; }

    void test(I<I<? extends String>> arg) {
        take(make(arg)).intern();
    }}