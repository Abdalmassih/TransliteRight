package com.project2.abd.transliteright;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {


    private ArrayList<Integer> partialTransIndexes = new ArrayList<>();
    private ArrayList<String> partialTransLetters = new ArrayList<>();

    public SQLiteDatabase transliteDB = null;


    public SQLiteDatabase getTransliteDB() {
        return transliteDB;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) throws SQLiteException {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onSwitch();


    /*    transliteDB = openOrCreateDatabase("transliteDB", MODE_PRIVATE, null);
        transliteDB.execSQL("CREATE TABLE IF NOT EXISTS  costs  (\n" +
                "  \"letter\" varchar(9) NOT NULL,\n" +
                "  \"sub_with_a\" float DEFAULT NULL,\n" +
                "  \"sub_with_b\" float DEFAULT NULL,\n" +
                "  \"sub_with_c\" float DEFAULT NULL,\n" +
                "  \"sub_with_d\" float DEFAULT NULL,\n" +
                "  \"sub_with_e\" float DEFAULT NULL,\n" +
                "  \"sub_with_f\" float DEFAULT NULL,\n" +
                "  \"sub_with_g\" float DEFAULT NULL,\n" +
                "  \"sub_with_h\" float DEFAULT NULL,\n" +
                "  \"sub_with_i\" float DEFAULT NULL,\n" +
                "  \"sub_with_j\" float DEFAULT NULL,\n" +
                "  \"sub_with_k\" float DEFAULT NULL,\n" +
                "  \"sub_with_l\" float DEFAULT NULL,\n" +
                "  \"sub_with_m\" float DEFAULT NULL,\n" +
                "  \"sub_with_n\" float DEFAULT NULL,\n" +
                "  \"sub_with_o\" float DEFAULT NULL,\n" +
                "  \"sub_with_p\" float DEFAULT NULL,\n" +
                "  \"sub_with_q\" float DEFAULT NULL,\n" +
                "  \"sub_with_r\" float DEFAULT NULL,\n" +
                "  \"sub_with_s\" float DEFAULT NULL,\n" +
                "  \"sub_with_t\" float DEFAULT NULL,\n" +
                "  \"sub_with_u\" float DEFAULT NULL,\n" +
                "  \"sub_with_v\" float DEFAULT NULL,\n" +
                "  \"sub_with_w\" float DEFAULT NULL,\n" +
                "  \"sub_with_x\" float DEFAULT NULL,\n" +
                "  \"sub_with_y\" float DEFAULT NULL,\n" +
                "  \"sub_with_z\" float DEFAULT NULL,\n" +
                "  \"sub_with_ch\" float DEFAULT NULL,\n" +
                "  \"sub_with_ph\" float DEFAULT NULL,\n" +
                "  \"sub_with_gh\" float DEFAULT NULL,\n" +
                "  \"sub_with_kh\" float DEFAULT NULL,\n" +
                "  \"sub_with_ee\" float DEFAULT NULL,\n" +
                "  \"sub_with_ie\" float DEFAULT NULL,\n" +
                "  \"sub_with_ei\" float DEFAULT NULL,\n" +
                "  \"sub_with_aa\" float DEFAULT NULL,\n" +
                "  \"sub_with_ou\" float DEFAULT NULL,\n" +
                "  \"sub_with_th\" float DEFAULT NULL,\n" +
                "  \"sub_with_dh\" float DEFAULT NULL,\n" +
                "  \"sub_with_oo\" float DEFAULT NULL,\n" +
                "  \"sub_with_ea\" float DEFAULT NULL,\n" +
                "  \"sub_with_ai\" float DEFAULT NULL,\n" +
                "  \"sub_with_ck\" float DEFAULT NULL,\n" +
                "  \"sub_with_ey\" float DEFAULT NULL,\n" +
                "  \"insert\" float DEFAULT NULL,\n" +
                "  \"delete\" float DEFAULT NULL,\n" +
                "  \"doubled\" float DEFAULT '0.2',\n" +
                "  \"sub_with_sh\" float DEFAULT NULL,\n" +
                "  \"sub_with_ce\" float DEFAULT '1',\n" +
                "  \"sub_with_ci\" float DEFAULT '1',\n" +
                "  \"sub_with_cy\" float DEFAULT '1',\n" +
                "  PRIMARY KEY (\"letter\")\n" +
                ");");
       transliteDB.execSQL("INSERT  INTO `costs`  (`letter`, `sub_with_a`, `sub_with_b`, `sub_with_c`, `sub_with_d`, `sub_with_e`, `sub_with_f`, `sub_with_g`, `sub_with_h`, `sub_with_i`, `sub_with_j`, `sub_with_k`, `sub_with_l`, `sub_with_m`, `sub_with_n`, `sub_with_o`, `sub_with_p`, `sub_with_q`, `sub_with_r`, `sub_with_s`, `sub_with_t`, `sub_with_u`, `sub_with_v`, `sub_with_w`, `sub_with_x`, `sub_with_y`, `sub_with_z`, `sub_with_ch`, `sub_with_ph`, `sub_with_gh`, `sub_with_kh`, `sub_with_ee`, `sub_with_ie`, `sub_with_ei`, `sub_with_aa`, `sub_with_ou`, `sub_with_th`, `sub_with_dh`, `sub_with_oo`, `sub_with_ea`, `sub_with_ai`, `sub_with_ck`, `sub_with_ey`, `insert`, `delete`, `doubled`, `sub_with_sh`, `sub_with_ce`, `sub_with_ci`, `sub_with_cy`) VALUES"
                + " ('a', 0, 1, 1, 1, 0.5, 1, 1, 0.9, 0.8, 1, 1, 1, 1, 1, 0.8, 1, 1, 1, 1, 1, 0.8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.9, 0.8, 0.8, 0.2, 0.9, 1, 1, 0.9, 0.7, 0.6, 1, 0.8, 0.1, 0.1, 0.2, 1, 1, 1, 1),"
                + "  ('aa', 0.1, 1, 1, 1, 0.9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.8, 1, 1, 1, 1, 1, 0.8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.9, 0.8, 0.8, 0, 0.9, 1, 1, 1, 0.9, 0.8, 1, 0.8, 0.5, 0.5, 1, 1, 1, 1, 1),"
                + "   ('ai', 0.5, 1, 1, 1, 0.4, 1, 1, 1, 0.7, 1, 1, 1, 1, 1, 0.7, 1, 1, 1, 1, 1, 0.9, 1, 1, 1, 0.7, 1, 1, 1, 1, 1, 0.5, 0.5, 0.5, 0.8, 0.9, 1, 1, 0.9, 0.5, 0, 1, 0.2, 0.7, 0.7, 0.8, 1, 1, 1, 1),"
                + "  ('b', 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.3, 1, 1, 1, 1, 1, 0.9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.2, 1, 1, 1, 1),"
                + "  ('c', 1, 1, 0, 1, 1, 1, 0.5, 1, 1, 1, 0.1, 1, 1, 1, 1, 1, 0.8, 1, 0.9, 1, 1, 1, 1, 1, 1, 1, 0.6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.2, 1, 1, 1, 0.2, 1, 1, 1, 1),"
                + "   ('ce', 1, 1, 0.6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),"
                + "   ('ch', 1, 1, 0.6, 1, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0.9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 0.6, 0.3, 1, 1, 1),"
                + "   ('ci', 1, 1, 0.7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),"
                + "   ('ck', 1, 1, 0.4, 1, 1, 1, 0.8, 1, 1, 1, 0.1, 1, 1, 1, 1, 1, 0.1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.4, 1, 1, 0.8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1),"
                + " ('cy', 1, 1, 0.8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.2, 0.1, 0),"
                + "  ('d', 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.7, 1, 1, 1, 1, 1, 0.8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.9, 0.7, 1, 1, 1, 1, 1, 1, 1, 0.2, 1, 1, 1, 1),"
                + "   ('dh', 1, 1, 1, 0.3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.5, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),"
                + "     ('doubled', 0.2, 0.2, 0.2, 0.2, 0.2, 0.2, 0.2, 0.2, 0.2, 0.2, 0.2, 0.2, 0.2, 0.2, 0.2, 0.2, 0.2, 0.2, 0.2, 0.2, 0.8, 0.2, 0.2, 0.8, 0.2, 0.2, 0.4, 0.8, 0.8, 0.8, 0.8, 0.8, 0.8, 0.5, 0.5, 0.9, 0.9, 0.8, 0.9, 0.9, 0.9, 0.9, 0.7, 0.7, 0, 0.7, 1, 1, 1),"
                + "   ('e', 0.5, 1, 1, 1, 0, 1, 1, 1, 0.1, 0.9, 1, 1, 1, 1, 0.8, 1, 1, 1, 1, 1, 0.7, 1, 1, 1, 0.5, 1, 1, 1, 1, 1, 0.3, 0.3, 0.3, 1, 1, 1, 1, 1, 0.3, 0.7, 1, 0.3, 0.2, 0.2, 0.2, 1, 1, 1, 1),"
                + " ('ea', 0.8, 1, 1, 1, 0.2, 1, 1, 1, 0.2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.9, 1, 1, 1, 0.5, 1, 1, 1, 1, 1, 0.2, 0.2, 0.2, 1, 1, 1, 1, 1, 0, 0.6, 1, 0.3, 0.5, 0.5, 0.8, 1, 1, 1, 1),"
                + " ('ee', 0.8, 1, 1, 1, 0.2, 1, 1, 0.7, 0.2, 1, 1, 1, 1, 1, 0.9, 1, 1, 1, 1, 1, 0.9, 1, 1, 1, 0.2, 1, 1, 1, 1, 1, 0, 0.2, 0.2, 1, 1, 1, 1, 1, 0.3, 0.9, 1, 0.5, 0.6, 0.6, 1, 1, 1, 1, 1),"
                + "  ('ei', 1, 1, 1, 1, 0.2, 1, 1, 1, 0.2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.8, 1, 1, 1, 0.4, 1, 1, 1, 1, 1, 0.2, 0.2, 0, 0.9, 1, 1, 1, 1, 0.5, 0.2, 1, 0.1, 0.7, 0.7, 0.8, 1, 1, 1, 1),"
                + "    ('ey', 0.5, 1, 1, 1, 0.3, 1, 1, 1, 0.2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.7, 1, 1, 1, 0.2, 1, 1, 1, 1, 1, 0.2, 0.6, 0.2, 1, 1, 1, 1, 1, 0.2, 0.2, 1, 0, 0.5, 0.5, 0.8, 1, 1, 1, 1),"
                + " ('f', 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.8, 1, 1, 1, 1, 1, 0.1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.2, 1, 1, 1, 1),"
                + " ('g', 1, 1, 1, 1, 1, 1, 0, 1, 1, 0.3, 0.8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.8, 1, 1, 1, 0.2, 1, 1, 1, 1),"
                + " ('gh', 1, 1, 1, 1, 1, 1, 0.3, 1, 1, 0.9, 0.8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.8, 1, 1, 1, 0.7, 1, 1, 1, 1),"
                + "  ('h', 0.9, 1, 1, 1, 0.9, 1, 1, 0, 0.9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.9, 0.7, 0.8, 1, 1, 1, 1, 1, 0.8, 0.9, 1, 0.9, 0.7, 0.7, 0.2, 1, 1, 1, 1),"
                + "  ('i', 0.8, 1, 1, 1, 0.1, 1, 1, 0.9, 0, 0.9, 1, 1, 1, 1, 0.8, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 0.1, 1, 1, 1, 1, 1, 0.2, 0.2, 0.2, 1, 1, 1, 1, 1, 0.2, 0.4, 1, 0.2, 0.2, 0.2, 0.2, 1, 1, 1, 1),"
                + "  ('ie', 1, 1, 1, 1, 0.3, 1, 1, 1, 0.2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.2, 0, 0.2, 1, 1, 1, 1, 1, 0.2, 0.8, 1, 0.3, 0.7, 0.7, 0.9, 1, 1, 1, 1),"
                + "  ('j', 1, 1, 1, 1, 0.9, 1, 0.2, 1, 0.9, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.2, 1, 1, 1, 1),"
                + "  ('k', 1, 1, 0.3, 1, 1, 1, 0.9, 1, 1, 1, 0, 0.9, 1, 1, 1, 1, 0.3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.2, 1, 1, 1, 0.2, 1, 1, 1, 1),"
                + "   ('kh', 1, 1, 0.7, 1, 1, 1, 1, 1, 1, 1, 0.3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.9, 1, 1, 1, 0.8, 1, 1, 1, 1),"
                + "   ('l', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.2, 1, 1, 1, 1),"
                + "   ('m', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.2, 1, 1, 1, 1),"
                + "   ('n', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.2, 1, 1, 1, 1),"
                + "   ('o', 0.8, 1, 1, 1, 0.5, 1, 1, 1, 0.8, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0.3, 1, 0.2, 1, 1, 1, 1, 1, 1, 1, 0.9, 0.9, 0.9, 0.9, 0.2, 1, 1, 0.1, 1, 0.9, 1, 1, 0.2, 0.2, 0.2, 1, 1, 1, 1),"
                + "   ('oo', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.1, 1, 1, 1, 1, 1, 0.3, 1, 0.4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.1, 1, 1, 0, 1, 1, 1, 1, 0.6, 0.6, 0.8, 1, 1, 1, 1),"
                + "   ('ou', 0.8, 1, 1, 1, 0.8, 1, 1, 1, 0.9, 1, 1, 1, 1, 1, 0.1, 1, 1, 1, 1, 1, 0.3, 1, 0.4, 1, 1, 1, 1, 1, 1, 1, 0.9, 0.9, 0.9, 0.9, 0, 1, 1, 0.1, 0.9, 0.9, 1, 0.9, 0.6, 0.6, 0.8, 1, 1, 1, 1),"
                + "   ('p', 1, 0.3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.2, 1, 1, 1, 1),"
                + "    ('ph', 1, 0.9, 1, 1, 1, 0.2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.8, 1, 1, 1, 1),"
                + "     ('q', 1, 1, 0.6, 1, 1, 1, 0.9, 1, 1, 1, 0.2, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.8, 1, 1, 1, 0.2, 1, 1, 1, 1),"
                + "      ('r', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.2, 1, 1, 1, 1),"
                + "     ('s', 1, 1, 0.5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0.9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.2, 1, 0.1, 0.2, 0.4),"
                + "  ('sh', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.4, 0, 1, 1, 1),"
                + "   ('t', 1, 1, 1, 0.8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.2, 1, 1, 1, 1),"
                + "   ('th', 1, 1, 1, 0.8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 1, 1, 0.3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0.2, 1, 1, 1, 1, 1, 1, 1, 0.8, 1, 1, 1, 1),"
                + "    ('u', 0.6, 1, 1, 1, 0.6, 1, 1, 1, 0.7, 1, 1, 1, 1, 1, 0.2, 1, 1, 1, 1, 1, 0, 1, 0.8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.2, 1, 1, 0.6, 0.8, 0.9, 1, 0.9, 0.2, 0.2, 0.2, 1, 1, 1, 1),"
                + "    ('v', 1, 1, 1, 1, 1, 0.8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0.8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.2, 1, 1, 1, 1),"
                + "    ('w', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.4, 1, 1, 1, 1, 1, 0.9, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.5, 1, 1, 0.6, 1, 0.8, 1, 1, 0.9, 0.9, 0.2, 1, 1, 1, 1),"
                + "    ('x', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.2, 1, 1, 1, 1),"
                + "    ('y', 1, 1, 1, 1, 0.4, 1, 1, 1, 0.2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.9, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0.5, 0.5, 0.5, 1, 1, 1, 1, 1, 0.5, 0.8, 1, 0.4, 0.9, 0.9, 0.2, 1, 1, 1, 1),"
                + "    ('z', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.8, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.2, 1, 1, 1, 1);");
*/

        transliteDB = openOrCreateDatabase("transliteDB", MODE_PRIVATE, null);

//        transliteDB.execSQL("DROP TABLE IF EXISTS `namesMap`", null);


        transliteDB.execSQL("CREATE TABLE IF NOT EXISTS namesMap  (" +

                "  \"nameID\" int,\n" +
                "  \"enName\" varchar(20) NOT NULL,\n" +
                "  \"arName\" varchar(20) NOT NULL,\n" +
                "  \"cluster\" int DEFAULT '1',\n" +


                "  PRIMARY KEY (\"nameID\")\n" +
                ");");

        transliteDB.delete("namesMap", "1", null);


        transliteDB.execSQL("INSERT  INTO `namesMap`  (`enName`, `arName` ) VALUES"


//                + " ('sami', '????????', '9'),"

//
//                + "  ('hussein', '????????',1 ),"
//                + "  ('jumana', '??????????', 2 ),"
//                + "  ('abd', '??????', 4 ),"
//                + "  ('abdalmassih', '?????? ????????????', 5 ),"
//                + "  ('tarek', '????????', 6),"
//                + "  ('tareq', '????????', 3),"
//                + "  ('zuheir', '????????', 8),"
//                + "  ('abdullah', '??????????????', 9),"
//                + "  ('zuher', '????????', 8),"
//                + " ('suher', '????????', '7'),"

                + "  ('hussein', '????????'),"
                + "  ('jumana', '??????????'),"
                + "  ('abd', '??????'),"
                + "  ('tarek', '????????'),"
                + "  ('zuheir', '????????'),"
                + "  ('zuher', '????????'),"
                + "  ('abdullah', '??????????????'),"
                + "  ('abd almassih', '??????????????????'),"
                + "  ('suher', '????????'),"
                + "  ('sami', '????????'),"
                + "  ('ammar', '????????'),"

                + "  ('maissaa', '??????????'),"
                + "  ('maysa', '??????????'),"
                + "  ('moumen', '????????'),"
                + "  ('ali', '??????'),"
                + "  ('muhammad', '????????'),"
                + "  ('ahmad', '????????'),"
                + "  ('mahmoud', '??????????'), "
                + "  ('hamed', '????????'), "
                + "  ('maher', '????????'), "
                + "  ('maha', '??????'), "
                + "  ('mahran', '??????????'), "
                + "  ('hala', '??????'), "
                + "  ('hala', '??????'), "
                + "  ('hala', '????????'), "
                + "  ('alaa', '????????'), "
                + "  ('alaa', '????????'), "
                + "  ('amina', '??????????'), "
                + "  ('mirna', '??????????'), "
                + "  ('aya', '??????'), "
                + "  ('sali', '????????'), "
                + "  ('zena', '????????'), "
                + "  ('amira', '??????????'), "
                + "  ('fareed', '????????'), "
                + "  ('karim', '????????'), "
                + "  ('ghaith', '??????'), "
                + "  ('ghais', '??????'), "
                + "  ('mamdouh', '??????????'), "
                + "  ('george', '????????'), "
                + "  ('louay', '??????'), "
                + "  ('wael', '????????'), "
                + "  ('saleem', '????????'), "
                + "  ('samer', '????????'), "
                + "  ('asaad', '????????'), "
                + "  ('saad', '??????'), "
                + "  ('thaer', '????????'), "
                + "  ('hani', '????????'), "
                + "  ('shadi', '????????'), "
                + "  ('madlen', '????????????'), "
                + "  ('bassem', '????????'), "
                + "  ('bassel', '????????'), "
                + "  ('khaled', '????????'), "
                + "  ('ayman', '????????'), "
                + "  ('aiman', '????????'), "
                + "  ('mazen', '????????'), "
                + "  ('nazeer', '????????'), "
                + "  ('natheer', '????????'), "
                + "  ('firas', '????????'), "
                + "  ('amani', '??????????'), "
                + "  ('muna', '??????'), "
                + "  ('lama', '??????'), "
                + "  ('faten', '????????'), "
                + "  ('raafat', '????????'), "
                + "  ('masoud', '??????????'), "
                + "  ('manar', '????????'), "
                + "  ('lina', '????????'), "
                + "  ('leen', '??????'), "

                + "  ('bashar', '????????'), "
                + "  ('kazem', '????????'), "
                + "  ('hanaa', '????????'), "
                + "  ('fadia', '??????????'), "
                + "  ('lubna', '????????'), "
                + "  ('ulfat', '????????'), "
                + "  ('talaat', '????????'), "
                + "  ('ameena', '??????????'), "
                + "  ('amena', '????????'), "

                + "  ('bassema', '??????????'), "
                + "  ('lolo', '????????'), "
                + "  ('lulu', '????????'), "
                + "  ('siham', '????????'), "
                + "  ('arwa', '????????'), "
                + "  ('lubaba', '??????????'), "
                + "  ('alice', '????????'), "
                + "  ('rania', '??????????'), "
                + "  ('eatidal', '????????????'), "
                + "  ('baker', '??????'), "
                + "  ('lamees', '????????'), "
                + "  ('buthaina', '????????'), "
                + "  ('jaafar', '????????'), "

                + "  ('sawsan', '????????'), "
                + "  ('aamer', '????????'), "
                + "  ('michael', '??????????'), "
                + "  ('michel', '??????????'), "
                + "  ('marwan', '??????????'), "
                + "  ('waleed', '????????'), "
                + "  ('ezzat', '??????'), "
                + "  ('munir', '????????'), "
                + "  ('samia', '??????????'), "
                + "  ('marissa', '????????????'), "
                + "  ('luna', '????????'), "
                + "  ('saada', '????????'), "
                + "  ('tameem', '????????'), "
                + "  ('nasser', '????????'), "
                + "  ('naser', '????????'), "
                + "  ('alkama', '??????????'), "

                + "  ('waheed', '????????'), "
                + "  ('islam', '??????????'), "
                + "  ('aghiad', '????????'), "
                + "  ('toni', '????????'), "
                + "  ('salah', '????????'), "
                + "  ('saleh', '????????'), "

                + "  ('tony', '????????'), "
                + "  ('mehiar', '??????????'), "
                + "  ('abbas', '????????'), "
                + "  ('sophia', '??????????'), "

                + "  ('hamza', '????????'), "
                + "  ('hadi', '????????'), "
                + "  ('sindebad', '????????????'), "
                + "  ('hameeda', '??????????'), "
                + "  ('carla', '??????????'), "
                + "  ('walaa', '????????'), "
                + "  ('azaheer', '????????????'), "
                + "  ('zahra', '????????'), "
                + "  ('obama', '????????????'), "


                + "  ('orwa', '????????'), "
                + "  ('sulaiman', '????????????'), "
                + "  ('batoul', '????????'), "
                + "  ('shireen', '??????????'), "
                + "  ('fatina', '??????????'), "
                + "  ('rawan', '????????'), "
                + "  ('fabiolla', '??????????????'), "
                + "  ('raghad', '??????'), "
                + "  ('sameer', '????????'), "
                + "  ('ismaeel', '??????????????'), "
                + "  ('ismael', '??????????????'), "
                + "  ('sulaf', '????????'), "
                + "  ('ibrahim', '??????????????'), "
                + "  ('ibraheem', '??????????????'), "
                + "  ('rooney', '????????'), "
                + "  ('roni', '????????'), "
                + "  ('rafi', '????????'), "
                + "  ('khouloud', '????????'), "
                + "  ('khuloud', '????????'), "
                + "  ('kifah', '????????'), "
                + "  ('kareem', '????????'), "
                + "  ('karim', '????????'), "
                + "  ('karam', '??????'), "
                + "  ('hanadi', '??????????'), "
                + "  ('rami', '????????'), "


                + "  ('raghda', '????????'), "
                + "  ('tamer', '????????'), "
                + "  ('fouad', '????????'), "
                + "  ('abdulrazak', '??????????????????'), "
                + "  ('abdulmajeed', '??????????????????'), "
                + "  ('abd almassih', '??????????????????'), "

                + "  ('lubaba', '??????????'), "
                + "  ('basheer', '????????'), "
                + "  ('besher', '??????'), "
                + "  ('rani', '????????'), "
                + "  ('rama', '????????'), "
                + "  ('bdour', '????????'), "
                + "  ('rafi', '????????'), "

                + "  ('budour', '????????'), "
                + "  ('omaima', '??????????'), "
                + "  ('umaima', '??????????'), "
                + "  ('alan', '????????'), "
                + "  ('zaher', '????????'), "
                + "  ('suhel', '????????'), "
                + "  ('ziad', '????????'), "
                + "  ('joseph', '??????????'), "
                + "  ('milad', '??????????'), "
                + "  ('fareed', '????????'), "

                + "  ('wajeeh', '????????'), "
                + "  ('kamel', '????????'), "
                + "  ('kamal', '????????'), "
//                + "  ('kamar', '??????'), "
//                + "  ('qamar', '??????'), "
                + "  ('eyad', '????????'), "
                + "  ('kinan', '????????'), "
                + "  ('mahfoud', '??????????'), "
                + "  ('mahfouz', '??????????'), "
                + "  ('mahfoudh', '??????????'), "
                + "  ('kinana', '??????????'), "
                + "  ('fahed', '??????'), "
                + "  ('fahd', '??????'), "
                + "  ('elias', '??????????'), "
                + "  ('suha', '??????'), "


                + "  ('hania', '??????????'), "
                + "  ('rania', '??????????'), "

                + "  ('arwa', '????????'), "
                + "  ('marwa', '????????'), "

                + "  ('fidel', '??????????'), "
                + "  ('taleb', '????????'), "
                + "  ('mudar', '??????'), "

                + "  ('selena', '????????????'), "
                + "  ('christina', '????????????????'), "
                + "  ('christin', '??????????????'), "
                + "  ('christine', '??????????????'), "


                + "  ('rana', '??????'), "
                + "  ('sandouk', '??????????'), "
                + "  ('joukhadar', '????????????'), "
                + "  ('amjad', '????????'), "
                + "  ('majed', '????????'), "
                + "  ('majd', '??????'), "
                + "  ('ayham', '????????'), "
                + "  ('aiham', '????????'), "
                + "  ('obada', '??????????'), "
                + "  ('othman', '??????????'), "

                + "  ('ghadeer', '????????'), "
                + "  ('omar', '??????'), "
                + "  ('naji', '????????'), "
                + "  ('zahi', '????????'), "
                + "  ('zahran', '??????????'), "


                + "  ('lilas', '??????????'), "
                + "  ('aaref', '????????'), "
                + "  ('abboud', '????????'), "
                + "  ('rakan', '??????????'), "
                + "  ('laila', '????????'), "
                + "  ('maisa', '??????????'), "
                + "  ('shuaib', '????????'), "
                + "  ('mashhour', '??????????'), "


                + " ('maissaa', '??????????'), "
                + " ('intesar', '????????????'), "
                + " ('sabah','????????'), "

                + " ('safaa', '????????'), "
                + " ('seba', '??????'), "
                + " ('safouan','??????????'), "
                + " ('safwan','??????????'), "

                + " ('sabiha', '??????????'), "
                + " ('samah', '????????'), "
                + " ('farah', '??????'), "
                + " ('saeb','????????'), "
                + " ('saber','????????'), "
                + " ('sabir','????????'), "
                + " ('sabeer','????????'), "

                + " ('sadek', '????????'), "
                + " ('sarem','????????'), "
                + " ('safy', '????????'), "
                + " ('saleh','????????'), "
                + " ('subhi','????????'), "
                + " ('sabri','????????'), "
                + " ('sakher', '??????'), "
                + " ('saddam', '????????'), "
                + " ('sudki', '????????'), "
                + " ('safwat', '????????'), "
                + " ('salah', '????????'), "
                + " ('saker','??????'), "
                + " ('musaab', '????????'), "
                + " ('suhib','???????? '), "
                + " ('soufia', '??????????'), "
                + " ('duha', '??????'), "
                + " ('diaa', '????????'), "
                + " ('taha', '????'), "
                + " ('tala', '????????'), "
                + " ('taher', '????????'), "
                + " ('tala', '????????'), "
                + " ('turfa', '????????'), "
                + " ('tahera', '??????????'), "
                + " ('insaf', '??????????'), "
                + " ('inssaf', '??????????'), "
                + " ('tania', '??????????'), "
                + " ('raduan', '??????????'), "
                + " ('ramadan', '??????????'), "
                + " ('rukaia', '????????'), "
                + " ('rukaiya', '????????'), "
                + " ('suaad', '????????'), "
                + " ('sameha', '??????????'), "
                + " ('thabia', '????????'), "
                + " ('aisha', '??????????'), "
                + " ('aida', '??????????'), "
                + " ('abeer', '????????'), "
                + " ('areen', '????????'), "
                + " ('afaf', '????????'), "
                + " ('afraa', '??????????'), "
                + " ('ola', '??????'), "
                + " ('oula', '??????'), "

                + " ('anan', '????????'), "
                + " ('adnan', '??????????'), "

                + " ('ahd', '??????'), "
                + " ('ahed', '??????'), "
                + " ('awatef', '??????????'), "
                + " ('fairouz', '??????????'), "
                + " ('kamar', '??????'), "
                + " ('qamar', '??????'), "
                + " ('najah', '????????'), "
                + " ('weam', '????????'), "
                + " ('ahmed', '????????'), "
                + " ('iskandar', '????????????'), "
                + " ('ismaeel', '??????????????'), "
//                + " ('ayham', '????????'), "
                + " ('badee', '????????'), "
                + " ('badea', '????????'), "
                + " ('badiaa', '??????????'), "

                + " ('twfik', '??????????'), "
                + "  ('tawfeek', '??????????'), "
                + "  ('hakam', '??????'), "
                + "  ('hakeem', '????????'), "
                + "  ('rose', '??????'), "
                + "  ('roz', '??????'), "
                + "  ('fidaa', '????????'), "
                + "  ('dani', '????????'), "
                + "  ('dalal', '????????'), "
                + "  ('dania', '??????????'), "
                + "  ('deema', '????????'), "
                + "  ('kamela', '??????????'), "
                + "  ('akram', '????????'), "
                + "  ('fadwa', '????????'), "
                + "  ('areej', '????????'), "
                + "  ('murjan', '??????????'), "
                + "  ('fares', '????????'), "
                + "  ('lawrance', '????????????'), "
                + "  ('oras', '??????????'), "
                + "  ('shahed', '??????'), "
                + "  ('maurice', '??????????'), "
                + "  ('bilal', '????????'), "
                + "  ('dured', '????????'), "
                + "  ('hiba', '??????'), "
                + "  ('ossama', '??????????'), "


                + " ('moufak', '????????'), "
                + " ('mwaffak', '????????'), "

                + " ('jafaar', '????????'), "
                + " ('hatem', '????????'), "
                + " ('hazem', '????????'), "
                + " ('husam', '????????'), "
                + " ('hussam', '????????'), "
                + " ('radwan', '??????????'), "
                + " ('rida', '??????'), "
                + " ('rida', '????????'), "
                + " ('roudaina', '??????????'), "
                + " ('raeda', '??????????'), "
                + " ('nahed', '????????'), "

                + " ('hassan', '????????'), "
                + " ('hassan', '??????'), "
                + " ('hasan', '??????'), "

                + " ('hakki', '??????'), "
                + " ('hamdan', '??????????'), "
                + " ('hamza', '????????'), "
                + " ('hana', '??????'), "
                + " ('hayder', '????????'), "
                + " ('haider', '????????'), "
                + " ('haidar', '????????'), "
                + "  ('salam', '????????'), "
                + "  ('salma', '????????'), "
                + "  ('hisham', '????????'), "
                + "  ('hind', '??????'), "
                + "  ('hend', '??????'), "
                + "  ('farid', '????????'), "
                + "  ('ghada', '????????'), "
                + "  ('eva', '????????'), "
                + "  ('fatima', '??????????'), "
                + "  ('fatema', '??????????'), "
                + " ('okba', '????????'), "

                + " ('hayan', '????????'), "
                + " ('hayyan', '????????'), "

                + " ('khater', '????????'), "
                + " ('radee', '????????'), "
                + " ('rafee', '????????'), "
                + " ('rafeek', '????????'), "
                + " ('rabee', '????????'), "
                + " ('shaban', '??????????'), "
                + " ('shaaban', '??????????'), "
                + " ('abeed', '????????'), "
                + " ('akeel', '????????'), "
                + " ('obada', '??????????'), "
                + " ('abbass', '????????'), "
                + " ('othman', '??????????'), "
                + " ('adnan', '??????????'), "
                + " ('oday', '??????'), "
                + " ('azeez', '????????'), "
                + " ('esam', '????????'), "
                + " ('afeef', '????????'), "
                + " ('omran', '??????????'), "
                + " ('isaa', '????????'), "
                + " ('issa', '????????'), "
                + " ('farouk', '??????????'), "
                + " ('farouq', '??????????'), "
                + " ('fadeel', '????????'), "
                + " ('fadel', '??????'), "
                + " ('fadel', '????????'), "
                + " ('faesal', '????????'), "
                + " ('faisal', '????????'), "
                + " ('kasem', '????????'), "
                + " ('kaees', '??????'), "
                + " ('kusai', '??????'), "
                + " ('qusai', '??????'), "
                + " ('qussai', '??????'), "
                + " ('muhsen', '????????'), "
                + " ('mahrous', '??????????'), "
                + " ('medhat', '????????'), "
                + " ('moustafa', '??????????'), "
                + " ('mutee', '????????'), "
                + " ('mutea', '????????'), "
                + " ('mutaz', '????????'), "
                + " ('maen', '??????'), "
                + " ('mueen', '????????'), "

                + " ('nazem', '????????'), "
                + " ('nasr', '??????'), "
                + " ('nedal', '????????'), "
                + " ('nouman', '??????????'), "
                + " ('naeem', '????????'), "
                + " ('waddah', '????????'), "
                + " ('yaarub', '????????'), "
                + " ('nai', '??????'), "
                + " ('hayat', '????????'), "
                + " ('amal', '??????'), "
                + " ('sandra', '????????????'), "
                + " ('hayfaa', '??????????'), "
                + " ('somar', '????????'), "
                + " ('sahar', '??????'), "
                + " ('sahar', '??????'), "
                + " ('sanaa', '????????'), "
                + " ('jaydaa', '??????????'), "
                + " ('taymaa', '??????????'), "
                + " ('aliaa', '??????????'), "
                + " ('raghdaa', '??????????'), "
                + " ('hanaa', '????????'), "
                + " ('rawaa', '????????'), "
                + " ('rawaa', '????????'), "
                + " ('douaa', '????????'), "
                + " ('asmaa', '??????????'), "
                + " ('faihaa', '??????????'), "
                + " ('ghaidaa', '??????????'), "
                + " ('shaimaa', '??????????'), "
                + " ('lamiaa', '??????????'), "
                + " ('baraa', '????????'), "
                + " ('hasnaa', '??????????'), "
                + " ('zahraa', '??????????'), "
                + " ('rajaa', '????????'), "
                + " ('esraa', '??????????'), "
                + " ('tharaa', '????????'), "
                + " ('najlaa', '??????????'), "
                + " ('wafaa', '????????'), "
                + " ('rashed', '????????'), "
                + " ('rashad', '????????'), "
                + " ('rasheed', '????????'), "


                + "  ('mhmd', '????????'); ");


//        final TextView transTxt = (TextView) findViewById(R.id.transTextView);
//        transliteDB = openOrCreateDatabase("transliteDB", MODE_PRIVATE, null);
//        Cursor maxCrsr = transliteDB.query("namesMap", null, "cluster=(SELECT MAX(cluster) FROM namesMap)", null, null, null, null);     //"SELECT MAX(cluster) AS maxx FROM namesMap", null);
//        while ( maxCrsr.moveToNext())
//            transTxt.append(Integer.toString(maxCrsr.getInt(  maxCrsr.getColumnIndex("cluster")) ) );


        //        Cursor c = transliteDB.rawQuery("SELECT arName FROM namesMap ", null);
//        transTxt.setText("");


//        transliteDB.close();

//              insertNameIntoDB("abd", "??????");


    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public ArrayList<String> directNameMap(String srchName) {
        ArrayList<String> directMapNames = new ArrayList<>();

        transliteDB = openOrCreateDatabase("transliteDB", MODE_PRIVATE, null);
        Cursor c = transliteDB.rawQuery("SELECT arName FROM namesMap WHERE enName = '" + srchName + "'", null);
        while (c.moveToNext()) {
            String foundName = c.getString(c.getColumnIndex("arName"));
//            for (int i=0; i<closestNames.size();i++) {
//                if (closestNames.get(i).equalsIgnoreCase(foundName) )
//                    break;
//                else
//                    if (i==closestNames.size()-1)
            directMapNames.add(foundName);

            //for bracket }
        }
//        ArrayList<Integer> elemOccurrences = new ArrayList<>();
//
//        for (String name : closestNames) {
//            elemOccurrences.clear();
//            for (int i = 0; i < closestNames.size(); i++) {
//                if (closestNames.get(i).equalsIgnoreCase(name))
//                    elemOccurrences.add(i);
//            }
//            while (elemOccurrences.size()>1) {
//                closestNames.remove(elemOccurrences.get(elemOccurrences.size()-1));
//            }
//        }

        return directMapNames;
//
    }


    public float getSubstitutionCost(String a, String b) throws SQLiteException {

//
        float result = 0f;
        try {
            transliteDB = openOrCreateDatabase("transliteDB", MODE_PRIVATE, null);

            String s = "sub_with_" + b;

            if (a.length() == 2 && a.equalsIgnoreCase(b)) {
//                System.out.println("same");
                result = 0f;

            } else if (b.length() == 2 && b.toCharArray()[0] == b.toCharArray()[1] && a.length() == 1 && a.toCharArray()[0] == b.toCharArray()[0]) {

                Cursor c = transliteDB.rawQuery("SELECT doubled FROM costs WHERE letter =  '" + a + "' ", null);
                if (c.moveToFirst()) {

                    result = c.getFloat(c.getColumnIndex("doubled"));
                } else {
                    result = 1f;
                }
            }
//            
            else {
                if (b.matches("[a-z|A-Z]") || b.matches("(ch|ph|gh|kh|ee|ie|ei|aa|ou|th|dh|oo|ea|ai|ck|ey|sh|ce|ci|cy)")) {
                    Cursor c = transliteDB.rawQuery("SELECT `" + s + "` FROM costs WHERE letter =  '" + a + "' ", null);
                    if (c.moveToFirst()) {
                        result = c.getFloat(c.getColumnIndex(s));

                    } else {
                        result = 1f;
                    }
                } else
                    result = 1f;

            }

            transliteDB.close();

        } catch (SQLiteException e) {

            e.printStackTrace();


        }
//        System.out.println(result);
//         .out.println(result);
        return result;
//        else return 1f;
    }


    public float getInsertionCost(String a) throws SQLiteException {


        float result = 0f;
        try {
            transliteDB = openOrCreateDatabase("transliteDB", MODE_PRIVATE, null);
            Cursor c = getTransliteDB().rawQuery("SELECT `insert` FROM costs WHERE letter =  '" + a + "' ", null);
            if (c.moveToFirst()) {

                result = c.getFloat(c.getColumnIndex("insert"));

            } else {
                result = 1f;
            }
            transliteDB.close();
        } catch (SQLiteException e) {

            e.printStackTrace();


        }
//        System.out.println(result);
        return result;
//        else return 1f;
    }


    public float getDeletionCost(String a) throws SQLiteException {

        float result = 0f;
        try {
            transliteDB = openOrCreateDatabase("transliteDB", MODE_PRIVATE, null);
            Cursor c = getTransliteDB().rawQuery("SELECT `delete` FROM costs WHERE letter =  '" + a + "' ", null);
            if (c.moveToFirst()) {

                result = c.getFloat(c.getColumnIndex("delete"));

            } else {
                result = 1f;
            }
            transliteDB.close();
        } catch (SQLiteException e) {
            transliteDB.close();

            e.printStackTrace();


        }
        return result;
    }

    public ArrayList<String> getAllNames() {
        ArrayList<String> contacts = new ArrayList<>();

        Cursor people = getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
        while (people.moveToNext()) {
            int nameIndex = people.getColumnIndex(ContactsContract.PhoneLookup.DISPLAY_NAME);
            contacts.add(people.getString(nameIndex));
        }
        return contacts;

    }

    public ArrayList<String> getClosestNames() {

        float minDistance;
        ArrayList<String> closestNames = new ArrayList<>();
        ArrayList<String> allBroughtNames = new ArrayList<>();

        allBroughtNames = getAllNames();
        final EditText srchTxt = (EditText) findViewById(R.id.searchTxt);
        String searchName = srchTxt.getText().toString();
//        ContactsHandler ch = new ContactsHandler();

        minDistance = Levenshtein.calcDistance(allBroughtNames.get(0), searchName, this);

        closestNames.add(allBroughtNames.get(0));

        for (int i = 1; i < allBroughtNames.size(); i++) {
            float difference = Levenshtein.calcDistance(allBroughtNames.get(i), searchName, this);
            if (difference < minDistance) {
                closestNames.clear();
                minDistance = difference;
                closestNames.add(allBroughtNames.get(i));
            } else if (difference == minDistance) {
                closestNames.add(allBroughtNames.get(i));

            }
        }
        return closestNames;

    }


    public void onSwitch() {
        final Switch sw = (Switch) findViewById(R.id.switch2);
        final TextView swText = (TextView) findViewById(R.id.switchTxtView);
        final EditText srchTxt = (EditText) findViewById(R.id.searchTxt);


        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (sw.isChecked()) {
                    swText.setText("Search contacts");
                } else
                    swText.setText("Transliterate " + srchTxt.getText().toString().toUpperCase());


            }
        });
    }

    public void insertNameIntoDB(String name, String arName) {
        String rawName = removeVowels(name);
        String closestClusterName = "";
        String rawDbName = "";
        String closestDbName = "";
        ArrayList<String> candidateNames = new ArrayList<>();

        transliteDB = openOrCreateDatabase("transliteDB", MODE_PRIVATE, null);
        Cursor nameExistsCrsr = transliteDB.rawQuery("SELECT enName FROM namesMap WHERE enName = '" + name + "' ", null);
        if (nameExistsCrsr.moveToFirst()) {
//            transliteDB.close();
            Toast.makeText(MainActivity.this, name.toUpperCase() + " already exists in Names DB!", Toast.LENGTH_LONG).show();
        } else {
            // Log.d("ABD", "executed..");
            transliteDB = openOrCreateDatabase("transliteDB", MODE_PRIVATE, null);
            Cursor maxCrsr = transliteDB.query("namesMap", null, "cluster=(SELECT MAX(cluster) FROM namesMap)", null, null, null, null);     //"SELECT MAX(cluster) AS maxx FROM namesMap", null);
            if (maxCrsr.moveToFirst()) {
                int clustersCount = maxCrsr.getInt(maxCrsr.getColumnIndex("cluster"));
                for (int i = 1; i < clustersCount; i++) {
                    transliteDB = openOrCreateDatabase("transliteDB", MODE_PRIVATE, null);
                    Cursor clusterCrsr = transliteDB.rawQuery("SELECT enName FROM namesMap WHERE cluster = " + i, null);
                    if (clusterCrsr.moveToFirst())
                        closestClusterName = clusterCrsr.getString(clusterCrsr.getColumnIndex("enName"));
                    while (clusterCrsr.moveToNext()) {
                        String currentClusterName = clusterCrsr.getString(clusterCrsr.getColumnIndex("enName"));
                        String rawCurrent = removeVowels(currentClusterName);
                        if (Math.abs(rawName.length() - rawCurrent.length()) < Math.abs(rawName.length() - removeVowels(closestClusterName).length()))
                            closestClusterName = currentClusterName;
                    }
                    candidateNames.add(closestClusterName);
                }
                float minDistance = Levenshtein.calcDistance(name, candidateNames.get(0), this);

                closestDbName = candidateNames.get(0);
                for (int i = 1; i < candidateNames.size(); i++) {
                    if (Levenshtein.calcDistance(name, candidateNames.get(i), this) < minDistance) {
                        minDistance = Levenshtein.calcDistance(name, candidateNames.get(i), this);
                        closestDbName = candidateNames.get(i);
                    }
                }
                if (minDistance <= 0.9) {
                    transliteDB = openOrCreateDatabase("transliteDB", MODE_PRIVATE, null);
                    Cursor getClusterByNameCrsr = transliteDB.rawQuery("SELECT cluster  FROM namesMap WHERE enName = '" + closestDbName + "'", null);
                    getClusterByNameCrsr.moveToFirst();
                    transliteDB.execSQL("INSERT  INTO `namesMap`  (`enName`, `arName`, `cluster` ) VALUES"
                            + " ('" + name + "', '" + arName + "', " + getClusterByNameCrsr.getInt(getClusterByNameCrsr.getColumnIndex("cluster")) + ");");
                    Toast.makeText(MainActivity.this, name.toUpperCase() + " added successfully in cluster " + getClusterByNameCrsr.getInt(getClusterByNameCrsr.getColumnIndex("cluster")) + " along with " + closestDbName.toUpperCase() + " and others.", Toast.LENGTH_LONG).show();
                } else {
                    transliteDB = openOrCreateDatabase("transliteDB", MODE_PRIVATE, null);
                    maxCrsr.moveToFirst();
                    int maxClusterNum = maxCrsr.getInt(maxCrsr.getColumnIndex("cluster"));
                    transliteDB.execSQL("INSERT  INTO `namesMap`  (`enName`, `arName`, `cluster`) VALUES"
                            + " ('" + name + "', '" + arName + "', " + maxClusterNum + 1 + ");");
                    Toast.makeText(MainActivity.this, name.toUpperCase() + " added successfully in a new cluster", Toast.LENGTH_LONG).show();

                }
            }
            transliteDB.close();
        }
    }


    public String removeVowels(String name) {
        ArrayList<String> namePhonemes = Phonemizer.phonemize(name);
        String rawName = "";
        for (int i = 0; i < namePhonemes.size(); i++) {
            if (isVowel(namePhonemes.get(i))) {
                continue;
            } else
                rawName = rawName + namePhonemes.get(i);

        }

        return rawName;
    }

    public boolean isVowel(String ph) {
        if (ph.equalsIgnoreCase("a") || ph.equalsIgnoreCase("o") || ph.equalsIgnoreCase("u") || ph.equalsIgnoreCase("e") || ph.equalsIgnoreCase("i") || ph.equalsIgnoreCase("y") || ph.equalsIgnoreCase("ou") || ph.equalsIgnoreCase("aa") || ph.equalsIgnoreCase("ee") || ph.equalsIgnoreCase("ie") || ph.equalsIgnoreCase("ei") || ph.equalsIgnoreCase("oo") || ph.equalsIgnoreCase("ai"))
            return true;
        else
            return false;


    }


    public void onClickButton(View v) {
        Button button = (Button) v;
        final Switch sw = (Switch) findViewById(R.id.switch2);
        final EditText srchTxt = (EditText) findViewById(R.id.searchTxt);
        final TextView transTxt = (TextView) findViewById(R.id.transTextView);
        final TextView swText = (TextView) findViewById(R.id.switchTxtView);

        String nameTxt = srchTxt.getText().toString().toLowerCase();
//        if (!sw.isChecked()) {
//            if (nameTxt.matches("[a-z | A-Z]")) {
//                transTxt.setHint("Transliteration should appear here");
        transliteDB = openOrCreateDatabase("transliteDB", MODE_PRIVATE, null);
        transTxt.setHint("");
        transTxt.setText("");
//        if (nameTxt.matches("[a-z]")) {
        if (!sw.isChecked()) {

            if (directNameMap(srchTxt.getText().toString()).isEmpty()) {
                ArrayList<String> phonemes = Phonemizer.phonemize(nameTxt);
                String[] phonemesArr = new String[phonemes.size()];
                for (int i = 0; i < phonemes.size(); i++) {
                    phonemesArr[i] = phonemes.get(i);
                }
//                int[] partialTransIndexes = new int[phonemesArr.length];
                Rules r = new com.project2.abd.transliteright.Rules();
                String[] phonemesArrPartialTrans = r.isRule(phonemesArr);

                partialTransIndexes.clear();
                partialTransLetters.clear();

                for (int i = 0; i < phonemesArrPartialTrans.length; i++) {
                    if (phonemesArrPartialTrans[i].matches("[a-zA-Z]+")) {
                        partialTransIndexes.add(i);
                        partialTransLetters.add("");
                    } else {
                        partialTransIndexes.add(100);
                        partialTransLetters.add(phonemesArrPartialTrans[i]);
                    }


                }


//                partialTransIndexes = com.project2.abd.transliteright.Rules.result(phonemesArr);
                String ss = "";
                for (int i = 0; i < phonemesArr.length; i++) {
//                    ss = ss + (Integer.toString(partialTransIndexes.get(i)) + ", ");
                    ss = ss + (partialTransLetters.get(i));
//                    Log.i("ABDAL", Integer.toString(partialTransIndexes[i]));
                }
//                transTxt.setText("");
                transTxt.setText(ss + "  ");


            } else  //name found directly in names DB
                transTxt.setText("");
            for (int i = 0; i < directNameMap(srchTxt.getText().toString()).size(); i++) {
                if (i == directNameMap(srchTxt.getText().toString()).size() - 1)
                    transTxt.append(directNameMap(srchTxt.getText().toString()).get(i));
                else
                    transTxt.append(directNameMap(srchTxt.getText().toString()).get(i) + "?? ");

            }
        } else { // sw isChecked true
            String result = "";
            ArrayList<String> closest = getClosestNames();
            for (int i = 0; i < closest.size(); i++) {
                if (i == closest.size() - 1)
                    result = result + closest.get(i);
                else
                    result = result + closest.get(i) + ", ";


            }

            transTxt.setText(result);
        }
//        } else     //entered name does not match a-z or A-Z
//            Toast.makeText(MainActivity.this, "Please enter a valid name!", Toast.LENGTH_SHORT).show();





     /*

        Cursor c1 = transliteDB.rawQuery("SELECT arName FROM namesMap WHERE enName =  '" + nameTxt + "' ", null);
       // if (c1.moveToFirst()) {
            while (c1.moveToNext()) {
                if (c1.isLast())
                    result = result + (c1.getString(c1.getColumnIndex("arName")));
                else
                    result = result + (c1.getString(c1.getColumnIndex("arName")) + "?? ");
            }
            transTxt.setText(result);
        transliteDB.close();
       // }
//        else
//            transTxt.setText("No results were found.");

//            }
//            else
//                transTxt.setHint("Invalid name, please re-enter.");

//        }


        */
    }

//    public void onAddNameClick(View v) {

//        Button btn = (Button) v;
//        startActivity(new Intent(MainActivity.this, AddNameActivity.class));
//
//}


}



