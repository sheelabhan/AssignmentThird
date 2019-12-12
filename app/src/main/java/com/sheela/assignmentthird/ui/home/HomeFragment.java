package com.sheela.assignmentthird.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sheela.assignmentthird.R;
import com.sheela.assignmentthird.ui.Contacts;
import com.sheela.assignmentthird.ui.ContactsAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView recyclerView;


      public View onCreateView(@NonNull LayoutInflater inflater,
                          ViewGroup container, Bundle savedInstanceState) {
//
      View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
          List<Contacts> contactsList = new ArrayList<>();
          contactsList.add(new Contacts("Sheela Bhandari","20","Anamnagar",
                  "Female", R.drawable.female,"Delete"));
          contactsList.add(new Contacts("Remon Subedi","21","Sydney",
                  "Male", R.drawable.male,"Delete"));
          ContactsAdapter contactsAdapter = new ContactsAdapter(getContext(),contactsList);
          recyclerView.setAdapter(contactsAdapter);
          recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }


}
