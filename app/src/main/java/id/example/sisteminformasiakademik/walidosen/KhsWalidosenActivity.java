package id.example.sisteminformasiakademik.walidosen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import id.example.sisteminformasiakademik.R;

public class KhsWalidosenActivity extends AppCompatActivity {

    TextView txtNidnKHS, txtNamaWaldosKHS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khs_walidosen);
        getSupportActionBar().hide();

        txtNidnKHS = findViewById(R.id.txtNIDNkhs);
        txtNamaWaldosKHS = findViewById(R.id.txtNamaWaldosKhs);

        Intent i = getIntent();
        String tNim = i.getStringExtra("nidn");
        String tName = i.getStringExtra("namaDosen");

        txtNidnKHS.setText(tNim);
        txtNamaWaldosKHS.setText(tName);
    }

    public void moveDashboardKHSWaldos(View view){
        String idAdmin = txtNidnKHS.getText().toString().trim();
        String namaAdmin = txtNamaWaldosKHS.getText().toString().trim();
        Intent intent = new Intent(getApplicationContext(), DashboardWalidosenActivity.class);
        intent.putExtra("nidn", idAdmin);
        intent.putExtra("namaDosen", namaAdmin);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
    }

    public void onBackPressed() {
        String idAdmin = txtNidnKHS.getText().toString().trim();
        String namaAdmin = txtNamaWaldosKHS.getText().toString().trim();
        Intent intent = new Intent(getApplicationContext(), DashboardWalidosenActivity.class);
        intent.putExtra("nidn", idAdmin);
        intent.putExtra("namaDosen", namaAdmin);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();

    }
}