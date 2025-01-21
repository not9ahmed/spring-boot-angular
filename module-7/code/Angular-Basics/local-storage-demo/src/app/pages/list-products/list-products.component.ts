import { Component } from '@angular/core';
import { ProductService } from '../../services/product.service';
import { Product } from '../../models/product';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-list-products',
  imports: [CommonModule, RouterLink],
  templateUrl: './list-products.component.html',
  styleUrl: './list-products.component.css'
})
export class ListProductsComponent {

  productsList: Product[] = [];

  constructor(private productService: ProductService) {
    this.loadProducts();
  }
  
  loadProducts() {
    this.productsList = this.productService.getProducts();
  }


  handleDelete(productId: number) {
    const result = confirm('Are you sure you want to delete product');
    this.productService.deleteProduct(productId);
    this.loadProducts();
  }
}
