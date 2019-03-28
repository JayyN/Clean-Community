package com.pattersonhs.jaylinn.cleancommunity;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
public class CleanCommunityMainActivity extends AppCompatActivity {
    RadioButton Recycling;
    RadioButton CommunityGarden;
    RadioButton TrashPickUp;
    TextView CleanCommunity;
    Button SignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clean_community_main);
        Recycling = (RadioButton) findViewById(R.id.Recycling);
        CommunityGarden = (RadioButton) findViewById(R.id.CommunityGarden);
        TrashPickUp = (RadioButton) findViewById(R.id.TrashPickUp);
        CleanCommunity = (TextView) findViewById(R.id.CleanCommunity);
        SignIn = (Button) findViewById(R.id.SignIn);

    }
}
