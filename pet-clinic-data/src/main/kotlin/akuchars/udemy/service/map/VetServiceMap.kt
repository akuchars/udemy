package akuchars.udemy.service.map

import akuchars.udemy.model.Vet
import akuchars.udemy.service.VetService
import org.springframework.stereotype.Service

@Service
class VetServiceMap : AbstractMapService<Vet, Long>(), VetService