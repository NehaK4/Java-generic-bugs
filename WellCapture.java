

public class Animal<T extends Animal<T>> {
	public T bestFriend();
  public iterable<T> friends();
}
 class Dog extends Animal<Dog> {}
 
 public class WellCapture{
public static void main(String ar[]){
//The capture of the following is specified to trigger a compiler error, per 5.1.10:

Animal<? extends Dog> a= new Animal<>(); // bound of capture var is glb(Dog, Animal<CAP>)
a.bestFriend().friends();
}
}