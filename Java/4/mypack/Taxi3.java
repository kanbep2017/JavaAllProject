package mypack;

public class Taxi3 extends Vehicle implements Stopable {
  // private int crewNum;

  public Taxi3(int crewNum) {
    this.crewNum = crewNum;
  }

  public void showCrewNum() {
    System.out.println("�^�N�V�[�̏�q�F" + crewNum + "��");
  }

  public void stop() {
    System.out.println("�����ō~��܂�");
  }

}
