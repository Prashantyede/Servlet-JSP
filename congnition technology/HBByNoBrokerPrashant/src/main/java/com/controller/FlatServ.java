package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.model.Flats;

/**
 * Servlet implementation class FlatServ
 */
public class FlatServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlatServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int fid=Integer.parseInt(request.getParameter("fid"));
		int carea=Integer.parseInt(request.getParameter("ca"));
		String Type=request.getParameter("type");
		String Rooms=request.getParameter("frm");
		String Addr=request.getParameter("fadd");
		int rent=Integer.parseInt(request.getParameter("frent"));
		int deposite=Integer.parseInt(request.getParameter("fdep"));
		int maint=Integer.parseInt(request.getParameter("fmaint"));
		String Ament=request.getParameter("fAmt");
		
		Flats f=new Flats();
		f.setFid(fid);
		f.setCarea(carea);
		f.setType(Type);
		f.setRooms(Rooms);
		f.setRent(rent);
		f.setDeposite(deposite);
		f.setAmnt(Ament);
		
		UserDao.insertFlat(f);
		
		
	}
}
