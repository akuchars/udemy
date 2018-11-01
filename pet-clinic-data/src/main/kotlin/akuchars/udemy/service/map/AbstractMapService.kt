package akuchars.udemy.service.map

import akuchars.udemy.model.Model
import akuchars.udemy.service.CrudService
import io.vavr.kotlin.`try`
import java.util.*

abstract class AbstractMapService<T : Model, ID: Long> : CrudService<T, ID> {
    private val map = mapOf<Long, T>().toMutableMap()

    override fun findById(id: ID): T? = map[id]

    override fun save(model: T): T {
        model.id = getNextId()
        map[model.id!!] = model
        return model
    }
    override fun findAll(): Set<T> = map.values.toSet()

    override fun deleteById(id: ID) {
        map.remove(id)
    }

    override fun delete(model: T) {
        map.entries.removeIf { it.value == model }
    }

    private fun getNextId() : Long = `try`{Collections.max(map.keys) + 1}.getOrElse(1L)
}