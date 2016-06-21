package br.edu.ifpb.pdm.theplacebook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int NOVO = 1, LUGAR = 2, SOBRE = 9;

    private ListView lvLista;
    private Lugares lugares;

   public MainActivity(){
       this.lugares = new Lugares();
   }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.lvLista = (ListView)findViewById(R.id.lvList);
        this.lvLista.setOnItemClickListener(new OnClickList());
        carregarLugares();

    }
    public void carregarLugares(){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, this.lugares.get());
        this.lvLista.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0,NOVO,1, "Novo lugar");
        menu.add(0,SOBRE,2,"Sobre");

        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case NOVO:
                Intent it = new Intent(MainActivity.this, NovoActivity.class);
                startActivityForResult(it,NOVO);
            case SOBRE:

                break;
        }
       return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK){
            if (requestCode == NOVO){
                Lugar l = new Lugar (data.getStringExtra("NOME"),data.getStringExtra("DESC"));
                lugares.adicionarLugar(l);
                carregarLugares();

            }
        }
    }
    private class OnClickList implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent it = new Intent(MainActivity.this, LugarActivity.class);
            startActivityForResult(it,LUGAR);
            parent.getAdapter().getItem(position);
        }
    }


}
