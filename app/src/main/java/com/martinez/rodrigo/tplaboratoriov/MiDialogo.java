package com.martinez.rodrigo.tplaboratoriov;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alumno on 31/05/2018.
 */

public class MiDialogo extends DialogFragment
{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder b = new AlertDialog.Builder(getActivity());
        b.setTitle("Elegir un RSS");
        b.setPositiveButton("Guardar",null);
        b.setNegativeButton("Salir",null);

        View v =LayoutInflater.from(getActivity()).inflate(R.layout.listaseleccion,null,false);
        b.setView(v);


        List<String> listaModelo = new ArrayList<String>();
        listaModelo.add("hola");
        listaModelo.add("asd");
        listaModelo.add("bsdf");
        listaModelo.add("xcv");

        ListView lista;

        ArrayAdapter<String> adaptador;

        lista = (ListView)v.findViewById(R.id.listView);
        adaptador = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1);
        adaptador.addAll(listaModelo);
        lista.setAdapter(adaptador);

        return b.create();
    }
}
