import { Component } from '@angular/core';
import { FormGroup, FormControl, Validators, ReactiveFormsModule } from '@angular/forms';
import { Product } from '../../models/product';
import { ProductService } from '../../services/product.service';
import { CommonModule } from '@angular/common';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-edit-product',
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './edit-product.component.html',
  styleUrl: './edit-product.component.css'
})
export class EditProductComponent {

    // Reactive Form
    productForm = new FormGroup({
      title: new FormControl('', [Validators.required]),
      category: new FormControl('', [Validators.required]),
      price: new FormControl('', [Validators.required, Validators.min(0)]),
    })
  
    message: string = '';
    error: string = '';
    productId: number = 0;
  
    constructor(private productService: ProductService, private route: ActivatedRoute) { 

      // get the product id from the url
      this.productId = route.snapshot.params['id'];

      // get product from the service
      const product = this.productService.getProductById(this.productId);

      if (product) {
        this.productForm.patchValue({
          title: product.title,
          category: product.category,
          price: String(product.price)
        })
      }
    }
  
  
    get title(): FormControl {
      return this.productForm.get('title') as FormControl;
    }
  
    get category(): FormControl {
      return this.productForm.get('category') as FormControl;
    }
  
    get price(): FormControl {
      return this.productForm.get('price') as FormControl;
    }
  
  
    handleSubmit() {
      const {title, category, price} = this.productForm.value;
  
      // if they all exist then  ass the product to the service
      if(title && category && price) {

        const editedProduct: Product = {id: this.productId, title, category, price: Number(price)};
        
        if (this.productService.updateProduct(editedProduct)) {
          this.message = 'Product updated Successfully'
        } else {
          this.error = 'Something went wrong'
        }
  
      }
    }
}
