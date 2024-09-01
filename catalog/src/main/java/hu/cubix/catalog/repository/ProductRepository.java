package hu.cubix.catalog.repository;

import hu.cubix.catalog.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
