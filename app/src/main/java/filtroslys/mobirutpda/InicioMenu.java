package filtroslys.mobirutpda;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import filtroslzs.layer.entidad.entDataBase;
import filtroslzs.layer.negocio.*;

import java.util.ArrayList;

import filtroslzs.layer.entidad.entZaccMenu;

public class InicioMenu extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    String sNombreUsuario , sCorreoUsuario , sCodigoUsuario;
    SharedPreferences preferences;
    appglobal app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_menu);
        app = ((appglobal) getApplicationContext());
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        preferences = PreferenceManager.getDefaultSharedPreferences(InicioMenu.this);
         sNombreUsuario  =preferences.getString("NomUsuario",null);
        sCorreoUsuario = preferences.getString("MailUsuario",null);
        sCodigoUsuario =  preferences.getString("CodUsuario",null);
        setSupportActionBar(toolbar);
        setTitle("Menu Inicio");
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        Menu m = navigationView.getMenu();
        LoadNavDrawMenu(m);
        View header=navigationView.getHeaderView(0);
        TextView name = (TextView)header.findViewById(R.id.txtUserNav);
        TextView  email = (TextView)header.findViewById(R.id.txtMailNav);
        name.setText(sNombreUsuario);
        email.setText(sCorreoUsuario);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_config, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.config) {
            ConfigurarVendTrans();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public  void  ConfigurarVendTrans(){
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View formElementsView = inflater.inflate(R.layout.dialog_vendedor,
                null, false);
        final EditText txtCodUser = (EditText) formElementsView.findViewById(R.id.txtCodUsuarioDialog);
        final CheckBox chkVendedor= (CheckBox)formElementsView.findViewById(R.id.chkVendedor);
        final CheckBox chkTransp = (CheckBox)formElementsView.findViewById(R.id.chkTransp);
        final EditText txtCodVend = (EditText)formElementsView.findViewById(R.id.txtCodVendedor);
        final EditText txtClaveVend = (EditText)formElementsView.findViewById(R.id.txtClaveVendor);
        final EditText  txtCodTransp = (EditText)formElementsView.findViewById(R.id.txtCodTransp);
        final EditText txtClaveTransp = (EditText)formElementsView.findViewById(R.id.txtClaveTransp);
        txtCodUser.setText(app.getUsuario());
        txtCodUser.setEnabled(false);

        chkTransp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                txtClaveTransp.setEnabled(b);
                txtCodTransp.setEnabled(b);
            }
        });
        chkVendedor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                txtClaveVend.setEnabled(b);
                txtCodVend.setEnabled(b);
            }
        });

        new AlertDialog.Builder(InicioMenu.this).setView(formElementsView)
                .setTitle("Configuración")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (chkTransp.isChecked()) {
                    negTransportista ntramsp = new negTransportista(app.getConexion());
                     boolean autentic =  ntramsp.GetTranspAutenticado(txtCodTransp.getText().toString().trim(),txtClaveTransp.getText().toString().trim());
                     //if (aute)
                }

            }
        })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .show();
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

      /*  if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public   void  LoadNavDrawMenu (Menu menu){
        ArrayList<entZaccMenu> listamenu= new ArrayList<>();
        negZaccMenu negMenu = new negZaccMenu(app.getConexion());
        listamenu = negMenu.ListaMenuHome("MMONTERO");

        if (listamenu.size()>0){
            //Cargando items menu padres
            for (int  i = 0 ; i < listamenu.size();i++){
                entZaccMenu zmenu = listamenu.get(i);
                if (zmenu.getTipo().equals("P")){
                   Menu m = menu.addSubMenu(Integer.valueOf(zmenu.getIdReg()),Integer.valueOf(zmenu.getIdReg()), i,zmenu.getNombre());
                   CreandoMenuHijos(listamenu,zmenu.getIdReg(),m);
                }
            }


        }


    }

    public  void CreandoMenuHijos (ArrayList<entZaccMenu> listamenu ,String menuPadreId , Menu menuHijo){
        for (int i  = 0 ;  i <  listamenu.size(); i++) {
            entZaccMenu itemMenu= listamenu.get(i);
            if (itemMenu.getTipo().equals("H")&& menuPadreId.equals(itemMenu.getIdRef())) {

                menuHijo.add(Integer.valueOf(menuPadreId), Integer.valueOf(itemMenu.getIdReg()), i, itemMenu.getNombre()).setIcon(R.drawable.ic_navmenu);
            }
        }
    }


}
