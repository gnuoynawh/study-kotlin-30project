package com.gnuoynawh.prj.part5.shopping.data.repository

import com.gnuoynawh.prj.part5.shopping.data.entity.product.ProductEntity

interface ProductRepository {

    suspend fun getProductList(): List<ProductEntity>

    suspend fun getLocalProductList(): List<ProductEntity>

    suspend fun insertProductItem(productItem: ProductEntity): Long

    suspend fun insertProductList(productList: List<ProductEntity>)

    suspend fun updateProductItem(productItem: ProductEntity)

    suspend fun getProductItem(itemId: Long): ProductEntity?

    suspend fun deleteAll()

    suspend fun deleteProductItem(id: Long)

}