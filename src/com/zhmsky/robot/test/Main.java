package com.zhmsky.robot.test;

import java.util.Scanner;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.zhmsky.robot.test.api;;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        while(true) {
            String content = "";
            //控制台输入信息
            content = sc.nextLine();

            //接收返回的结果
            String result = api.getResult(content);

            //把json格式的字符串转化为json对象
            JsonObject json = new JsonParser().parse(result).getAsJsonObject();
            //获得text键的内容，并转化为string
            String back = json.get("text").toString();

            //打印结果
            System.out.println(back);
        }
	}

}
