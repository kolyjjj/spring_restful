package koly.li;

import koly.model.Credential;
import koly.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.util.StringUtils.isEmpty;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class LoginController {
    @RequestMapping(value = "/login", method = POST)
    @ResponseBody
    public Map<String, String> onCreate(@RequestBody User user, HttpServletResponse httpServletResponse) {
        Credential credential = new Credential();
        credential.setUsername(user.getName());
        credential.setToken("LDJLFKJGHSODUFJLJSDKJFLSKDFJ");
        HashMap<String, String> map = new HashMap<String, String>();

        if (isEmpty(user.getName()) || isEmpty(user.getPassword())){
            httpServletResponse.setStatus(401);
            map.put("errorMessage", "登录失败，用户名或密码错误！");
        }else{
            map.put("name", user.getName());
            map.put("token", credential.getToken());
        }
        return map;
    }

    @RequestMapping(value = "/login", method= GET)
    @ResponseBody
    public Credential onView() {
        return new Credential("kewei", "AAAAAAAAA");
    }
}
