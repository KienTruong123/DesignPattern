using System;

namespace ReplaceRecordwithDataClass
{
    class Student
    {
        private string _code;
        private string _name;
        private int _age;

        public string Code
        {
            set { _code = value; }
            get { return _code; }
        }

        public string Name
        {
            set { _name = value; }
            get { return _name; }
        }

        public int Age
        {
            set { _age = value; }
            get { return _age; }
        }

        public Student(string code, string name, int age)
        {
            _code = code;
            _name = name;
            _age = age;
        }
    }
}
