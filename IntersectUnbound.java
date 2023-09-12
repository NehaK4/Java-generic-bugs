public class IntersectUnbound {
    public static void main(String[] args) {
    }
}

interface A<T> {
    T f();
}
class C {
    <T extends Object & A<?>> void f(T t)
    {
        Object o = t.f();
    }
}