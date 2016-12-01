package controller;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Satyarth on 30/11/16.
 */
public class MyHttpHandler implements HttpHandler {

  public void handle(HttpExchange httpExchange) throws IOException {
    String response = "Yes, we have created a server!";
    httpExchange.sendResponseHeaders(200,response.getBytes().length);
    OutputStream os = httpExchange.getResponseBody();
    os.write(response.getBytes());
    os.close();
  }
}
