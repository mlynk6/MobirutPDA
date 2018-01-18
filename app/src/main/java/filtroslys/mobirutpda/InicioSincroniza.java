package filtroslys.mobirutpda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import filtroslzs.layer.entidad.entZaccMenu;
import filtroslzs.layer.negocio.negZaccMenu;

public class InicioSincroniza extends AppCompatActivity {

    appglobal app;
    ArrayList<entZaccMenu> LstMenu;
    ArrayList<String> menuData;
    ListView lvMenuSincronizar;
    Button btnProcesar,btnCancelar;
    ArrayList<MenuSincItem> ItemsSelect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sincroniza);
        setTitle("Sincronizar Datos");
        app = ((appglobal) getApplicationContext());
        lvMenuSincronizar = (ListView) findViewById(R.id.lvMenuSincroniza);
        btnCancelar = (Button)findViewById(R.id.btnCancelSinc);
        btnProcesar = (Button)findViewById(R.id.btnProcesarSinc);

        CargarMenuSincroniza();
        lvMenuSincronizar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                CheckedTextView ctv = (CheckedTextView)view;
                    ItemsSelect.get(i).setbChecked(ctv.isChecked());
            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InicioSincroniza.super.onBackPressed();
            }
        });
        btnProcesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void CargarMenuSincroniza(){
        LstMenu = new ArrayList<>();
        negZaccMenu negMenu = new negZaccMenu(app.getConexion());
        LstMenu = negMenu.ListaMenu("MMONTERO","SC");
        if (LstMenu.size()>0){
            menuData = new ArrayList<>();
            ItemsSelect = new ArrayList<>();
            for (int i = 0 ; i<LstMenu.size(); i++){
                menuData.add(LstMenu.get(i).getNombre());
                MenuSincItem menuSincItem = new MenuSincItem(LstMenu.get(i).getIdRef(),false,i);
                ItemsSelect.add(menuSincItem);

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
    public  class  MenuSincItem{

        public  String sMenu;
        public  boolean bChecked;
        public  int nIndex ;

        public MenuSincItem(String sMenu, boolean bChecked, int nIndex) {
            this.sMenu = sMenu;
            this.bChecked = bChecked;
            this.nIndex = nIndex;
        }

        public String getsMenu() {
            return sMenu;
        }

        public void setsMenu(String sMenu) {
            this.sMenu = sMenu;
        }

        public boolean isbChecked() {
            return bChecked;
        }

        public void setbChecked(boolean bChecked) {
            this.bChecked = bChecked;
        }

        public int getnIndex() {
            return nIndex;
        }

        public void setnIndex(int nIndex) {
            this.nIndex = nIndex;
        }
    }

}
