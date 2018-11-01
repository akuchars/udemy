package akuchars.udemy.service

import akuchars.udemy.model.Model

interface CrudService<T: Model, ID> {
    fun findById(id: ID): T
    fun save(model: T): T
    fun findAll(): Set<T>
    fun deleteById(id: ID)
    fun delete(id: T)
}