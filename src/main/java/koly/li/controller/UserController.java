package koly.li.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @RequestMapping(value = "/id")
    @ResponseBody
    public Map<String, String> email(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("id", "1");
        return map;
    }

    @RequestMapping(value = "/creditnumber")
    @ResponseBody
    public Map<String, String> id(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("creditNumber", "12345");
        return map;
    }

    @RequestMapping(value = "/credit")
    @ResponseBody
    public Map<String, String> credit(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("amount", "50");
        map.put("owner", "koly");
        return map;
    }
}
