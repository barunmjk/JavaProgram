package collectionFrameWork;

public class Box<T> {
        T t;
        Box(T t){
        	   this.t=t;
        }
         public T getDetails() {
        	   return t;
         }
}
