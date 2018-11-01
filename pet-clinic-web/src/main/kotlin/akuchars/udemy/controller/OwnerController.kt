package akuchars.udemy.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class OwnerController {

    @RequestMapping(value = ["/owner/index", "/owner/index.html", "/owner"])
    fun listOwners(): String = "owner/index"
}