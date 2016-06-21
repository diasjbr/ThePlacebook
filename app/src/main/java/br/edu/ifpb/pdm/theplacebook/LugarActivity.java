package br.edu.ifpb.pdm.theplacebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

public class LugarActivity extends AppCompatActivity {
private TextView tvNome, tvDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugar);
        this.tvNome = (TextView) findViewById(R.id.etNome);
        this.tvDesc = (TextView)findViewById(R.id.etDesc);
        this.setValores();

    }
    public boolean onTouchEvent(MotionEvent event){
        this.finish();
        return super.onTouchEvent(event);
    }
    public void setValores(){
    this.tvNome.setText("Nome1");
    this.tvDesc.setText("desc1");
    }
}
