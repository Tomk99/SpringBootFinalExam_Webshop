package hu.cubix.catalog.mapper;

import hu.cubix.catalog.dto.ProductCategoryDto;
import hu.cubix.catalog.model.ProductCategory;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductCategoryMapper {
    ProductCategoryDto categoryToDto(ProductCategory category);
    List<ProductCategoryDto> categoriesToDtos(List<ProductCategory> categories);
    ProductCategory dtoToCategory(ProductCategoryDto productCategoryDto);
}
