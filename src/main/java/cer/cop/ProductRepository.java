package cer.cop;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.btc.bcart.model.Catalog;
import com.btc.bcart.model.Products;
@Repository
public interface ProductRepository extends MongoRepository<Products, String> {

	
	List <Products> getAllProduct();
	Products getAllProductById(String ID);

}
