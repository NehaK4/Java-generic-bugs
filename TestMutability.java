import java.util.*;
interface A<T> {
public Object f(T t);
 
}

class B<F> implements A<F> {
  public Object f(F input){ return null;}
 
}

class C<T extends Number> extends B<T> {
  public String f(T input) { return "null"; }
 
}

class TestMutability {
	

  C<Integer> function=new C<>();

  void f(Integer i) {
    String r = function.f(i);
	}public static void main(String ar[]){
		B<Number> b= new C<>();
		//String str= b.f(89);
		List<?> list=new ArrayList<>();
		list.add(null);
		List<Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list=list1;
		//int i=list.get(1);
	}
}


