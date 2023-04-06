package com.example.relativelayoutloginpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class admin_approval extends AppCompatActivity {

    Spinner Choosecampus, Chooseschool, Chooseprogram, Choosebranch;
    ArrayList<String> arrIds = new ArrayList<>();
    ArrayList<String> arrayList_school;
    ArrayAdapter<String> arrayAdapter_school;

    ArrayList<String> arrayList_soet, arrayList_soph, arrayList_soas, arrayList_sofs, arrayList_somc, arrayList_sop, arrayList_som, arrayList_sovet;
    ArrayAdapter<String> arrayAdapter_program;

    ArrayList<String> arrayList_btech, arrayList_mtech, arrayList_bop, arrayList_mop, arrayList_dop, arrayList_soasbsc,arrayList_mca, arrayList_bca, arrayList_sofsbsc, arrayList_sofsmsc, arrayList_bmc, arrayList_somcbsc, arrayList_sopbsc, arrayList_sopboptt, arrayList_sopbp, arrayList_sopmsc, arrayList_sopdiploma, arrayList_bc, arrayList_bba, arrayList_mba, arrayList_diploma;
    ArrayAdapter<String> arrayAdapter_branch, arrayAdapter_pharmacy_branch;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_approval);

        Choosecampus = (Spinner) findViewById(R.id.campus_spinner);
        Chooseschool = (Spinner) findViewById(R.id.school_spinner);
        Chooseprogram = (Spinner) findViewById(R.id.program_spinner);
        Choosebranch = (Spinner) findViewById(R.id.branch_spinner);

        Choosecampus = findViewById(R.id.campus_spinner);
        //Spinner
        arrIds.add("Balasore");
        arrIds.add("Bhubaneswar");
        arrIds.add("Balangir");
        arrIds.add("Chatrapur");
        arrIds.add("Paralakhemundi");
        arrIds.add("Rayagada");
        arrIds.add("Vizianagaram");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, arrIds);
        Choosecampus.setAdapter(spinnerAdapter);


        arrayList_school=new ArrayList<>();
        arrayList_school.add("School of Engineering and Technology");
        arrayList_school.add("School of Pharmacy");
        arrayList_school.add("School of Applied Science");
        arrayList_school.add("School of Forensic Sciences");
        arrayList_school.add("School of Media & Communication");
        arrayList_school.add("School of Paramedics & Allied Health Sciences");
        arrayList_school.add("School of Management");
        arrayList_school.add("School of Vocational Education & Training");

        arrayAdapter_school=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_school);
        Chooseschool.setAdapter(arrayAdapter_school);

        //******Under the school program spinner******//
        arrayList_soet=new ArrayList<>();
        arrayList_soet.add("Bachelor of Technology");
        arrayList_soet.add("Master of Technology");

        arrayAdapter_branch=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_soet);
        Choosebranch.setAdapter(arrayAdapter_branch);


        arrayList_soph=new ArrayList<>();
        arrayList_soph.add("Bachelor of Pharmacy");
        arrayList_soph.add("Master of Pharmacy");
        arrayList_soph.add("Diploma in Pharmacy");

        arrayAdapter_branch=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_soph);
        Choosebranch.setAdapter(arrayAdapter_pharmacy_branch);

        arrayList_soas=new ArrayList<>();
        arrayList_soas.add("Bachelor of Science");
        arrayList_soas.add("Master in Computer Applications");
        arrayList_soas.add("Bachelor of Computer Application");

        arrayList_sofs=new ArrayList<>();
        arrayList_sofs.add("Bachelor of Science");
        arrayList_sofs.add("Master of Science");

        arrayList_somc=new ArrayList<>();
        arrayList_somc.add("Bachelor of Media and Communication");
        arrayList_somc.add("Bachelor of Science");

        arrayList_sop=new ArrayList<>();
        arrayList_sop.add("Bachelor of Science");
        arrayList_sop.add("Bachelor of Operation Theatre Technology");
        arrayList_sop.add("Bachelor of Physiotherapy");
        arrayList_sop.add("Master of Science");
        arrayList_sop.add("Diploma");

        arrayList_som=new ArrayList<>();
        arrayList_som.add("Bachelor of Commerce");
        arrayList_som.add("Bachelor of Business Administration");
        arrayList_som.add("Master of Business Administration");

        arrayList_sovet=new ArrayList<>();
        arrayList_sovet.add("Diploma");

        Chooseschool.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                if (position==0)
                {
                    arrayAdapter_program=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_soet);
                }

                if (position==1)
                {
                    arrayAdapter_program=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_soph);
                }

                if (position==2)
                {
                    arrayAdapter_program=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_soas);
                }

                if (position==3)
                {
                    arrayAdapter_program=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_sofs);
                }

                if (position==4)
                {
                    arrayAdapter_program=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_somc);
                }

                if (position==5)
                {
                    arrayAdapter_program=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_sop);
                }

                if (position==6)
                {
                    arrayAdapter_program=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_som);
                }

                if (position==7)
                {
                    arrayAdapter_program=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_sovet);
                }

                Chooseprogram.setAdapter(arrayAdapter_program);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        //******Under the program - branch spinner******//
        arrayList_btech=new ArrayList<>();
        arrayList_btech.add("Computer Science and Engineering");
        arrayList_btech.add("Civil Engineering");
        arrayList_btech.add("Electronics and Communication Engineering");
        arrayList_btech.add("Electrical Engineering");
        arrayList_btech.add("Electrical and Electronics Engineering");
        arrayList_btech.add("Mechanical Engineering");
        arrayList_btech.add("Bio-Technology Engineering");
        arrayList_btech.add("Mining Engineering");
        arrayList_btech.add("Cloud Technology and Information Security Engineering");
        arrayList_btech.add("Aerospace Engineering");


        arrayList_mtech=new ArrayList<>();
        arrayList_mtech.add("Communication Systems Engineering");
        arrayList_mtech.add("Design and Manufacturing Engineering");
        arrayList_mtech.add("Structural Engineering");
        arrayList_mtech.add("Transportation Engineering");
        arrayList_mtech.add("Data Science");

        arrayList_bop=new ArrayList<>();
        arrayList_bop.add("Bachelor of Pharmacy");

        arrayList_mop=new ArrayList<>();
        arrayList_mop.add("Life Science");
        arrayList_mop.add("Pharmaceutics");
        arrayList_mop.add("Industrial Pharmacy");
        arrayList_mop.add("Pharmaceutical Analysis");

        arrayList_dop=new ArrayList<>();
        arrayList_dop.add("Life Science");
        arrayList_dop.add("Pharmaceutics");




        Chooseprogram.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                if (position==0)
                {
                    arrayAdapter_branch=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_btech);
                }

                if (position==1)
                {
                    arrayAdapter_branch=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_mtech);
                }

                Choosebranch.setAdapter(arrayAdapter_branch);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




    }
}