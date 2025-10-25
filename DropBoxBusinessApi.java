package org.goofy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DropBoxBusinessApi {

    //  Replace with your actual Dropbox access token
    private static final String ACCESS_TOKEN = "ADD_ACCESS_TOKEN_HERE";

    public static void main(String[] args) {
        try {
            URL url = new URL("https://api.dropboxapi.com/2/team/get_info");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");

            // no body
            conn.setDoOutput(false);

            // only Authorization header; omit Content-Type
            conn.setRequestProperty("Authorization", "Bearer " + ACCESS_TOKEN);

            int responseCode = conn.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            (responseCode == 200) ? conn.getInputStream() : conn.getErrorStream()
                    )
            );
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) sb.append(line);
            reader.close();

            System.out.println("Response:");
            System.out.println(sb.toString());

            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}