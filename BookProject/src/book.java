
public class book {

	private String author;
	private String BookID;
	private String Title;
	private String description;
	private boolean taxble;
	private double price;
	
	public book()
	{
		author = "";
		BookID = "";
		Title = "";
		description = "";
	}
	
	public book(String BookID, String author, String Title, String description )
	{
		this.author = author;
		this.BookID =BookID;
		this.Title = Title;
		this.description =description;
	}
	
	public String getBookID() {
		return BookID;
	}
	public void setBookID(String bookID) {
		BookID = bookID;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getDisplayText()
	{
		return author + "\n" + Title + "\n" + description;
	}
	public boolean getTaxble() {
		return taxble;
	}
	public void setTaxble(boolean taxble) {
		this.taxble = taxble;
	}
	
	
}
