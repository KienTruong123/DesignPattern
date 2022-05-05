using System;

namespace ConsoleApp1
{
	class Book
	{
		private string name;
		private string author;

		public string Name
		{
			get { return name; }
			set { name = value; }
		}

		public string Author
		{
			set { author = value; }
			get { return author; }
		}
		public Book(string name, string author)
		{
			this.name = name;
			this.author = author;
		}
	}
}
