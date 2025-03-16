class HospitalRunner{
public static void main(String [] args){
System.out.println("running the main method which is a HospitalRunner");
String name="Sanjana VU";
int dob=21;
Long phoneno=7795039943L;
String mail="sanjana@123";		
String sick="cold fever";
Hospital.checkup(name,dob,phoneno,mail,sick);
}
}