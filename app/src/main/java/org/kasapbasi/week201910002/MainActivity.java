package org.kasapbasi.week201910002;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;
    SharedPreferences mypref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    et=(EditText) findViewById(R.id.editText);

     mypref= getSharedPreferences("MyPref",0);
        et.setText(mypref.getString("etValue","Name :)"));

    }



    @Override
    public void onStop() {
        super.onStop();

       SharedPreferences.Editor edi =mypref.edit();
       edi.putString("etValue", et.getText().toString());

       edi.commit();

    }
}
