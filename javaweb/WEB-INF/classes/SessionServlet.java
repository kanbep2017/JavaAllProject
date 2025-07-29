import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {
  public void doPost(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
    // �Z�b�V�����I�u�W�F�N�g�̐���or�擾
    HttpSession session = req.getSession(true);
    // �Z�b�V�����I�u�W�F�N�g����cart���擾
    ArrayList<String> booklist = 
      (ArrayList<String>)session.getAttribute("cart");
    
    if(booklist == null){
      booklist = new ArrayList<String>();  // ����A�N�Z�X
    } else {
      req.setCharacterEncoding("utf-8");   // �Q��ڈȍ~
      String book = req.getParameter("book");
      booklist.add(book);
    }
    session.setAttribute("cart", booklist);
    
    res.setContentType("text/html;charset=utf-8");
    PrintWriter out = res.getWriter();
    out.println("<html><head>");
    out.println("<title>�������</title>");
    out.println("</head><body>");
    out.println("<h2>���i��I�����Ă�������</h2>");
    out.println("<form action=\"/javaweb/session\" method=\"post\">");
    out.println("<select name=\"book\" size=\"1\">");
    out.println("<option value=\"����킩��Java\">����킩��Java</option>");
    out.println("<option value=\"���w������͂��߂�Java\">���w������͂��߂�Java</option>");
    out.println("<option value=\"Oracle����100%���i�{\">Oracle����100�����i�{</option>");
    out.println("</select><input type=\"submit\" value=\"�ǉ�\" /></form>");
    out.println("<h2>�J�[�g�̒��g</h2>");

    for(int i = 0; i < booklist.size(); i++){
      out.println(booklist.get(i) + "<br/>");
    }
    
    out.println("</body></html>");
  }
  public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {
    doPost(req, res);
  }
}
