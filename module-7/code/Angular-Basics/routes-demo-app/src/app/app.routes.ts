import { Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { AboutComponent } from './pages/about/about.component';
import { PageNotFoundComponent } from './pages/page-not-found/page-not-found.component';
import { AboutCompanyComponent } from './pages/about-company/about-company.component';
import { AboutPeopleComponent } from './pages/about-people/about-people.component';
import { ProfilesComponent } from './pages/profiles/profiles.component';
import { ProfileDetailComponent } from './pages/profile-detail/profile-detail.component';
import { PaymentsComponent } from './pages/payments/payments.component';

export const routes: Routes = [
    {path: '', redirectTo:"/home", pathMatch:"full"},
    {path: 'home', component: HomeComponent},
    {
        path: 'about',
        component: AboutComponent,
        // second way
        // and the RouterOutlet should be added to the template
        children: [
            // auto redirect to /about company
            {path: '', redirectTo: '/about/company', pathMatch: "full"},
            {path: 'company', component: AboutCompanyComponent},
            {path: 'people', component: AboutPeopleComponent},
        ]
    },

    // one way
    // {path: 'about/company', component: AboutCompanyComponent},
    // {path: 'about/people', component: AboutPeopleComponent},


    {path: 'profiles', component: ProfilesComponent},

    {path: 'profiles/:name', component: ProfileDetailComponent},
    {path: 'profiles/:name', component: ProfileDetailComponent},

    {path: 'payments', component: PaymentsComponent},

    // This should always be at the end
    {path: '**', component: PageNotFoundComponent},
];
