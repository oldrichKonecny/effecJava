import lombok.Getter;
import lombok.Setter;

/**
 * Created by oldrichkonecny on 20/05/2017.
 */
@Getter
@Setter
public class StaticFactoryNormal {

    private String what;

    private StaticFactoryNormal() {

    }

    public static StaticFactoryNormal newInstance() {
        StaticFactoryNormal staticFactoryNormal = new StaticFactoryNormal();
        staticFactoryNormal.setWhat("Nothing");
        return staticFactoryNormal;
    }

}
