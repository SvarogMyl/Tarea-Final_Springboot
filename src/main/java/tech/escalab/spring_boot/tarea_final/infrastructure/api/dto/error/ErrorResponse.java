package tech.escalab.spring_boot.tarea_final.infrastructure.api.dto.error;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ErrorResponse {

    private Integer codeAppError;

    private Integer httpStatus;

    private String message;

    private Object detailMessage;
}

