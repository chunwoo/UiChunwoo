package com.example.tacademy.uichunwoo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;
import android.widget.TextView;

public class TabActivity extends AppCompatActivity {
    TabHost tabHost;

    public static final String TAB_ONE = "tab1";
    public static final String TAB_TWO = "tab2";
    public static final String TAB_THREE = "tab3";
    public static final String TAB_FOUR = "tab4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        tabHost = (TabHost)findViewById(R.id.tabHost);

        tabHost.setup();

        TextView tabSpec = (TextView)getLayoutInflater().inflate(R.layout.tab_spec, tabHost.getTabWidget(), false);
        tabSpec.setText("TAB1");
        tabHost.addTab(tabHost.newTabSpec(TAB_ONE).setIndicator(tabSpec)
                .setContent(R.id.tab1));

        tabSpec = (TextView)getLayoutInflater().inflate(R.layout.tab_spec, tabHost.getTabWidget(), false);
        tabSpec.setText("TAB2");
        tabHost.addTab(tabHost.newTabSpec(TAB_TWO).setIndicator(tabSpec)
                .setContent(R.id.tab2));

        tabSpec = (TextView)getLayoutInflater().inflate(R.layout.tab_spec, tabHost.getTabWidget(), false);
        tabSpec.setText("TAB3");
        tabHost.addTab(tabHost.newTabSpec(TAB_THREE).setIndicator(tabSpec)
                .setContent(R.id.tab3));

        tabSpec = (TextView)getLayoutInflater().inflate(R.layout.tab_spec, tabHost.getTabWidget(), false);
        tabSpec.setText("TAB4");
        tabHost.addTab(tabHost.newTabSpec(TAB_THREE).setIndicator(tabSpec)
                .setContent(R.id.tab4));

        tabHost.setCurrentTabByTag(TAB_TWO);



    }
}
