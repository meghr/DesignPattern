public class Main {

    public static void main(String[] args){


        // 1. Singleton Demo
        SingletonDemo instance1 = SingletonDemo.getInstance();

        SingletonDemo instance2 = SingletonDemo.getInstance();

        System.out.println("Object -> " + instance1);

        System.out.println("Object -> " + instance2);


        // 2. Builder Pattern

        BuilderPattern.Builder builder = new BuilderPattern.Builder();

        builder.bread("HoneyBread").condiments("Mustard").dressing("Stuffing").meat("Ham");

        BuilderPattern customerOrder = builder.build();

        System.out.println(customerOrder.getBread());
        System.out.println(customerOrder.getCondiments());
        System.out.println(customerOrder.getDressing());
        System.out.println(customerOrder.getMeat());


    }
}
