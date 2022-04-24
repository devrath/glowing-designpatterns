import SampleDemoCode.MainTypes.*;

public class MovieDemo {

    public static void main(String[] args){
        // Parent
        ParentFolder parentFolder = new ParentFolder();
        // First level children
        SoftwaresFolder softFolder = new SoftwaresFolder();
        MoviesFolder moviesFolder = new MoviesFolder();
        GamesFolder gamesFolder = new GamesFolder();
        // Second level children
        JurassicParkMovie jurassicParkMovieFile = new JurassicParkMovie();
        CategoryDramaMoviesFolder categoryDramaMoviesFolder = new CategoryDramaMoviesFolder();
        // Add second level children
        moviesFolder.addItems(jurassicParkMovieFile);
        moviesFolder.addItems(categoryDramaMoviesFolder);
        // Add first level children
        parentFolder.add(softFolder);
        parentFolder.add(moviesFolder);
        parentFolder.add(gamesFolder);

        // Initiate print
        parentFolder.printFolderDetails();
    }

}
