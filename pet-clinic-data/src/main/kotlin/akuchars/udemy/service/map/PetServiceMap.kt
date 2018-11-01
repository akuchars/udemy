package akuchars.udemy.service.map

import akuchars.udemy.model.Pet
import akuchars.udemy.service.PetService
import org.springframework.stereotype.Service

@Service
class PetServiceMap : AbstractMapService<Pet, Long>(), PetService