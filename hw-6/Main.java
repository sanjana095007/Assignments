class Main{
public static void main(String [] args){

Anklet anklet = new Anklet(16,'M',"black");
System.out.println("Anklet beads: "+anklet.beads +",Anklet size :"+ anklet.size +",anklet color :"+anklet.color);

Anklet anklet1 = new Anklet(20,'S',"black");
System.out.println("Anklet beads: "+anklet1.beads +",Anklet size :"+ anklet1.size +",anklet color :"+anklet1.color);

Anklet anklet2 = new Anklet(25,'M',"black");
System.out.println("Anklet beads: "+anklet2.beads +",Anklet size :"+ anklet2.size +",anklet color :"+anklet2.color);

Anklet anklet3 = new Anklet(30,'L',"black");
System.out.println("Anklet beads: "+anklet3.beads +",Anklet size :"+ anklet3.size +",anklet color :"+anklet3.color);

Anklet anklet4 = new Anklet(35,'M',"black");
System.out.println("Anklet beads: "+anklet4.beads +",Anklet size :"+ anklet4.size +",anklet color :"+anklet4.color);

System.out.println("==================================================================================");

Charger charger = new Charger("apple","white",56);
System.out.println("Charger brand :"+charger.brand +",Charger color :"+charger.color +",Charger volts :"+charger.volts);

Charger charger1 = new Charger("nokia","yellow",24);
System.out.println("Charger brand :"+charger.brand +",Charger color :"+charger1.color +",Charger volts :"+charger1.volts);

Charger charger2 = new Charger("samsung","white",56);
System.out.println("Charger brand :"+charger2.brand +",Charger color :"+charger2.color +",Charger volts :"+charger2.volts);

Charger charger3 = new Charger("spice","green",60);
System.out.println("Charger brand :"+charger3.brand +",Charger color :"+charger3.color +",Charger volts :"+charger3.volts);

Charger charger4 = new Charger("lenovo","turquoise",56);
System.out.println("Charger brand :"+charger4.brand +",Charger color :"+charger4.color +",Charger volts :"+charger4.volts);

System.out.println("==================================================================================");

Chain chain = new Chain("black","dazzel",100);
System.out.println("Chain color: "+chain.color +",chain brand:"+ chain.brand +",chain price :"+chain.price);

Chain chain1 = new Chain("black","dazzel",100);
System.out.println("Chain color: "+chain1.color +",chain brand:"+ chain1.brand +",chain price :"+chain1.price);

Chain chain2 = new Chain("black","dazzel",100);
System.out.println("Chain color: "+chain2.color +",chain brand:"+ chain2.brand +",chain price :"+chain2.price);

Chain chain3 = new Chain("black","dazzel",100);
System.out.println("Chain color: "+chain3.color +",chain brand:"+ chain3.brand +",chain price :"+chain3.price);

Chain chain = new Chain("black","dazzel",100);
System.out.println("Chain color: "+chain4.color +",chain brand:"+ chain4.brand +",chain price :"+chain4.price);

System.out.println("==================================================================================");

Magnet magnet = new Magnet(5,"north","black");
System.out.println("Magnet counts: "+magnet.count +",Magnet direction :"+ magnet.direction +",Magnet color :"+magnet.color);

Magnet magnet1 = new Magnet(5,"north","black");
System.out.println("Magnet counts: "+magnet1.count +",Magnet direction :"+ magnet1.direction +",Magnet color :"+magnet1.color);

Magnet magnet2 = new Magnet(5,"north","black");
System.out.println("Magnet counts: "+magnet2.count +",Magnet direction :"+ magnet2.direction +",Magnet color :"+magnet2.color);

Magnet magnet3 = new Magnet(5,"north","black");
System.out.println("Magnet counts: "+magnet3.count +",Magnet direction :"+ magnet3.direction +",Magnet color :"+magnet3.color);

Magnet magnet4 = new Magnet(5,"north","black");
System.out.println("Magnet counts: "+magnet4.count +",Magnet direction :"+ magnet4.direction +",Magnet color :"+magnet4.color);

System.out.println("==================================================================================");

Chat chat = new Chat("black",5,"afternoon");
System.out.println("Wallpaper color :"+chat.wallpapercolor +",Number of people chatting :"+chat.ppl +",Time specification :"+chat.time);


Chat chat1 = new Chat("pink",7,"noon");
System.out.println("Wallpaper color :"+chat1.wallpapercolor +",Number of people chatting :"+chat1.ppl +",Time specification :"+chat1.time);


Chat chat2 = new Chat("yellow",8,"morning");
System.out.println("Wallpaper color :"+chat2.wallpapercolor +",Number of people chatting :"+chat2.ppl +",Time specification :"+chat2.time);


Chat chat3 = new Chat("green",7,"midnight");
System.out.println("Wallpaper color :"+chat3.wallpapercolor +",Number of people chatting :"+chat3.ppl +",Time specification :"+chat3.time);


Chat chat4 = new Chat("red",2,"night");
System.out.println("Wallpaper color :"+chat4.wallpapercolor +",Number of people chatting :"+chat4.ppl +",Time specification :"+chat4.time);

System.out.println("==================================================================================");

RatPoision rat = new RatPoision(2,"hit","liquid");
System.out.println("RatPoision times: "+rat.times +",RatPoision brand :"+ rat.brand +",RatPoision state :"+rat.state);

RatPoision rat1 = new RatPoision(3,"hit","solid");
System.out.println("RatPoision times: "+rat1.times +",RatPoision brand :"+ rat1.brand +",RatPoision state :"+rat1.state);

RatPoision rat2 = new RatPoision(5,"hit","gas");
System.out.println("RatPoision times: "+rat2.times +",RatPoision brand :"+ rat2.brand +",RatPoision state :"+rat2.state);

RatPoision rat3 = new RatPoision(7,"hit","liquid");
System.out.println("RatPoision times: "+rat3.times +",RatPoision brand :"+ rat3.brand +",RatPoision state :"+rat3.state);

RatPoision rat4 = new RatPoision(8,"hit","gas");
System.out.println("RatPoision times: "+rat4.times +",RatPoision brand :"+ rat4.brand +",RatPoision state :"+rat4.state);

System.out.println("==================================================================================");

Festival fest1 = new Festival("ugadhi" , 2 , "bevu");
System.out.println( "festival names:"+fest1.name +"holidays : "+fest1.holidays + ",sweets: "+ fest1.sweetname );

Festival fest2 = new Festival("holi" , 5, "rasmalai");
System.out.println( "festival names:"+fest2.name +"holidays : "+fest2.holidays + ",sweets: "+ fest2.sweetname );

Festival fest3 = new Festival("diwali" , 5 , "holige");
System.out.println( "festival names:"+fest3.name +"holidays : "+fest3.holidays + ",sweets: "+ fest3.sweetname );

Festival fest4 = new Festival("sankranti" , 1 , "yallubelaa");
System.out.println( "festival names:"+fest4.name +"holidays : "+fest4.holidays + ",sweets: "+ fest4.sweetname );

Festival fest5 = new Festival("gugammajatare" , 7 , "paysa");
System.out.println( "festival names:"+fest5.name +"holidays : "+fest5.holidays + ",sweets: "+ fest5.sweetname );

System.out.println("==================================================================================");

Whatsapp wats = new Whatsapp(2,"papa","informal");
System.out.println("message time : "+wats.time +",Messaging person :"+ wats.person +",Message type :"+wats.type);

Whatsapp wats1 = new Whatsapp(4,"mom","informal");
System.out.println("message time : "+wats1.time +",Messaging person :"+ wats1.person +",Message type :"+wats1.type);

Whatsapp wats2 = new Whatsapp(6,"sister","formal");
System.out.println("message time : "+wats2.time +",Messaging person :"+ wats2.person +",Message type :"+wats2.type);

Whatsapp wats3 = new Whatsapp(8,"frnd","informal");
System.out.println("message time : "+wats3.time +",Messaging person :"+ wats3.person +",Message type :"+wats3.type);

Whatsapp wats4 = new Whatsapp(12,"grandpa","formal");
System.out.println("message time : "+wats4.time +",Messaging person :"+ wats4.person +",Message type :"+wats4.type);

System.out.println("==================================================================================");

Harphic harphic = new Harphic(500,"blue",250);
System.out.println("Harphic quantity :"+harphic.quantity +",Harphic color :"+harphic.color +",Harphic price :"+harphic.price);

Harphic harphic1 = new Harphic(100,"white",60);
System.out.println("Harphic quantity :"+harphic1.quantity +",Harphic color :"+harphic1.color +",Harphic price :"+harphic1.price);

Harphic harphic2 = new Harphic(200,"black",200);
System.out.println("Harphic quantity :"+harphic2.quantity +",Harphic color :"+harphic2.color +",Harphic price :"+harphic2.price);

Harphic harphic3 = new Harphic(300,"green",600);
System.out.println("Harphic quantity :"+harphic3.quantity +",Harphic color :"+harphic3.color +",Harphic price :"+harphic3.price);

Harphic harphic4 = new Harphic(400,"red",550);
System.out.println("Harphic quantity :"+harphic4.quantity +",Harphic color :"+harphic4.color +",Harphic price :"+harphic4.price);

System.out.println("==================================================================================");



}
}