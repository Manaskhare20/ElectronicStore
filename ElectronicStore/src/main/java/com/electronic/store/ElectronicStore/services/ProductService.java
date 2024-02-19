package com.electronic.store.ElectronicStore.services;

import com.electronic.store.ElectronicStore.dtos.PageableResponse;
import com.electronic.store.ElectronicStore.dtos.ProductDto;
import com.electronic.store.ElectronicStore.entities.Product;

import java.util.List;

public interface ProductService {
    //create
    ProductDto create(ProductDto productDto);

    //update

    ProductDto update(ProductDto productDto,String productId);

    //delete

    void delete(String productId);

    //get single
    ProductDto get(String productID);

    PageableResponse<ProductDto>getAll(int pageNumber,int pageSize,String sortBy,String sortDir);

    //getAlllive products

    PageableResponse<ProductDto> getAllLive(int pageNumber,int pageSize,String sortBy,String sortDir);

    //Search product by title
    PageableResponse<ProductDto>searchByTitle(String subTitle,int pageNumber,int pageSize,String sortBy,String sortDir);


    ProductDto createWithCategory(ProductDto productDto, String categoryId);

    ProductDto updateCategory(String productId, String categoryId);

    PageableResponse<ProductDto> getAllOfCategory(String categoryId, int pageNumber, int pageSize, String sortBy, String sortDir);
}
