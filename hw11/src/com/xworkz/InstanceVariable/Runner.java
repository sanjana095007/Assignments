package com.xworkz.InstanceVariable;

public class Runner {
    public static void main(String[] args) {
        Clip clip1=new Clip("RED");
        Clip clip2=new Clip("BLUE");
        Clip clip3=new Clip("RED");
        Clip clip4=new Clip("green");
        Clip clip5=new Clip("purple");
         Clip[] clips={clip1,clip2,clip3,clip4,clip5};
         Pushpa pushpa=new Pushpa();
         pushpa.useClip(clips);

         Ticket ticket=new Ticket(TicketType.tatkal,400);
         Cricket cricket=new Cricket(ticket);
         cricket.watch();
         cricket.profit();

         Brush brush=new Brush(Color.PINK);
         brush.scrub();
         //brush.clean();
         Virat virat=new Virat(brush,ticket,cricket);
         virat.play();
         virat.clean();
         virat.relax();


    }
}
