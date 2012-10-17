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
	      out.println("<title>血液型占い</title>");
	      
	      String bloodtype = req.getParameter("bloodtype");

		switch (bloodtype){
		case "A":
			out.println("だいきちー");
			break;
		case "B":
			out.println("ちょうだいきちーー");
			break;
		case "O":
			out.println("まあまあ");
			break;
		case "AB":
			out.println("だいきょうー　がーん！");
			break;
		default:
			out.println("そんな血液型ないですからー");
			
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
