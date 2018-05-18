package com.bagicode.jadwalsholatku.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TodayWeather {

    @SerializedName("pressure")
    @Expose
    private Object pressure;
    @SerializedName("temperature")
    @Expose
    private Object temperature;

    public Object getPressure() {
        return pressure;
    }

    public void setPressure(Object pressure) {
        this.pressure = pressure;
    }

    public Object getTemperature() {
        return temperature;
    }

    public void setTemperature(Object temperature) {
        this.temperature = temperature;
    }
}
