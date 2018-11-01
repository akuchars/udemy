package akuchars.udemy.jokes.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class JokesApp {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(JokesApp::class.java, *args)
        }
    }
}
