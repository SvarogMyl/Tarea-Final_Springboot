package tech.escalab.spring_boot.tarea_final.aplication.use_case.drivers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import tech.escalab.spring_boot.tarea_final.domain.model.drivers.Drivers;
import tech.escalab.spring_boot.tarea_final.domain.port.drivers.DriversPort;

@AllArgsConstructor
@Component
public class SaveDriversUseCase {
    private DriversPort driversPort;

    public Drivers execute(Drivers drivers){
        return driversPort.save(drivers);
    }
}
