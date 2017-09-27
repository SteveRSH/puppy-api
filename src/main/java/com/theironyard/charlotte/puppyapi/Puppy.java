package com.theironyard.charlotte.puppyapi;

public class Puppy {
    private int weight;
    private int height;
    private int cuteRating;
    private long energyLevel;
    private boolean castrated;
    private String breed;
    private String name;

    // we need an empty constructor for our
    // json serialization and deserialization
    public Puppy() {
    }

    public Puppy(int weight, int height, int cuteRating, long energyLevel, boolean castrated, String breed, String name) {
        this.weight = weight;
        this.height = height;
        this.cuteRating = cuteRating;
        this.energyLevel = energyLevel;
        this.castrated = castrated;
        this.breed = breed;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCuteRating() {
        return cuteRating;
    }

    public void setCuteRating(int cuteRating) {
        this.cuteRating = cuteRating;
    }

    public long getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(long energyLevel) {
        this.energyLevel = energyLevel;
    }

    public boolean isCastrated() {
        return castrated;
    }

    public void setCastrated(boolean castrated) {
        this.castrated = castrated;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
