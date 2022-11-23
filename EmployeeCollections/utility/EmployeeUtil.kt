package EmployeeCollections

import com.axis.fsd.Module.Employee

class EmployeeUtil1 {
    var employees = mutableListOf<Employee>()
    public fun employeeList():MutableList<Employee>
    {
        employees.add(Employee(1,"sachin",4500))
        employees.add(Employee(2,"ravi",56500))

        return employees
    }
    fun addEmployee(id:Int, name:String, Salary:Int):MutableList<Employee>{
        var flag:Boolean=false
        for (i in employees) {
            if(i.id==id) {
                println("Employee exist with same id")
                flag=true
                break
            }
        }
        if(flag==false) {
            val salary = 0
            employees.add(Employee(id,name,salary))
        }
        return employees
    }

    fun view():MutableList<Employee> {
        println("Employee Info")
        for(i in employees){
            println("Id:${i.id}| Name:${i.name} | Salary:${i.salary}")
        }
        println("End")
        return employees
    }
    fun deleteemployee(id:Int):MutableList<Employee> {
        for(i in employees){
            if(i.id==id){
                employees.remove(i)
            }
        }
        return employees
    }
}
