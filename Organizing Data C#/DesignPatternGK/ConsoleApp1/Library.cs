using ConsoleApp1;
using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EncapsulateCollection
{
    class Library
    {
        private HashSet<Book> _books = null;

        public HashSet<Book> Books{
            get { return _books; }
        }

        public Book Book
        {
            set { _books.Add(value); }
        }

        public void remove(Book book)
        {
            _books.Remove(book);
        }

        public Library()
        {
            _books = new HashSet<Book>();
        }

        
    }
}
