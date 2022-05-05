using System;

namespace ReplaceRecordwithDataClass
{
    class Program
    {
        static void Main(string[] args)
        {
            //replace {id: "1", name: "Kien", age: 18} to data class
            Student s = new Student("1", "Kien", 18);
            Console.WriteLine(s.ToString());
        }
    }
}
