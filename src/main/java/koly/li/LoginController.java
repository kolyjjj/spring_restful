package koly.li;

import koly.model.Credential;
import koly.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class LoginController {
    @RequestMapping(value = "/login", method = POST)
    @ResponseBody
    public Map<String, String> onCreate(@RequestBody User user) {
        Credential credential = new Credential();
        credential.setUsername(user.getName());
        credential.setToken("LDJLFKJGHSODUFJLJSDKJFLSKDFJ");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name", user.getName());
        map.put("token", credential.getToken());
        return map;
    }

    @RequestMapping(value = "/login", method= GET)
    @ResponseBody
    public String onView() {
        return "hello";
    }
}
