package webajax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

@WebServlet("/cli.do")
public class ClienteController extends HttpServlet {

	
	private static List<Cliente> lista = new ArrayList<>();
	private static Integer id = 1;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		
		resp.getWriter().print( lista.toString()) ;
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String nome = req.getParameter("nome");
		String login= req.getParameter("login");
		String senha= req.getParameter("senha");
		String estado= req.getParameter("estado");
		
		Cliente cliente = new Cliente(nome, login ,senha, estado);
		lista.add(cliente);
		ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(lista);
		
		resp.getWriter().print(json);
	}
}
