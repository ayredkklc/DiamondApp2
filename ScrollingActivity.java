package com.example.diamondapp;

import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        toolBarLayout.setTitle(getTitle());

        String text = "Composting\n" +
                "Composting turns household wastes into valuable fertilizer and soil organic matter.It is a process that works to speed up the natural decay of organic material by providing the ideal conditions for detritus-eating organisms to thrive.\n" +
                "Composting Basics\n" +
                "All composting requires three basic ingredients:\n" +
                "\to Browns - This includes materials such as dead leaves, branches, and twigs. \n" +
                "\to Greens - This includes materials such as grass clippings, vegetable waste, fruit scraps, and coffee grounds.\n" +
                "\to Water - Having the right amount of water, greens, and browns is important for compost development.\n" +
                "What Not To Compost and Why\n" +
                "\to Black walnut tree leaves or twigs\n" +
                "\t    \t-Releases substances that might be harmful to plants\n" +
                "\to Coal or charcoal ash\n" +
                "\t\t- Might contain substances harmful to plants\n" +
                "\to Dairy products (e.g., butter, milk, sour cream, yogurt) and eggs*\n" +
                "\t\t- Create odor problems and attract pests such as rodents and flies\n" +
                "\to Diseased or insect-ridden plants\n" +
                "\t\t- Diseases or insects might survive and be transferred back to other plants\n" +
                "\to Fats, grease, lard, or oils*\n" +
                "\t\t- Create odor problems and attract pests such as rodents and flies\n" +
                "\to Meat or fish bones and scraps*\n" +
                "\t\t- Create odor problems and attract pests such as rodents and flies\n" +
                "\to Pet wastes (e.g., dog or cat feces, soiled cat litter)*\n" +
                "\t\t- Might contain parasites, bacteria, germs, pathogens, and viruses harmful to humans\n" +
                "\to Yard trimmings treated with chemical pesticides\n" +
                "\t\t- Might kill beneficial composting organisms\n" +
                "* Check with your local composting or recycling coordinator to see if these organics are accepted by your community curbside or drop-off composting program.\n" +
                "Benefits of Composting\n" +
                "\to Enriches soil, helping retain moisture and suppress plant diseases and pests.\n" +
                "\to Reduces the need for chemical fertilizers.\n" +
                "\to Encourages the production of beneficial bacteria and fungi that break down organic matter to create humus, a rich nutrient-filled material.\n" +
                "\to Reduces methane emissions from landfills and lowers your carbon footprint.\n" +
                "\n" +
                "Recycling \n" +
                "Recycling is the process of converting waste materials into new materials and objects.\n" +
                "Benefits of Recycling\n" +
                "\to Reduces the amount of waste sent to landfills and incinerators\n" +
                "\to Conserves natural resources such as timber, water and minerals\n" +
                "\to Increases economic security by tapping a domestic source of materials\n" +
                "\to Prevents pollution by reducing the need to collect new raw materials\n" +
                "\to Saves energy\n" +
                "\to Supports American manufacturing and conserves valuable resources\n" +
                "\to Helps create jobs in the recycling and manufacturing industries in the United States\n" +
                "Common Recycling Mistakes\n" +
                "\to It can’t be recycled if it’s covered in food.\n" +
                "\to Putting recyclables in plastic bags.\n" +
                "\t\t- Any recycling that’s thrown out in a plastic bag will go straight to landfill, so it’s really just a waste of your time. \n" +
                "\to Batteries and electrical products can’t be recycled.\n";

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}