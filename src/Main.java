public class Main {

    public static void main(String[] args){


        SingletonDemo instance1 = SingletonDemo.getInstance();

        SingletonDemo instance2 = SingletonDemo.getInstance();

        System.out.println("Object -> " + instance1);

        System.out.println("Object -> " + instance2);
    }
}
