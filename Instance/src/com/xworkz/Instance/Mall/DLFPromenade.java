package com.xworkz.Instance.Mall;

public class DLFPromenade extends Mall {
    public void visit() {

        System.out.println("DLF Promenade is a popular shopping mall in Delhi.");
    }
    @Override
    public void open() {
        System.out.println("DLFPromenade Mall is opening");
    }
    @Override
    public void close() {
        System.out.println("DLFPromenade Mall is closing");
    }
    @Override
    public void shop() {
        System.out.println(" People are shopping in the DLFPromenade mall");
    }
    @Override
    public void eat() {
        System.out.println("People are dining in the food court in DLFPromenade mall");
    }
    @Override
    public void entertain() {
        System.out.println("DLFPromenade Mall is offering entertainment options");
    }
}
