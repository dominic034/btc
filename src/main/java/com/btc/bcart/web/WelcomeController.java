
package com.btc.bcart.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.btc.bcart.model.Catalog;
import com.btc.bcart.model.Products;
import com.btc.bcart.service.ProductService;

/**
 * @since 2015
 */
@Controller
public class WelcomeController {
	
	@Autowired
	private ProductService productService;
 
    // Spring MVC calls method loadPetWithVisit(...) before initNewVisitForm is called
	@RequestMapping(value = "/", method = RequestMethod.GET)  
    public String getCatalog(Map<String, Object> model) {
    	return "/welcome";
    }
	
	 @ModelAttribute("productByCatagory")
//	 public List <Products> getProductsbyCatagory(@PathVariable("categoryID") String categoryID) {
//		 return  productService.getProductsbyCatagory(categoryID);
//	    }
//    
	   @RequestMapping(value = "/pets/{categoryID}/edit", method = RequestMethod.GET)
	    public  String initUpdateForm(@PathVariable("categoryID") String categoryID, ModelMap model) {
		 List <Products> list = productService.getProductsbyCatagory(categoryID);
	        model.put("popularProduts", list);
	        return "/welcome";
	    }
	 
	 
	 
    @ModelAttribute("categorys")  
    public List <Catalog> getAllCatalog(){
    	return productService.getAllCatalog();
      }
    
    @ModelAttribute("popularProduts") 
    public List <Products> getPopularProduts(){
    	return productService.getPopularProduts();
      }



}
