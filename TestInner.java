  import java.util.*;
    
      class TestInner {
       static class ListHolder<T> {
         final List<T> list = new ArrayList<T>();
    
         class Inserter {
           Inserter(T itemToAdd) {
             list.add(itemToAdd);
           }
         }
       }
    
       static class StringListHolder extends ListHolder<String> {
         class IntInserter extends ListHolder<Integer>.Inserter {
           IntInserter() {
             super(42);
           }
         }
       }
    
       public void testInnerClassWithMismatchedOuterType() {
         StringListHolder list = new StringListHolder();
         list.new IntInserter();
    
         System.out.println(list.list.get(0).length());
       }
    
        public static void main(String... args) {
          new TestInner().testInnerClassWithMismatchedOuterType();
        }
      }