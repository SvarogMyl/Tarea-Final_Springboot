package tech.escalab.spring_boot.tarea_final.domain.exception.base;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DomainExceptionCode {

    PACKAGES_STATUS_LOADED_INVALID(201, 400, "No se posible eliminar el paquete, debe tener el estado LOADED");

    private Integer codeApp;

    private Integer statusCode;

    private String message;
}
