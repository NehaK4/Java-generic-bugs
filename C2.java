class T { }
class N<Z> { }
class C2<X> extends N<N<? super C2<C2<X>>>> {
  N<? super C2<T>> cast(C2<T> c) { return c; }
}