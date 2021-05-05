package com.example.lab06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Student> listStudent;
    ListView lvStudent;
    StudentListViewAdapter lvAdapter;
    String nameAdd;
    EditText plt;
    int iSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listStudent=new ArrayList<>();
        listStudent.add(new Student(1, "Nguyen Ngoc Ha", "Da Lat"));
        listStudent.add(new Student(1, "Đỗ Anh Bôn", "Da Lat"));
        listStudent.add(new Student(1, "Hoàng Quốc Cường", "Da Lat"));
        listStudent.add(new Student(1, "Phạm Minh Dũng", "Da Lat"));
        listStudent.add(new Student(1, "Châu Hoàng Duy", "Da Lat"));
        listStudent.add(new Student(1, "Trần Nhật Duy", "Da Lat"));
        lvAdapter=new StudentListViewAdapter(listStudent);

        lvStudent = findViewById(R.id.lvName);
        lvStudent.setAdapter(lvAdapter);

        lvStudent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Student product = (Student) lvAdapter.getItem(position);
                iSelect=position;
                //Làm gì đó khi chọn sản phẩm (ví dụ tạo một Activity hiện thị chi tiết, biên tập ..)
                //Toast.makeText(MainActivity.this, product.getName(), Toast.LENGTH_LONG).show();
            }
        });

        findViewById(R.id.btnRemove).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listStudent.size() > 0) {
                    //Xoá phần tử đầu tiên của danh sách
                    //int productpost = 0;
                    listStudent.remove(iSelect);
                    lvAdapter.notifyDataSetChanged();
                }
            }
        });

        plt=findViewById(R.id.txtName);

        findViewById(R.id.btnAdd).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                nameAdd=plt.getText().toString().trim();//((EditText)findViewById(R.id.txtName)).getText().toString().trim();//
                listStudent.add(new Student(nameAdd));
                lvAdapter.notifyDataSetChanged();
            }
        });
    }




}