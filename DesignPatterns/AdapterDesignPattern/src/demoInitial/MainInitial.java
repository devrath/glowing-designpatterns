package demoInitial;

public class MainInitial {

    public static void main(String[] args){

        ImageView imgView = new ImageView(new Image());
        imgView.applyFilter(new RedFilter());
        imgView.applyFilter(new GreenFilter());

    }

}
