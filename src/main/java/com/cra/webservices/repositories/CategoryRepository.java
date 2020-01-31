package com.cra.webservices.repositories;

import com.cra.webservices.entities.Category;
import com.cra.webservices.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
