public class TestMalform {
    interface I<T extends Class<S>, S> {}
    
    <T extends Class<?>> void test() {
        I<T,?> val;
    }
	interface C<T extends Number> {}
C<? extends String> test=null;
}