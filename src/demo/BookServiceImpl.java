package demo;

public class BookServiceImpl implements BookService {

	private BookDao bookDao;
	public void setBookDao(BookDao bookDao){
		this.bookDao = bookDao;
	}
	@Override
	public void addBook() {
		// TODO Auto-generated method stub
		bookDao.addBook();
		
	}

}
