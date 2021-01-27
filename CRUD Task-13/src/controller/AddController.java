package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import exception.CustomException;
@WebServlet("/AddController")
public class AddController extends HttpServlet {

private static final long serialVersionUID = 1L;
   public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		   CostumerController controller = new CostumerController();
		
		   int id= Integer.parseInt(request.getParameter("id"));
		   String name = request.getParameter("name");
		   String dos=request.getParameter("dos");
		   String seatNo=request.getParameter("seatNo");
	       try {
	    	 SimpleDateFormat userformat = new SimpleDateFormat("dd-MM-yyyy");
	    	 userformat.setLenient(false);
			 java.util.Date f=userformat.parse(dos);
			 java.sql.Date date = new java.sql.Date(f.getTime());
			 controller.addCostumer(id,name,date,seatNo);
		} catch (ParseException e) {
			invokeCustomException();
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
	     response.sendRedirect("Login");
		   
	}
   public static void invokeCustomException() {
	    try {
	      throw new CustomException();
	    } catch (CustomException e) {
	      System.out.println(e);
	    }
	  }
}