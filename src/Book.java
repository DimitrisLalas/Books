
public class Book {
	public String title;
	public String category;
	private String author;
	private int ISBN_13;
	private String publisher;
	private int pages;
	private double price;
	
	Book(String title,String category, String author, int ISBN_13, String publisher, int pages, double price) {
		this.setAuthor(author);
		this.setISBN_13(ISBN_13);
		this.setPublisher(publisher);
		this.setPages(pages);
		this.setPrice(price);
		this.title = title;
		this.category = category;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public  String getAuthor() {
		return this.author;
	}
	public void setISBN_13(int ISBN_13) {
		this.ISBN_13 = ISBN_13;
	}
	public int getISBN_13() {
		return this.ISBN_13;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublisher() {
		return this.publisher;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getPages() {
		return this.pages;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return this.price;
	}
	public double getPriceDifference(double book1price, double book2price) {
		return (book1price - book2price);
	}
}