package akuchars.udemy.bootstrap

import akuchars.udemy.model.Owner
import akuchars.udemy.model.Vet
import akuchars.udemy.service.map.OwnerServiceMap
import akuchars.udemy.service.map.VetServiceMap
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DataLoader(private var ownerService: OwnerServiceMap,
                 private var vetService: VetServiceMap) : CommandLineRunner {


    override fun run(vararg args: String?) {
        (0L..100L).map { Owner("Owner name $it", "Owner seconds name$it") }
                .forEach { ownerService.save(it) }
                .also { log.info("Added owners bootstrap") }
        (0L..100L)
                .map { Vet("Vet name $it", "Vet seconds name$it") }
                .forEach { vetService.save(it) }
                .also { log.info("Added vet bootstrap") }
    }

    companion object {
        val log: Logger = LoggerFactory.getLogger(DataLoader::class.java)
    }
}