package tech.escalab.spring_boot.tarea_final.infrastructure.api.dto.packages.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import tech.escalab.spring_boot.tarea_final.domain.model.packages.Status;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString
public class PackagesResponseDto {
    private UUID uuid;
    private String code;
    private Double weight;
    private LocalDateTime schedule;
    private Status status;
    private UUID uuidTrucks;
    private List<UUID> products;
}
