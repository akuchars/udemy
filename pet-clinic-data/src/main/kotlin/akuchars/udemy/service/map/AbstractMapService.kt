package akuchars.udemy.service.map

import akuchars.udemy.model.Model
import akuchars.udemy.service.CrudService

abstract class AbstractMapService<T : Model, ID> : CrudService<T, ID> {
    private val map = mapOf<ID, T>().toMutableMap()

    override fun findById(id: ID): T? = map[id]

    fun save(id: ID, model: T): T {
        map[id] = model
        return model
    }

    override fun findAll(): Set<T> = map.values.toSet()

    override fun deleteById(id: ID) {
        map.remove(id)
    }

    override fun delete(model: T) {
        map.entries.removeIf { it.value == model }
    }
}