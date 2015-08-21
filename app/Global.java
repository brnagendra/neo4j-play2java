import org.neo.Neo4jSessionFactory;
import play.Application;
import play.GlobalSettings;

/**
 * Created by nagendra on 8/21/2015.
 */
public class Global extends GlobalSettings {

    @Override
    public void onStart(Application app) {


        System.setProperty("username", "neo4j");
        System.setProperty("password", "neo");
        Neo4jSessionFactory.getInstance();
    }
}
