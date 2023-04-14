package inheritance;
// -- 'authorDtails' is a reference entity of a class 'Author'
// -- 'publisherDetails' is a reference entity of a class 'Publisher'
public class Book {// main class
	String bookName;
	int bookPrice;
	Author authorDtails;//Aggregation
	Publisher publisherDetails;//Aggregation
	// parameterized constructor
	Book(String  bookName, int bookPrice, Author authorDtails, Publisher publisherDetails){ 
		this.bookName=bookName;
		this.bookPrice=bookPrice;
		this.authorDtails=authorDtails;
		this.publisherDetails=publisherDetails;
	}
	void showBook() { //user defined method 1
		System.out.println("Book Name: "+bookName+"\nBook Price: "+bookPrice);
	}
	void showAuthor() { //user defined method 2
		System.out.println("---------------------Author Details------------------------");
		System.out.println("Author Name: "+authorDtails.authorName);
		System.out.println("Author Age: "+authorDtails.authorAge);
		System.out.println("Author Place: "+authorDtails.authorPlace);
	}
	void showPublisher() { //user defined method 3
		System.out.println("---------------------Publisher Details------------------------");
		System.out.println("Publisher Name: "+publisherDetails.publisherName);
		System.out.println("Publisher ID: "+publisherDetails.publisherId);
		System.out.println("Publisher City: "+publisherDetails.publisherCity);
	}
	public static void main(String[] args) {// main method
		//creating objects and passing parameters to constructors
		Author a = new Author("Micheal", 32, "USA");
		Publisher p =new Publisher("Sun Publisher", "ABC-1110", "London");
		Book  b = new Book("Core Java", 800, a, p);
		// method call
		b.showBook();
		b.showAuthor();
		b.showPublisher();
	}

}
