package kd.ac.th.showkp.utility;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import kd.ac.th.showkp.R;

public class FoodAdapter extends BaseAdapter{
    private Context context;
    private String[] imgString, fooString, priceStings, detailStrings;

    public FoodAdapter(Context context, String[] imgString, String[] fooString, String[] priceStings, String[] detailStrings) {
        this.context = context;
        this.imgString = imgString;
        this.fooString = fooString;
        this.priceStings = priceStings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {
        return fooString.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.listview_food, parent, false);

        TextView foodTextView = view.findViewById(R.id.txtFood);
        TextView pricTextView = view.findViewById(R.id.txtPrice);
        TextView detailTextView = view.findViewById(R.id.txtDetail);
        ImageView imageView = view.findViewById(R.id.imvFood);

        foodTextView.setText(fooString[position]);
        pricTextView.setText(priceStings[position]);
        detailTextView.setText(detailStrings[position]);

        Picasso.get().load(imgString[position]).into(imageView );


        return view;
    }
}
