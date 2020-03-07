package main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {

    @RequestMapping(value="/main/main.do")
    public String mainView(){
        return "views/webs/mainPage";
    }
}
