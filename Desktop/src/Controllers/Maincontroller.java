package Controllers;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Models.Kucko;
import Models.RestApi;
import Views.MainConsole;

public class Maincontroller 
{
    MainConsole mainConsole;

    public Maincontroller() 
    {}
    {
        this.mainConsole = new MainConsole();
        this.showProp();
    }

    private void showProp()
    {
        RestApi restapi = new RestApi();
        String res = restapi.getKuckos();
        ArrayList<Kucko> propList = convertStringToArray(res); 
        this.mainConsole.printProperties(propList);
    }

    private ArrayList<Kucko> convertStringToArray(String res) 
    {
        ArrayList<Kucko> propList = null;
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Kucko[] propArray = gson.fromJson(res, Kucko[].class);
        propList = new ArrayList<>(Arrays.asList(propArray));
        return propList;

    }

}
