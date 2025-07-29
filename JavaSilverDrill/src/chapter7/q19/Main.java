package chapter7.q19;

public class Main {

	public static void main(String[] args) {
		Child child = new Child();
		child.name = "sample"; // サブクラス→スーパークラスの順に対応するものに設定される。nameは両方にあるので、Childクラスの方に設定される。
		System.out.println(child.getName()); // Parentクラスにしか定義がないのでParentクラスで動く。nameは設定してないのでnullになる。
	}

}
