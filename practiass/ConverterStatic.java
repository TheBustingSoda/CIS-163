public class  ConverterStatic
{
    static final int base2 = 2;
    static final int base8 = 8;
    public static void main(String[]args)
    {
        int num = 0;
        String inputString = "17";
        num = baseToDecimal(inputString, base8);
        System.out.println(num);
        inputString = "10111";
        num = baseToDecimal(inputString, base2);
        System.out.println(num);
    }

    static int baseToDecimal(String in, int base)
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
}
