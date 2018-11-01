package akuchars.udemy.service.map

import akuchars.udemy.model.Vet
import akuchars.udemy.service.VetService

class VetServiceMap : AbstractMapService<Vet, Long>(), VetService {
    override fun save(model: Vet): Vet = super.save(model.id, model)
}