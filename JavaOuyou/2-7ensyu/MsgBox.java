public class MsgBox{
  private int index = 0;
  private String[] msgBox = new String[3];
  public synchronized void pushMsg(String msg){ // ���b�Z�[�W���i�[���郁�\�b�h
    while (index == msgBox.length) {
      try {
        wait(); // ���b�Z�[�W�{�b�N�X�����t�Ȃ�ҋ@
      } catch (InterruptedException e) {
      }
    }
    msgBox[index] = msg;
    System.out.println(msg + "���i�[");
    index++;
    notify(); // ���b�Z�[�W���i�[������A�ҋ@���̃X���b�h�ɒʒm
  }
  public synchronized String popMsg(){ // ���b�Z�[�W�����o�����\�b�h
    while (index == 0) {
      try {
        wait(); // ���b�Z�[�W�{�b�N�X����Ȃ�ҋ@
      } catch (InterruptedException e) {
      }
    }
    index--;
    notify(); // ���b�Z�[�W�����o������A�ҋ@���̃X���b�h�ɒʒm
    return msgBox[index];
  }
}
