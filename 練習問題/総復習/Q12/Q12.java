// 編集禁止！！！
public class Q12 {
	public static void main(String[] args) {
		Book[] books = new Book[2];
		books[0] = new Book();
		books[0].setName("少年ジャンプ");
		books[0].setPrice(290);
		
		books[1] = new Book();
		books[1].setName("少年マガジン");
		books[1].setPrice(270);
		
		for (Book book : books) {
			System.out.println(book.getName() + "は" + book.getPrice() + "円です");
		}
	}
}
// 編集禁止！！！
