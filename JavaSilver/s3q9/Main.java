public class Main {
    public static void main(String[] args) {
        Sample a = new Sample(10, "a");
        Sample b = new Sample(10, "b");
        System.out.println(a.equals(b));
    }
}

public class Sample {
    private int num;
    private String name;

    public Sample(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Sample) {
            Sample s = (Sample) obj;
            return s.num == this.num;
        }
        return false;
    }
}