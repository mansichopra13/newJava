public class Ps6 {
    public static float avgNum(float a,float b,float c)
    {
        float sum=a+b+c;
        float s=sum/3;
        return s;
    }
    public static void main(String[] args)
    {
        float m=avgNum(1,2,3);
        System.out.println(m);
    }
}
