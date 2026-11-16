
package com.snowclient;

import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;

public class SnowClient extends MeteorAddon {

    public static final Category CATEGORY =
        new Category("Snow");

    @Override
    public void onInitialize() {
        Modules.get().addCategory(CATEGORY);
        System.out.println("[Snow Client] Initialized!");
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.snowclient";
    }
}
