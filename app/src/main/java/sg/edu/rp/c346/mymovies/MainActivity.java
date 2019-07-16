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

        caMovie = new CustomAdapter(this, R.layout.row,alMovie);
        lvMovie.setAdapter(caMovie);
    }


}
