public class Sample {
    private int num;

    public Sample(int num) {
        this.num = num;
    }

    public boolean equals(Sample obj) {
        if (obj == null) {
            System.out.println("Sample_null!!");
            return false;
        }
        // if (obj instanceof Sample) {
        System.out.println("Sample_this.num:" + this.num);
        System.out.println("Sample_obj.num:" + obj.num);
        return this.num == obj.num;
        // }
        // return false;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            System.out.println("null!!");
            return false;
        }
        if (obj instanceof Sample) {
            Sample s = (Sample) obj;
            System.out.println("this.num:" + this.num);
            System.out.println("obj.num:" + s.num);
            return this.num == s.num;
        }
        return false;
    }
}
