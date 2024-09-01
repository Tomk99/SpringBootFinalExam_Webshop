package hu.cubix.catalog.web;

import hu.cubix.catalog.api.CatalogApi;
import hu.cubix.catalog.dto.ProductCategoryDto;
import hu.cubix.catalog.mapper.ProductCategoryMapper;
import hu.cubix.catalog.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductCategoryController implements CatalogApi {

    @Autowired
    ProductCategoryRepository categoryRepository;
    @Autowired
    ProductCategoryMapper categoryMapper;
    @Override
    public List<ProductCategoryDto> findAllCategory() {
        return categoryMapper.categoriesToDtos(categoryRepository.findAll());
    }

    @Override
    public ProductCategoryDto createNewCategory(ProductCategoryDto productCategoryDto) {
        categoryRepository.save(categoryMapper.dtoToCategory(productCategoryDto));
        return productCategoryDto;
    }
}
