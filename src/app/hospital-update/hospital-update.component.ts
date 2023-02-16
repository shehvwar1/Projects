import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Hospital } from 'model/hospital';
import { HospitalServiceService } from 'service/hospital-service.service';

@Component({
  selector: 'app-hospital-update',
  templateUrl: './hospital-update.component.html',
  styleUrls: ['./hospital-update.component.css']
})
export class HospitalUpdateComponent implements OnInit{
  hospitalId!:number;
  hospital!:Hospital;
  constructor(private route:ActivatedRoute, private router:Router, private hospitalService:HospitalServiceService){}
  ngOnInit() {
    this.hospital = new Hospital();
    this.hospitalId = this.route.snapshot.params['hospitalId'];
    this.hospitalService.getHospital(this.hospitalId).subscribe(data=>{
      this.hospital = data;
      console.log(data)
    });
  }
  //this.hospitalService['saveHospital'](this.hospital).subscribe((result:any)=>this.hospital=result);
  // hospitalUpdate()
  // {
  //   this.hospitalService.updateHospital(this.hospitalId, this.hospital)
  //   .subscribe(data=>{
  //     console.log(data);
  //     this.hospital = new Hospital;
  //     this.gotoHospitalList();
  //   })
  // }
  onSubmit()
  {
    this.hospitalService['updateHospital']( this.hospitalId, this.hospital).subscribe((result:any)=>this.hospital=result);
  }
  gotoHospitalList()
  {
    this.router.navigate(['getAllHospitalRecords'])
  }

}
