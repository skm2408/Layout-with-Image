package com.example.shubhammishra.layoutwithimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Random;

public class ImageLayout extends AppCompatActivity {
    ListView lst;
    ArrayList<Profile> arr=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_layout);
        populateList();
        lst=findViewById(R.id.profile);
        NewAdapter na=new NewAdapter(arr);
        lst.setAdapter(na);
    }

    private void populateList() {
        String name[]={"Shubham Mishra","Saurabh Vaish","Divyam Raj","Piyush Tiwari","Aman Goyal","Shubham Shukla"};
        String address[]={"abc","def","ghi","jkl","mno","pqr"};
        String city[]={"Sitapur","Delhi","Basti","Agra","Gaya","Jhansi"};
        Integer imageID[]={R.drawable.sample,R.drawable.sample2,R.drawable.sample3,R.drawable.sample4,R.drawable.sample5};
        int phone[]={85,99,70,91,72,91};
        int pincode=20000;
        Random r=new Random();
        for(int i=0;i<100;i++)
            arr.add(new Profile(name[r.nextInt(6)],address[r.nextInt(6)],city[r.nextInt(6)],phone[r.nextInt(6)],pincode+r.nextInt(100),imageID[r.nextInt(5)]));
    }

}
