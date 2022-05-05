using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ReplaceAnArraywithObject
{
    class Program
    {
        public static void Main(string[] args)
        {

            // Normal
            string[] row = new string[3];
            row[0] = "Kien";
            row[1] = "0909123456";
            row[2] = "HCM";

            // Should do
            People people = new People();
            people.Name="kien";
            people.Phone="0909123456";
            people.Address="HCM";


            Console.WriteLine( "People [name=" + row[0] + ", phone=" + row[1] + ", address=" + row[2] + "]");
            Console.WriteLine(people);
        }
    }
}
