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
            //����̨������Ϣ
            content = sc.nextLine();

            //���շ��صĽ��
            String result = api.getResult(content);

            //��json��ʽ���ַ���ת��Ϊjson����
            JsonObject json = new JsonParser().parse(result).getAsJsonObject();
            //���text�������ݣ���ת��Ϊstring
            String back = json.get("text").toString();

            //��ӡ���
            System.out.println(back);
        }
	}

}
