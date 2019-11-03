package es.alejandra.findyourdream;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

public class Fragment2 extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_panel);
        if(savedInstanceState == null){
            Bundle arguments = new Bundle();
            arguments.putString(FragmentDetail.ARG_ID_ENTRADA_SELECCIONADA,
                    getIntent().getStringExtra((FragmentDetail.ARG_ID_ENTRADA_SELECCIONADA)));
            FragmentDetail detail = new FragmentDetail();
            detail.setArguments(arguments);
            getSupportFragmentManager().beginTransaction().add(R.id.frame_contenedor, detail).commit();
        }
    }
}
