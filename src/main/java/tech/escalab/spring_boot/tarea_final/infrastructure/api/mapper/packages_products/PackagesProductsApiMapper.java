package tech.escalab.spring_boot.tarea_final.infrastructure.api.mapper.packages_products;

import org.mapstruct.*;
import tech.escalab.spring_boot.tarea_final.domain.model.packages_products.PackagesProducts;
import tech.escalab.spring_boot.tarea_final.infrastructure.api.dto.packages_products.request.PackagesProductsRequestDto;
import tech.escalab.spring_boot.tarea_final.infrastructure.api.dto.packages_products.response.PackagesProductsResponseDto;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface PackagesProductsApiMapper {

    PackagesProducts toDomain(PackagesProductsRequestDto request);
    PackagesProductsResponseDto toResponse(PackagesProducts p);
}
