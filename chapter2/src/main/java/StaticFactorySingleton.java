import lombok.Getter;
import lombok.Setter;

/**
 * Created by olda on 28.05.2017.
 */
public class StaticFactorySingleton {

    private static final String NAME = "Singleton Class Example";
    private static final StaticFactorySingleton staticFactorySingleton = new StaticFactorySingleton("default", 42);

    @Setter
    @Getter
    private String something;
    @Setter
    @Getter
    private Integer number;



    /**
     * This class has only one instance
     */
    private StaticFactorySingleton() {}
    private StaticFactorySingleton(String something, Integer number) {
        this.something = something;
        this.number = number;
    }

    public static StaticFactorySingleton getInstance() {
//       not valid coz 'private static final StaticFactorySingleton staticFactorySingleton' is final
//        if (staticFactorySingleton == null) {
//            staticFactorySingleton = new StaticFactorySingleton("something", 42);
//        }
        return staticFactorySingleton;
    }
}
