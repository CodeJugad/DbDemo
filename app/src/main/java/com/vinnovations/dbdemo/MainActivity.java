package com.vinnovations.dbdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.vinnovations.dbdemo.data.MyDbHandler;
import com.vinnovations.dbdemo.model.Contact;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDbHandler db = new MyDbHandler(MainActivity.this);

        // both are correct
        Contact c1 = new Contact("yogesh","1234567890");
        Contact c2 = new Contact();
        c2.setName("yogi");
        c2.setPhoneNumber("321");

        db.addContact(c1);
        db.addContact(c2);

        List<Contact> allContacts = db.getAllContacts();
        for(Contact contact: allContacts) {
            Log.d("dbharry", "\nId: " + contact.getId() + "\n" +
                    "Name: " + contact.getName() + "\n" +
                    "Phone Number: " + contact.getPhoneNumber() + "\n");

        }


    }
}