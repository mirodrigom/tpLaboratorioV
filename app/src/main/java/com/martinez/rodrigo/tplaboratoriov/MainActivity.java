package com.martinez.rodrigo.tplaboratoriov;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/*
 View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
 */

/**
 * Implemento estas interfaces por los items del menu (como search)
 * Implements oOQueryTextListener y sus metodos
 */

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        //Con esto mando desde la activity 1 a la activity webview y le paso info

        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener((View.OnClickListener) this);


        Intent i = new Intent(this, WebActivity.class);
        i.putExtra("url","http://clarin.com.ar");
        startActivity(i);



       // btn.setOnClickListener();

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
        //Seteo lo que va poniendo en el buscador.
        SearchView mi = (SearchView) menu.findItem(R.id.isearchview).getActionView();
        mi.setOnQueryTextListener(this);
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

    @Override
    public boolean onQueryTextSubmit(String query)
    {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        //Aca tiene que actualizar lista a medida que vas escribiendo
        //con el indexof o con una expresion regular puedo comparar la palabra ingresada con el titulo de las noticias
        return false;
    }

    /*
    @Override
    public void onClick(View v) {

    }
    */
}
