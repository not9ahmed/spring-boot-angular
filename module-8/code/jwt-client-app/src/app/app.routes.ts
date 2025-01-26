import { Routes } from '@angular/router';
import { LoginComponent } from './pages/login/login.component';
import { RegisterComponent } from './pages/register/register.component';
import { ProductsComponent } from './pages/products/products.component';
import { UnauthorizedComponent } from './pages/unauthorized/unauthorized.component';
import { PageNotFoundComponent } from './pages/page-not-found/page-not-found.component';
import { authGuard } from './guards/auth.guard';
import { BooksComponent } from './pages/books/books.component';
// import { PaymentsComponent } from './pages/payments/payments.component';

export const routes: Routes = [
    {path: '', redirectTo: '/login', pathMatch:'full'},
    {path: 'login', component: LoginComponent},
    {path: 'register', component: RegisterComponent},

    // User roles restrictions
    {path: 'products', component: ProductsComponent, canActivate:[authGuard], data: {roles: ['ADMIN', 'USER']}},
    {path: 'books', component: BooksComponent, canActivate:[authGuard], data: {roles: ['ADMIN']}},

    // normal path without lazy loading
    // {path: 'payment', component: PaymentsComponent},

    // Lazy loading payment page
    {path: 'payment', loadComponent: () => import('./pages/payment/payment.component').then((c) => c.PaymentComponent)},

    {path: 'unauthorized', component: UnauthorizedComponent},
    {path: '**', component: PageNotFoundComponent}

];
