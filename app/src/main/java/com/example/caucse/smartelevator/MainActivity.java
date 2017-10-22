package com.example.caucse.smartelevator;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {


    TextView tnumofpeople_left ;// = (TextView) findViewById(R.id.numOfpeople_left);

    TextView tnumofpeople_right;//  = (TextView) findViewById(R.id.numOfpeople_right);

    //num of people each floor
    TextView tpeople_left_6f ;// = (TextView) findViewById(R.id.people_left_6f);

    TextView tpeople_right_6f ;// = (TextView) findViewById(R.id.people_right_6f);

    TextView tpeople_left_5f ;// = (TextView) findViewById(R.id.people_left_5f);

    TextView tpeople_right_5f;//  = (TextView) findViewById(R.id.people_right_5f);

    TextView tpeople_left_4f ;// = (TextView) findViewById(R.id.people_left_4f);

    TextView tpeople_right_4f ;// = (TextView) findViewById(R.id.people_right_4f);

    TextView tpeople_left_3f;//  = (TextView) findViewById(R.id.people_left_3f);

    TextView tpeople_right_3f;//  = (TextView) findViewById(R.id.people_right_3f);

    TextView tpeople_left_2f;//  = (TextView) findViewById(R.id.people_left_2f);

    TextView tpeople_right_2f;//  = (TextView) findViewById(R.id.people_right_2f);

    TextView tpeople_left_1f;//  = (TextView) findViewById(R.id.people_left_1f);

    TextView tpeople_right_1f;//  = (TextView) findViewById(R.id.people_right_1f);

    //elevator Image
    ImageView elevator_left_6F;//  = (ImageView)findViewById(R.id.elevator_left_6F);
    //elevator_left_6F.setImageResource(R.drawable.elevator);
    ImageView elevator_left_5F;//  = (ImageView)findViewById(R.id.elevator_left_5F);
    //elevator_left_6F.setImageResource(R.drawable.elevator);
    ImageView elevator_left_4F ;// = (ImageView)findViewById(R.id.elevator_left_4F);
    //elevator_left_6F.setImageResource(R.drawable.elevator);
    ImageView elevator_left_3F;//  = (ImageView)findViewById(R.id.elevator_left_3F);
    //elevator_left_6F.setImageResource(R.drawable.elevator);
    ImageView elevator_left_2F;//  = (ImageView)findViewById(R.id.elevator_left_2F);
    //elevator_left_6F.setImageResource(R.drawable.elevator);
    ImageView elevator_left_1F;//  = (ImageView)findViewById(R.id.elevator_left_1F);
    //elevator_left_6F.setImageResource(R.drawable.elevator);

    ImageView elevator_right_6F;//  = (ImageView)findViewById(R.id.elevator_right_6F);
    //elevator_right_6F.setImageResource(R.drawable.elevator);
    ImageView elevator_right_5F;//  = (ImageView)findViewById(R.id.elevator_right_5F);
    //elevator_right_6F.setImageResource(R.drawable.elevator);
    ImageView elevator_right_4F;//  = (ImageView)findViewById(R.id.elevator_right_4F);
    //elevator_right_4F.setImageResource(R.drawable.elevator);
    ImageView elevator_right_3F ;// = (ImageView)findViewById(R.id.elevator_right_3F);
    //elevator_right_3F.setImageResource(R.drawable.elevator);
    ImageView elevator_right_2F ;// = (ImageView)findViewById(R.id.elevator_right_2F);
    //elevator_right_2F.setImageResource(R.drawable.elevator);
    ImageView elevator_right_1F;//  = (ImageView)findViewById(R.id.elevator_right_1F);
    //elevator_right_1F.setImageResource(R.drawable.elevator);
    //arrow up_left
    ImageView up_left_6f ;// = (ImageView)findViewById(R.id.up_left_6f);
    ImageView up_left_5f;//  = (ImageView)findViewById(R.id.up_left_5f);
    ImageView up_left_4f ;// = (ImageView)findViewById(R.id.up_left_4f);
    ImageView up_left_3f ;// = (ImageView)findViewById(R.id.up_left_3f);
    ImageView up_left_2f ;// = (ImageView)findViewById(R.id.up_left_2f);
    ImageView up_left_1f;//  = (ImageView)findViewById(R.id.up_left_1f);

    //up_left_6f.setImageResource(R.drawable.arrowup);
    //up_left_5f.setImageResource(R.drawable.arrowup);
    //upleft_4f.setImageResource(R.drawable.arrowup);
    //up_left_3f.setImageResource(R.drawable.arrowup);
    ///up_left_2f.setImageResource(R.drawable.arrowup);
    //up_left_1f.setImageResource(R.drawable.arrowup);
    //arrow up_right
    ImageView up_right_6f;//  = (ImageView)findViewById(R.id.up_right_6f);
    ImageView up_right_5f;//  = (ImageView)findViewById(R.id.up_right_5f);
    ImageView up_right_4f;//  = (ImageView)findViewById(R.id.up_right_4f);
    ImageView up_right_3f;// = (ImageView)findViewById(R.id.up_right_3f);
    ImageView up_right_2f;// = (ImageView)findViewById(R.id.up_right_2f);
    ImageView up_right_1f;

        //up_right_6f.setImageResource(R.drawable.arrowup);
        //up_right_5f.setImageResource(R.drawable.arrowup);
        //up_right_4f.setImageResource(R.drawable.arrowup);
        //up_right_3f.setImageResource(R.drawable.arrowup);
        //up_right_2f.setImageResource(R.drawable.arrowup);
        //up_right_1f.setImageResource(R.drawable.arrowup);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tnumofpeople_left = (TextView) findViewById(R.id.numOfpeople_left);

        tnumofpeople_right = (TextView) findViewById(R.id.numOfpeople_right);

        //num of people each floor
        tpeople_left_6f = (TextView) findViewById(R.id.people_left_6f);

        tpeople_right_6f = (TextView) findViewById(R.id.people_right_6f);

        tpeople_left_5f = (TextView) findViewById(R.id.people_left_5f);

         tpeople_right_5f = (TextView) findViewById(R.id.people_right_5f);

         tpeople_left_4f = (TextView) findViewById(R.id.people_left_4f);
        tpeople_right_4f = (TextView) findViewById(R.id.people_right_4f);

        tpeople_left_3f = (TextView) findViewById(R.id.people_left_3f);

         tpeople_right_3f = (TextView) findViewById(R.id.people_right_3f);

         tpeople_left_2f = (TextView) findViewById(R.id.people_left_2f);

         tpeople_right_2f = (TextView) findViewById(R.id.people_right_2f);

         tpeople_left_1f = (TextView) findViewById(R.id.people_left_1f);

         tpeople_right_1f = (TextView) findViewById(R.id.people_right_1f);

        //elevator Image
        elevator_left_6F = (ImageView)findViewById(R.id.elevator_left_6F);
        //elevator_left_6F.setImageResource(R.drawable.elevator);
        elevator_left_5F = (ImageView)findViewById(R.id.elevator_left_5F);
        //elevator_left_6F.setImageResource(R.drawable.elevator);
         elevator_left_4F = (ImageView)findViewById(R.id.elevator_left_4F);
        //elevator_left_6F.setImageResource(R.drawable.elevator);
        elevator_left_3F = (ImageView)findViewById(R.id.elevator_left_3F);
        //elevator_left_6F.setImageResource(R.drawable.elevator);
         elevator_left_2F = (ImageView)findViewById(R.id.elevator_left_2F);
        //elevator_left_6F.setImageResource(R.drawable.elevator);
         elevator_left_1F = (ImageView)findViewById(R.id.elevator_left_1F);
        //elevator_left_6F.setImageResource(R.drawable.elevator);

        elevator_right_6F = (ImageView)findViewById(R.id.elevator_right_6F);
        //elevator_right_6F.setImageResource(R.drawable.elevator);
        elevator_right_5F = (ImageView)findViewById(R.id.elevator_right_5F);
        //elevator_right_6F.setImageResource(R.drawable.elevator);
        elevator_right_4F = (ImageView)findViewById(R.id.elevator_right_4F);
        //elevator_right_4F.setImageResource(R.drawable.elevator);
        elevator_right_3F = (ImageView)findViewById(R.id.elevator_right_3F);
        //elevator_right_3F.setImageResource(R.drawable.elevator);
        elevator_right_2F = (ImageView)findViewById(R.id.elevator_right_2F);
        //elevator_right_2F.setImageResource(R.drawable.elevator);
        elevator_right_1F = (ImageView)findViewById(R.id.elevator_right_1F);
        //elevator_right_1F.setImageResource(R.drawable.elevator);
        //arrow up_left
         up_left_6f = (ImageView)findViewById(R.id.up_left_6f);
         up_left_5f = (ImageView)findViewById(R.id.up_left_5f);
        up_left_4f = (ImageView)findViewById(R.id.up_left_4f);
         up_left_3f = (ImageView)findViewById(R.id.up_left_3f);
         up_left_2f = (ImageView)findViewById(R.id.up_left_2f);
         up_left_1f = (ImageView)findViewById(R.id.up_left_1f);

        //up_left_6f.setImageResource(R.drawable.arrowup);
        //up_left_5f.setImageResource(R.drawable.arrowup);
        //upleft_4f.setImageResource(R.drawable.arrowup);
        //up_left_3f.setImageResource(R.drawable.arrowup);
        ///up_left_2f.setImageResource(R.drawable.arrowup);
        //up_left_1f.setImageResource(R.drawable.arrowup);
        //arrow up_right
         up_right_6f = (ImageView)findViewById(R.id.up_right_6f);
        up_right_5f = (ImageView)findViewById(R.id.up_right_5f);
         up_right_4f = (ImageView)findViewById(R.id.up_right_4f);
         up_right_3f = (ImageView)findViewById(R.id.up_right_3f);
         up_right_2f = (ImageView)findViewById(R.id.up_right_2f);
         up_right_1f = (ImageView)findViewById(R.id.up_right_1f);


    // Example of a call to a native method
        elevator_left_6F.setImageResource(R.drawable.elevator);
        //ageView elevator_left_5F = (ImageView)findViewById(R.id.elevator_left_5F);
        elevator_left_5F.setImageResource(R.drawable.elevator);
        //ImageView elevator_left_4F = (ImageView)findViewById(R.id.elevator_left_4F);
        elevator_left_4F.setImageResource(R.drawable.elevator);
        //ImageView elevator_left_3F = (ImageView)findViewById(R.id.elevator_left_3F);
        elevator_left_3F.setImageResource(R.drawable.elevator);
        //ImageView elevator_left_2F = (ImageView)findViewById(R.id.elevator_left_2F);
        elevator_left_2F.setImageResource(R.drawable.elevator);
        //ImageView elevator_left_1F = (ImageView)findViewById(R.id.elevator_left_1F);
        elevator_left_1F.setImageResource(R.drawable.elevator);

        //ImageView elevator_right_6F = (ImageView)findViewById(R.id.elevator_right_6F);
        elevator_right_6F.setImageResource(R.drawable.elevator);
        //ImageView elevator_right_5F = (ImageView)findViewById(R.id.elevator_right_5F);
        elevator_right_6F.setImageResource(R.drawable.elevator);
        //ImageView elevator_right_4F = (ImageView)findViewById(R.id.elevator_right_4F);
        elevator_right_4F.setImageResource(R.drawable.elevator);
        //ImageView elevator_right_3F = (ImageView)findViewById(R.id.elevator_right_3F);
        elevator_right_3F.setImageResource(R.drawable.elevator);
        //ImageView elevator_right_2F = (ImageView)findViewById(R.id.elevator_right_2F);
        elevator_right_2F.setImageResource(R.drawable.elevator);
        //ImageView elevator_right_1F = (ImageView)findViewById(R.id.elevator_right_1F);
        elevator_right_1F.setImageResource(R.drawable.elevator);


        up_left_6f.setImageResource(R.drawable.arrowup);
        up_left_5f.setImageResource(R.drawable.arrowup);
        up_left_4f.setImageResource(R.drawable.arrowup);
        up_left_3f.setImageResource(R.drawable.arrowup);
        up_left_2f.setImageResource(R.drawable.arrowup);
        up_left_1f.setImageResource(R.drawable.arrowup);

        up_right_6f.setImageResource(R.drawable.arrowup);
        up_right_5f.setImageResource(R.drawable.arrowup);
        up_right_4f.setImageResource(R.drawable.arrowup);
        up_right_3f.setImageResource(R.drawable.arrowup);
        up_right_2f.setImageResource(R.drawable.arrowup);
        up_right_1f.setImageResource(R.drawable.arrowup);





        //while(true)

        Thread leftThread = new Thread(new Runnable()
        {
            public void run()
            {

                Log.d("dddd","#333");
                while(true) {

                    GetData("01");
                    GetData("02");

                    try {
                        Thread.sleep(50);
                    }catch(Exception e){}

                }
            }
        });

        leftThread.start();

        // 이건 엘리베이터 내부의 데이터를 가져온다.


    }

    public void GetData(String elevnum)
    {
        class GetData extends AsyncTask<String,Void,String[]>
        {
            @Override
            protected void onPreExecute()
            {
                super.onPreExecute();
            }

            @Override
            protected void onPostExecute(String[] s )
            {
                super.onPostExecute(s);
                JSONArray ja;
                JSONObject jobj;
                try
                {
                    // 여기서 json의 파싱이 필요하다. 동시에 UI변경을 해야한다.
                    String elev_num = s[3]; // 엘리베이터 번호를 가져온다.

                    Log.d("JsonFloor",s[3]);
                    if(elev_num.equals("01"))
                    {

                        Log.d("Json",s[2]);

                        jobj = new JSONObject(s[2]); //
                        ja = (JSONArray) jobj.get("floor"); // floor로 된 정보를 가져온다.

                        for(int i=0;i<ja.length();i++)
                        {
                            JSONObject tmp = (JSONObject) ja.get(i);

                            final int people_num = Integer.valueOf((String)tmp.get("f1"));
                            // 이제 왼쪽 1층의 정보를 가져온다.
                           // tpeople_left_1f.setText(String.valueOf(people_num));
                            // 정보를 가져온다.


                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    tpeople_left_1f.setText(String.valueOf(people_num) +"명");
                                }
                            });

                        }
                        // 01번 엘리베이터일때랑 아닐때로 나눈다.

                        // 엘리베이터 내부의 문제를 해결해야한다.
                        jobj = new JSONObject(s[0]); //
                        Log.d("Eonji Babo",s[0]);
                        ja = (JSONArray) jobj.get("data"); // floor로 된 정보를 가져온다.

                        for(int i=0;i<ja.length();i++)
                        {
                            JSONObject tmp = (JSONObject) ja.get(i);

                            final int floor = Integer.valueOf((String)tmp.get("floor"));
                            // 01번 엘리베이터의 현재층
                            final int current = Integer.valueOf((String)tmp.get("current_people"));

                            final int moving = Integer.valueOf((String)tmp.get("moving"));


                            Log.d("ㅂㅂㅂㅂㅂㅂㅂ",String.valueOf(floor) +"/" + String.valueOf(current) + "/" + String.valueOf(moving));


                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    elevator_left_1F.setVisibility(View.INVISIBLE);
                                    elevator_left_2F.setVisibility(View.INVISIBLE);
                                    elevator_left_3F.setVisibility(View.INVISIBLE);
                                    elevator_left_4F.setVisibility(View.INVISIBLE);
                                    elevator_left_5F.setVisibility(View.INVISIBLE);
                                    elevator_left_6F.setVisibility(View.INVISIBLE);

                                    if(floor ==1)
                                        elevator_left_1F.setVisibility(View.VISIBLE);
                                    else if(floor==2)
                                        elevator_left_2F.setVisibility(View.VISIBLE);
                                    else if(floor==3)
                                        elevator_left_3F.setVisibility(View.VISIBLE);
                                    else if(floor==4)
                                        elevator_left_4F.setVisibility(View.VISIBLE);
                                    else if(floor==5)
                                        elevator_left_5F.setVisibility(View.VISIBLE);
                                    else if(floor==6)
                                        elevator_left_6F.setVisibility(View.VISIBLE);


                                    tnumofpeople_left.setText(String.valueOf(current) + "/15명");

                                    up_left_6f.setVisibility(View.INVISIBLE);
                                    up_left_5f.setVisibility(View.INVISIBLE);
                                    up_left_4f.setVisibility(View.INVISIBLE);//.setImageResource(R.drawable.arrowup);
                                    up_left_3f.setVisibility(View.INVISIBLE);//.setImageResource(R.drawable.arrowup);
                                    up_left_2f.setVisibility(View.INVISIBLE);//.setImageResource(R.drawable.arrowup);
                                    up_left_1f.setVisibility(View.INVISIBLE);//.setImageResource(R.drawable.arrowup);

                                    if(floor==1)
                                    {
                                        if(moving == 1)
                                        {
                                            up_left_1f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);

                                            up_left_1f.setImageResource(R.drawable.arrowup);
                                        }
                                        else if(moving ==-1)
                                        {
                                            up_left_1f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);
                                            up_left_1f.setImageResource(R.drawable.arrowdown);
                                        }
                                    }
                                    else if(floor==2)
                                    {
                                        if(moving == 1)
                                        {
                                            up_left_2f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);

                                            up_left_2f.setImageResource(R.drawable.arrowup);
                                        }
                                        else if(moving ==-1)
                                        {
                                            up_left_2f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);
                                            up_left_2f.setImageResource(R.drawable.arrowdown);
                                        }
                                    }
                                    else if(floor==3)
                                    {
                                        if(moving == 1)
                                        {
                                            up_left_3f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);

                                            up_left_3f.setImageResource(R.drawable.arrowup);
                                        }
                                        else if(moving ==-1)
                                        {
                                            up_left_3f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);
                                            up_left_3f.setImageResource(R.drawable.arrowdown);
                                        }
                                    }
                                    else if(floor==4)
                                    {
                                        if(moving == 1)
                                        {
                                            up_left_4f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);

                                            up_left_4f.setImageResource(R.drawable.arrowup);
                                        }
                                        else if(moving ==-1)
                                        {
                                            up_left_4f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);
                                            up_left_4f.setImageResource(R.drawable.arrowdown);
                                        }
                                    }
                                    else if(floor==5)
                                    {
                                        if(moving == 1)
                                        {
                                            up_left_5f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);

                                            up_left_5f.setImageResource(R.drawable.arrowup);
                                        }
                                        else if(moving ==-1)
                                        {
                                            up_left_5f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);
                                            up_left_5f.setImageResource(R.drawable.arrowdown);
                                        }
                                    }
                                    else if(floor==6)
                                    {
                                        if(moving == 1)
                                        {
                                            up_left_6f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);
                                            up_left_6f.setImageResource(R.drawable.arrowup);
                                        }
                                        else if(moving ==-1)
                                        {
                                            up_left_6f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);
                                            up_left_6f.setImageResource(R.drawable.arrowdown);
                                        }
                                    }

                                }
                            });

                        }

                        jobj = new JSONObject(s[1]); //
                        Log.d("Eonji Babo",s[1]);
                        ja = (JSONArray) jobj.get("data"); // floor로 된 정보를 가져온다.

                        for(int i=0;i<ja.length();i++)
                        {
                            JSONObject tmp = (JSONObject) ja.get(i);

                            final int f1 = Integer.valueOf((((String)tmp.get("f1")).split("/"))[0]);
                            // 01번 엘리베이터의 현재층
                            final int f2 = Integer.valueOf((((String)tmp.get("f2")).split("/"))[0]);

                            final int f3 = Integer.valueOf((((String)tmp.get("f3")).split("/"))[0]);

                            final int f4 = Integer.valueOf((((String)tmp.get("f4")).split("/"))[0]);

                            final int f5 = Integer.valueOf((((String)tmp.get("f5")).split("/"))[0]);

                            final int f6 = Integer.valueOf((((String)tmp.get("f6")).split("/"))[0]);

                            Log.d("Nanhee" , String.valueOf(f1));

                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {

                                    tpeople_left_2f.setText(String.valueOf(f2) + "명");
                                    tpeople_left_3f.setText(String.valueOf(f3) + "명");
                                    tpeople_left_4f.setText(String.valueOf(f4) + "명");
                                    tpeople_left_5f.setText(String.valueOf(f5) + "명");
                                    tpeople_left_6f.setText(String.valueOf(f6) + "명");

                                }
                            });

                        }
                    }
                    if(elev_num.equals("02"))
                    {

                        // 엘리베이터 내부의 문제를 해결해야한다.
                        jobj = new JSONObject(s[0]); //
                        Log.d("Eonji Babo",s[0]);
                        ja = (JSONArray) jobj.get("data"); // floor로 된 정보를 가져온다.

                        for(int i=0;i<ja.length();i++)
                        {
                            JSONObject tmp = (JSONObject) ja.get(i);

                            final int floor = Integer.valueOf((String)tmp.get("floor"));
                            // 01번 엘리베이터의 현재층
                            final int current = Integer.valueOf((String)tmp.get("current_people"));

                            final int moving = Integer.valueOf((String)tmp.get("moving"));


                            Log.d("02ㅂㅂㅂㅂㅂㅂㅂ",String.valueOf(floor) +"/" + String.valueOf(current) + "/" + String.valueOf(moving));


                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    elevator_right_1F.setVisibility(View.INVISIBLE);
                                    elevator_right_2F.setVisibility(View.INVISIBLE);
                                    elevator_right_3F.setVisibility(View.INVISIBLE);
                                    elevator_right_4F.setVisibility(View.INVISIBLE);
                                    elevator_right_5F.setVisibility(View.INVISIBLE);
                                    elevator_right_6F.setVisibility(View.INVISIBLE);

                                    if(floor ==1)
                                        elevator_right_1F.setVisibility(View.VISIBLE);
                                    else if(floor==2)
                                        elevator_right_2F.setVisibility(View.VISIBLE);
                                    else if(floor==3)
                                        elevator_right_3F.setVisibility(View.VISIBLE);
                                    else if(floor==4)
                                        elevator_right_4F.setVisibility(View.VISIBLE);
                                    else if(floor==5)
                                        elevator_right_5F.setVisibility(View.VISIBLE);
                                    else if(floor==6)
                                        elevator_right_6F.setVisibility(View.VISIBLE);


                                    tnumofpeople_right.setText(String.valueOf(current) + "/15명");

                                    up_right_6f.setVisibility(View.INVISIBLE);
                                    up_right_5f.setVisibility(View.INVISIBLE);
                                    up_right_4f.setVisibility(View.INVISIBLE);//.setImageResource(R.drawable.arrowup);
                                    up_right_3f.setVisibility(View.INVISIBLE);//.setImageResource(R.drawable.arrowup);
                                    up_right_2f.setVisibility(View.INVISIBLE);//.setImageResource(R.drawable.arrowup);
                                    up_right_1f.setVisibility(View.INVISIBLE);//.setImageResource(R.drawable.arrowup);

                                    if(floor==1)
                                    {
                                        if(moving == 1)
                                        {
                                            up_right_1f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);

                                            up_right_1f.setImageResource(R.drawable.arrowup);
                                        }
                                        else if(moving ==-1)
                                        {
                                            up_right_1f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);
                                            up_right_1f.setImageResource(R.drawable.arrowdown);
                                        }
                                    }
                                    else if(floor==2)
                                    {
                                        if(moving == 1)
                                        {
                                            up_right_2f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);

                                            up_right_2f.setImageResource(R.drawable.arrowup);
                                        }
                                        else if(moving ==-1)
                                        {
                                            up_right_2f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);
                                            up_right_2f.setImageResource(R.drawable.arrowdown);
                                        }
                                    }
                                    else if(floor==3)
                                    {
                                        if(moving == 1)
                                        {
                                            up_right_3f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);

                                            up_right_3f.setImageResource(R.drawable.arrowup);
                                        }
                                        else if(moving ==-1)
                                        {
                                            up_right_3f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);
                                            up_right_3f.setImageResource(R.drawable.arrowdown);
                                        }
                                    }
                                    else if(floor==4)
                                    {
                                        if(moving == 1)
                                        {
                                            up_right_4f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);

                                            up_right_4f.setImageResource(R.drawable.arrowup);
                                        }
                                        else if(moving ==-1)
                                        {
                                            up_right_4f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);
                                            up_right_4f.setImageResource(R.drawable.arrowdown);
                                        }
                                    }
                                    else if(floor==5)
                                    {
                                        if(moving == 1)
                                        {
                                            up_right_5f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);

                                            up_right_5f.setImageResource(R.drawable.arrowup);
                                        }
                                        else if(moving ==-1)
                                        {
                                            up_right_5f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);
                                            up_right_5f.setImageResource(R.drawable.arrowdown);
                                        }
                                    }
                                    else if(floor==6)
                                    {
                                        if(moving == 1)
                                        {
                                            up_right_6f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);
                                            up_right_6f.setImageResource(R.drawable.arrowup);
                                        }
                                        else if(moving ==-1)
                                        {
                                            up_right_6f.setVisibility(View.VISIBLE);//.setImageResource(R.drawable.arrowup);
                                            up_right_6f.setImageResource(R.drawable.arrowdown);
                                        }
                                    }

                                }
                            });

                        }

                        jobj = new JSONObject(s[1]); //
                        Log.d("Eonji Babo",s[1]);
                        ja = (JSONArray) jobj.get("data"); // floor로 된 정보를 가져온다.

                        for(int i=0;i<ja.length();i++)
                        {
                            JSONObject tmp = (JSONObject) ja.get(i);

                            final int f1 = Integer.valueOf((((String)tmp.get("f1")).split("/"))[0]);
                            // 01번 엘리베이터의 현재층
                            final int f2 = Integer.valueOf((((String)tmp.get("f2")).split("/"))[0]);

                            final int f3 = Integer.valueOf((((String)tmp.get("f3")).split("/"))[0]);

                            final int f4 = Integer.valueOf((((String)tmp.get("f4")).split("/"))[0]);

                            final int f5 = Integer.valueOf((((String)tmp.get("f5")).split("/"))[0]);

                            final int f6 = Integer.valueOf((((String)tmp.get("f6")).split("/"))[0]);


                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {

                                    tpeople_right_1f.setText(String.valueOf(f1) + "명");
                                    tpeople_right_2f.setText(String.valueOf(f2) + "명");
                                    tpeople_right_3f.setText(String.valueOf(f3) + "명");
                                    tpeople_right_4f.setText(String.valueOf(f4) + "명");
                                    tpeople_right_5f.setText(String.valueOf(f5) + "명");
                                    tpeople_right_6f.setText(String.valueOf(f6) + "명");

                                }
                            });

                        }
                    }




                }catch(Exception e){}
            }

            @Override
            protected String[] doInBackground(String... params)
            {
                String []  readData  = new String[4];
                String num = params[0]; // 엘리베이터의 숫자를 가져온다.
                StringBuilder jsonHtml = new StringBuilder();
                try {

                    Log.d("엘리베이터 번호 ", num);

                    String link = "http://35.201.148.240/read_state.php?num=" + num; // 엘리베이터의 상태를 가져온다.

                    Log.d("주소",link);

                    URL url = new URL(link);

                    HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // 연결하고

                    // get방식이라서 OutputStream이 없다.

                    if(conn == null)
                        Log.d("무엇이 문제인것인가","344443");

                    if(conn != null) {
                        Log.d("무엇이 문제인것인가","33");
                        conn.setConnectTimeout(10000);
                        conn.setUseCaches(false);

                        if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
                            for (; ; ) {
                                String line = br.readLine();
                                if (line == null) break;

                                jsonHtml.append(line + "\n");
                            }
                        }

                        Log.d("tag",jsonHtml.toString());
                        conn.disconnect(); // 연결을 종료한다
                    }

                }catch(Exception e){}

                readData[0] = new String(jsonHtml.toString()); // 우선 엘리베이터 내부의 데이터를 저장한다.

                // 여기는 엘리베이터 앞의 사람수와 방향을 가져오기 위함이다.
                jsonHtml = new StringBuilder();
                try {

                    //Log.d("엘리베이터 번호 ", num);

                    String link = "http://35.201.148.240/read_front.php?elev=" + num; // 엘리베이터의 상태를 가져온다.

                    URL url = new URL(link);

                    HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // 연결하고

                    // get방식이라서 OutputStream이 없다.

                    if(conn != null) {
                        conn.setConnectTimeout(10000);
                        conn.setUseCaches(false);

                        if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
                            for (; ; ) {
                                String line = br.readLine();
                                if (line == null) break;

                                jsonHtml.append(line + "\n");
                            }
                        }

                        conn.disconnect(); // 연결을 종료한다
                    }

                }catch(Exception e){}


                readData[1] = new String(jsonHtml.toString());

                if(num.equals("01"))
                {
                    // 01번 엘리베이터의 경우, 앞에서 다른 테이블을 이용해야한다.
                    jsonHtml = new StringBuilder();
                    try {

                        //Log.d("엘리베이터 번호 ", num);

                        String link = "http://35.201.148.240/read_left_front.php?"; // 엘리베이터의 상태를 가져온다.

                        URL url = new URL(link);

                        HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // 연결하고

                        // get방식이라서 OutputStream이 없다.

                        if(conn != null) {
                            conn.setConnectTimeout(10000);
                            conn.setUseCaches(false);

                            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
                                for (; ; ) {
                                    String line = br.readLine();
                                    if (line == null) break;

                                    jsonHtml.append(line + "\n");
                                }
                            }

                            conn.disconnect(); // 연결을 종료한다
                        }

                    }catch(Exception e){}

                    readData[2] = new String(jsonHtml.toString());
                    // json방식으로바꿔서 다시 대입.
                }


                readData[3] = new String(num); // 엘리베이터 번호를 저장한다

                return readData;
            }


        }

        GetData task = new GetData();

        task.execute(elevnum);
    }
    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
}
