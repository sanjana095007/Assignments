package com.xworkz.Interface.Another;

import com.xworkz.Interface.Internal.Gold;
import com.xworkz.Interface.Internal.Plastic;
import com.xworkz.Interface.Internal.Platinum;
import com.xworkz.Interface.Internal.Silver;

public class Jewellery implements Gold, Silver, Platinum {

    @Override
    public void melt() {
        System.out.println("running the melt method in GoldJewellery");
    }

    @Override
    public void mold() {
        System.out.println("running the mold method in GoldJewellery");
    }

    @Override
    public void shine() {
        System.out.println("running the shine method in GoldJewellery");
    }

    @Override
    public void Purity() {
        System.out.println("running the Purity method in GoldJewellery");
    }

    @Override
    public void shape() {
        System.out.println("running the shape method in GoldJewellery");
    }

    @Override
    public void polish() {
        System.out.println("running the polish method in GoldJewellery");
    }

    @Override
    public void refine() {
        System.out.println("running the refine method in GoldJewellery");
    }

    @Override
    public void cut() {
        System.out.println("running the cut method in GoldJewellery");
    }

    @Override
    public void weigh() {
        System.out.println("running the weigh method in GoldJewellery");
    }

    @Override
    public void sell() {
        System.out.println("running the sell method in GoldJewellery");
    }
}
