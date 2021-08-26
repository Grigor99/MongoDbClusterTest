package com.example.mongoatlasconnect.repo;

import com.example.mongoatlasconnect.model.Products;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends MongoRepository<Products,String > {
}
