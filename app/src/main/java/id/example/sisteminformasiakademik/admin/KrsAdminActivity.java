package id.example.sisteminformasiakademik.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import id.example.sisteminformasiakademik.R;

public class KrsAdminActivity extends AppCompatActivity {

    TextView txtidAdmin, txtNamaAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krs_admin);
        getSupportActionBar().hide();

        txtidAdmin = findViewById(R.id.txtIdAdminKrs);
        txtNamaAdmin = findViewById(R.id.txtNamaAdminKrs);

        Intent i = getIntent();
        String tNim = i.getStringExtra("id_admin");
        String tName = i.getStringExtra("nama");

        txtidAdmin.setText(tNim);
        txtNamaAdmin.setText(tName);
    }

    public void moveDashboardKrsData(View view){
        String idAdmin = txtidAdmin.getText().toString().trim();
        String namaAdmin = txtNamaAdmin.getText().toString().trim();
        Intent intent = new Intent(getApplicationContext(), DashboardAdminActivity.class);
        intent.putExtra("id_admin", idAdmin);
        intent.putExtra("nama", namaAdmin);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
    }

    public void onBackPressed() {
        String idAdmin = txtidAdmin.getText().toString().trim();
        String namaAdmin = txtNamaAdmin.getText().toString().trim();
        Intent intent = new Intent(getApplicationContext(), DashboardAdminActivity.class);
        intent.putExtra("id_admin", idAdmin);
        intent.putExtra("nama", namaAdmin);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();

    }
}