package com.zff.myfirstdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.open_layotu);
        //这是主界面
    }

    public void openServer(View view) {
        Log.i("phone", "openServer: 手动开启服务");
        Intent intent = new Intent(this, PhoneStealService.class);
        startService(intent);
    }

//        listView = (ListView) findViewById(R.id.lv_id);
//
//        List<HashMap<String, Object>> hashMaps = new ArrayList<>();
//        String[] a = {"班长", "正班长", "副班长"};
//        String[] b = {"组长", "组长1", "组长2", "组长3", "组长4"};
//        String[] c = {"学员", "学员1", "学员2", "学员3", "学员4", "学员5"};
//
//        int[] image = {};
//        getList(a, image);
//        getList(b, image);
//        getList(c, image);
//
//
////        List<Student> students = new ArrayList<>();
////        students.add(new Student(1005, "张三", "平民"));
////        students.add(new Student(1001, "李四", "班长"));
////        students.add(new Student(1002, "王五", "组长"));
////        students.add(new Student(1003, "张权", "平民"));
////        students.add(new Student(1004, "张三", "平民"));
////
////        for (Student stu : students) {
////            System.out.println(stu);
////
////        }
////        System.out.println("___________________________");
////
//////        Collections.sort(students);
////
////        Collections.sort(students, new Comparator<Student>() {
////            @Override
////            public int compare(Student o1, Student o2) {
////                if (o2.getName().compareTo(o1.getName()) == 0) {
////                    return Integer.valueOf(o2.getId()).compareTo(Integer.valueOf(o1.getId()));
////                }
////                return o2.getName().compareTo(o1.getName());
////            }
////        });
////
////        for (Student stu : students) {
////            System.out.println(stu);
////
////        }
//    }
//
//    private void getList(String[] a, int[] image) {
//
//        for (int i = 0; i < a.length; i++) {
//            HashMap<String, Object> hashMap = new HashMap<>();
//            for (int j = 0; j < image.length; j++) {
//                if (i == 0) {
//
//                } else if (i == j - 1) {
//
//                }
//            }
//        }
//    }
}
