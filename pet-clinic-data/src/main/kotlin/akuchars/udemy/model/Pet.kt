package akuchars.udemy.model

import java.time.LocalDate

class Pet(id: Long, val type: PetType, owner: Owner, birthDate: LocalDate) : Model(id)