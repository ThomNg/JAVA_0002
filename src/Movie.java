public class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public void watchMovie (){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(name+" is a "+instanceType+" film");
    }
    public static Movie getMovie(String type, String title){
        return switch(type.toUpperCase().charAt(0)) {
            case 'H' -> new Horror(title);
            case 'A' -> new Anime(title);
            default -> new Movie(title);
        };
    }

}

class Horror extends Movie{
    public Horror(String name) {
        super(name);
    }

    public void displayHorror(){
        System.out.println("Entering a dark cave full of maggots");
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("Howww....Scary");
    }
}

class Anime extends Movie{
    public Anime(String name) {
        super(name);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.println("super cute anime...");
    }
}
