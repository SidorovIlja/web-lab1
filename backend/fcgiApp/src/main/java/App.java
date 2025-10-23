import com.fastcgi.*;
import java.lang.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(App.class.getName());
        FileHandler fh = new FileHandler("/home/studs/s467141/httpd-root/fcgi-bin/my_log.log", false);
        logger.addHandler(fh);

        FCGIInterface fcgiInterface = new FCGIInterface();
        logger.info("Server was started");
        
        while (fcgiInterface.FCGIaccept() >= 0) {

            }
        }
    }
} 