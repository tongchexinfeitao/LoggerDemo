package com.example.loggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.orhanobut.logger.Logger;

import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        LogUtils.v("1506a", 1000);
//        LogUtils.d("1506a", 1000);
//        Person person = new Person("赵四", "男", new Person.Job("村长", "农村"));
//        LogUtils.d(person);
//        LogUtils.d("1506a",person);

        Logger.v("这是1506a");


        //第一个参数是字符串的格式,可以放一些占位符,然后传入多参去替换占位符
        // %s占位符 可以代替一个字符串;      %d占位符,他可以替代一个整数  %f占位符,他可以代替一个浮点型的数字

        String a = "1506a";
        int b = 18;
        //可以传入一个 格式字符串,然后通过占位符传入多参
        Logger.w("我是%s班级的,我今年%d岁,我有%f元", a, b, 3.5);


        //设置自己的tag,使用 init方法 ,以后所有的tag都会变成我设置的这个
//        Logger.init("150a");
        Logger.w("我是%s班级的,我今年%d岁,我有%f元", a, b, 3.5);


        //我只想当前的这一条log,他的tag是1506a
        Logger.t("150a").w("我是%s班级的,我今年%d岁,我有%f元", a, b, 3.5);


        //实验一下.t能不能改变所有的log的tag
        Logger.w("我是%s班级的,我今年%d岁,我有%f元", a, b, 3.5);

        //Logger打印Json
        String json = newJson();
        Logger.json(json);
        Log.i("tag", json);

        //重置Logger的一些参数 methodCount = 2;  methodOffset = 0;showThreadInfo = true; logLevel = LogLevel.FULL;
        /**
         * 重置Logger的一些参数
         * methodCount = 2;
         *  methodOffset = 0
         * showThreadInfo = true
         * logLevel = LogLevel.FULL
         */
        Logger.resetSettings();
        Logger.w("我是%s班级的,我今年%d岁,我有%f元", a, b, 3.5);
    }

    private String newJson() {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("name", "王非");
            jsonObject.put("gender", "女");

            JSONObject jsonObject1 = new JSONObject();
            jsonObject1.put("work", "明星");
            jsonObject1.put("workLocation", "横店");
            jsonObject.put("job", jsonObject1);

            return jsonObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return "";
    }


}
