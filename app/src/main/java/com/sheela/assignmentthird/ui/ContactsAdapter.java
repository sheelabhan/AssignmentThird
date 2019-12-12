package com.sheela.assignmentthird.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sheela.assignmentthird.R;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {
    Context mContext;
    List<Contacts> contactsList;
    private ContactsViewHolder holder;
    private int position;

    public ContactsAdapter(Context mContext, List<Contacts> contactsList) {
        this.mContext = mContext;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_contacts, parent, false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, final int position) {
        final Contacts contacts = contactsList.get(position);
        holder.imgProfile.setImageResource(contacts.getimageId());
        holder.tvName.setText(contacts.getName());
        holder.tvAge.setText(contacts.getAge());
        holder.tvLocation.setText(contacts.getLocation());
        holder.tvGender.setText(contacts.getGender());
        holder.btnDelete.setText(contacts.getButton());
        holder.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contactsList.remove(position);
                notifyItemRemoved(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder {
        ImageView imgProfile;
        TextView tvName, tvAge, tvLocation, tvGender;
        Button btnDelete;


        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile = itemView.findViewById(R.id.imgProfile);
            tvName = itemView.findViewById(R.id.tvName);
            tvAge = itemView.findViewById(R.id.tvAge);
            tvLocation = itemView.findViewById(R.id.tvLocation);
            tvGender = itemView.findViewById(R.id.tvGender);
            btnDelete=itemView.findViewById(R.id.btnDelete);
        }
    }

}
