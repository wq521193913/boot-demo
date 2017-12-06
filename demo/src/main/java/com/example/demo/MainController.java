package com.example.demo;

import com.example.entity.User;
import com.example.service.UserService;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RestController
public class MainController {
    final Logger logger = Logger.getLogger(MainController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public ModelAndView helloWorld() {
        logger.debug("hello world");
        ModelAndView modelAndView = new ModelAndView("test");
        return modelAndView;
    }

    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject getUserInfo(@RequestParam("id")Integer id){
        JSONObject result = new JSONObject();
        try {
            User user = userService.queryUserById(id);
            result.put("success",true);
            result.put("data",user);
            result.put("msg","查询成功");
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

}
