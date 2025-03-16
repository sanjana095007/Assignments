class Hospital{
public static void checkup(String patientname,int age,Long mobile,String email,String sicknes)
{
System.out.println("running checkup in Hospital");
System.out.println("patient name is:" + patientname);
System.out.println("age:" + age);
System.out.println("mobile number is:" + mobile);
System.out.println("email:" + email);
System.out.println("sicknes:" + sicknes);
Doctor.treatment(patientname,age);
}
}