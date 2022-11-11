package id.example.sisteminformasiakademik.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import id.example.sisteminformasiakademik.R;
import id.example.sisteminformasiakademik.user.DashboardActivity;
import id.example.sisteminformasiakademik.user.menu.MenuActivity;

public class UserMahasiswaAdminActivity extends AppCompatActivity {

    TextView txtidAdmin, txtNamaAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_mahasiswa_admin);
        getSupportActionBar().hide();

        txtidAdmin = findViewById(R.id.txtIdAdminDM);
        txtNamaAdmin = findViewById(R.id.txtNamaAdminDM);

        Intent i = getIntent();
        String tNim = i.getStringExtra("id_admin");
        String tName = i.getStringExtra("nama");

        txtidAdmin.setText(tNim);
        txtNamaAdmin.setText(tName);
    }

    public void moveDashboardMhsData(View view){
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