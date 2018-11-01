package akuchars.udemy.service.map

import akuchars.udemy.model.Pet
import akuchars.udemy.service.PetService

class PetServiceMap : AbstractMapService<Pet, Long>(), PetService {
    override fun save(model: Pet): Pet = super.save(model.id, model)
}