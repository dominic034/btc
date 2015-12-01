package cer.cop;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.btc.bcart.model.Catalog;


public interface CatalogRepository  extends MongoRepository<Catalog, String>{
	
	List <Catalog> getAllCatalog();
	Catalog getAllCatalogbyId(String ID);

}
