
public class bookApp {
	
	public static void main(String[] args) {
		
		 String author = "Bill waterson";
		 String BookID = "12345";
		 String Title="day before yesterday";
		 String Description = "scifi";
		
		book myBook = new book();
		book myBook1 = new book( BookID,  author,  Title, Description);
		//myBook.setAuthor(author);
		//myBook.setBookID(BookID);
		//myBook.setDescription("Scifi");
		//myBook.setTaxble(true);
		//myBook.setTitle(Title);
		System.out.println(myBook1.getDisplayText());
		
	}

}
