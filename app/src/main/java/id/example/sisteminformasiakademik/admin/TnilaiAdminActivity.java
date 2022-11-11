package id.example.sisteminformasiakademik.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import id.example.sisteminformasiakademik.R;

public class TnilaiAdminActivity extends AppCompatActivity {

    TextView txtidAdminTnilai, txtNamaAdminTnilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tnilai_admin);
        getSupportActionBar().hide();

        txtidAdminTnilai = findViewById(R.id.txtIdAdminTnilai);
        txtNamaAdminTnilai = findViewById(R.id.txtNamaAdminTnilai);

        Intent i = getIntent();
        String tNim = i.getStringExtra("id_admin");
        String tName = i.getStringExtra("nama");

        txtidAdminTnilai.setText(tNim);
        txtNamaAdminTnilai.setText(tName);
    }

    public void moveDashboardTnilai(View view){
        String idAdmin = txtidAdminTnilai.getText().toString().trim();
        String namaAdmin = txtNamaAdminTnilai.getText().toString().trim();
        Intent intent = new Intent(getApplicationContext(), DashboardAdminActivity.class);
        intent.putExtra("id_admin", idAdmin);
        intent.putExtra("nama", namaAdmin);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
    }

    public void onBackPressed() {
        String idAdmin = txtidAdminTnilai.getText().toString().trim();
        String namaAdmin = txtNamaAdminTnilai.getText().toString().trim();
        Intent intent = new Intent(getApplicationContext(), DashboardAdminActivity.class);
        intent.putExtra("id_admin", idAdmin);
        intent.putExtra("nama", namaAdmin);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();

    }
}