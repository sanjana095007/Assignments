class PostHeadMaster{
public static void head(String customername, String address)
{
System.out.println("running head in PostHeadMaster");
System.out.println("customer name is:" + customername);
System.out.println("address:" + address);
PostMaster.post(customername,address);
}
}