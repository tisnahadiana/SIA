package id.example.sisteminformasiakademik.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import id.example.sisteminformasiakademik.R;

public class UserAdminActivity extends AppCompatActivity {

    TextView txtidAdminDA, txtNamaAdminDA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_admin);
        getSupportActionBar().hide();

        txtidAdminDA = findViewById(R.id.txtIdAdminDA);
        txtNamaAdminDA = findViewById(R.id.txtNamaAdminDA);

        Intent i = getIntent();
        String tNim = i.getStringExtra("id_admin");
        String tName = i.getStringExtra("nama");

        txtidAdminDA.setText(tNim);
        txtNamaAdminDA.setText(tName);
    }

    public void moveDashboardAdminData(View view){
        String idAdmin = txtidAdminDA.getText().toString().trim();
        String namaAdmin = txtNamaAdminDA.getText().toString().trim();
        Intent intent = new Intent(getApplicationContext(), DashboardAdminActivity.class);
        intent.putExtra("id_admin", idAdmin);
        intent.putExtra("nama", namaAdmin);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
    }

    public void onBackPressed() {
        String idAdmin = txtidAdminDA.getText().toString().trim();
        String namaAdmin = txtNamaAdminDA.getText().toString().trim();
        Intent intent = new Intent(getApplicationContext(), DashboardAdminActivity.class);
        intent.putExtra("id_admin", idAdmin);
        intent.putExtra("nama", namaAdmin);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();

    }

}