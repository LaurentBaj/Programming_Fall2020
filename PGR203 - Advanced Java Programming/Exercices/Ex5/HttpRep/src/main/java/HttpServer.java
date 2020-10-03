import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {

    public HttpServer(int port) throws IOException {
        ServerSocket serverSocket = new ServerSocket(port); // Inngangsport slik at nettverksklienter kan kobles til

        new Thread(() -> {  // Lambda which creats multiple threads that don't block each other
            while (true) {
                try {
                    handleRequest(serverSocket.accept());   // .accept opens a connection and waits for a socket respone
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    // Everything from here is hardcoded message from server to page
    private void handleRequest(Socket clientSocket) throws IOException {
        String requestLine = HttpClient.readLine(clientSocket); // Using static method from readline
        System.out.println(requestLine);

        String requestTarget = requestLine.split(" ")[1];   // Split line to find request target
        String statusCode = "200"; // Default value of echo

        // Get the value of everything before the '?'(key) AND after 'value'
        int questionPos = requestTarget.indexOf('?');
        if (questionPos != -1) {
            String queryString = requestTarget.substring(questionPos+1);
            int equalPos = queryString.indexOf('=');
            String parameterName = queryString.substring(0, equalPos); // feks: status
            String parameterValue = queryString.substring(equalPos+1); // feks: value(of status)
            statusCode = parameterValue;
        }

        String response = "HTTP/1.1 " + statusCode + " OK\r\n" +
                "Content-Length: 29\r\n" +
                "Content-Type: text/html\r\n" +
                "\r\n" +
                "Hello <strong>World</strong>!";

        clientSocket.getOutputStream().write(response.getBytes()); // Write response back to server
    }

    public static void main(String[] args) throws IOException {
        new HttpServer(8080);
        System.out.println();
    }

}