package com.example.prince.fragment_modularui2;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Prince on 04-07-2017.
 */

public class FragmentA extends Fragment implements AdapterView.OnItemClickListener{
    ListView l;
  Communicator comm;
    public void setCommunicator(Communicator c){
        comm=c;
    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        l= (ListView) getActivity().findViewById(R.id.ll);
        ArrayAdapter adapter=ArrayAdapter.createFromResource(getActivity(),R.array.title,android.R.layout.simple_list_item_1);
        l.setAdapter(adapter);
        l.setOnItemClickListener(this);
        return inflater.inflate(R.layout.fragment_a, container, false);
}



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        comm.respond(position);
    }








    public interface Communicator{
        public void respond(int data);
    }
}
