package tech.escalab.spring_boot.tarea_final.infrastructure.adapters.jpa.addapter.drivers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import tech.escalab.spring_boot.tarea_final.domain.model.drivers.Drivers;
import tech.escalab.spring_boot.tarea_final.domain.port.drivers.DriversPort;
import tech.escalab.spring_boot.tarea_final.infrastructure.adapters.jpa.mapper.drivers.DriversJpaMapper;
import tech.escalab.spring_boot.tarea_final.infrastructure.adapters.jpa.repository.drivers.DriversRepositoryJpa;

import java.util.UUID;

@AllArgsConstructor
@Component
public class DriversPortAdapter implements DriversPort {

    private DriversJpaMapper jpaMapper;
    private DriversRepositoryJpa repositoryJpa;

    @Override
    public void deleteByUuid(UUID uuid) {
        repositoryJpa.deleteById(uuid);
    }

    @Override
    public Drivers findByUuid(UUID uuid) {
        var entity = repositoryJpa.findById(uuid)
                ;
        return jpaMapper.toDomain(entity.get());
    }

    @Override
    public Drivers save(Drivers drivers) {
        var savedDrivers = repositoryJpa.save(
                jpaMapper.toEntity(drivers)
        );
        return jpaMapper.toDomain(savedDrivers);
    }

    @Override
    public Drivers update(Drivers driversToUpdate, Drivers driversFound) {
        jpaMapper.updateDomain(driversToUpdate, driversFound);
        var entity = jpaMapper.toEntity(driversFound);
        return jpaMapper.toDomain(
                repositoryJpa.save(entity)
        );
    }
}
