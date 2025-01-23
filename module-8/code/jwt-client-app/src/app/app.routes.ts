import { Routes } from '@angular/router';
import { LoginComponent } from './pages/login/login.component';
import { RegisterComponent } from './pages/register/register.component';
import { ProductsComponent } from './pages/products/products.component';
import { UnauthorizedComponent } from './pages/unauthorized/unauthorized.component';
import { PageNotFoundComponent } from './pages/page-not-found/page-not-found.component';
import { authGuard } from './guards/auth.guard';

export const routes: Routes = [
    {path: '', redirectTo: '/login', pathMatch:'full'},
    {path: 'login', component: LoginComponent},
    {path: 'register', component: RegisterComponent},
    {path: 'products', component: ProductsComponent, canActivate:[authGuard]},
    {path: 'unauthorized', component: UnauthorizedComponent},
    {path: '**', component: PageNotFoundComponent}

];
