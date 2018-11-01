package akuchars.udemy.service.map

import akuchars.udemy.model.Owner
import akuchars.udemy.service.OwnerService
import org.springframework.stereotype.Service

@Service
class OwnerServiceMap : AbstractMapService<Owner, Long>(), OwnerService