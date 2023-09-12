import java.util.concurrent.Callable;

public class GenericArrayTest {
  
    public Object foo(Callable<? extends Object[]> foo) throws Exception {
return foo.call()[0];
    }
}