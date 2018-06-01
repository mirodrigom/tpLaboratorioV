package com.martinez.rodrigo.tplaboratoriov;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/*
 View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        SharedPreferences pref = getSharedPreferences("miconfig", Context.MODE_PRIVATE);

        String nameURL = pref.getString("nombre","Infobae");
        String url = pref.getString("url","https://www.infobae.com/tag/feed/");

        Log.d("ver",nameURL);
        Log.d("ver",url);


*/

        //Carga nueva info q le da el usuario
        /*
        SharedPreferences.Editor editor = pref.edit();

       editor.putString("nombre",);
       editor.putString("url",);

        editor.commit();
        */

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
       if( id == R.id.itemAlgo )
       {
           MiDialogo mi = new MiDialogo();
           mi.show(getFragmentManager(),"digo");
       }
        return super.onOptionsItemSelected(item);
    }

    /*
    @Override
    public void onClick(View v) {

    }
    */
}
