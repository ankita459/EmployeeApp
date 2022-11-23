package EmployeeCollections

import com.axis.fsd.Module.Employee

//in service call we write the business logic
class EmployeeService1 {

    /*
        description: this method is used to display employee details
        param : It takes employee objects are param
        returns : It returns unit
     */
    fun displayEmployeeDetails(employee: Employee)
    {
        println("====Employee Information======")
        println("Employee_id = ${employee.id}")
        println("Employee_name = ${employee.name}")
        println("Employee_salary =${employee.salary}")
    }
    /*
        to find perday salary
     */
    fun perDaySalary(employee: Employee):Int
    {
        return employee.salary/30
    }
    fun increaseSalaryByTenPercentage(employee: Employee):Double
    {
        var incrementedSalary = employee.salary*0.10
        println("10 % increment in salary is $incrementedSalary")
        return incrementedSalary+employee.salary
    }



}
