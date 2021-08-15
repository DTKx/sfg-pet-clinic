package dtk.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")//reduces relative paths in request mapping
@Controller
public class OwnerController {
    @RequestMapping({"","/","/index","/index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
