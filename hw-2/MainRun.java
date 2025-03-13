class MainRun{
public static void main(String [] args){
Long mobilenos=7795039943L;
String ref=Assignment.getname(mobilenos);
System.out.println("name:"+ref);
System.out.println("==========================================");
String company="reliance";
String refs=Assignment.ownername(company);
System.out.println("name:"+refs);
System.out.println("==========================================");
String fooditems="Biryani";
int food=Assignment.fooditem(fooditems);
System.out.println("price:"+food);
System.out.println("==========================================");
Long accs=77950399435678L;
int acc=Assignment.account(accs);
System.out.println("Balance:"+acc);
System.out.println("==========================================");
String sources="Books";
int sor=Assignment.source(sources);
System.out.println("price:"+sor);
System.out.println("==========================================");
String Alivepeople="Ratan Tata";
String res=Assignment.name(Alivepeople);
System.out.println("name:"+res);
}
}