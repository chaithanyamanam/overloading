class area
{
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y);
    }
    void area(float x)
    {
        double a = 3.14 * x * x;
        System.out.println("the area of the circle is "+a);
    }
}
class Overload 
{
     public static void main(String args[]) 
	{
	   area ob = new area();
	 ob.area(11,12);
	   ob.area(5);
        }
}
