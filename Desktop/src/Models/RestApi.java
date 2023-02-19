package Models;

public class RestApi {

    public RestApi() 
    {}

    public String getKuckos() 
    {
        HttpClient http = new HttpClient();
        String host = "http://[::1]:3000/";
        String endpoint = "properties";
        String urlStr = host + endpoint;
        String res = http.get(urlStr);
        System.out.println(res);

        return res;
    }

}