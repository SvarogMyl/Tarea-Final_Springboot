package tech.escalab.spring_boot.tarea_final.aplication.use_case.drivers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import tech.escalab.spring_boot.tarea_final.domain.model.drivers.Drivers;
import tech.escalab.spring_boot.tarea_final.domain.port.drivers.DriversPort;

import java.util.UUID;
@AllArgsConstructor
@Component
public class UpdateDriversUseCase {
    private DriversPort driversPort;

    public void execute(UUID uuid, Drivers drivers){
        var driverFound = driversPort.findByUuid(uuid);
        driversPort.update(drivers, driverFound);
    }
}
