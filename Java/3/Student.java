class Student{
  //�����o�ϐ��i�����j
  String name;
  int engScore;
  int mathScore;

  //���\�b�h�i����j
  void display(){
    System.out.println(name + "����");
    System.out.println("�p��" + engScore + "�_�E���w" + mathScore + "�_");
  }
  void setScore(int eng, int math){
    engScore = eng;
    mathScore = math;
  }  
  double getAvg(){
    double avg = (engScore + mathScore) / 2.0;
    return avg;
  }
}
