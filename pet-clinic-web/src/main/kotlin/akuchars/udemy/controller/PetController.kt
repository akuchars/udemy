package akuchars.udemy.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class PetController {

    @RequestMapping(value = ["/pet/index", "/pet/index.html", "/pet"])
    fun listPets(): String = "pet/index"
}