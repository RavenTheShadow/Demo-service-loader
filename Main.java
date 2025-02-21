public class Main {
    
    public static void main(String[] args) {
        Context context = new Context();
        ServiceA serviceA = (ServiceA) context.getService("ServiceA");
        serviceA.doSomething();

        ServiceA serviceA2 = new ServiceA();
        serviceA2.doSomething();
    }
}
