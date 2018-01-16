package vtuFirst;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pankaj.vtuapp.Main4Activity;
import com.example.pankaj.vtuapp.R;

import java.util.List;

import model.ListItem;

/**
 * Created by Pankaj on 10-01-2018.
 */

public class Adap extends RecyclerView.Adapter<Adap.ViewHolder>
        {
    private static Context context;
    private static List<ListItem> listItems ;
    public  Adap(Context context, List listItems)
    {
        this.context = context;
        this.listItems = listItems;

    }
    public Adap.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.vtu,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Adap.ViewHolder holder, int position) {
        ListItem item =listItems.get(position);
        holder.name1.setText(item.getName());
        holder.name2.setText(item.getDescription());


    }

    @Override
    public int getItemCount() {

        return listItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

         public TextView name1;
         public TextView name2;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            name1 = (TextView)itemView.findViewById(R.id.title);
            name2 =(TextView)itemView.findViewById(R.id.title2);

        }

        @Override
        public void onClick(View view) {
         //Get position of the row clicked
            int position = getAdapterPosition();
            ListItem item = listItems.get(position);
            Intent intent = new Intent(context, Main4Activity.class);
            context.startActivity(intent);
           // Toast.makeText(context,item.getName(),Toast.LENGTH_LONG).show();
        }
    }
}

