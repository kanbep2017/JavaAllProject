public class TryDivide2 {
  public static void main(String[] args) {
    try {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      System.out.println("a / b = " + (a / b) + " ���܂� " + (a % b));
    } catch (NumberFormatException e) {
      System.out.println("���l����͂��Ă�������");
      e.printStackTrace();
    } catch (ArithmeticException e) {
      System.out.println("���鐔��0�ȊO����͂��Ă�������");
      e.printStackTrace();
    } catch (Exception e) {
      System.out.println("��O���������܂���");
      e.printStackTrace();
    } finally {
      System.out.println("�v���O�������I�����܂�");
    }
  }
}
