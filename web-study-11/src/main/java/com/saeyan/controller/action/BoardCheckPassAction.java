package com.saeyan.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.BoardDAO;
import com.saeyan.dto.BoardVO;

public class BoardCheckPassAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = null;
		String num = request.getParameter("num");
		String pass = request.getParameter("pass");
		BoardDAO dao = BoardDAO.getInstance();
		BoardVO vo = dao.selectOneBoardByNum(num);

		if (vo.getPass().equals(pass)) {
			url = "/board/checkSuccess.jsp";
		} else {
			url = "/board/boardCheckPass.jsp";
			request.setAttribute("message", "It's wrong passoword");
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
