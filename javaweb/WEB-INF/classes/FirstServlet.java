// �S�̃p�b�P�[�W���C���|�[�g
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/first")     // �}�b�s���O�����w��
public class FirstServlet extends HttpServlet {   // HttpServlet�N���X���p��
  public void doGet(HttpServletRequest req, HttpServletResponse res)
      throws IOException, ServletException {      // doGet()���I�[�o�[���C�h
    res.setContentType("text/html;charset=utf-8");  // �R���e���c�^�C�v���w��
    PrintWriter out = res.getWriter();              // PrintWriter���擾
    out.println("<html>");                          // PrintWriter�ŏo��
    out.println("<head>");
    out.println("<title>�͂��߂ẴT�[�u���b�g</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>�T�[�u���b�g���n�߂悤�I</h1>");
    out.println("</body>");
    out.println("</html>");
  }
}
