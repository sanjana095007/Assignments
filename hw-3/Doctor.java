class Doctor{
public static void treatment(String patientname,int age)
{
System.out.println("running treatment in Doctor");
System.out.println("patient name is:" + patientname);
System.out.println("age:" + age);
Nurse.assist(patientname);
}
}