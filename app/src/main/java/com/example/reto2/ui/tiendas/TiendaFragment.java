package com.example.reto2.ui.tiendas;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.reto2.FormActivity;
import com.example.reto2.R;
import com.example.reto2.adaptadores.TiendaAdapter;
import com.example.reto2.databinding.FragmentTiendaBinding;
import com.example.reto2.modelo.Tienda;
import java.util.ArrayList;
import java.util.List;

public class TiendaFragment extends Fragment {

    FragmentTiendaBinding binding;
    RecyclerView reciclerView;
    List<Tienda> tiendas;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_tienda, container, false);
        tiendas = new ArrayList<>();
        reciclerView = view.findViewById(R.id.rcv_tienda);
        reciclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        llenarLista();
        TiendaAdapter adapter = new TiendaAdapter(tiendas, getContext());
        reciclerView.setAdapter(adapter);
        return view;

    }

    public void llenarLista(){
        tiendas.add(new Tienda("SUCRE", "CALLE 12 ENTRE CARRERAS 13 Y 14\n" +
                "AL INTERIOR DEL PARQUE SUCRE\n" +
                "Armenia Quindio\n" +
                "Colombia", "lUNES A VIERNES  7AM A 9PM", R.drawable.cafequindio));
        tiendas.add(new Tienda("UNICENTRO", " CENTRO COERCIAL UNICENTRO CALLE 2 No 45-03 LOCACAL 25", "lUNES A VIERNES  7AM A 9PM", R.drawable.cafe_qundio2));
        tiendas.add(new Tienda("TERMINAL", "Terminal de transportes de Amenia quindio", "lUNES A VIERNES  7AM A 9PM", R.drawable.juan_valdes));
        tiendas.add(new Tienda("MANCHA", " En algun lugar de la manchad de cuyo nombre no quiero acordarme", "lUNES A VIERNES  7AM A 9PM", R.drawable.tostao));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        switch (item.getItemId()){
            case R.id.action_add:
                intent = new Intent(getContext(), FormActivity.class);
                intent.putExtra("name","Agregar Tienda");
                getActivity().startActivity(intent);
                return true;
            case R.id.action_update:
                intent = new Intent(getContext(), FormActivity.class);
                intent.putExtra("name","Actualizar Tienda");
                getActivity().startActivity(intent);
                return true;
            case R.id.action_delete:
                intent = new Intent(getContext(), FormActivity.class);
                intent.putExtra("name","Eliminar Tienda");
                getActivity().startActivity(intent);
                return true;

            default:return super.onOptionsItemSelected(item);
        }

    }


}