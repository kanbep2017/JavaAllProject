public class TryDivide1{
  public static void main(String[] args){
    try{
      System.out.println("�����J�n");
      int[] a = new int[3];
      for(int i = 0; i < args.length; i++){
        a[i] = Integer.parseInt(args[i]);
        System.out.println(a[i]);
      }
    }catch(NumberFormatException e){
      System.out.println("��O�FNumberFormatException");
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("��O�FArrayIndexOutOfBoundsException");
    }catch(Exception e){
      System.out.println("��O�FException");
    }finally{
      System.out.println("�����I��");
    }
  }
}
