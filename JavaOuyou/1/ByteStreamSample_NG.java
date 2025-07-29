import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamSample_NG {
  public static void main(String[] args) {
    try {
      // �@�X�g���[�����J��
      FileInputStream fis = new FileInputStream(args[0]);
      FileOutputStream fos = new FileOutputStream(args[1]);
      int data;
      // �A�ǂݍ��� / ��������
      while ((data = fis.read()) != -1) {
        fos.write(data);
      }
      // �B�X�g���[�������
      fis.close();
      fos.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
