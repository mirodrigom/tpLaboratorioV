package com.martinez.rodrigo.tplaboratoriov;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by alumno on 31/05/2018.
 */

public class MyListener implements DialogInterface.OnClickListener {

    int posicion;

    MyListener(int posicion)
    {
        this.posicion = posicion;
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {

        if(AlertDialog.BUTTON_POSITIVE == which)
        {
            SharedPreferences pref = null;//getSharedPreferences("miconfig", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = pref.edit();
            editor.putString("nombre","Otro");
            editor.putString("url","Otro");

            editor.commit();

            String nameURL = pref.getString("nombre","Infobae");
            String url = pref.getString("url","https://www.infobae.com/tag/feed/");

            Log.d("ver",nameURL);
            Log.d("ver",url);
        }
        if(AlertDialog.BUTTON_NEGATIVE == which)
        {
            dialog.cancel();
        }

    }


}
