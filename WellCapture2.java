

class Animal<T extends Animal<T>> {
	public T bestFriend(T t){return t;}
  public T friends(T t){return t;}
}
 class Dog extends Animal<Dog> {}
 
 public class WellCapture2{
public static void main(String ar[]){
//The capture of the following is specified to trigger a compiler error, per 5.1.10:

Animal<? extends Dog> a= new Animal<>(); // bound of capture var is glb(Dog, Animal<CAP>)
a.bestFriend(12).friends(23);
}
}