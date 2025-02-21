import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public final class Context {
    private List<BaseService> services = new ArrayList<BaseService>();

    public Context() {
        registerAllServices();
    }

    public void registerAllServices() {
        ServiceLoader<BaseService> loader = ServiceLoader.load(BaseService.class);
        for (BaseService service : loader) {
            services.add(service);
        }
    }

    public BaseService getService(String serviceName) {
        for (BaseService service : services) {
            if (service.getClass().getSimpleName().equals(serviceName)) {
                return service;
            }
        }
        return null;
    }
}