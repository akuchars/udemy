package akuchars.udemy.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class VetController {

    @RequestMapping(value = ["/vets/index", "/vets/index.html", "/vets"])
    fun listVets(): String = "vets/index"
}