package controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoxu on 1/10/16.
 */
@RestController
public class HomeController {

    @RequestMapping(value="/home", method = RequestMethod.GET)
    public ResponseEntity<List<String>> displayWelcomeMessage() {

        List<String> strings = new ArrayList<String>();
        strings.add("Welcome to my home page!!!");

        return new ResponseEntity<List<String>>(strings, HttpStatus.OK);
    }

}
