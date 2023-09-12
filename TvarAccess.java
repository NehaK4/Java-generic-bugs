class TvarAccess {

 /*** Declarations ***/

 static abstract class A {
   protected abstract String foo();
   protected String bar() { return "bar"; }
   protected abstract Object clone();
 }

 interface Foo { public String foo(); }

 interface Bar { public String bar(); }

 interface PublicClone { public Object clone(); }

 // Witness for A&Foo, A&Bar, A&PublicClone, Object&PublicClone
 static class C extends A implements Foo, Bar, PublicClone {
   public String foo() { return "foo"; }
   public String bar() { return "bar"; }
   public Object clone() { return this; }
 }

 interface ReadableFactory {
   Readable make();
 }

 interface CloseableFactory {
   java.io.Closeable make();
 }

 // Witness for ReadableFactory&CloseableFactory
 interface ReaderFactory extends ReadableFactory, CloseableFactory {
   java.io.Reader make();
 }

 class RequiresSuperCall {
   public RequiresSuperCall(boolean arg) {}
 }

 // Witness for T extends RequiresSuperCall
 class D extends RequiresSuperCall {
   public D() { super(true); }
 }

 /*** Tests ***/

 // No error for tvar in javac 7
 public <T extends A & Foo> String testMethod1(T arg) {
   return arg.foo();
 }

 /* ERROR for tvar in javac 7
 public <T extends A & Bar> String testMethod2(T arg) {
   return arg.foo();
 }

 // ERROR for tvar in javac 7
 public <T extends A & PublicClone> void testMethod3(T arg) {
   arg.clone();
 }

 // ERROR for tvar in javac 7
 public <T extends Object & PublicClone> void testMethod4(T arg) { // error
   arg.clone();
 }

 // ERROR for tvar in javac 7
 public <T extends ReadableFactory & CloseableFactory> void testMethod5(T arg) {
   arg.make(); // ERROR in javac 7: ambiguous method
 } */

 // No error for tvar in javac 7
 public <T extends RequiresSuperCall> void testMethod6(T arg) {
 }

}
