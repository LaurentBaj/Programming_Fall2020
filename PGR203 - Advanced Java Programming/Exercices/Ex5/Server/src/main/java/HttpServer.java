package java;

public class HttpServer {
    private final ServerSocket serverSocket;

    public HttpServer(int port) throws IOException {
        // new ServerSocket throws IOException if for example the port is already in use
        // new ServerSocket opens a "port" for incoming connections on the network
        // In this case, putting http://localhost:9080 in the web browser address bar
        // will attach the browser to this server
        this.serverSocket = new ServerSocket(port);
    }

    public static void main(String[] args) throws IOException {
        new HttpServer(9080).start();
    }

    private void start() throws IOException {
        // waits and blocks the current thread until a client tries to connect
        //  then returns a socket to the client
        Socket socket = serverSocket.accept();

        // What the server writes to socket.getOutputStream,
        // the client can read from socket.getInputStream
        socket.getOutputStream().write(("HTTP/1.1 200 OK\r\n" +
                // "HTTP/1.1 .... Hello world" is a single string broken up over several lines
                "Content-length: 12\r\n" +
                // The HTTP protocol (RFC7230) requires each line to end with
                //  carriage return (\r) and linefeed (\n)
                "Content-type: text/plain\r\n" +
                // An HTTP header. Header name and header value are separated by ":"
                "\r\n" + // A newline separates the headers from the content body
                "Hello World!").getBytes());
        // body should be the same number of bytes as the content-length header
    }
}
