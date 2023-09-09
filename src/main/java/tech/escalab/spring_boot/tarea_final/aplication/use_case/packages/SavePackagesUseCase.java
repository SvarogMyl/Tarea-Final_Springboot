package tech.escalab.spring_boot.tarea_final.aplication.use_case.packages;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import tech.escalab.spring_boot.tarea_final.domain.model.packages.Packages;
import tech.escalab.spring_boot.tarea_final.domain.port.packages.PackagesPort;

@AllArgsConstructor
@Component
public class SavePackagesUseCase {
    private PackagesPort port;

    public Packages execute(Packages packages){

        return port.save(packages);
    }
}
