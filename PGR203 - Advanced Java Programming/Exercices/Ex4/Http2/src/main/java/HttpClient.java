import java.io.IOException;
import java.net.Socket;

public class HttpClient
{
    private String hostName, requestTarget;
    private int port;

    public HttpClient(String hostName, int port, String requestTarget) {
        this.hostName = hostName;
        this.port = port;
        this.requestTarget = requestTarget;
    }

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("urlecho.appspot.com", 80);
        String request= "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9\r\n" +
                "Accept-Language: en-GB,en-US;q=0.9,en;q=0.8,nb;q=0.7\r\n" +
                "Cache-Control: max-age=0\r\n" +
                "Connection: keep-alive\r\n" +
                "dnt: 1\r\n" +
                "Host: urlecho.appspot.com\r\n" +
                "Upgrade-Insecure-Requests: 1\r\n" +
                "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/85.0.4183.102 Safari/537.36";
        socket.getOutputStream().write(request.getBytes());


        int c;
        while ((c = socket.getInputStream().read()) != '\r') {
            StringBuilder str = new StringBuilder();
            str.append(c); 
        }
    }

    public Object getStatusCode() {
        return 200;
    }
}
