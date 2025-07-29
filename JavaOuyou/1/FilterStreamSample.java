import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class FilterStreamSample {
  public static void main(String[] args) {
    FileReader fr = null;
    FileWriter fw = null;
    BufferedReader br = null;
    BufferedWriter bw = null;
    try {
      // ①ストリームを開く
      fr = new FileReader("name.txt");
      br = new BufferedReader(fr);
      fw = new FileWriter("message2.txt");
      bw = new BufferedWriter(fw);

      // ②読み込む
      String name = br.readLine();
      // ②書き込む
      String msg = "Hello, " + name + "!";
      for (int i = 0; i < 5; i++) {
        bw.write(msg);
        bw.newLine();
      }
      bw.flush();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        // ③ストリームを閉じる
        if (br != null)
          br.close();
        if (bw != null)
          bw.close();
      } catch (IOException e) {
      }
    }
  }
}
