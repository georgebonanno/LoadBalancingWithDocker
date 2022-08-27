import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.util.Objects;


@WebServlet(urlPatterns = "/echo", name = "echoService")
public class EchoService extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String inputString = Objects.toString(request.getParameter("message"),"").toUpperCase();

        PrintWriter out = response.getWriter();
        out.print("Echo from "+ InetAddress.getLocalHost().getHostAddress()+": ");
        out.println(inputString);
    }
}