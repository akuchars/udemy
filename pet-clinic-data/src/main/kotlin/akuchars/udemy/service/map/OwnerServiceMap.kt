package akuchars.udemy.service.map

import akuchars.udemy.model.Owner
import akuchars.udemy.service.OwnerService

class OwnerServiceMap : AbstractMapService<Owner, Long>(), OwnerService {
    override fun save(model: Owner): Owner = super.save(model.id, model)
}