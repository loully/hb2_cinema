import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { PlanComponent } from './plan/plan.component';
import { ListeComponent } from './liste/liste.component';
import { HelpComponent } from './help/help.component';

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { CinemaComponent } from './cinema/cinema.component';
import { FilmComponent } from './Film/Film.component';
import { HttpClientModule } from '@angular/common/http';
import { FormbookingComponent } from './formbooking/formbooking.component';
import { RoomComponent } from './room/room.component';


const appRoutes = [
  { path: '', component: HomeComponent },
  { path: 'plan', component: PlanComponent },
  { path: 'help', component: HelpComponent },
  { path: 'cinema', component: CinemaComponent },
  { path: 'list', component: ListeComponent },
  { path: 'film', component: FilmComponent },
  { path: 'book', component: FormbookingComponent },
  { path: 'room', component: RoomComponent }

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
    FormbookingComponent,
    RoomComponent,
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
