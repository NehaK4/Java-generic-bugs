public class JDK8154792 {
    interface I<T extends Class<S>, S> {}
    
    <T extends Class<?>> void test() {
        I<T,?> val;
    }
}