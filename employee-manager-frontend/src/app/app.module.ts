import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AddEmployeeComponent } from './employee/components/add-employee/add-employee.component';
import { EditEmployeeComponent } from './employee/components/edit-employee/edit-employee.component';
import { EmployeesListComponent } from './employee/components/employees-list/employees-list.component';
import { DeleteEmployeeComponent } from './employee/components/delete-employee/delete-employee.component';
import { EmployeeDetailsComponent } from './employee/components/employee-details/employee-details.component';


@NgModule({
  declarations: [
    AppComponent,
    AddEmployeeComponent,
    EditEmployeeComponent,
    EmployeesListComponent,
    DeleteEmployeeComponent,
    EmployeeDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
