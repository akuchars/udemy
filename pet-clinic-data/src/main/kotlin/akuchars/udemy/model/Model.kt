package akuchars.udemy.model

import kotlin.properties.Delegates

abstract class Model {
    val id: Long by Delegates.notNull()
}