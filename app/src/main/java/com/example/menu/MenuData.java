package com.example.menu;

import java.util.ArrayList;

public class MenuData {

    private static String[] menuName = {
            "MARTABAK TELOR ",
            "MARTABAK TELOR JUGA",
            "MARTABAK TELOR JUGA",
            "MARTABAK TELOR JUGA",
            "MARTABAK TELOR JUGA"

    };

    private static String [] menuDetail = {
            "MARTABAK TELOR Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
            "MARTABAK TELOR JUGA Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
            "MARTABAK TELOR JUGA Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
            "MARTABAK TELOR JUGA Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
            "MARTABAK TELOR JUGA Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."

    };

    private static int [] menuImage = {
            R.drawable.martabak_telor___martabak_mesir__beef_and_eggs_pancakes___3_,
            R.drawable.martabak_telor___martabak_mesir__beef_and_eggs_pancakes___3_,
            R.drawable.martabak_telor___martabak_mesir__beef_and_eggs_pancakes___3_,
            R.drawable.martabak_telor___martabak_mesir__beef_and_eggs_pancakes___3_,
            R.drawable.martabak_telor___martabak_mesir__beef_and_eggs_pancakes___3_,

    };

    static ArrayList<Menu> getListData(){
        ArrayList<Menu> list = new ArrayList<>();
        for(int position = 0; position <menuName.length; position++){
            Menu menu = new Menu();
            menu.setName(menuName[position]);
            menu.setDetail(menuDetail[position]);
            menu.setPhoto(menuImage[position]);
            list.add(menu);
        }
        return list;
    };
}
