using System;

namespace ReplaceAnArraywithObject
{
    class People
    {
        private string _name;
        private string _phone;
        private string _address;

        public string Name
        {
            get { return _name; }
            set { _name = value; }
        }

        public string Phone
        {
            get { return _phone; }
            set { _phone = value; }
        }

        public string Address
        {
            set { _address = value; }
            get { return _address; }
        }

        public People(string name, string phone, string address)
        {
            _name = name;
            _phone = phone;
            _address = address;
        }

        public People() { }
    }
}
