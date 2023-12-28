package com.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.model.Owner;

/**
 * Servlet implementation class OwnerRegServ
 */
public class OwnerRegServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OwnerRegServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		int o_id=Integer.parseInt(request.getParameter("oid"));
		String ow_Name=request.getParameter("onm");
		String ow_Mob=request.getParameter("ocont");
		String ow_Email=request.getParameter("oem");
		String ow_Pass=request.getParameter("opass");
		String ow_addr=request.getParameter("oadd");
		
		Owner o=new Owner();
		o.setOid(o_id);
		o.setoName(ow_Name);
		o.setoMob(ow_Mob);
		o.setoEmail(ow_Email);
		o.setoPass(ow_Pass);
		o.setoAddr(ow_addr);
		
		UserDao.insert(o);
		System.out.println("Owner Registration Successfull,Please Login");
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}	
		
}
