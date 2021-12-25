package com.example.grid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView l=(GridView)findViewById(R.id.gridView);
        l.setAdapter(new ListResources(this));
    }

    class ListResources extends BaseAdapter{
        ArrayList<CharacterAnime> myData;
        Context context;

        ListResources(Context context){
            this.context=context;
            myData=new ArrayList<CharacterAnime>();
            //myData.add(new CharacterAnime("Luffytaro",R.drawable.luffyTaro));
            myData.add(new CharacterAnime("Kurapika",R.drawable.kurapika));
            myData.add(new CharacterAnime("nagaro",R.drawable.nagato));
        }

        @Override
        public int getCount() {
            return myData.size();
        }

        @Override
        public CharacterAnime getItem(int position) {
            return myData.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater=getLayoutInflater();
            View row=inflater.inflate(R.layout.item,parent,false);
            TextView name=(TextView)row.findViewById(R.id.name);
            ImageView img=(ImageView)row.findViewById(R.id.img);

            CharacterAnime temp=myData.get(position);
            name.setText(temp.get_name());
            img.setImageResource(temp.get_img());

            return row;
        }
    }
}