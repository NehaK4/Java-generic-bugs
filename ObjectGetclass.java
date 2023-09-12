import java.util.*;
class ObjectGetclass{
public void f(ArrayList<Integer> l1, ArrayList<String> l2)
   throws InstantiationException, IllegalAccessException {

    l1.getClass().newInstance().addAll(l2.getClass().newInstance());
  }
  }