package mypack;

public class Bus extends Vehicle implements Stopable {
    public Bus(int crewNum) {
        this.crewNum = crewNum;
    }

    public void showCrewNum() {
        System.out.println("ƒoƒX‚Ìæ‹qF" + crewNum + "–¼");
    }

    public void stop() {
        System.out.println("Ÿ~‚Ü‚è‚Ü‚·");
    }

}
