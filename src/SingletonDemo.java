public class SingletonDemo {

    private static volatile SingletonDemo instance;

    private SingletonDemo(){
       // So that object  is not created by reflections
     if (instance!=null) {
         throw new RuntimeException(" Kindly use getInstance() mehtod for creating instance ");
     }
    }

    /* Here we are not putting synchronized on whole method just putting it
    * on block for performance */
    public static SingletonDemo getInstance(){
        synchronized (SingletonDemo.class) {
            if (instance==null);
        }
        if (instance==null){
            instance = new SingletonDemo();
        }
        return instance;
    }
}
