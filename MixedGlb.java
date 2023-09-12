public class MixedGlb {

    interface Box<T> { T get(); }
    static class Parent {}
    static class Child extends Parent { void poke() {} }


    interface I<X extends Box<Child>> {
        X get();
    }

    <T extends Box<? extends Parent>> void test(I<? extends T> arg) {
        arg.get().get().poke();
        // expected: the type I<? extends T> is malformed, or the invocation succeeds
        // actual: error, cannot find method in type Parent
    }
}