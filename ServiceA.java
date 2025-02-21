public class ServiceA implements BaseService {
    private static ServiceA instance;

    public  ServiceA() {
    }

    private static synchronized ServiceA getInstance() {
        if (instance == null) {
            instance = new ServiceA();
        }
        return instance;
    }

    @Override
    public BaseService getBaseService() {
        return ServiceA.getInstance();
    }

    public void doSomething() {
        System.out.println("ServiceA is doing something");
    }
}
