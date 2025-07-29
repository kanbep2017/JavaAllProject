import java.io.*;

public class ThrowsMethod {
  public static void main(String[] args) {
    WriteFile wf = new WriteFile();
    try {
      wf.open();
      wf.write();
    } catch (IOException e) {
      System.out.println("IOExceptionÇ™î≠ê∂ÇµÇ‹ÇµÇΩ");
      e.printStackTrace();
    } catch (Exception e) {
      System.out.println("ExceptionÇ™î≠ê∂ÇµÇ‹ÇµÇΩ");
      e.printStackTrace();
    } finally {
      wf.close();
    }
  }
}
