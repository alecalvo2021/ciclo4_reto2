package com.example.reto2.ui.servicios;

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
import com.example.reto2.adaptadores.ServiciosAdapter;
import com.example.reto2.databinding.FragmentServiciosBinding;
import com.example.reto2.modelo.Servicio;
import java.util.ArrayList;
import java.util.List;

public class ServiciosFragment extends Fragment {
    RecyclerView reciclerView;
    List<Servicio> servicios;

    FragmentServiciosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_servicios, container, false);
        servicios = new ArrayList<>();
        reciclerView = view.findViewById(R.id.recicler_servicios);
        reciclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        llenarLista();
        ServiciosAdapter adapter = new ServiciosAdapter(servicios, getContext());
        reciclerView.setAdapter(adapter);
        return view;

    }

    private void llenarLista() {
        servicios.add(new Servicio("BALSAJE", "Es una actividad recreativa y de observación del paisaje que se practica en pequeñas embarcaciones de guadua en los tramos navegables del río La Vieja.", R.drawable.balsaj));
        servicios.add(new Servicio("HOTELERIA","Servicio de alojamiento en el eje cafetero en la parte rural y en la parte urbana", R.drawable.fincas));
        servicios.add(new Servicio("TRANSPORTE"," Servicio de transporte y de choffer, chiva tours", R.drawable.transporte));
        servicios.add(new Servicio("PASAPORTES","Venta de pasaportes para paarques tematicos: Panaca, Parque del café, parque arrieros, entre otros", R.drawable.pasaportes));






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
                intent.putExtra("name","Agregar Servicio");
                getActivity().startActivity(intent);
                return true;
            case R.id.action_update:
                intent = new Intent(getContext(), FormActivity.class);
                intent.putExtra("name","Actualizar Servicio");
                getActivity().startActivity(intent);
                return true;
            case R.id.action_delete:
                intent = new Intent(getContext(), FormActivity.class);
                intent.putExtra("name","Eliminar Servicio");
                getActivity().startActivity(intent);
                return true;

            default:return super.onOptionsItemSelected(item);
        }

    }

}