package controller;

import com.sun.net.httpserver.HttpServer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Created by Satyarth on 1/12/16.
 */
@Controller
public class EmbeddabeServerController {


  @RequestMapping(value = "/server")
  @ResponseBody
  public static String startServer() {
    try {
      HttpServer myServer = HttpServer.create(new InetSocketAddress(1124), 0);
      myServer.createContext("/started",new MyHttpHandler());
      myServer.setExecutor(null);
      myServer.start();
    }
    catch (IOException e) {
      e.printStackTrace();
      return "There were problems starting the server";
    }
    return "Server started at port number 1124 with address as \"/started\"";
  }
}
