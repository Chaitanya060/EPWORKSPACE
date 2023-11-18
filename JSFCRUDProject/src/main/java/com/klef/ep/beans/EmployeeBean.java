package com.klef.ep.beans;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.klef.ep.models.Employee;
import com.klef.ep.services.EmployeeService;

@ManagedBean(name = "empbean",eager=true)
public class EmployeeBean 
{
    private int id;   
    private String name;    
    private String gender;   
    private String dateofjoining;    
    private double salary;    
    private String department;    
    private String email;     
    private String password;
    private String contactno;
    
    private List<Employee> emplist;
    
    @EJB(lookup = "java:global/JSFCRUDProject/EmployeeServiceImpl!com.klef.ep.services.EmployeeService" )
    EmployeeService employeeService;
    
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }
  public String getDateofjoining() {
    return dateofjoining;
  }
  public void setDateofjoining(String dateofjoining) {
    this.dateofjoining = dateofjoining;
  }
  public double getSalary() {
    return salary;
  }
  public void setSalary(double salary) {
    this.salary = salary;
  }
  public String getDepartment() {
    return department;
  }
  public void setDepartment(String department) {
    this.department = department;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public String getContactno() {
    return contactno;
  }
  public List<Employee> getEmplist() {
    emplist = employeeService.viewAllEmployees();
    return emplist;
  }
  public void setEmplist(List<Employee> emplist) {
    this.emplist = emplist;
  }
  public void setContactno(String contactno) {
    this.contactno = contactno;
  }
  
  
  
  public String addemp()
  {
    Employee emp=new Employee();
    emp.setId(id);
    emp.setName(name);
    emp.setGender(gender);
    emp.setDateofjoining(dateofjoining);
    emp.setSalary(salary);
    emp.setDepartment(department);
    emp.setEmail(email);
    emp.setPassword(password);
    emp.setContactno(contactno);
    
    employeeService.addEmployee(emp);
    
    return "empreg.jsf?faces-redirect=true";
  }
  
  public void updaemp() throws IOException
  
  {
    FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();
    
    Employee emp=new Employee();
    emp.setId(id);
    emp.setSalary(salary);
    emp.setPassword(password);
    emp.setContactno(contactno);
    
    employeeService.updateEmployee(emp);
    
    response.sendRedirect("updatesuccess.jsp");
    
}
  public String deleteemp(int eid)
  {
    employeeService.deleteEmployee(eid);
    
    return "viewallemps.jsf";
    
  }
  public void emplogin() throws IOException
  {
    FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        HttpServletRequest request = (HttpServletRequest) externalContext.getRequest();
        HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();
        
        Employee emp=employeeService.EmployeeLogin(email, password);
        if(emp!=null)
        {
        	HttpSession session = request.getSession();
        	session.setAttribute("emp", emp);
        	response.sendRedirect("emphome.jsp");
        }
        else
        {
        	response.sendRedirect("loginfail.jsp");
        }
        
  }
  
  
  
}