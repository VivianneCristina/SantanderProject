package com.viviannecristina.santanderproject.domain;

import com.google.gson.annotations.SerializedName;

public class SubScreen {

    @SerializedName("screen")
    private Screen screen;

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}
