package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.model.Buyer;
/**
 * Servlet implementation class BuyerRegServ
 */
@Entity
@Table
public class BuyerRegServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyerRegServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 PrintWriter out = response.getWriter();
			int id=Integer.parseInt(request.getParameter("bid"));
			String b_Name=request.getParameter("bnm");
			String b_Mob=request.getParameter("bcont");
			String b_Email=request.getParameter("bem");
			String b_Pass=request.getParameter("bpass");
			String b_addr=request.getParameter("badd");
			
			Buyer b=new Buyer();
			b.setBid(id);
			b.setbName(b_Name);
			b.setbMob(b_Mob);
			b.setbEmail(b_Email);
			b.setbPass(b_Pass);
			b.setbAddr(b_addr);
			
			com.dao.UserDao.insertBuyer(b);
		out.println("Buyer Registration Successfull,Please Login");
		}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// TODO Auto-generated method stub
	}
}