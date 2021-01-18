package com.zpf.testhttpclient;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.net.www.http.HttpClient;

import java.io.IOException;


public class TestHttpClientApplication {

    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient= HttpClients.createDefault();
        //调用6次服务
        for (int i = 0; i <6; i++) {
            //调用Get
            HttpGet httpGet=new HttpGet("http://localhost:9000/router");
            //获取响应
            HttpResponse httpResponse=httpClient.execute(httpGet);
            //解析字符串
            System.out.println(EntityUtils.toString(httpResponse.getEntity()));
        }



    }

}
