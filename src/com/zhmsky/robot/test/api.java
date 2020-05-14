package com.zhmsky.robot.test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class api {
	 private static final String key = "d7153757da8e448f986709d8028a0df5";
	 protected static final String getResult( String content ) {
	        //ͼ��api�ӿ�
	        String apiUrl = "http://www.tuling123.com/openapi/api?key="+key+"&info=";
	        try {
	            //������Ҫutf-8����(�ٷ��ĵ�����˵��)
	            content = URLEncoder.encode(content, "utf-8");
	            //ƴ��url
	            apiUrl = apiUrl + content;
	        } catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	        }
	        //��װ����ͷ
	        HttpGet request = new HttpGet(apiUrl);

	        String result = "";

	        try {
	            //����http����
	            HttpResponse response = HttpClients.createDefault().execute(request);
	            //��ȡ��Ӧ��
	            int code = response.getStatusLine().getStatusCode();
	            if (code == 200) {
	                //��ȡ���صĽ��
	                result = EntityUtils.toString(response.getEntity());
	            } else {
	                System.out.println("code=" + code);
	            }
	        } catch (ClientProtocolException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        //���ؽ��
	        return result;
	    }

}
