import com.fastcgi.*;
public class App {
    public static void main(String[] args) {
        System.setProperty("FCGI_PORT", "29299");
        var fcgiInterface = new FCGIInterface();
        while (fcgiInterface.FCGIaccept() >= 0) {
            var method = FCGIInterface.request.params.getProperty("REQUEST_METHOD");

            if (method.equals("GET")) {
                System.out.println("Content-type: text/plain\n");
                System.out.println("Hello from java ");
            }
        }
    }
} 