public class product 
{
    String pcode;
    String pname;
    int price;

    public product(String pcode_get, String pname_get, int price_get) 
{
        pcode = pcode_get;
        pname = pname_get;
        price = price_get;
    }

    public int get_price()
{
        return price;

    }

    public static void main(String[] args)
    {
        product p1 = new product("A123", "tv", 2);
        product p2 = new product("B123", "Radio", 3);
        product p3 = new product("C123", "Dvd", 4);
        if (p1.price <= p3.price && p1.price <= p2.price)
            System.out.println("Lowest product ID is:" + p1.pcode);
        if (p3.price <= p1.price && p3.price <= p2.price)
            System.out.println("Lowest product ID is:" + p3.pcode);
        if (p2.price <= p1.price && p2.price <= p1.price)
            System.out.println("Lowest product ID is:" + p2.pcode);
    }
}

                                              

                                                    ___OUTPUT__
 C:\Users\mlm\.jdks\openjdk-21.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\lib\idea_rt.jar=51105:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.3.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 
     -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\mlm\Idrojects\bibn\out\production\bibn 
                                                       
productLowest product ID is:A123

Process finished with exit code 0

