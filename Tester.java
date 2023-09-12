class U1 {}
class X1 extends U1 {}
interface I { }

@FunctionalInterface
interface SAM<T> {
    void m(T t);
}


@SuppressWarnings("unchecked")
class Tester {
    SAM<? extends U1> sam1 = (SAM<? extends U1>) (X1 x) -> { };       //ok
    SAM<? extends U1> sam2 = (SAM<? extends U1> & I) (X1 x) -> { }; //error
}