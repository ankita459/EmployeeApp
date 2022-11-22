package com.axis.fsd.app

import com.axis.fsd.Module.Employee
import com.axis.fsd.Service.EmployeeService
fun main(args: Array<String>) {
    println("===Employee Application====")
    var employee=Employee(101,"Lalitha",50000)
    var employeeService=EmployeeService()
    employeeService.displayEmployeeDetails(employee)
    println(" per day salary ${employeeService.perDaySalary(employee)}")
    println("increase salary by 10% ${employeeService.increaseSalaryByTenPercentage(employee)}")

}