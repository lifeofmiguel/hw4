public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Scream";
        one.genre = "Horror";
        one.rating = 95;
        Movie two = new Movie();
        two.title = "Nightmare on Elm St";
        two.genre = "Horror";
        two.rating = 98;
        two.playIt();
        Movie three = new Movie();
        three.title = "Friday the 13th";
        three.genre = "Horror";
        three.rating = 80;
    }
}
