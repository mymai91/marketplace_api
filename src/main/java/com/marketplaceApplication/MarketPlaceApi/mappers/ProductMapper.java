package com.marketplaceApplication.MarketPlaceApi.mappers;

import com.marketplaceApplication.MarketPlaceApi.dtos.ProductDto;
import com.marketplaceApplication.MarketPlaceApi.entities.Product;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ProductMapper {
    Product toEntity(ProductDto productDto);

    ProductDto toDto(Product product);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Product partialUpdate(ProductDto productDto, @MappingTarget Product product);
}