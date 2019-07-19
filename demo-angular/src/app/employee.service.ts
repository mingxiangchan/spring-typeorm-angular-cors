import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  constructor(private http: HttpClient) { }

  getEmployees() {
    const url = "http://localhost:8080"
    return this.http.get(url)
  }

  createEmployee() {
    const url = "http://localhost:8080/createEmployee"
    const data = {firstName: "Harry", lastName: "Potter"}
    return this.http.post(url, data)
  }
}
