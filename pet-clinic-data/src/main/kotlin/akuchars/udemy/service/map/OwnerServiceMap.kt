package akuchars.udemy.service.map

import akuchars.udemy.model.Owner

class OwnerServiceMap : AbstractMapService<Owner, Long>() {
    override fun save(model: Owner): Owner = super.save(model.id, model)
}