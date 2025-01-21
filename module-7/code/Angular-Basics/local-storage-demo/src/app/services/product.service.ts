import { Injectable } from '@angular/core';
import { Product } from '../models/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor() { }


  // get the products from the localstorage
  getProducts(): Product[] {
    const products = localStorage.getItem('products');

    return products? JSON.parse(products) : []
  }


  addProduct(product: Product) {
    const products = this.getProducts();
    products.push(product);

    localStorage.setItem('products', JSON.stringify(products))
  }


  getProductById(productId: number): Product | null {
    const products = this.getProducts();
    const index = products.findIndex(p => p.id == productId);

    if(index != -1){
      return products[index];
    }
    return null;
  }


  /**
   * Function that takes a product and return true if it's successful
   * @param editedProduct
   * @returns 
   */
  updateProduct(editedProduct: Product): boolean{
    const products = this.getProducts();
    const index = products.findIndex(p => p.id === editedProduct.id);

    if(index !== -1){
      products[index] =  editedProduct;
      localStorage.setItem('products', JSON.stringify(products));
      return true;
    }
    return false;
  }



  deleteProduct(productId: number) {
    const products = this.getProducts();
    const updateProducts = products.filter(p => p.id !== productId);
    localStorage.setItem('products', JSON.stringify(updateProducts));
  }
}
