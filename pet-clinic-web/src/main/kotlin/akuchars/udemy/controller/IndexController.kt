package akuchars.udemy.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
open class IndexController {

    @RequestMapping(value = ["", "/", "index", "index.html"])
    fun index(): String = "index"
}