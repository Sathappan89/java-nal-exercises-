package ClassAndObject;

/*
 * 
 * Define a class named Book with the following attributes:
 * 			String title
 * 			String author
 * 			int pageCount
 * 			int totalBooks(to keep track of the total number of books)
 * 
 * In the main method:
 * 			Create three Book objects and initialize their properties with different values.
 * 			Print the details of each book and the total number of books.
 * 			Modify the pageCount attribute of one book and print the updated details.
 * 			Create another Book object and update the total number of books.
 * 			Print the details of the new book and the updated total number of books.
 * 
 * */
public class Book {

	String title;
	String author;
	int pageCount;
	int totalBooks;

	public static void main(String[] args) {

		int totalNumberofBooks = 0;

		Book b1 = new Book();
		b1.title = "Best friend";
		b1.author = "Borin";
		b1.pageCount = 10;
		totalNumberofBooks++;
		System.out.println(b1.title + " " + b1.author + " " + b1.pageCount);

		b1.pageCount = 35;
		System.out.println(b1.title + " " + b1.author + " " + b1.pageCount);

		Book b2 = new Book();
		b2.title = "Grade1";
		b2.author = "pattern";
		b2.pageCount = 15;
		totalNumberofBooks++;
		System.out.println(b2.title + " " + b2.author + " " + b2.pageCount);

		Book b3 = new Book();
		b3.title = "Grade2";
		b3.author = "prathamesh";
		b3.pageCount = 30;
		totalNumberofBooks++;
		System.out.println(b3.title + " " + b3.author + " " + b3.pageCount);

	}

}
