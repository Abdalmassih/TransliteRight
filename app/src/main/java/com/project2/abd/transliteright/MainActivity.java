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


//                + " ('sami', 'سامي', '9'),"

//
//                + "  ('hussein', 'حسين',1 ),"
//                + "  ('jumana', 'جمانة', 2 ),"
//                + "  ('abd', 'عبد', 4 ),"
//                + "  ('abdalmassih', 'عبد المسيح', 5 ),"
//                + "  ('tarek', 'طارق', 6),"
//                + "  ('tareq', 'طارق', 3),"
//                + "  ('zuheir', 'زهير', 8),"
//                + "  ('abdullah', 'عبدالله', 9),"
//                + "  ('zuher', 'زهير', 8),"
//                + " ('suher', 'سهير', '7'),"

                + "  ('hussein', 'حسين'),"
                + "  ('jumana', 'جمانة'),"
                + "  ('abd', 'عبد'),"
                + "  ('tarek', 'طارق'),"
                + "  ('zuheir', 'زهير'),"
                + "  ('zuher', 'زهير'),"
                + "  ('abdullah', 'عبدالله'),"
                + "  ('abd almassih', 'عبدالمسيح'),"
                + "  ('suher', 'سهير'),"
                + "  ('sami', 'سامي'),"
                + "  ('ammar', 'عمار'),"

                + "  ('maissaa', 'ميساء'),"
                + "  ('maysa', 'ميساء'),"
                + "  ('moumen', 'مؤمن'),"
                + "  ('ali', 'علي'),"
                + "  ('muhammad', 'محمد'),"
                + "  ('ahmad', 'أحمد'),"
                + "  ('mahmoud', 'محمود'), "
                + "  ('hamed', 'حامد'), "
                + "  ('maher', 'ماهر'), "
                + "  ('maha', 'مها'), "
                + "  ('mahran', 'مهران'), "
                + "  ('hala', 'حلا'), "
                + "  ('hala', 'هلا'), "
                + "  ('hala', 'هالة'), "
                + "  ('alaa', 'علاء'), "
                + "  ('alaa', 'آلاء'), "
                + "  ('amina', 'أمينة'), "
                + "  ('mirna', 'ميرنا'), "
                + "  ('aya', 'آية'), "
                + "  ('sali', 'سالي'), "
                + "  ('zena', 'زينة'), "
                + "  ('amira', 'أميرة'), "
                + "  ('fareed', 'فريد'), "
                + "  ('karim', 'كريم'), "
                + "  ('ghaith', 'غيث'), "
                + "  ('ghais', 'غيث'), "
                + "  ('mamdouh', 'ممدوح'), "
                + "  ('george', 'جورج'), "
                + "  ('louay', 'لؤي'), "
                + "  ('wael', 'وائل'), "
                + "  ('saleem', 'سليم'), "
                + "  ('samer', 'سامر'), "
                + "  ('asaad', 'أسعد'), "
                + "  ('saad', 'سعد'), "
                + "  ('thaer', 'ثائر'), "
                + "  ('hani', 'هاني'), "
                + "  ('shadi', 'شادي'), "
                + "  ('madlen', 'مادلين'), "
                + "  ('bassem', 'باسم'), "
                + "  ('bassel', 'باسل'), "
                + "  ('khaled', 'خالد'), "
                + "  ('ayman', 'أيمن'), "
                + "  ('aiman', 'أيمن'), "
                + "  ('mazen', 'مازن'), "
                + "  ('nazeer', 'نزير'), "
                + "  ('natheer', 'نذير'), "
                + "  ('firas', 'فراس'), "
                + "  ('amani', 'أماني'), "
                + "  ('muna', 'منى'), "
                + "  ('lama', 'لمى'), "
                + "  ('faten', 'فاتن'), "
                + "  ('raafat', 'رأفت'), "
                + "  ('masoud', 'مسعود'), "
                + "  ('manar', 'منار'), "
                + "  ('lina', 'لينا'), "
                + "  ('leen', 'لين'), "

                + "  ('bashar', 'بشار'), "
                + "  ('kazem', 'كاظم'), "
                + "  ('hanaa', 'هناء'), "
                + "  ('fadia', 'فاديا'), "
                + "  ('lubna', 'لبنى'), "
                + "  ('ulfat', 'ألفت'), "
                + "  ('talaat', 'طلعت'), "
                + "  ('ameena', 'أمينة'), "
                + "  ('amena', 'آمنة'), "

                + "  ('bassema', 'باسمة'), "
                + "  ('lolo', 'لولو'), "
                + "  ('lulu', 'لولو'), "
                + "  ('siham', 'سهام'), "
                + "  ('arwa', 'أروى'), "
                + "  ('lubaba', 'لبابة'), "
                + "  ('alice', 'آليس'), "
                + "  ('rania', 'رانيا'), "
                + "  ('eatidal', 'اعتدال'), "
                + "  ('baker', 'بكر'), "
                + "  ('lamees', 'لميس'), "
                + "  ('buthaina', 'بسام'), "
                + "  ('jaafar', 'جعفر'), "

                + "  ('sawsan', 'سوسن'), "
                + "  ('aamer', 'عامر'), "
                + "  ('michael', 'مايكل'), "
                + "  ('michel', 'ميشيل'), "
                + "  ('marwan', 'مروان'), "
                + "  ('waleed', 'وليد'), "
                + "  ('ezzat', 'عزت'), "
                + "  ('munir', 'منير'), "
                + "  ('samia', 'سامية'), "
                + "  ('marissa', 'ماريسا'), "
                + "  ('luna', 'لونا'), "
                + "  ('saada', 'سعدا'), "
                + "  ('tameem', 'تميم'), "
                + "  ('nasser', 'ناصر'), "
                + "  ('naser', 'ناصر'), "
                + "  ('alkama', 'علقمة'), "

                + "  ('waheed', 'وحيد'), "
                + "  ('islam', 'إسلام'), "
                + "  ('aghiad', 'أغيد'), "
                + "  ('toni', 'طوني'), "
                + "  ('salah', 'صلاح'), "
                + "  ('saleh', 'صالح'), "

                + "  ('tony', 'طوني'), "
                + "  ('mehiar', 'مهيار'), "
                + "  ('abbas', 'عباس'), "
                + "  ('sophia', 'صوفيا'), "

                + "  ('hamza', 'حمزة'), "
                + "  ('hadi', 'هادي'), "
                + "  ('sindebad', 'سندباد'), "
                + "  ('hameeda', 'حميدة'), "
                + "  ('carla', 'كارلا'), "
                + "  ('walaa', 'ولاء'), "
                + "  ('azaheer', 'أزاهير'), "
                + "  ('zahra', 'زهرة'), "
                + "  ('obama', 'أوباما'), "


                + "  ('orwa', 'عروة'), "
                + "  ('sulaiman', 'سليمان'), "
                + "  ('batoul', 'بتول'), "
                + "  ('shireen', 'شيرين'), "
                + "  ('fatina', 'فاتنة'), "
                + "  ('rawan', 'روان'), "
                + "  ('fabiolla', 'فابيولا'), "
                + "  ('raghad', 'رغد'), "
                + "  ('sameer', 'سمير'), "
                + "  ('ismaeel', 'إسماعيل'), "
                + "  ('ismael', 'إسماعيل'), "
                + "  ('sulaf', 'سلاف'), "
                + "  ('ibrahim', 'إبراهيم'), "
                + "  ('ibraheem', 'إبراهيم'), "
                + "  ('rooney', 'روني'), "
                + "  ('roni', 'روني'), "
                + "  ('rafi', 'رافي'), "
                + "  ('khouloud', 'خلود'), "
                + "  ('khuloud', 'خلود'), "
                + "  ('kifah', 'كفاح'), "
                + "  ('kareem', 'كريم'), "
                + "  ('karim', 'كريم'), "
                + "  ('karam', 'كرم'), "
                + "  ('hanadi', 'هنادي'), "
                + "  ('rami', 'رامي'), "


                + "  ('raghda', 'رغدة'), "
                + "  ('tamer', 'تامر'), "
                + "  ('fouad', 'فؤاد'), "
                + "  ('abdulrazak', 'عبدالرزاق'), "
                + "  ('abdulmajeed', 'عبدالمجيد'), "
                + "  ('abd almassih', 'عبدالمسيح'), "

                + "  ('lubaba', 'لبابة'), "
                + "  ('basheer', 'بشير'), "
                + "  ('besher', 'بشر'), "
                + "  ('rani', 'راني'), "
                + "  ('rama', 'راما'), "
                + "  ('bdour', 'بدور'), "
                + "  ('rafi', 'رافي'), "

                + "  ('budour', 'بدور'), "
                + "  ('omaima', 'أميمة'), "
                + "  ('umaima', 'أميمة'), "
                + "  ('alan', 'آلان'), "
                + "  ('zaher', 'زاهر'), "
                + "  ('suhel', 'سهيل'), "
                + "  ('ziad', 'زياد'), "
                + "  ('joseph', 'جوزيف'), "
                + "  ('milad', 'ميلاد'), "
                + "  ('fareed', 'فريد'), "

                + "  ('wajeeh', 'وجيه'), "
                + "  ('kamel', 'كامل'), "
                + "  ('kamal', 'كمال'), "
//                + "  ('kamar', 'قمر'), "
//                + "  ('qamar', 'قمر'), "
                + "  ('eyad', 'إياد'), "
                + "  ('kinan', 'كنان'), "
                + "  ('mahfoud', 'محفوظ'), "
                + "  ('mahfouz', 'محفوظ'), "
                + "  ('mahfoudh', 'محفوظ'), "
                + "  ('kinana', 'كنانة'), "
                + "  ('fahed', 'فهد'), "
                + "  ('fahd', 'فهد'), "
                + "  ('elias', 'الياس'), "
                + "  ('suha', 'سهى'), "


                + "  ('hania', 'هانية'), "
                + "  ('rania', 'رانيا'), "

                + "  ('arwa', 'أروى'), "
                + "  ('marwa', 'مروة'), "

                + "  ('fidel', 'فيديل'), "
                + "  ('taleb', 'طالب'), "
                + "  ('mudar', 'مضر'), "

                + "  ('selena', 'سيلينا'), "
                + "  ('christina', 'كريستينا'), "
                + "  ('christin', 'كريستين'), "
                + "  ('christine', 'كريستين'), "


                + "  ('rana', 'رنا'), "
                + "  ('sandouk', 'صندوق'), "
                + "  ('joukhadar', 'جوخدار'), "
                + "  ('amjad', 'أمجد'), "
                + "  ('majed', 'ماجد'), "
                + "  ('majd', 'مجد'), "
                + "  ('ayham', 'أيهم'), "
                + "  ('aiham', 'أيهم'), "
                + "  ('obada', 'عبادة'), "
                + "  ('othman', 'عثمان'), "

                + "  ('ghadeer', 'غدير'), "
                + "  ('omar', 'عمر'), "
                + "  ('naji', 'ناجي'), "
                + "  ('zahi', 'زاهي'), "
                + "  ('zahran', 'زهران'), "


                + "  ('lilas', 'ليلاس'), "
                + "  ('aaref', 'عارف'), "
                + "  ('abboud', 'عبود'), "
                + "  ('rakan', 'راكان'), "
                + "  ('laila', 'ليلى'), "
                + "  ('maisa', 'ميساء'), "
                + "  ('shuaib', 'شعيب'), "
                + "  ('mashhour', 'مشهور'), "


                + " ('maissaa', 'ميساء'), "
                + " ('intesar', 'انتصار'), "
                + " ('sabah','صباح'), "

                + " ('safaa', 'صفاء'), "
                + " ('seba', 'صبا'), "
                + " ('safouan','صفوان'), "
                + " ('safwan','صفوان'), "

                + " ('sabiha', 'صبيحة'), "
                + " ('samah', 'سماح'), "
                + " ('farah', 'فرح'), "
                + " ('saeb','صائب'), "
                + " ('saber','صابر'), "
                + " ('sabir','صابر'), "
                + " ('sabeer','صابر'), "

                + " ('sadek', 'صادق'), "
                + " ('sarem','صارم'), "
                + " ('safy', 'صافي'), "
                + " ('saleh','صالح'), "
                + " ('subhi','صبحي'), "
                + " ('sabri','صبري'), "
                + " ('sakher', 'صخر'), "
                + " ('saddam', 'صدام'), "
                + " ('sudki', 'صدقي'), "
                + " ('safwat', 'صفوت'), "
                + " ('salah', 'صلاح'), "
                + " ('saker','صقر'), "
                + " ('musaab', 'مصعب'), "
                + " ('suhib','صهيب '), "
                + " ('soufia', 'صوفيا'), "
                + " ('duha', 'ضحى'), "
                + " ('diaa', 'ضياء'), "
                + " ('taha', 'طه'), "
                + " ('tala', 'طلال'), "
                + " ('taher', 'طاهر'), "
                + " ('tala', 'تالة'), "
                + " ('turfa', 'طرفة'), "
                + " ('tahera', 'طاهرة'), "
                + " ('insaf', 'إنصاف'), "
                + " ('inssaf', 'إنصاف'), "
                + " ('tania', 'تانيا'), "
                + " ('raduan', 'رضوان'), "
                + " ('ramadan', 'رمضان'), "
                + " ('rukaia', 'رقية'), "
                + " ('rukaiya', 'رقية'), "
                + " ('suaad', 'سعاد'), "
                + " ('sameha', 'سميحة'), "
                + " ('thabia', 'ظبية'), "
                + " ('aisha', 'عائشة'), "
                + " ('aida', 'عائدة'), "
                + " ('abeer', 'عبير'), "
                + " ('areen', 'عرين'), "
                + " ('afaf', 'عفاف'), "
                + " ('afraa', 'عفراء'), "
                + " ('ola', 'علا'), "
                + " ('oula', 'علا'), "

                + " ('anan', 'عنان'), "
                + " ('adnan', 'عدنان'), "

                + " ('ahd', 'عهد'), "
                + " ('ahed', 'عهد'), "
                + " ('awatef', 'عواطف'), "
                + " ('fairouz', 'فيروز'), "
                + " ('kamar', 'قمر'), "
                + " ('qamar', 'قمر'), "
                + " ('najah', 'نجاح'), "
                + " ('weam', 'وئام'), "
                + " ('ahmed', 'أحمد'), "
                + " ('iskandar', 'اسكندر'), "
                + " ('ismaeel', 'اسماعيل'), "
//                + " ('ayham', 'ايهم'), "
                + " ('badee', 'بديع'), "
                + " ('badea', 'بديع'), "
                + " ('badiaa', 'بديعة'), "

                + " ('twfik', 'توفيق'), "
                + "  ('tawfeek', 'توفيق'), "
                + "  ('hakam', 'حكم'), "
                + "  ('hakeem', 'حكيم'), "
                + "  ('rose', 'روز'), "
                + "  ('roz', 'روز'), "
                + "  ('fidaa', 'فداء'), "
                + "  ('dani', 'داني'), "
                + "  ('dalal', 'دلال'), "
                + "  ('dania', 'دانيا'), "
                + "  ('deema', 'ديمة'), "
                + "  ('kamela', 'كاملة'), "
                + "  ('akram', 'أكرم'), "
                + "  ('fadwa', 'فدوى'), "
                + "  ('areej', 'أريج'), "
                + "  ('murjan', 'مرجان'), "
                + "  ('fares', 'فارس'), "
                + "  ('lawrance', 'لورانس'), "
                + "  ('oras', 'أوراس'), "
                + "  ('shahed', 'شهد'), "
                + "  ('maurice', 'موريس'), "
                + "  ('bilal', 'بلال'), "
                + "  ('dured', 'دريد'), "
                + "  ('hiba', 'هبة'), "
                + "  ('ossama', 'أسامة'), "


                + " ('moufak', 'موفق'), "
                + " ('mwaffak', 'موفق'), "

                + " ('jafaar', 'جعفر'), "
                + " ('hatem', 'حاتم'), "
                + " ('hazem', 'حازم'), "
                + " ('husam', 'حسام'), "
                + " ('hussam', 'حسام'), "
                + " ('radwan', 'رضوان'), "
                + " ('rida', 'رضا'), "
                + " ('rida', 'ريدا'), "
                + " ('roudaina', 'ردينة'), "
                + " ('raeda', 'رائدة'), "
                + " ('nahed', 'ناهد'), "

                + " ('hassan', 'حسان'), "
                + " ('hassan', 'حسن'), "
                + " ('hasan', 'حسن'), "

                + " ('hakki', 'حقي'), "
                + " ('hamdan', 'حمدان'), "
                + " ('hamza', 'حمزة'), "
                + " ('hana', 'حنا'), "
                + " ('hayder', 'حيدر'), "
                + " ('haider', 'حيدر'), "
                + " ('haidar', 'حيدر'), "
                + "  ('salam', 'سلام'), "
                + "  ('salma', 'سلمى'), "
                + "  ('hisham', 'هشام'), "
                + "  ('hind', 'هند'), "
                + "  ('hend', 'هند'), "
                + "  ('farid', 'فريد'), "
                + "  ('ghada', 'غادة'), "
                + "  ('eva', 'إيفا'), "
                + "  ('fatima', 'فاطمة'), "
                + "  ('fatema', 'فاطمة'), "
                + " ('okba', 'عقبة'), "

                + " ('hayan', 'حيان'), "
                + " ('hayyan', 'حيان'), "

                + " ('khater', 'خاطر'), "
                + " ('radee', 'راضي'), "
                + " ('rafee', 'رافع'), "
                + " ('rafeek', 'رفيق'), "
                + " ('rabee', 'ربيع'), "
                + " ('shaban', 'شعبان'), "
                + " ('shaaban', 'شعبان'), "
                + " ('abeed', 'عابد'), "
                + " ('akeel', 'عاقل'), "
                + " ('obada', 'عبادة'), "
                + " ('abbass', 'عباس'), "
                + " ('othman', 'عثمان'), "
                + " ('adnan', 'عدنان'), "
                + " ('oday', 'عدي'), "
                + " ('azeez', 'عزيز'), "
                + " ('esam', 'عصام'), "
                + " ('afeef', 'عفيف'), "
                + " ('omran', 'عمران'), "
                + " ('isaa', 'عيسى'), "
                + " ('issa', 'عيسى'), "
                + " ('farouk', 'فاروق'), "
                + " ('farouq', 'فاروق'), "
                + " ('fadeel', 'فاضل'), "
                + " ('fadel', 'فضل'), "
                + " ('fadel', 'فاضل'), "
                + " ('faesal', 'فيصل'), "
                + " ('faisal', 'فيصل'), "
                + " ('kasem', 'قاسم'), "
                + " ('kaees', 'قيس'), "
                + " ('kusai', 'قصي'), "
                + " ('qusai', 'قصي'), "
                + " ('qussai', 'قصي'), "
                + " ('muhsen', 'محسن'), "
                + " ('mahrous', 'محروس'), "
                + " ('medhat', 'مدحت'), "
                + " ('moustafa', 'مصطفى'), "
                + " ('mutee', 'مطيع'), "
                + " ('mutea', 'مطيع'), "
                + " ('mutaz', 'معتز'), "
                + " ('maen', 'معن'), "
                + " ('mueen', 'معين'), "

                + " ('nazem', 'ناظم'), "
                + " ('nasr', 'نصر'), "
                + " ('nedal', 'نضال'), "
                + " ('nouman', 'نعمان'), "
                + " ('naeem', 'نعيم'), "
                + " ('waddah', 'وضاح'), "
                + " ('yaarub', 'يعرب'), "
                + " ('nai', 'ناي'), "
                + " ('hayat', 'حياة'), "
                + " ('amal', 'أمل'), "
                + " ('sandra', 'ساندرا'), "
                + " ('hayfaa', 'هيفاء'), "
                + " ('somar', 'سومر'), "
                + " ('sahar', 'سحر'), "
                + " ('sahar', 'سهر'), "
                + " ('sanaa', 'سناء'), "
                + " ('jaydaa', 'جيداء'), "
                + " ('taymaa', 'تيماء'), "
                + " ('aliaa', 'علياء'), "
                + " ('raghdaa', 'رغداء'), "
                + " ('hanaa', 'هناء'), "
                + " ('rawaa', 'رواء'), "
                + " ('rawaa', 'روعة'), "
                + " ('douaa', 'دعاء'), "
                + " ('asmaa', 'أسماء'), "
                + " ('faihaa', 'فيحاء'), "
                + " ('ghaidaa', 'غيداء'), "
                + " ('shaimaa', 'شيماء'), "
                + " ('lamiaa', 'لمياء'), "
                + " ('baraa', 'براء'), "
                + " ('hasnaa', 'حسناء'), "
                + " ('zahraa', 'زهراء'), "
                + " ('rajaa', 'رجاء'), "
                + " ('esraa', 'اسراء'), "
                + " ('tharaa', 'ثراء'), "
                + " ('najlaa', 'نجلاء'), "
                + " ('wafaa', 'وفاء'), "
                + " ('rashed', 'راشد'), "
                + " ('rashad', 'رشاد'), "
                + " ('rasheed', 'رشيد'), "


                + "  ('mhmd', 'محمد'); ");


//        final TextView transTxt = (TextView) findViewById(R.id.transTextView);
//        transliteDB = openOrCreateDatabase("transliteDB", MODE_PRIVATE, null);
//        Cursor maxCrsr = transliteDB.query("namesMap", null, "cluster=(SELECT MAX(cluster) FROM namesMap)", null, null, null, null);     //"SELECT MAX(cluster) AS maxx FROM namesMap", null);
//        while ( maxCrsr.moveToNext())
//            transTxt.append(Integer.toString(maxCrsr.getInt(  maxCrsr.getColumnIndex("cluster")) ) );


        //        Cursor c = transliteDB.rawQuery("SELECT arName FROM namesMap ", null);
//        transTxt.setText("");


//        transliteDB.close();

//              insertNameIntoDB("abd", "عبد");


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
                    transTxt.append(directNameMap(srchTxt.getText().toString()).get(i) + "، ");

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
                    result = result + (c1.getString(c1.getColumnIndex("arName")) + "، ");
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



