import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateHospitalComponent } from './create-hospital/create-hospital.component';
import { HospitalListComponent } from './hospital-list/hospital-list.component';

import { HospitalUpdateComponent } from './hospital-update/hospital-update.component';
import { ViewDetailsComponent } from './view-details/view-details.component';

const routes: Routes = [
  {path:'addHospitals', component:CreateHospitalComponent},
  {path:'getAllHospitalRecords', component:HospitalListComponent},
  {path:'getHospitalById/:hospitalId', component:ViewDetailsComponent},
  {path:'updateHospitalRecords/:hospitalId', component:HospitalUpdateComponent}
];
//required mOdules for project
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
