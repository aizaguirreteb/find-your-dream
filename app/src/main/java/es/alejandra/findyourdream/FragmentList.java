package es.alejandra.findyourdream;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

public class FragmentList extends ListFragment {



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new Adaptador(getActivity(), R.layout.layout_listado, Contenido.ENT_LISTA) {

            @Override
            public void onEntrada(final Object entrada, View view) {
                final TextView textoTitulo = (TextView) view.findViewById(R.id.textoTitulo);
                textoTitulo.setText(((Contenido.Lista_entrada) entrada).titulo);
                textoTitulo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(v.getContext(), textoTitulo.getText(), Toast.LENGTH_SHORT).show();

                    }
                });
                TextView texto = (TextView) view.findViewById(R.id.texto);
                texto.setText(((Contenido.Lista_entrada) entrada).texto);
                texto.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(v.getContext(), "Wow! It's crazy!", Toast.LENGTH_SHORT).show();
                        Intent intentDetail = new Intent(v.getContext(), Fragment2.class);
                        intentDetail.putExtra(FragmentDetail.ARG_ID_ENTRADA_SELECCIONADA, ((Contenido.Lista_entrada) entrada).id);
                        startActivity(intentDetail);

                    }
                });
                ImageView imagen = (ImageView) view.findViewById(R.id.imagenLista);
                imagen.setImageResource(((Contenido.Lista_entrada) entrada).idImagen);
                imagen.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(v.getContext(), textoTitulo.getText(), Toast.LENGTH_LONG).show();

                    }
                });

                CheckBox haveDream = (CheckBox) view.findViewById(R.id.checkboxHave);
                haveDream.setChecked(((Contenido.Lista_entrada) entrada).haveDream);
                haveDream.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        Toast.makeText(buttonView.getContext(), "That's scary!", Toast.LENGTH_SHORT).show();

                    }
                });

                CheckBox likeIt = (CheckBox) view.findViewById(R.id.checkboxLike);
                likeIt.setChecked(((Contenido.Lista_entrada) entrada).likeIt);
                likeIt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        Toast.makeText(buttonView.getContext(), "Do you really?", Toast.LENGTH_SHORT).show();
                    }
                });


            }
        });
    }





}
