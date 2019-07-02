import java.util.Scanner;

public class TestBook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Book BookA= new Book("The Library of Greek Mythology", "Mythology", "Apollodorus", 1229, "Oxford University Press", 336, 13.95);
		System.out.println(BookA.title);
		System.out.println(BookA.category);
		System.out.println(BookA.getAuthor());
		System.out.println(BookA.getISBN_13());
		System.out.println(BookA.getPublisher());
		System.out.println(BookA.getPages());
		System.out.println(BookA.getPrice());
		
		System.out.println("BookB items \n Give title");
		String Title= sc.nextLine();
		System.out.println("Give category");
		String Category=sc.nextLine();
		System.out.println("Give pages");
		int pages=Integer.valueOf(sc.nextLine());
		System.out.println("Give Author");
		String Author=sc.nextLine();
		System.out.println("Give ISBN_13");
		int ISBN=Integer.valueOf(sc.nextLine());
		System.out.println("Give Publisher");
		String Publisher=sc.nextLine();
		System.out.println("Give price");
		double Price=Double.valueOf(sc.nextLine());
		
		Book BookB= new Book(Title,Category,Author,ISBN,Publisher,pages,Price);
		System.out.println(BookB.title);
		System.out.println(BookB.category);
		System.out.println(BookB.getAuthor());
		System.out.println(BookB.getISBN_13());
		System.out.println(BookB.getPublisher());
		System.out.println(BookB.getPages());
		System.out.println(BookB.getPrice());
		System.out.println("\nthe tile and category of the most pricy book between the two books is:");
		double diafora=(BookA.getPriceDifference( BookA.getPrice(),BookB.getPrice()));
		if (diafora>0) {
			System.out.println(BookA.title);
			System.out.println(BookA.category);
		}else if(diafora<0) {
			System.out.println(BookB.title);
			System.out.println(BookB.category);
		}
	}
}