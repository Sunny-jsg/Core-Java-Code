package in.question;

public class Book implements Comparable{
	double price;
	Book(double price){
		this.price =price;
	}
	
	

	@Override
	public int compareTo(Object o) {
		Book b =(Book) o;
		if(this.price > b.price)return 1;
		if(this.price <b.price) return -1;
		return 0;
	}

}
