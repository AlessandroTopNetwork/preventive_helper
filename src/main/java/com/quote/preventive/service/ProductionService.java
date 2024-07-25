package com.quote.preventive.service;

import java.util.List;

import com.quote.preventive.model.ProductionModel;

public interface ProductionService {

    List<ProductionModel> findAll();

    ProductionModel findById(Long theId);

    List<ProductionModel> save(List<ProductionModel> theEmployee);
    
    void updateProdution(ProductionModel production);

    void deleteById(Long theId) throws Exception;
    
    void checkFieldObj(ProductionModel p);

}
