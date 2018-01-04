package com.crakama.hangmandroidclient;

import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
<<<<<<< HEAD
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainInterface,
                                                          ConnectionFragment.OnItemClickedListener {
=======
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements ConnectionFragment.OnItemClickedListener {
    private Handler handler;
>>>>>>> de414d6... Update Model View Presenter
    private ConnectionPresenterInt connectionPresenterInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        connectionPresenterInt = new ConnectionPresenterImpl(this);
=======
        this.handler = new Handler();

>>>>>>> de414d6... Update Model View Presenter
        if(findViewById(R.id.fragment_container) != null){
            if(savedInstanceState != null){
                return;
            }
            ConnectionFragment connectionFragment = new ConnectionFragment();
            connectionFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,connectionFragment).commit();
        }
    }


    //-------------------------------------------------------------------------
    // Connection methods
    //-------------------------------------------------------------------------

<<<<<<< HEAD


    @Override
    public void connectionBtnClicked(String ipAdress) {

        connectionPresenterInt = new ConnectionPresenterImpl(this);
        connectionPresenterInt.connectToServer(ipAdress);
    }


    public void connectionInfo(final String setText) {
        new Thread()
        {
            public void run()
            {
                runOnUiThread(new Runnable()
                {
                    public void run()
                    {
                        ConnectionFragment.setConnectionInfo(setText);
                    }
                });
            }
        }.start();
    }

    @Override
    public void setConnectionButton(final boolean enabled) {
        new Thread()
        {
            public void run()
            {
                runOnUiThread(new Runnable()
                {
                    public void run()
                    {
                        // UI Update operations
                        ConnectionFragment.setButtonState(enabled);
                    }
                });
            }
        }.start();
    }
=======
>>>>>>> de414d6... Update Model View Presenter
    @Override
    protected  void onDestroy(){
        super.onDestroy();
    }

<<<<<<< HEAD

=======
    @Override
    public void connectionBtnClicked(String ipAdress) {

        connectionPresenterInt = new ConnectionPresenterImpl();
        connectionPresenterInt.connectToServer(ipAdress);
    }
>>>>>>> de414d6... Update Model View Presenter
}
