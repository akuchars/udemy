package akuchars.udemy.controller

import akuchars.udemy.model.Vet
import akuchars.udemy.service.CrudService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class VetController(private val service: CrudService<Vet, Long>) {

    @RequestMapping(value = ["/vets/index", "/vets/index.html", "/vets"])
    fun listVets(model: Model): String {
        model.addAttribute("owners", service.findAll())
        return "vets/index"
    }
}