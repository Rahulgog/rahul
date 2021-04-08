package com.bank.izbank.MainScreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.bank.izbank.R;
import com.bank.izbank.Sign.SignIn;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.parse.LogOutCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

public class MainScreenActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private Fragment tempFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,new Fragment1()).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.menu1:
                        tempFragment = new Fragment1();
                        break;
                    case R.id.menu2:
                        tempFragment = new Fragment2();
                        break;
                    case R.id.menu3:
                        tempFragment= new Fragment3();
                        break;
                    case R.id.menu4:
                        tempFragment = new Fragment4();
                        break;
                    case R.id.menu5:
                        tempFragment = new Fragment5();
                        break;

                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,tempFragment).commit();


                return true;
            }
        });


    }





    public void logOut(View view){
        ParseUser.logOutInBackground(new LogOutCallback() {
            @Override
            public void done(ParseException e) {
                if(e !=null){
                    Toast.makeText(getApplicationContext(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                }else{
                    Intent intent=new Intent(getApplicationContext(), SignIn.class);
                    startActivity(intent);
                }
            }
        });
    }
}