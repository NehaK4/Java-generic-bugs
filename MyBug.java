interface A {}

abstract class B<X> {
    abstract X m();
}

abstract class C<Y> extends B<Y> {
    @Override
    abstract Y m();
}

class MyBug<Z extends C<?> & A> {}
