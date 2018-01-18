package filtroslys.mobirutpda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

import filtroslzs.layer.entidad.entZaccMenu;
import filtroslzs.layer.negocio.negZaccMenu;

public class InicioSincroniza extends AppCompatActivity {

    appglobal app;
    ArrayList<entZaccMenu> LstMenu;
    ArrayList<String> menuData;
    ListView lvMenuSincronizar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sincroniza);
        setTitle("Sincronizar Datos");
        app = ((appglobal) getApplicationContext());
        lvMenuSincronizar = (ListView) findViewById(R.id.lvMenuSincroniza);
        CargarMenuSincroniza();

    }

    public  void  CargarMenuSincroniza(){
        LstMenu = new ArrayList<>();
        negZaccMenu negMenu = new negZaccMenu(app.getConexion());
        LstMenu = negMenu.ListaMenu("MMONTERO","SC");
        if (LstMenu.size()>0){
            menuData = new ArrayList<>();
            for (int i = 0 ; i<LstMenu.size(); i++){
                menuData.add(LstMenu.get(i).getNombre());
            }
            ArrayAdapter<String> adapter = new ArrayAdapter<>(
                    getApplicationContext(),
                    R.layout.checkbox_layout,
                    menuData
            );
            lvMenuSincronizar.setAdapter(adapter);
            lvMenuSincronizar.setAdapter(adapter);
            lvMenuSincronizar.setItemsCanFocus(false);
            lvMenuSincronizar.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        }

    }

}
