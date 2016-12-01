package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Satyarth on 30/11/16.
 */
@Controller
@RequestMapping("/app")
public class Starter {

  @RequestMapping(value = "/dummy")
  @ResponseBody
  public static String dummy() {
    return "People live in peace";
  }

}
