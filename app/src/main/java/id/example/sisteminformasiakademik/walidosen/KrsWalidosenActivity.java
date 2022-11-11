package id.example.sisteminformasiakademik.walidosen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import id.example.sisteminformasiakademik.R;
import id.example.sisteminformasiakademik.admin.DashboardAdminActivity;

public class KrsWalidosenActivity extends AppCompatActivity {

    TextView txtNidnKRS, txtNamaWaldosKRS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krs_walidosen);
        getSupportActionBar().hide();

        txtNidnKRS = findViewById(R.id.txtNIDNkrs);
        txtNamaWaldosKRS = findViewById(R.id.txtNamaWaldosKrs);

        Intent i = getIntent();
        String tNim = i.getStringExtra("nidn");
        String tName = i.getStringExtra("namaDosen");

        txtNidnKRS.setText(tNim);
        txtNamaWaldosKRS.setText(tName);
    }

    public void moveDashboardKRSWaldos(View view){
        String idAdmin = txtNidnKRS.getText().toString().trim();
        String namaAdmin = txtNamaWaldosKRS.getText().toString().trim();
        Intent intent = new Intent(getApplicationContext(), DashboardWalidosenActivity.class);
        intent.putExtra("nidn", idAdmin);
        intent.putExtra("namaDosen", namaAdmin);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
    }

    public void onBackPressed() {
        String idAdmin = txtNidnKRS.getText().toString().trim();
        String namaAdmin = txtNamaWaldosKRS.getText().toString().trim();
        Intent intent = new Intent(getApplicationContext(), DashboardWalidosenActivity.class);
        intent.putExtra("nidn", idAdmin);
        intent.putExtra("namaDosen", namaAdmin);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();

    }
}