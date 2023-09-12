class TestInference1 {
    class A<S> { } class B<S> { } class C<S> { } class D { }

    <T> A<B<? super T>> foo() { return null; }

    <U> C<U> bar(A<U> a1, A<? super U> a2) { return null; }

    C<B<? super D>> c = bar(foo(), foo());
}