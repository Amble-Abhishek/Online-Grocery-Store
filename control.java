

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class control
 */
@WebServlet("/control")
public class control extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String n="";
		int qty=0;
		int rate=0;
		int amt=0;
		int uqty=-1;
		int uamt=-1;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banks","root","root");
			
			RequestDispatcher rd=request.getRequestDispatcher("openr.html");  
			out.print("<h3><center>Added SuccessFully!</center><h3>");
			rd.include(request, response);
			 //out.println("<a href='opnr.html'>Go back</a>");
			
			
		if(request.getParameter("e1")!=null) {
			int z1=Integer.valueOf(request.getParameter("e1"));
			n="Apple";
			rate=150;
			amt=rate*z1;
			uqty=-1;
			uamt=-1;
			Statement sp= con.createStatement();
	
			ResultSet rs =sp.executeQuery("select qty,amt from storee where namee='"+n+"'");
			while(rs.next()) {
			uqty=rs.getInt("qty");
			uamt=rs.getInt("amt");
			}
			if(uqty!=-1) {
				uqty=uqty+z1;
				uamt=uamt+amt;
				Statement sq= con.createStatement();
				sq.executeUpdate("update storee set qty='"+uqty+"',amt='"+uamt+"' where namee='"+n+"'");
			}else {
			PreparedStatement st = con.prepareStatement("insert into storee values(?,?,?,?)");
			st.setString(1,n);
			st.setInt(2,z1);
			st.setInt(3,rate);
			st.setInt(4,amt);
			int a1=st.executeUpdate();
			}
			//out.println(a1);
		//out.println("<a href='opnr.html'>Go back</a>");
		}
		if(request.getParameter("e2")!=null) {
			int z2=Integer.valueOf(request.getParameter("e2"));
			n="Banana";
			qty=z2;
			rate=60;
			amt=rate*qty;
			uqty=-1;
			uamt=-1;
			Statement sp= con.createStatement();
	
			ResultSet rs =sp.executeQuery("select qty,amt from storee where namee='"+n+"'");
			while(rs.next()) {
			uqty=rs.getInt("qty");
			uamt=rs.getInt("amt");
			}
			if(uqty!=-1) {
				uqty=uqty+z2;
				uamt=uamt+amt;
				Statement sq= con.createStatement();
				sq.executeUpdate("update storee set qty='"+uqty+"',amt='"+uamt+"' where namee='"+n+"'");
			}else {
			PreparedStatement st = con.prepareStatement("insert into storee values(?,?,?,?)");
			st.setString(1,n);
			st.setInt(2,z2);
			st.setInt(3,rate);
			st.setInt(4,amt);
			int a2= st.executeUpdate();
			}
			//out.println(a2);
			//out.println("<a href='opnr.html'>Go back</a>");
		}
		if(request.getParameter("e3")!=null) {
			int z3=Integer.valueOf(request.getParameter("e3"));
			n="Guava";
			qty=z3;
			rate=80;
			amt=rate*qty;
			uqty=-1;
			uamt=-1;
			Statement sp= con.createStatement();
	
			ResultSet rs =sp.executeQuery("select qty,amt from storee where namee='"+n+"'");
			while(rs.next()) {
			uqty=rs.getInt("qty");
			uamt=rs.getInt("amt");
			}
			if(uqty!=-1) {
				uqty=uqty+z3;
				uamt=uamt+amt;
				Statement sq= con.createStatement();
				sq.executeUpdate("update storee set qty='"+uqty+"',amt='"+uamt+"' where namee='"+n+"'");
			}else {
			PreparedStatement st = con.prepareStatement("insert into storee values(?,?,?,?)");
			st.setString(1,n);
			st.setInt(2,z3);
			st.setInt(3,rate);
			st.setInt(4,amt);
			int a3= st.executeUpdate();
			}
			//out.println(a3);
			//out.println("<a href='opnr.html'>Go back</a>");
		}
		if(request.getParameter("e4")!=null) {
			int z4=Integer.valueOf(request.getParameter("e4"));
			n="Orange";
			qty=z4;
			rate=60;
			amt=rate*qty;
			uqty=-1;
			uamt=-1;
			Statement sp= con.createStatement();
	
			ResultSet rs =sp.executeQuery("select qty,amt from storee where namee='"+n+"'");
			while(rs.next()) {
			uqty=rs.getInt("qty");
			uamt=rs.getInt("amt");
			}
			if(uqty!=-1) {
				uqty=uqty+z4;
				uamt=uamt+amt;
				Statement sq= con.createStatement();
				sq.executeUpdate("update storee set qty='"+uqty+"',amt='"+uamt+"' where namee='"+n+"'");
			}else {
			PreparedStatement st = con.prepareStatement("insert into storee values(?,?,?,?)");
			st.setString(1,n);
			st.setInt(2,z4);
			st.setInt(3,rate);
			st.setInt(4,amt);
			int a4= st.executeUpdate();
			}
			//out.println(a4);
			//out.println("<a href='opnr.html'>Go back</a>");
		}
		if(request.getParameter("e5")!=null) {
			int z5=Integer.valueOf(request.getParameter("e5"));
			n="Mango";
			qty=z5;
			rate=550;
			amt=rate*qty;
			uqty=-1;
			uamt=-1;
			Statement sp= con.createStatement();
	
			ResultSet rs =sp.executeQuery("select qty,amt from storee where namee='"+n+"'");
			while(rs.next()) {
			uqty=rs.getInt("qty");
			uamt=rs.getInt("amt");
			}
			if(uqty!=-1) {
				uqty=uqty+z5;
				uamt=uamt+amt;
				Statement sq= con.createStatement();
				sq.executeUpdate("update storee set qty='"+uqty+"',amt='"+uamt+"' where namee='"+n+"'");
			}else {
			PreparedStatement st = con.prepareStatement("insert into storee values(?,?,?,?)");
			st.setString(1,n);
			st.setInt(2,z5);
			st.setInt(3,rate);
			st.setInt(4,amt);
			int a5= st.executeUpdate();
			}
			//out.println(a5);
			//out.println("<a href='opnr.html'>Go back</a>");
		}
 if(request.getParameter("e6")!=null) {
	 int z6=Integer.valueOf(request.getParameter("e6"));
			n="Strawberry";
			qty=z6;
			rate=100;
			amt=rate*qty;
			uqty=-1;
			uamt=-1;
			Statement sp= con.createStatement();
	
			ResultSet rs =sp.executeQuery("select qty,amt from storee where namee='"+n+"'");
			while(rs.next()) {
			uqty=rs.getInt("qty");
			uamt=rs.getInt("amt");
			}
			if(uqty!=-1) {
				uqty=uqty+z6;
				uamt=uamt+amt;
				Statement sq= con.createStatement();
				sq.executeUpdate("update storee set qty='"+uqty+"',amt='"+uamt+"' where namee='"+n+"'");
			}else {
			PreparedStatement st = con.prepareStatement("insert into storee values(?,?,?,?)");
			st.setString(1,n);
			st.setInt(2,z6);
			st.setInt(3,rate);
			st.setInt(4,amt);
			int a6= st.executeUpdate();
			}
			//out.println(a6);
			//out.println("<a href='opnr.html'>Go back</a>");
		}
 if(request.getParameter("e7")!=null) {
	 int z7=Integer.valueOf(request.getParameter("e7"));
			n="Tomatp";
			qty=z7;
			rate=40;
			amt=rate*qty;
			uqty=-1;
			uamt=-1;
			Statement sp= con.createStatement();
	
			ResultSet rs =sp.executeQuery("select qty,amt from storee where namee='"+n+"'");
			while(rs.next()) {
			uqty=rs.getInt("qty");
			uamt=rs.getInt("amt");
			}
			if(uqty!=-1) {
				uqty=uqty+z7;
				uamt=uamt+amt;
				Statement sq= con.createStatement();
				sq.executeUpdate("update storee set qty='"+uqty+"',amt='"+uamt+"' where namee='"+n+"'");
			}else {
			PreparedStatement st = con.prepareStatement("insert into storee values(?,?,?,?)");
			st.setString(1,n);
			st.setInt(2,z7);
			st.setInt(3,rate);
			st.setInt(4,amt);
			int a7= st.executeUpdate();
			}
			//out.println(a7);
			//out.println("<a href='opnr.html'>Go back</a>");
		}
 if(request.getParameter("e8")!=null) {
		int z8=Integer.valueOf(request.getParameter("e8"));
			n="Potato";
			qty=z8;
			rate=45;
			amt=rate*qty;
			uqty=-1;
			uamt=-1;
			Statement sp= con.createStatement();
	
			ResultSet rs =sp.executeQuery("select qty,amt from storee where namee='"+n+"'");
			while(rs.next()) {
			uqty=rs.getInt("qty");
			uamt=rs.getInt("amt");
			}
			if(uqty!=-1) {
				uqty=uqty+z8;
				uamt=uamt+amt;
				Statement sq= con.createStatement();
				sq.executeUpdate("update storee set qty='"+uqty+"',amt='"+uamt+"' where namee='"+n+"'");
			}else {
			PreparedStatement st = con.prepareStatement("insert into storee values(?,?,?,?)");
			st.setString(1,n);
			st.setInt(2,z8);
			st.setInt(3,rate);
			st.setInt(4,amt);
			int a8= st.executeUpdate();
			}
			//out.println(a8);
			//out.println("<a href='opnr.html'>Go back</a>");
		}
 if(request.getParameter("e9")!=null) {
	 int z9=Integer.valueOf(request.getParameter("e9"));
			n="Cabbage";
			qty=z9;
			rate=35;
			amt=rate*qty;
			uqty=-1;
			uamt=-1;
			Statement sp= con.createStatement();
	
			ResultSet rs =sp.executeQuery("select qty,amt from storee where namee='"+n+"'");
			while(rs.next()) {
			uqty=rs.getInt("qty");
			uamt=rs.getInt("amt");
			}
			if(uqty!=-1) {
				uqty=uqty+z9;
				uamt=uamt+amt;
				Statement sq= con.createStatement();
				sq.executeUpdate("update storee set qty='"+uqty+"',amt='"+uamt+"' where namee='"+n+"'");
			}else {
			PreparedStatement st = con.prepareStatement("insert into storee values(?,?,?,?)");
			st.setString(1,n);
			st.setInt(2,z9);
			st.setInt(3,rate);
			st.setInt(4,amt);
			int a9= st.executeUpdate();
			}
			//out.println(a9);
			//out.println("<a href='opnr.html'>Go back</a>");
		}
 if(request.getParameter("e10")!=null) {
	 int z10=Integer.valueOf(request.getParameter("e10"));
			n="Cauliflower";
			qty=z10;
			rate=30;
			amt=rate*qty;
			uqty=-1;
			uamt=-1;
			Statement sp= con.createStatement();
	
			ResultSet rs =sp.executeQuery("select qty,amt from storee where namee='"+n+"'");
			while(rs.next()) {
			uqty=rs.getInt("qty");
			uamt=rs.getInt("amt");
			}
			if(uqty!=-1) {
				uqty=uqty+z10;
				uamt=uamt+amt;
				Statement sq= con.createStatement();
				sq.executeUpdate("update storee set qty='"+uqty+"',amt='"+uamt+"' where namee='"+n+"'");
			}else {
			PreparedStatement st = con.prepareStatement("insert into storee values(?,?,?,?)");
			st.setString(1,n);
			st.setInt(2,z10);
			st.setInt(3,rate);
			st.setInt(4,amt);
			int a10= st.executeUpdate();
			}
			//out.println(a10);
		//	out.println("<a href='opnr.html'>Go back</a>");
		}
 if(request.getParameter("e11")!=null) {
	 int z11=Integer.valueOf(request.getParameter("e11"));
			n="Capsicum";
			qty=z11;
			rate=50;
			amt=rate*qty;
			uqty=-1;
			uamt=-1;
			Statement sp= con.createStatement();
	
			ResultSet rs =sp.executeQuery("select qty,amt from storee where namee='"+n+"'");
			while(rs.next()) {
			uqty=rs.getInt("qty");
			uamt=rs.getInt("amt");
			}
			if(uqty!=-1) {
				uqty=uqty+z11;
				uamt=uamt+amt;
				Statement sq= con.createStatement();
				sq.executeUpdate("update storee set qty='"+uqty+"',amt='"+uamt+"' where namee='"+n+"'");
			}else {
			PreparedStatement st = con.prepareStatement("insert into storee values(?,?,?,?)");
			st.setString(1,n);
			st.setInt(2,z11);
			st.setInt(3,rate);
			st.setInt(4,amt);
			int a11= st.executeUpdate();
			}
		//	out.println(a11);
		//	out.println("<a href='opnr.html'>Go back</a>");
		}
 if(request.getParameter("e12")!=null) {
	 int z12=Integer.valueOf(request.getParameter("e12"));
			n="Sweet Potato";
			qty=z12;
			rate=55;
			amt=rate*qty;
			uqty=-1;
			uamt=-1;
			Statement sp= con.createStatement();
	
			ResultSet rs =sp.executeQuery("select qty,amt from storee where namee='"+n+"'");
			while(rs.next()) {
			uqty=rs.getInt("qty");
			uamt=rs.getInt("amt");
			}
			if(uqty!=-1) {
				uqty=uqty+z12;
				uamt=uamt+amt;
				Statement sq= con.createStatement();
				sq.executeUpdate("update storee set qty='"+uqty+"',amt='"+uamt+"' where namee='"+n+"'");
			}else {
			PreparedStatement st = con.prepareStatement("insert into storee values(?,?,?,?)");
			st.setString(1,n);
			st.setInt(2,z12);
			st.setInt(3,rate);
			st.setInt(4,amt);
			int a12= st.executeUpdate();
			}
			//out.println(a12);
			//out.println("<a href='opnr.html'>Go back</a>");
		}
 
		
	
		}catch(Exception e) {
		System.out.println(e);
	}
		
	}
}
