import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HospitalListComponent } from './hospital-list/hospital-list.component';
import { CreateHospitalComponent } from './create-hospital/create-hospital.component';
import { FormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { DeleteHospitalComponent } from './delete-hospital/delete-hospital.component';
import { ViewDetailsComponent } from './view-details/view-details.component';
import { HospitalUpdateComponent } from './hospital-update/hospital-update.component';


@NgModule({
  declarations: [
    AppComponent,
    HospitalListComponent,
    CreateHospitalComponent,
    DeleteHospitalComponent,
    ViewDetailsComponent,
    HospitalUpdateComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
