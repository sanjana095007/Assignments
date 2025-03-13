class Assignment{
public static String getname(Long mobileno){
System.out.println("the mobile number is "+mobileno);
if(mobileno==7795039943L){
	return "sanjana";
}
else 
if(mobileno==8151865839L){
return "shashank";
}
else if(mobileno==1234567899L){
return "raj";
}
else if(mobileno==9823456789L){
return "Aarav";	
}
else if(mobileno==9734567890L){
return "Vivaan";	
}
else if(mobileno==9512345678L){
return "Anaya";	
}
else if(mobileno==9412346789L){
return "Ishaan";	
}
else if(mobileno==9321678901L){
return "Riya";	
}
else if(mobileno==9214567890L){
return "Aryan";	
}
else if(mobileno==8823456789L){
return "Meera";	
}
else if(mobileno==9876543210L){
return "Dev";	
}
else if(mobileno==9765432109L){
return "Neha";	
}
else if(mobileno==9654321098L){
return "Rohan";	
}
else if(mobileno==9543210987L){
return "Simran";	
}
else if(mobileno==9432109876L){
return "Arjun";	
}
else if(mobileno==9321098765L){
return "Priya";	
}
else if(mobileno==9210987654L){
return "Rahul";	
}
else if(mobileno==9109876543L){
return "Sneha";	
}
else if(mobileno==8998765432L){
return "Karan";	
}
else if(mobileno==8887654321L){
return "Pooja";	
}
else if(mobileno==8665432109L){
return "Yash";	
}
else if(mobileno==8332109876L){
return "Aditi";	
}
else if(mobileno==8554321098L){
return "Manav";	
}
return "Unknown Number";
}
public static String ownername(String companyname){
	System.out.println("the company name is "+companyname);
	if(companyname.equalsIgnoreCase("Reliance")){
		return "Ambani";
	}
	if(companyname.equals("Tata Group")){
		return "Ratan Tata";
	}
	if(companyname.equals("Infosys")){
		return "Narayana Murthy";
	}
	if(companyname.equals("Wipro")){
		return "Azim Premji";
	}
	if(companyname.equals("Adani Group")){
		return "Gautam Adani";
	}
	if(companyname.equals("HCL Technologies")){
		return "Shiv Nadar";
	}
	if(companyname.equals("Bajaj Auto")){
		return "Rahul Bajaj";
	}
	if(companyname.equals("Mahindra")){
		return "Anand Mahindra";
	}
	if(companyname.equals("Bharti Airtel")){
		return "Sunil Bharti Mittal";
	}
	if(companyname.equals("Zerodha")){
		return "Nithin Kamath";
	}
	if(companyname.equals("Paytm")){
		return "Vijay Shekhar Sharma";
	}
	if(companyname.equals("Byju’s")){
		return " Byju Raveendran";
	}
	return "Unknown name and company";
}
public static int fooditem(String fooditem){
	System.out.println("food item ordered: "+fooditem);
	if(fooditem.equals("Biryani")){
		return 350;
	}
	if(fooditem.equals("Butter Chicken")){
		return 400;
	}
	if(fooditem.equals("Paneer Tikka")){
		return 300;
	}
	if(fooditem.equals("Masala Dosa")){
		return 80;
	}
	if(fooditem.equals("Chole Bhature")){
		return 60;
	}
	if(fooditem.equals("Pani Puri")){
		return 30;
	}
	if(fooditem.equals("Samosa")){
		return 15;
	}
	if(fooditem.equals("Idli Sambar")){
		return 35;
	}
	if(fooditem.equals("Rajma Chawal")){
		return 50;
	}
	if(fooditem.equals("Pav Bhaji")){
		return 45;
	}
	if(fooditem.equals("Dal Makhani")){
		return 40;
	}
	if(fooditem.equals("Aloo Paratha")){
		return 40;
	}
	if(fooditem.equals("Tandoori Chicken")){
		return 350;
	}
	if(fooditem.equals("Matar Paneer")){
		return 100;
	}
	if(fooditem.equals("Kadai Paneer")){
		return 90;
	}
	if(fooditem.equals("Veg Pulao")){
		return 40;
	}
	if(fooditem.equals("Rasgulla")){
		return 50;
	}
	if(fooditem.equals("Gulab Jamun")){
		return 40;
	}
	if(fooditem.equals("Jalebi")){
		return 30;
	}
	return 000;
}
public static int account(Long account){
	System.out.println("Account number: "+account);
	if(account==77950399435678L){
	return 40000;
}
if(account==4556229435678L){
	return 50000;
}
if(account==744185295678L){
	return 80000;
}
if(account==84456612328L){
	return 800;
}
if(account==897456314785278L){
	return 7000;
}
if(account==123456874678L){
	return 90000;
}
if(account==987456321678L){
	return 100000;
}
if(account==523698745295678L){
	return 60000;
}
if(account==8523214565678L){
	return 6000;
}
if(account==54123451235678L){
	return 2000;
}
if(account==41258933795678L){
	return 3000;
}
if(account==6547412585678L){
	return 400;
}
if(account==71112225425678L){
	return 300;
}
if(account==7412588478963678L){
	return 36000;
}
if(account==36251445698795678L){
	return 34000;
}
if(account==852222355413698729L){
	return 56000;
}
if(account==44123666877455678L){
	return 55000;
}
return 000;
}
public static int source(String sources){
	System.out.println("source: "+sources);
	if(sources=="Internet"){
	return 4000;
}
if(sources=="Books"){
	return 500;
}
if(sources=="Research Papers"){
	return 200;
}
if(sources=="Magazines"){
	return 250;
}
if(sources=="News Articles"){
	return 200;
}
if(sources=="Academic Journals"){
	return 300;
}
if(sources=="Silver"){
	return 1530;
}
if(sources=="gold"){
	return 33330;
}
if(sources=="Case Studies"){
	return 500;
}
if(sources=="Market Surveys"){
	return 10000;
}
if(sources=="Scientific Studies"){
	return 1000;
}
if(sources=="petrol"){
	return 50;
}
if(sources=="oil"){
	return 250;
}
if(sources=="Diesel"){
	return 500;
}
if(sources=="stones"){
	return 3000000;
}
if(sources=="shop"){
	return 30000;
}
if(sources=="Journals"){
	return 6400;
}
return 000;
}
public static String name(String alive){
	System.out.println("name of alive : "+alive);
	if(alive.equals("sanjana")){
		return "Alive";
	}
	if(alive.equals("Ratan Tata")){
		return "Not Alive";
	}
	if(alive.equals("Dr. Manmohan Singh")){
		return "Not Alive";
	}
	if(alive.equals("Sanje pande")){
		return "Alive";
	}
	if(alive.equals("Modi")){
		return "Alive";
	}
	if(alive.equals("Omkar")){
		return "Alive";
	}
	if(alive.equals("Pankaj Udhas")){
		return "Not Alive";
	}
	if(alive.equals("Punitha rajkumar")){
		return "Not Alive";
	}
	return "Not Known";
}
}
