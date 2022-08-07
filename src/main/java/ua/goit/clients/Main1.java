package ua.goit.clients;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) throws Exception{
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(1,1);
//        map.put(2,2);
//
//        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
//
//        while (iterator.hasNext()) {
//            iterator.next();
//        }
//
//        System.out.println(map);

        Gson gson = new Gson();
        String urlPath = "http://jsonplaceholder.typicode.com/posts";
        String json = sendRequest(urlPath);
//        System.out.println(json);
        Model[] result = gson.fromJson(json, Model[].class);
//        System.out.println(Arrays.toString(result));
        for (Model model: result)
            System.out.println(model);

    }

    public static String sendRequest(String urlPath) throws IOException, MalformedURLException {

        URL url = new URL(urlPath);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("accept","application/json");

        try(Scanner scanner = new Scanner(new BufferedInputStream(connection.getInputStream()))) {
            StringBuilder stringBuilder = new StringBuilder();
            while (scanner.hasNext()) stringBuilder.append(scanner.nextLine());
            return stringBuilder.toString();
        }
    }
}

class Model {
    @SerializedName("userId")
    private Integer customerId;
    @SerializedName("id")
    private Long id;
    @SerializedName("title")
    private String title;
    @SerializedName("body")
    private String body;

    @Override
    public String toString() {
        return "Model{" +
                "userId=" + customerId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
