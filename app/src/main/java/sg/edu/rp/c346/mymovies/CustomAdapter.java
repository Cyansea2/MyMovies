package sg.edu.rp.c346.mymovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context context;
    int resource;
    ArrayList<Movie> objects;

    public CustomAdapter(Context context, int resource, ArrayList<Movie> objects) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(resource, parent, false);

        TextView tvTitle = rowView.findViewById(R.id.tvTitle);
        TextView tvYear = rowView.findViewById(R.id.tvYear);
        TextView tvGenre = rowView.findViewById(R.id.tvGenre);
        ImageView ivRated = rowView.findViewById(R.id.ivRated);


        Movie movie = objects.get(position);

        tvTitle.setText(movie.getTitle());
        tvYear.setText(movie.getYear());
        tvGenre.setText(movie.getGenre());

        if(movie.getRated().equalsIgnoreCase("g")) {
            ivRated.setImageResource(R.drawable.rating_g);
        }
        else if(movie.getRated().equalsIgnoreCase("pg")){
            ivRated.setImageResource(R.drawable.rating_pg);
        }
        else if(movie.getRated().equalsIgnoreCase("pg13")){
            ivRated.setImageResource(R.drawable.rating_pg13);
        }
        else if(movie.getRated().equalsIgnoreCase("nc16")){
            ivRated.setImageResource(R.drawable.rating_nc16);
        }
        else if(movie.getRated().equalsIgnoreCase("m18")){
            ivRated.setImageResource(R.drawable.rating_m18);
        }
        else{
            ivRated.setImageResource(R.drawable.rating_r21);
        }

        return rowView;
    }
}
