public class Test
{
    static
    {
        System.out.println("1");
    }
    {
        System.out.print("2");
    }
    public Test()
    {
        System.err.print("3");
    }
    public static void main(String[] args)
    {
		new Test();
			// 你好
    }
}