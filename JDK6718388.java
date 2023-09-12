interface B<X> { public X m(); }

class C implements B<String> {
	public String m(){return "";}
}

class JDK6718388<X extends C> {
   X x;
   public X m(){return x;}
   
   JDK6718388<? extends B<Integer>> b = null; // bound of the captured type var is B<Integer>&C, i.e. B<Integer>&B<String>
 //  Integer o = b.x.m();  // which m()? - compiles with Eclipse
   String o = b.x.m();  // which m()? - doesn't compile with Eclipse
}
