package proj.rd;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculadora
 */
@WebServlet("/Calculadora")
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		int val1, val2, val3;
		val1 = Integer.parseInt(request.getParameter("val1"));
		val2 = Integer.parseInt(request.getParameter("val2"));
		val3 = Integer.parseInt(request.getParameter("val3"));
		
	    if (val1 <= 0 || val2 <= 0 || val3 <= 0) {
	    	response.getWriter().println("ARGUMENTOS INVÁLIDOS, é possível que essas medidas sejam de um retângulo."); 
	    } if (val1 == val2 & val2 == val3){ 
	    	response.getWriter().println("Seu triângulo é um : TRIÂNGULO EQUILATERO, possui 3 lados iguais.");
	    } if (val1 == val2 || val2 == val3 || val1 == val3) { 
	    	response.getWriter().println("Seu triângulo é um : TRIANGULO ISÓSCELE, possui 2 dos lados iguais");
		} else { 
			response.getWriter().println("Seu triângulo é um : TRIANGULO ESCALENO, possui 3 lados diferentes");
		}
	}

}
