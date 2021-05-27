package com.example.firstcbnu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class BuildingClicked extends Activity{  //검색 후 **대학 클릭시 넘어오는 액티비티
    private String buildname;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_clicked);

        Intent clickedintent = getIntent(); //Search.java에서 넘어오는 정보들을 받기위해 "getIntent()"함수의 변수를 선언
        buildname = clickedintent.getStringExtra("대학이름");   //buildname이라는 getIntent변수에 Search.java로 부터 넘어온 선택된 아이템의 string값을 저장한다.

        TextView building_name=(TextView)findViewById(R.id.building_name);  //listview에서 선택한 아이템의 string(대학이름)을 출력할 Textview
        ImageView buildingimg = (ImageView)findViewById(R.id.buildingimg);  //listview에서 선택한 아이템에 따라 보여질 사진을 출력할 Imageview

        switch(buildname){  //Search.java에서 선택된 아이템의 string값에 따라 switch문을 통해 출력값을 정한다.
            case "전자정보대학" :
                building_name.setText("전자정보대학");
                buildingimg.setImageResource(R.drawable.elecinfoimg);
                break;
            case "자연과학대학" :
                building_name.setText("자연과학대학");
                buildingimg.setImageResource(R.drawable.naturalscien);
                break;
            case "공과대학" :
                building_name.setText("공과대학");
                buildingimg.setImageResource(R.drawable.engineerimg);
                break;
            case "인문대학" :
                building_name.setText("인문대학");
                buildingimg.setImageResource(R.drawable.humanimg);
                break;
            case "사회과학대학" :
                building_name.setText("사회과학대학");
                buildingimg.setImageResource(R.drawable.socialscienimg);
                break;
            case "경영대학" :
                building_name.setText("경영대학");
                buildingimg.setImageResource(R.drawable.operationimg);
                break;
            case "농업생명환경대학" :
                building_name.setText("농업생명환경대학");
                buildingimg.setImageResource(R.drawable.agricultualimg);
                break;
            case "사범대학" :
                building_name.setText("사범대학");
                buildingimg.setImageResource(R.drawable.educationimg);
                break;
            case "생활과학대학" :
                building_name.setText("생활과학대학");
                buildingimg.setImageResource(R.drawable.lifescienimg);
                break;
            case "수의과대학" :
                building_name.setText("수의과대학");
                buildingimg.setImageResource(R.drawable.veterinaryimg);
                break;
            case "의과대학" :
                building_name.setText("의과대학");
                buildingimg.setImageResource(R.drawable.medicalimg);
                break;
        }

    }
}
