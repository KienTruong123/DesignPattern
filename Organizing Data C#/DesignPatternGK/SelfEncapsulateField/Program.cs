using System;

namespace SelfEncapsulateField
{
    class Program
    {
        static void Main(string[] args)
        {
            Rectangle re = new Rectangle(3, 4);
            Console.WriteLine(re.getArea());
        }
    }
}
