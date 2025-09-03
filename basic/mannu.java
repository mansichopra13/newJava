package basic;
class mannu 
{
    int x=10;
    public static void main(String [] args)
    {
       mannu m = new mannu();
       mannu n = m ;
       n.x=20;
       System.out.println(m.x);
    }
}
    
