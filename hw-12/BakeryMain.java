class BakeryMain{
public static void main(String [] args){
 int amount=3;
 String item="cake";
 Bakery.buy(amount,item);

 
 Boolean sanj=true;
 Bakery.open(sanj);
 
 Boolean shopclose=false;
 Bakery.close(shopclose);
 
 String nameofowner="sanjana";
 Bakery.owner(nameofowner);
 
 String nameofcashier="shashank";
 Bakery.cashier(nameofcashier);
}
}