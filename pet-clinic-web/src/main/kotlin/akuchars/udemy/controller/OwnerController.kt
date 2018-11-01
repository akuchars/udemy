package akuchars.udemy.controller

import akuchars.udemy.model.Owner
import akuchars.udemy.service.CrudService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class OwnerController (private val service: CrudService<Owner, Long>) {

    @RequestMapping(value = ["/owner/index", "/owner/index.html", "/owner"])
    fun redirect(model: Model): String {
        model.addAttribute("owners", service.findAll())
        return "owners/index"
    }
}