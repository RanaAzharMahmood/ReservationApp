package com.example.reservationapp;

import android.graphics.Color;
import android.os.Bundle;
import android.transition.Slide;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.Button;
import android.content.Context;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment  {
    Button button;
    Context context;
    CardView cardview;
    LayoutParams layoutparams;
    TextView textview;
    RelativeLayout relativeLayout;
    ImageSlider imageSlider;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=  inflater.inflate(R.layout.fragment_home,container,false);

        imageSlider=v.findViewById(R.id.image_slider);
        List<SlideModel> list=new ArrayList<SlideModel>();
        list.add(new SlideModel("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.scientificamerican.com%2Farticle%2Fthe-nature-cure%2F&psig=AOvVaw2dZFNGrZli3hyQsiauMthb&ust=1602963415644000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJjGiJruuewCFQAAAAAdAAAAABAD","Reservation image"));
        list.add(new SlideModel("https://www.google.com/imgres?imgurl=https%3A%2F%2Ftherightsofnature.org%2Fwp-content%2Fuploads%2F2018%2F01%2Fturkey-3048299_1920-1366x550.jpg&imgrefurl=https%3A%2F%2Ftherightsofnature.org%2Fwhat-is-rights-of-nature%2F&tbnid=3GBeGyplemnTdM&vet=12ahUKEwi3rYuZ7rnsAhVJZxoKHXxYBcAQMygEegUIARDUAQ..i&docid=J6dbQkvxp3SRYM&w=1366&h=550&q=nature&ved=2ahUKEwi3rYuZ7rnsAhVJZxoKHXxYBcAQMygEegUIARDUAQ","OtherImage"));
        imageSlider.setImageList(list,true);


        return v;
    }


}
