import java.util.*;

public class JlsSux{

	class First <X extends Runnable> {}
	class Second <X extends Runnable, Y extends X> {}


	public static void main(String... args){
		List<First<? super Runnable>> a0 = null;
		List<First<Runnable>> a1 = a0;
		List<First<? super Runnable>> a2 = a1;
	}


	static <U extends Thread> void u(){
		List<Second<U, ? super Thread>> c0 = null;
		List<Second<U, U>> c1 = c0;
		//List<Second<U, ? super Thread>> c2 = c1;
	}

}