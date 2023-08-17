public class Converter
{
    int m_base;
    public Converter(int base)
    {
        m_base = base;
    }

    int baseToDecimal(String in)
    {
        return baseToDecimal(in, m_base);
    }

    int baseToDecimal(String in, int base)
    {
        int num = 0;
        int lend = in.length();
        for (int i = 0; i < lend; i++)
        {
            num += Integer.parseInt(in.substring(in.length()-1))* Math.pow(base,i);
            in = in.substring(0, in.length() - 1);
        }
        return num;
    }

    public static void main(String[]args)
    {
        Converter c = new Converter(8);
        System.out.println(c.baseToDecimal("17"));

    }
}