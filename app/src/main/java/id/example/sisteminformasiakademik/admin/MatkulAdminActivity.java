package id.example.sisteminformasiakademik.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import id.example.sisteminformasiakademik.R;

public class MatkulAdminActivity extends AppCompatActivity {

    TextView txtidAdminMatkul, txtNamaAdminMatkul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matkul_admin);
        getSupportActionBar().hide();

        txtidAdminMatkul = findViewById(R.id.txtIdAdminMatkul);
        txtNamaAdminMatkul = findViewById(R.id.txtNamaAdminMatkul);

        Intent i = getIntent();
        String tNim = i.getStringExtra("id_admin");
        String tName = i.getStringExtra("nama");

        txtidAdminMatkul.setText(tNim);
        txtNamaAdminMatkul.setText(tName);
    }

    public void moveDashboardMatkul(View view){
        String idAdmin = txtidAdminMatkul.getText().toString().trim();
        String namaAdmin = txtNamaAdminMatkul.getText().toString().trim();
        Intent intent = new Intent(getApplicationContext(), DashboardAdminActivity.class);
        intent.putExtra("id_admin", idAdmin);
        intent.putExtra("nama", namaAdmin);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
    }

    public void onBackPressed() {
        String idAdmin = txtidAdminMatkul.getText().toString().trim();
        String namaAdmin = txtNamaAdminMatkul.getText().toString().trim();
        Intent intent = new Intent(getApplicationContext(), DashboardAdminActivity.class);
        intent.putExtra("id_admin", idAdmin);
        intent.putExtra("nama", namaAdmin);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();

    }
}