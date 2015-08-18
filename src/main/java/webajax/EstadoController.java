package webajax;

import org.codehaus.jackson.map.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Virmerson Bento dos Santos on 12/08/15.
 */
@WebServlet("/estado.do")
public class EstadoController extends HttpServlet {

    List<Estado> estados = Arrays.asList(new Estado("MS", "Mato Grosso do Sul"), new Estado ("SP", "São Paulo"));

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(estados);

        System.out.println("entrei aki");
        resp.getWriter().print(json);
    }
}
