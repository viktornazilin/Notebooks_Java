package ru.gb.jseminar;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Notebook {

    private String brand;
    private String model;
    private Integer hardDrive;
    private Integer ram;
    private String color;
    private String os;

    public Notebook(String brand, String model, Integer hardDrive, Integer ram, String color,
                    String os) {
        this.brand = brand.toLowerCase();
        this.model = model.toLowerCase();
        this.hardDrive = hardDrive;
        this.ram = ram;
        this.color = color.toLowerCase();
        this.os = os.toLowerCase();

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(Integer hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Map<String, String> getSpecification() {
        Map<String, String> spec = new HashMap<>();

        spec.put("brand", brand);
        spec.put("model", model);
        spec.put("hardDrive".toLowerCase(), String.valueOf(hardDrive));
        spec.put("ram".toLowerCase(), String.valueOf(ram));
        spec.put("colour", color);
        spec.put("os".toLowerCase(), os);

        return spec;
    }

    @Override
    public String toString() {
        return String.format("brand: %s; model: %s; hard drive: %d; RAM: %d; colour: %s, OS: %s",
                brand, model, hardDrive, ram, color, os);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notebook)) return false;
        Notebook notebook = (Notebook) o;
        return getBrand().equals(notebook.getBrand()) && getModel().equals(notebook.getModel()) &&
                getHardDrive().equals(notebook.getHardDrive()) && getRam().equals(notebook.getRam())
                && getColor().equals(notebook.getColor()) && getOs().equals(notebook.getOs());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getHardDrive(), getRam(), getColor(), getOs());
    }
}