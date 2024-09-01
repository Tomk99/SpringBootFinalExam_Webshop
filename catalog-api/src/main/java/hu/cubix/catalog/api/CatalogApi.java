package hu.cubix.catalog.api;

import hu.cubix.catalog.dto.ProductCategoryDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "catalog", url = "${feign.bonus.url}")
public interface CatalogApi {
    @GetMapping("/catalog")
    List<ProductCategoryDto> findAllCategory();

    @PostMapping("/catalog")
    ProductCategoryDto createNewCategory(@RequestBody ProductCategoryDto productCategoryDto);
}
