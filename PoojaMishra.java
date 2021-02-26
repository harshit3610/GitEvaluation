class Vehicle
{
    String regno;
    int model;
    Vehicle(String r, int m)
    {
        regno=r;
        model=m;
    }

    //display

    void display()
    {
        System.out.println("Registration no: "+regno);
        System.out.println("Model no: "+model);
    }
}

 

 
class Threewheeler extends Vehicle
{
    int noofleaf;
    Threewheeler(String r,int m,int n)
    {
        super(r,m);
        noofleaf=n;
    }
    void display()
    {
        System.out.println("Three wheeler");
        super.display();
        System.out.println("No. of leaf:" +noofleaf);
    }
}
 
class Fourwheeler extends Vehicle
{
    int noofleaf;
    Fourwheeler(String r,int m,int n)
    {
        super(r,m);
        noofleaf=n;
    }
    void display()
    {
        System.out.println("Four wheeler");
        super.display();
        System.out.println("No. of leaf:" +noofleaf);
    }
}
 
class VehicleDemo
{
    public static void main(String arg[])
    {
       
        Threewheeler th1;
        Fourwheeler f1;
       
        th1=new Threewheeler("xyz0983", 4,3);
        f1=new Fourwheeler("ab123",5,4);
       
        th1.display();
        f1.display();
    }
}