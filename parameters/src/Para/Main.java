package Para;

public class Main {
    public static void main(String[] args) {
        Rubber rubber=new Tyre();
        rubber.expand();
//        rubber.Compress(); error :datatype is a Rubber which is a parent datatype
        System.out.println("============================");
        Tyre tyre = new Tyre();
        tyre.expand();
        tyre.Compress();
        System.out.println("============================");
        Rubber Rubber1=new Rubber();
        Rubber1.expand();
        System.out.println("============================");
        MRF mrf=new MRF();
        mrf.expand();
        mrf.radial();
        mrf.Compress();
        System.out.println("================================");
        ArmyVehical armyVehical=new ArmyVehical();
        armyVehical.wheel(rubber);
        armyVehical.wheel(tyre);
        armyVehical.wheel(Rubber1);
        armyVehical.wheel(mrf);

    }
}
