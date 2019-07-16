package sg.edu.rp.c346.mymovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    CustomAdapter caMovie;
    ArrayList<Movie> alMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie);
        alMovie = new ArrayList<>();
        Movie movie1 = new Movie("The Avengers", "2012","pg13","Action | Sci-Fi","15/11/2014","Golden Village - Bishan","Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army." );
        alMovie.add(movie1);
        Movie movie2 = new Movie ("Planes","2013","pg","Animation | Comedy","15/5/2015","Cathay - AMK Hub","A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.");
        alMovie.add(movie2);
        caMovie = new CustomAdapter(this, R.layout.row ,alMovie);
        lvMovie.setAdapter(caMovie);
    }


}
