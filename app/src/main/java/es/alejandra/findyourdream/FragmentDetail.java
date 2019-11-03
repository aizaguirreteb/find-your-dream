package es.alejandra.findyourdream;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentDetail extends Fragment {

    public static final String ARG_ID_ENTRADA_SELECCIONADA = "item_id";
    private Contenido.Lista_entrada item;

    public FragmentDetail(){}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments().containsKey(ARG_ID_ENTRADA_SELECCIONADA)) {

            item = Contenido.ENT_LISTA_HASHMAP.get(getArguments().getString(ARG_ID_ENTRADA_SELECCIONADA));
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.layout_detalle, container, false);

        if (item != null){
            ((TextView) rootView.findViewById(R.id.tituloDetalle)).setText(item.titulo);
            ((TextView) rootView.findViewById(R.id.textoDetalle)).setText(item.texto);
            ((ImageView) rootView.findViewById(R.id.imagenDetalle)).setImageResource(item.idImagen);
        }

        return rootView;
    }
}
