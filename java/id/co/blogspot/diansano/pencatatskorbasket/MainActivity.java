package id.co.blogspot.diansano.pencatatskorbasket;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int skorTeamBiru = 0;
    int skorTeamMerah = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Tambahkan skor 1 untuk team Biru.
     */
    public void tambahSatuAngkaBiru(View v) {
        skorTeamBiru = skorTeamBiru + 1;
        tampilkanSkorTeamBiru(skorTeamBiru);
    }

    /**
     * Tambahkan skor 2 untuk team Biru.
     */
    public void tambahDuaAngkaBiru(View v) {
        skorTeamBiru = skorTeamBiru + 2;
        tampilkanSkorTeamBiru(skorTeamBiru);
    }

    /**
     * Tambahkan skor 3 untuk team Biru.
     */
    public void tambahTigaAngkaBiru(View v) {
        skorTeamBiru = skorTeamBiru + 3;
        tampilkanSkorTeamBiru(skorTeamBiru);
    }


    /**
     * Tambahkan skor 1 untuk team Merah.
     */
    public void tambahSatuAngkaMerah(View v) {
        skorTeamMerah = skorTeamMerah + 1;
        tampilkanSkorTeamMerah(skorTeamMerah);
    }

    /**
     * Tambahkan skor 2 untuk team Merah.
     */
    public void tambahDuaAngkaMerah(View v) {
        skorTeamMerah = skorTeamMerah + 2;
        tampilkanSkorTeamMerah(skorTeamMerah);
    }

    /**
     * Tambahkan skor 3 untuk team Merah.
     */
    public void tambahTigaAngkaMerah(View v) {
        skorTeamMerah = skorTeamMerah + 3;
        tampilkanSkorTeamMerah(skorTeamMerah);
    }

    /**
     * Tampilkan skor untuk team Biru.
     */
    public void tampilkanSkorTeamBiru(int skor) {
        TextView textViewSkor = (TextView) findViewById(R.id.skor_team_biru);
        textViewSkor.setText(String.valueOf(skor));
    }

    /**
     * Tampilkan skor untuk team Merah.
     */
    public void tampilkanSkorTeamMerah(int skor) {
        TextView textViewSkor = (TextView) findViewById(R.id.skor_team_merah);
        textViewSkor.setText(String.valueOf(skor));
    }

    /**
     * Me-reset skor untuk kedua team
     */
    public void resetSkor(View v) {
        skorTeamBiru = 0;
        skorTeamMerah = 0;
        tampilkanSkorTeamBiru(skorTeamBiru);
        tampilkanSkorTeamMerah(skorTeamMerah);
    }
}
