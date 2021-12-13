package com.tahaprojects.recyclerview2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ContactsRecViewAdapter extends RecyclerView.Adapter<ContactsRecViewAdapter.ViewHolder>{


    private ArrayList<Contacts> contactsArrayList=new ArrayList<>();
    private Context context;
    private TextView txtName,txtEmail;
    private ImageView imgContact;
    private CardView parent;
    Typeface typeFace;

    public ContactsRecViewAdapter(Context context) {
        this.context = context;
    }

    public ContactsRecViewAdapter(ArrayList<Contacts> contactsArrayList) {
        this.contactsArrayList = contactsArrayList;

    }

    public void setContactsArrayList(ArrayList<Contacts> contactsArrayList) {
        this.contactsArrayList = contactsArrayList;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list_layout,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        txtName.setText(contactsArrayList.get(position).getName());
        txtEmail.setText(contactsArrayList.get(position).getEmail());
/*        holder.btnFont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //holder.parent.setVisibility(View.GONE);
                //holder.txtName.setTypeface();
                holder.txtName.setTypeface(typeFace);
            }
        });*/
        parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, contactsArrayList.get(position).getName()+" Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        Glide.with(context).asBitmap().load(contactsArrayList.get(position).getImgURL()).into(imgContact);

    }

    @Override
    public int getItemCount() {
        return contactsArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        //private Button btnFont;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            typeFace =itemView.getResources().getFont(R.font.amsterdam);
            txtName=itemView.findViewById(R.id.txtName);
            parent=itemView.findViewById(R.id.parent);
            txtEmail=itemView.findViewById(R.id.txtEmail);
            imgContact=itemView.findViewById(R.id.imgContact);
            //btnFont=itemView.findViewById(R.id.btnFont);
            //txtName.setTypeface(typeFace);

        }
    }

}
