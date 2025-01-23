import { Component } from '@angular/core';
import { Product } from '../../models/product';
import { ProductService } from '../../services/product.service';

@Component({
  selector: 'app-products',
  imports: [],
  templateUrl: './products.component.html',
  styleUrl: './products.component.css'
})
export class ProductsComponent {

  products : Product[] = [];

  constructor(private productService: ProductService) {
    this.loadProducts();
  }

  loadProducts() {
    this.productService.getAllProducts().subscribe((data) => {
      console.log(data);
      this.products = data;
    })
  }
}
