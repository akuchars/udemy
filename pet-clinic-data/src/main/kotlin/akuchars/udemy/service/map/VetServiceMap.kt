package akuchars.udemy.service.map

import akuchars.udemy.model.Vet

class VetServiceMap : AbstractMapService<Vet, Long>() {
    override fun save(model: Vet): Vet = super.save(model.id, model)
}