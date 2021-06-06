import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { PlanComponent } from './plan/plan.component';
import { ListeComponent } from './liste/liste.component';
import { HelpComponent } from './help/help.component';

import { MarkerService } from './marker.service';

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { CinemaComponent } from './cinema/cinema.component';
import { FilmComponent } from './Film/Film.component';
import { HttpClientModule } from '@angular/common/http';
import { SignupFormComponent } from './signup-form/signup-form.component';
import { FormsModule, ReactiveFormsModule, FormGroup, FormControl, Validators } from '@angular/forms';
import { FormbookingComponent } from './formbooking/formbooking.component';
import { BookingrecapitulativeComponent } from './formbooking/bookingrecapitulative/bookingrecapitulative.component';
import { HTTP } from '@ionic-native/http/ngx';
import { LoginComponent } from './Login/Login.component';
import { HTTP_INTERCEPTORS } from '@angular/common/http';
import { AfficheUserComponent } from './afficheUser/afficheUser.component';

const appRoutes = [
  { path: '', component: HomeComponent },
  { path: 'plan', component: PlanComponent },
  { path: 'help', component: HelpComponent },
  { path: 'cinema', component: CinemaComponent },
  { path: 'list', component: ListeComponent },
  { path: 'film', component: FilmComponent },
  { path: 'signUp', component: SignupFormComponent },
  { path: 'booking', component: FormbookingComponent },
  { path: 'recapbooking', component: BookingrecapitulativeComponent },

  { path: 'login', component: LoginComponent },
  { path: 'listuser', component: AfficheUserComponent }
]

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    PlanComponent,
    ListeComponent,
    HelpComponent,
    HeaderComponent,
    FooterComponent,
    CinemaComponent,
    FilmComponent,
    SignupFormComponent,
    FormbookingComponent,
    BookingrecapitulativeComponent,
    LoginComponent,
    AfficheUserComponent
  ],
  
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes),
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule

  ],

  providers: [

    MarkerService
  ],

  bootstrap: [AppComponent]
})
export class AppModule { }
