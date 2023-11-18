package com.klef.ep.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.klef.ep.dao.Employee;
import com.klef.ep.dao.EmployeeDAOoperations;

public class AddEmpServlet extends HttpServlet
{
  public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
  {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    
    String eid = request.getParameter("id");
    int id = Integer.parseInt(eid);
    String name = request.getParameter("name");
    String gender = request.getParameter("gender");
    String salary = request.getParameter("salary");
    double sal = Double.parseDouble(salary);
    String uname = request.getParameter("uname");
    String pwd = request.getParameter("pwd");
    String contact = request.getParameter("contactno");
    
    Employee emp = new Employee();
    emp.setId(id);
    emp.setName(name);
    emp.setGender(gender);
    emp.setSalary(sal);
    emp.setUsername(uname);
    emp.setPassword(pwd);
    emp.setContactno(contact);
    
    EmployeeDAOoperations dao = new EmployeeDAOoperations();
    int n = dao.insertemployee(emp);
    
    String msg = null;
    
    if(n>0)
    {
      msg = "Employee Registered Successfully";
    }
    else
    {
      msg = "Failed to register Employee ";
    }
    request.setAttribute("message", msg);
    RequestDispatcher rd = request.getRequestDispatcher("displayresponse.jsp");
    rd.forward(request, response);
  }
}