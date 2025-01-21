import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { ProductService } from '../../services/product.service';
import { Product } from '../../models/product';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-add-product',
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './add-product.component.html',
  styleUrl: './add-product.component.css'
})
export class AddProductComponent {

  // Reactive Form
  productForm = new FormGroup({
    title: new FormControl('', [Validators.required]),
    category: new FormControl('', [Validators.required]),
    price: new FormControl('', [Validators.required, Validators.min(0)]),
  })

  message: string = '';

  constructor(private productService: ProductService) { }


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
      const newProduct: Product = {id: Date.now(), title, category, price: Number(price)};
      this.productService.addProduct(newProduct);
      
      // reset the form
      this.productForm.reset();


      this.message = 'Product Added Successfully'
    }
  }

}
