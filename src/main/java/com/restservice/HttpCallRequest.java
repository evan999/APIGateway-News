package com.restservice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.http.HttpClient;

public class HttpCallRequest {
    
    private static HttpURLConnection connection;
    /*
    private final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();
     */
    
    public static String httpCallRequest(String urlString) throws MalformedURLException{
        Buffered

        try{
            URL url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();

            if(status > 200) {
                reader
            }

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            )
            String line;
            while((line = reader.readLine()) != null) {
                responseContent.append(line);
            }
            StringBuffer response = new StringBuffer();
        }
    }
}
