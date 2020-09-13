import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HttpClientTest {

    @Test
    void shouldGetSuccessfulResponseCode() throws IOException {
        HttpClient client = makeEchoRequest("/echo?status=200");
        assertEquals(200, client.getStatusCode());
    }

    @Test
    void shouldGetFailureResponseCode() throws IOException {
        HttpClient client = makeEchoRequest("/echo?status=401");
        assertEquals(401, client.getStatusCode());
    }


    private HttpClient makeEchoRequest(String requestTarget) throws IOException {
        return new HttpClient("urlecho.appspot.com", 80, requestTarget);
    }

    @Test
    void shouldReadResponseHeaders() throws IOException {
        HttpClient client = new HttpClient("urlecho.appspot.com", 80, "/echo?body=kristiania");
        assertEquals("kristiania".length(), client.getResponseHeader("Content-length"));
    }

}
