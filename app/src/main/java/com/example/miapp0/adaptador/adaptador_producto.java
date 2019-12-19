package com.example.miapp0.adaptador;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.example.miapp0.R;
import com.example.miapp0.modelos.producto;

import java.util.ArrayList;

public class adaptador_producto extends BaseAdapter {


    private Context contexto;

    private ArrayList<producto> listaProductos;


     ImageLoader queue;

    public adaptador_producto(Context context, ArrayList<producto> _listaProductos, ImageLoader _queue) {
        this.contexto = context;
        this.listaProductos = _listaProductos;
        this.queue = _queue;
    }


    @Override
    public int getCount() {
        return listaProductos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaProductos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        producto prod = (producto) getItem(position);

        convertView = LayoutInflater.from(contexto).inflate(R.layout.item_producto, null);
        TextView prd_nombre = (TextView) convertView.findViewById(R.id.text_nombre);
        TextView prd_precio = (TextView) convertView.findViewById(R.id.text_precio);
        NetworkImageView prd_imagen = (NetworkImageView)convertView.findViewById(R.id.imagen);


        prd_nombre.setText(prod.getNombre());
        prd_precio.setText(prod.getPrecio());
        prd_imagen.setImageUrl(prod.getImagen(), queue);


        return convertView;
    }
}
