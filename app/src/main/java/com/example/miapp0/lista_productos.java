package com.example.miapp0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.miapp0.adaptador.adaptador_producto;
import com.example.miapp0.helpers.queueutils;
import com.example.miapp0.modelos.producto;

import java.util.ArrayList;

public class lista_productos extends AppCompatActivity {

    queueutils.QueueObject queue = null;

    private ListView listaProd;
    private adaptador_producto adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_productos);
        queue = queueutils.getInstance(this.getApplicationContext());

        listaProd = (ListView) findViewById(R.id.lista_productos);
        adaptador = new adaptador_producto(this, getArrayItems(), queue.getImageLoader());
        listaProd.setAdapter(adaptador);


    }

    private ArrayList<producto> getArrayItems() {

        ArrayList<producto> listaprod = new ArrayList<producto>();
         listaprod.add(new producto("https://images.unsplash.com/photo-1562967914-01efa7e87832?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1352&q=80",
                        "Pollo al limón", "S/. 18.00", "lo que sea"));
        listaprod.add(new producto("https://images.unsplash.com/photo-1562967915-6ba607ff7d05?ixlib=rb-1.2.1&auto=format&fit=crop&w=1352&q=80",
                "Pollo al limón", "S/. 18.00", "lo que sea"));
        listaprod.add(new producto("https://images.unsplash.com/photo-1541832676-9b763b0239ab?ixlib=rb-1.2.1&auto=format&fit=crop&w=921&q=80",
                "Pollo al limón", "S/. 18.00", "lo que sea"));
        listaprod.add(new producto("https://images.unsplash.com/photo-1562967914-01efa7e87832?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1352&q=80",
                "Pollo al limón", "S/. 18.00", "lo que sea"));
        listaprod.add(new producto("https://images.unsplash.com/photo-1562967915-6ba607ff7d05?ixlib=rb-1.2.1&auto=format&fit=crop&w=1352&q=80",
                "Pollo al limón", "S/. 18.00", "lo que sea"));
        listaprod.add(new producto("https://images.unsplash.com/photo-1541832676-9b763b0239ab?ixlib=rb-1.2.1&auto=format&fit=crop&w=921&q=80",
                "Pollo al limón", "S/. 18.00", "lo que sea"));


        return listaprod;

    }

}
