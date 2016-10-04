class Movie {
	String title;
	String genre;
	int rating;
	 
	void playIt() {
		System.out.println("Play the movie ");
	}
}

public class MovieTestDrive{
	public static void main(String[] args) {
		Movie one = new Movie();
		one.title = "Gone with the Winter";
		one.playIt();
	}
}