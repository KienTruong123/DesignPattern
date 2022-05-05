using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SelfEncapsulateField
{
    class Rectangle
    {
        private double _length, _width;

        public Rectangle(double length, double width)
        {
            _length = length;
            _width = width;
        }
        public double Length
        {
            set { _length = value; }
            get { return _length; }
        }
        public double Width
        {
            set { _width = value; }
            get { return _width; }
        }

        public double getArea()
        {
            return (Length * Width);
        }

        public double getPerimeter()
        {
            return (2 * Length+ Width);
        }
    }
}
