public class JDK8251891 {
    
    interface I<T> {}
    interface J<T> {}
    
    static <X extends I<?>> void test(J<X> vs) { 
        m(vs); 
    } 

    static <Y extends I<T>, T> void m(J<Y> vs) { 
    } 

}