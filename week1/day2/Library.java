package week1.day2;

public class Library {

		public String addBook(String BookTitle) {
			System.out.println("Book added Successfully");
			return BookTitle;
			
			
		}
		
		public void issueBook() {
			System.out.println("Book issued Successfully");
		}
		
		public static void main(String[] args) {
			Library lib = new Library();
			System.out.println(lib.addBook("Java"));
			lib.issueBook();
		}
	}
