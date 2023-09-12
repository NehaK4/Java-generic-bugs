public Class<? extends ArrayList<?>> wildcardGetClass(ArrayList<?> list) {
    return (Class<? extends ArrayList<?>>)list.getClass();
  }
  
  public void f(ArrayList<Integer> l1, ArrayList<String> l2)
     throws InstantiationException, IllegalAccessException {
      wildcardGetClass(l1).newInstance().addAll(
         wildcardGetClass(l2).newInstance());
  }