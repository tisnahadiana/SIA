package id.example.sisteminformasiakademik.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import id.example.sisteminformasiakademik.R;

public class KhsAdminActivity extends AppCompatActivity {

    TextView txtidAdminKhs, txtNamaAdminKhs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khs_admin);
        getSupportActionBar().hide();

        txtidAdminKhs = findViewById(R.id.txtIdAdminKHS);
        txtNamaAdminKhs = findViewById(R.id.txtNamaAdminKHS);

        Intent i = getIntent();
        String tNim = i.getStringExtra("id_admin");
        String tName = i.getStringExtra("nama");

        txtidAdminKhs.setText(tNim);
        txtNamaAdminKhs.setText(tName);
    }

    public void moveDashboardKhs(View view){
        String idAdmin = txtidAdminKhs.getText().toString().trim();
        String namaAdmin = txtNamaAdminKhs.getText().toString().trim();
        Intent intent = new Intent(getApplicationContext(), DashboardAdminActivity.class);
        intent.putExtra("id_admin", idAdmin);
        intent.putExtra("nama", namaAdmin);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
    }

    public void onBackPressed() {
        String idAdmin = txtidAdminKhs.getText().toString().trim();
        String namaAdmin = txtNamaAdminKhs.getText().toString().trim();
        Intent intent = new Intent(getApplicationContext(), DashboardAdminActivity.class);
        intent.putExtra("id_admin", idAdmin);
        intent.putExtra("nama", namaAdmin);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();

    }
}