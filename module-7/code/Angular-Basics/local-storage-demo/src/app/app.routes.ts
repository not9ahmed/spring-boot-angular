import { Routes } from '@angular/router';
import { AddProductComponent } from './pages/add-product/add-product.component';
import { ListProductsComponent } from './pages/list-products/list-products.component';
import { EditProductComponent } from './pages/edit-product/edit-product.component';

export const routes: Routes = [
    {path: '', redirectTo: '/products', pathMatch: 'full'},
    {path: 'products', component: ListProductsComponent},
    {path: 'products/add', component: AddProductComponent},
    {path: 'products/:id', component: EditProductComponent},

];
