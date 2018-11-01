package akuchars.udemy.service.map

import akuchars.udemy.model.Pet

class PetServiceMap : AbstractMapService<Pet, Long>() {
    override fun save(model: Pet): Pet = super.save(model.id, model)
}