package fortune;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FortuneServlet
 */
@WebServlet("/Fortune")
public class FortuneServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 req.setCharacterEncoding("utf-8");
	      res.setContentType("text/html; charset=utf-8");
	      PrintWriter out = res.getWriter();
	      out.println("<!DOCTYPE html>");
	      out.println("<meta charset=\"utf-8\">");
	      out.println("<title>���t�^�肢</title>");
	      
	      String bloodtype = req.getParameter("bloodtype");

		switch (bloodtype){
		case "A":
			out.println("���������[");
			break;
		case "B":
			out.println("���傤���������[�[");
			break;
		case "O":
			out.println("�܂��܂�");
			break;
		case "AB":
			out.println("�������傤�[�@���[��I");
			break;
		default:
			out.println("����Ȍ��t�^�Ȃ��ł�����[");
			
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
