class NonObject{
  public static void main(String[] args){
    //�f�[�^�̑��
    int[] score = {80, 100, 75};
    String[] name = {"����", "���R", "����"};

    //�f�[�^�̕\��
    for(int i = 0; i < score.length; i++) {
      System.out.println(name[i] + "����F" + score[i] + "�_");
    }
  }
}
