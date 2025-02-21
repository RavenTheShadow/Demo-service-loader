public class ServiceA implements IServiceA {
    private static ServiceA instance;

    public  ServiceA() {
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("ServiceA already created, please call the Context to get the instance");
        }
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

    @Override
    public void doSomething() {
        System.out.println("ServiceA is doing something");
    }
}
