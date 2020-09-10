import java.io.IOException;
import java.net.Socket;

public class HttpClient {

    private final String host;
    private final int port;
    private final String requestTarget;
    private int statusCode;


    public static void main(String[] args) throws IOException {
        new HttpClient("urlecho.appspot.com", 80, "/echo").executeRequest();
    }

    public HttpClient(String host, int port, String requestTarget) throws IOException {
        this.host = host;
        this.port = port;
        this.requestTarget = requestTarget;
        executeRequest();
    }

    private void executeRequest() throws IOException {
        Socket socket = new Socket(host, port);
        socket.getOutputStream().write(("GET " + requestTarget + " HTTP/1.1\r\n" +
                "Host: " + host + "\r\n" +
                "\r\n").getBytes());

        StringBuilder output = readLine(socket);

        String[] array = output.toString().split(" ");
        int out = Integer.parseInt(array[1]);
        statusCode = Integer.parseInt(array[1]);
        System.out.println(out);
    }


    private StringBuilder readLine(Socket socket) throws IOException {
        int c;
        StringBuilder output = new StringBuilder();

        while ((c = socket.getInputStream().read()) != '\r') {
            output.append((char) c);
        }
        return output;
    }


    public int getStatusCode() throws IOException {
        return statusCode;
    }

    public int getResponseHeader(String s) {
        return 0;
    }
}
