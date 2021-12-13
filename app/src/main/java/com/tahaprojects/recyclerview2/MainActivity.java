package com.tahaprojects.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactsRecView;
    //private Button btnFont;
    private FloatingActionButton btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactsRecView=findViewById(R.id.recyclerView);
        btnShow=findViewById(R.id.btnShow);
        //btnFont=findViewById(R.id.btnFont);
        contactsRecView.setLayoutManager(new GridLayoutManager(this,2));
        Typeface typeface=getResources().getFont(R.font.amsterdam);
        //Typeface typeface1= ResourcesCompat.getFont(this,R.font.amsterdam);
        ArrayList<Contacts> contactsArrayList=new ArrayList<>();
        contactsArrayList.add(new Contacts("Thanzila Ulfath","thanzila059@gmail.com","https://static.vecteezy.com/system/resources/previews/000/559/309/original/vector-cute-girl-wearing-santa-hat.jpg"));
        contactsArrayList.add(new Contacts("Thanzila Ulfat","thanzila059@gmail.com","https://static.vecteezy.com/system/resources/previews/000/549/264/original/vector-a-boy-scout-wearing-uniform.jpg"));
        contactsArrayList.add(new Contacts("Thanzila Ulfh","thanzila059@gmail.com","http://www.clipartbest.com/cliparts/ncB/Bp4/ncBBp44cA.png"));
        contactsArrayList.add(new Contacts("Thanzilath","thanzila059@gmail.com","https://static.vecteezy.com/system/resources/previews/000/559/309/original/vector-cute-girl-wearing-santa-hat.jpg"));
        contactsArrayList.add(new Contacts("Tha Ulfath","thanzila059@gmial.com","http://www.clipartbest.com/cliparts/yio/6rR/yio6rRjrT.png"));
        contactsArrayList.add(new Contacts("Thla Ulfath","thanzila059@gmial.com","http://images.clipartpanda.com/principal-clipart-354bf64a15f9f816fa5fe3353341dc96.jpg"));
        contactsArrayList.add(new Contacts("Thala Ulfath","thanzila059@gmial.com","https://webstockreview.net/images/animated-clipart-child-5.jpg"));
        contactsArrayList.add(new Contacts("Thanila Ulfath","thanzila059@gmial.com","https://i.pinimg.com/originals/0c/08/27/0c08278208f9f7a82bd010d6116cf0ab.jpg"));
        contactsArrayList.add(new Contacts("Thanzila","thanzila059@gmial.com","http://ww1.prweb.com/prfiles/2014/06/04/11916176/straw.basic.jpg"));
        contactsArrayList.add(new Contacts("Thanzil","thanzila059@gmial.com","https://i.pinimg.com/originals/8b/fa/f0/8bfaf0d7f5feb4faf78ead26db771c54.png"));
        contactsArrayList.add(new Contacts("Thanzila Ulfath","thanzila059@gmial.com","https://i.pinimg.com/originals/d0/18/af/d018af0e34cefe22fb9f7c0197dfa1ae.png"));
        contactsArrayList.add(new Contacts("Thanzilh","thanzila059@gmial.com","https://i.pinimg.com/originals/2c/0a/00/2c0a00295dad1c17e9b53bae08ce64f7.jpg"));
        contactsArrayList.add(new Contacts("Thanz","thanzila059@gmial.com","https://i.pinimg.com/736x/87/98/bb/8798bbd772137bb3d7ff09cbf192ece6.jpg"));
        contactsArrayList.add(new Contacts("ThanzU","thanzila059@gmial.com","https://i.pinimg.com/originals/bc/c3/c5/bcc3c5f052789fcba65ef6273042e950.jpg"));
        contactsArrayList.add(new Contacts("Thanzi","thanzila059@gmial.com","https://i.pinimg.com/originals/2f/21/ed/2f21ed3c352aa7049078a733d562a536.png"));


        ContactsRecViewAdapter adapter=new ContactsRecViewAdapter(this);
        adapter.setContactsArrayList(contactsArrayList);
        contactsRecView.setAdapter(adapter);

        //contactsRecView.setLayoutManager(new LinearLayoutManager(this));
        //contactsRecView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

/*        btnFont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //CardView cardView = findViewById(R.id.)
                TextView textView=findViewById(R.id.txtName);
                textView.setTypeface(typeface);
        });*/
        contactsRecView.setLayoutManager(new GridLayoutManager(this,2));
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contactsRecView.setVisibility(View.VISIBLE);
                //System.out.println(contactsRecView.getChildAt(0).getId());
            }
        });
    }
}