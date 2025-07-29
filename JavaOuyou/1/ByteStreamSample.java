import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamSample {
  public static void main(String[] args) {
    FileInputStream fis = null;
    FileOutputStream fos = null;
    try {
      // ①ストリームを開く
      fis = new FileInputStream(args[0]);
      fos = new FileOutputStream(args[1]);
      int data;
      // ②読み込む / 書き込む
      while ((data = fis.read()) != -1) {
        fos.write(data);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        // ③ストリームを閉じる
        if (fis != null)
          fis.close();
        if (fos != null)
          fos.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
