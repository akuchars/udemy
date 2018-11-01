package akuchars.udemy.jokes.app

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
open class JokesController(private val jokesGenerator: JokesGenerator) {

    @RequestMapping(value = ["/", ""])
    fun showJoke(model: Model): String = model.addAttribute("joke", jokesGenerator.joke()).let { "chucknorris" }
}