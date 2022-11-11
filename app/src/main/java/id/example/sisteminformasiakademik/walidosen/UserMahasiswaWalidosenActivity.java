package id.example.sisteminformasiakademik.walidosen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import id.example.sisteminformasiakademik.R;
import id.example.sisteminformasiakademik.admin.DashboardAdminActivity;

public class UserMahasiswaWalidosenActivity extends AppCompatActivity {

    TextView txtNidnDM, txtNamaWaldosDM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_mahasiswa_walidosen);
        getSupportActionBar().hide();

        txtNidnDM = findViewById(R.id.txtNIDNDataMHS);
        txtNamaWaldosDM = findViewById(R.id.txtNamaWaldosDataMHS);

        Intent i = getIntent();
        String tNim = i.getStringExtra("nidn");
        String tName = i.getStringExtra("namaDosen");

        txtNidnDM.setText(tNim);
        txtNamaWaldosDM.setText(tName);
    }

    public void moveDashboardDMWaldos(View view){
        String idAdmin = txtNidnDM.getText().toString().trim();
        String namaAdmin = txtNamaWaldosDM.getText().toString().trim();
        Intent intent = new Intent(getApplicationContext(), DashboardWalidosenActivity.class);
        intent.putExtra("nidn", idAdmin);
        intent.putExtra("namaDosen", namaAdmin);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
    }

    public void onBackPressed() {
        String idAdmin = txtNidnDM.getText().toString().trim();
        String namaAdmin = txtNamaWaldosDM.getText().toString().trim();
        Intent intent = new Intent(getApplicationContext(), DashboardWalidosenActivity.class);
        intent.putExtra("nidn", idAdmin);
        intent.putExtra("namaDosen", namaAdmin);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();

    }
}