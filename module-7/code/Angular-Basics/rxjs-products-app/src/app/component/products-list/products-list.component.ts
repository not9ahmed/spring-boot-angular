import { Component } from '@angular/core';
import { ProductService } from '../../services/product.service';
import { Product } from '../../models/product';
import { ProductCardComponent } from '../product-card/product-card.component';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-products-list',
  imports: [ProductCardComponent, CommonModule],
  templateUrl: './products-list.component.html',
  styleUrl: './products-list.component.css'
})
export class ProductsListComponent {
  
  productsList: Product[] = [];

  constructor(private productService: ProductService) {
    this.showAllProducts();
  }

  showAllProducts() {
    this.productService.getAllProducts().subscribe(data => {
      console.log(data)
      this.productsList = data;
    });
  }

}
