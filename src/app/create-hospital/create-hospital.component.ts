import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Hospital } from 'model/hospital';
import { HospitalServiceService } from 'service/hospital-service.service';

@Component({
  selector: 'app-create-hospital',
  templateUrl: './create-hospital.component.html',
  styleUrls: ['./create-hospital.component.css']
})
export class CreateHospitalComponent {
  hospital:Hospital;
  constructor(private router:Router,private route:ActivatedRoute,private hospitalService:HospitalServiceService)
  {
    this.hospital = new Hospital();
  }
onSubmit()
{
  this.hospitalService['saveHospital'](this.hospital).subscribe((result:any)=>this.hospital=result);
  
}
}
