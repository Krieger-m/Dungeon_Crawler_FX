package com.krieger.dungeon_crawler_fx;

public class Paths {

    //CHECK - Paths -
        // ---------------------------->>>


        //NOTE Variables

    private static final String START_BG = "file:./src/main/resources/com/krieger/dungeon_crawler_fx/images/start_screen_bg.jpg";
    private static final String MAIN_BG = "file:./src/main/resources/com/krieger/dungeon_crawler_fx/images/main_scene_bg.jpg";
    private static final String INVENTORY_BG = "file:./src/main/resources/com/krieger/dungeon_crawler_fx/images/inventory_bg.jpg";


        //NOTE Getters / Setters

    public static String getStartBg() {
        return START_BG;
    }
    public static String getMainBg() {
        return MAIN_BG;
    }
    public static String getInventoryBg() {
        return INVENTORY_BG;
    }

   

        //NOTE Variables
        
    private static String[] startButtons = {"New Adventure","Load Game", "Options","Exit"};
    private static String[] mainButtons = {"Search","Action","Inventory"};
    private static String[] inventoryButtons = {"Use","Equip","Combine", "Back"};


        //NOTE Getters / Setters

    public static String[] getStartButtons() {
        return startButtons;
    }
    public static String[] getMainButtons() {
        return mainButtons;
    }
    public static String[] getInventoryButtons() {
        return inventoryButtons;
    }

    
    
    
}

