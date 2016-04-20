package com.example.zjwlong.recyclerviewdemo00;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<String> mDatas;
    private MySimpleAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDatas();

        initViews();

        mAdapter = new MySimpleAdapter(this, mDatas);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

//        recyclerView.addItemDecoration(
//                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST)
//        );

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void initDatas()
    {
        mDatas = new ArrayList<String>();
        for (int i = 'A'; i <= 'z'; i++){
            mDatas.add("" + (char) i);
        }

    }

    private void initViews()
    {
        recyclerView = (RecyclerView) findViewById(R.id.id_recyclerView);
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

        switch(id){
            case R.id.action_gridview:
                recyclerView.setLayoutManager(
                        new GridLayoutManager(this,3));
                break;
            case R.id.action_listview:
                recyclerView.setLayoutManager(
                        new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
                break;
            case R.id.action_hor_gridview:
                recyclerView.setLayoutManager(
                        new StaggeredGridLayoutManager(6,StaggeredGridLayoutManager.HORIZONTAL)
                );
                break;
            case R.id.action_ver_gridview:
                Intent demo_intent = new Intent(this,DemoRotateImage.class);
                startActivity(demo_intent);
                break;
            case R.id.action_stagged_gridview:
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
