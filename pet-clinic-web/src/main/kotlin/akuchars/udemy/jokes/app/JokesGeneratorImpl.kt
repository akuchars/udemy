package akuchars.udemy.jokes.app

import org.springframework.stereotype.Service

@Service
open class JokesGeneratorImpl: JokesGenerator {
    override fun joke(): String = "Some nice joke"
}