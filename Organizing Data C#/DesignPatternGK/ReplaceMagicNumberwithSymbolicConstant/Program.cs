using System;

namespace ReplaceMagicNumberwithSymbolicConstant
{
    class Program
    {
		readonly static double PI = 3.14159;

		// should not
		public static double getCircumferenceOfCircle(double radius)
		{
			return 2 * 3.14159 * radius;
		}

		//should do
		public static double calculateCircumferenceOfCircle(double radius)
		{
			return 2 * PI * radius;
		}
		static void Main(string[] args)
        {
            Console.WriteLine(getCircumferenceOfCircle(5));
            Console.WriteLine(calculateCircumferenceOfCircle(5));
        }
    }
}
