/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.githubadp2.assignment;

/**
 *
 * @author BLANCO
 */
public class SoupKitchen {
    String kitchen;
    String soup;
    String corruption;
    double distraction;

    public SoupKitchen() {
    }

    public SoupKitchen(String kitchen, String soup, String corruption, double distraction) {
        this.kitchen = kitchen;
        this.soup = soup;
        this.corruption = corruption;
        this.distraction = distraction;
    }

    public String getKitchen() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    public String getSoup() {
        return soup;
    }

    public void setSoup(String soup) {
        this.soup = soup;
    }

    public String getCorruption() {
        return corruption;
    }

    public void setCorruption(String corruption) {
        this.corruption = corruption;
    }

    public double getDistraction() {
        return distraction;
    }

    public void setDistraction(double distraction) {
        this.distraction = distraction;
    }

    @Override
    public String toString() {
        return "SoupKitchen{" + "kitchen=" + kitchen + ", soup=" + soup + ", corruption=" + corruption + ", distraction=" + distraction + '}';
    }
    
    
}
