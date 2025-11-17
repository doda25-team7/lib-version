import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class VersionUtil {

    private static final String VERSION;

    static {
        String v = "UNKNOWN";
        try (InputStream is = VersionUtil.class
                .getClassLoader()
                .getResourceAsStream("version.properties")) {

            if (is != null) {
                Properties props = new Properties();
                props.load(is);
                String prop = props.getProperty("version");
                if (prop != null && !prop.isEmpty()) {
                    v = prop;
                }
            }
        } catch (IOException _) {
        }
        VERSION = v;
    }

    private VersionUtil() {}

    public static String getVersion() {
        return VERSION;
    }
}
