package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.Gold;
import com.xworkz.Interface.Internal.Silver;

public class GoldJewellery implements Gold, Silver {

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
    public void shape() {
        System.out.println("running the shape method in GoldJewellery");
    }

    @Override
    public void polish() {
        System.out.println("running the polish method in GoldJewellery");
    }
}
