package org.fasttrackit.tema7;

public class Bottle {
    private final int totalCapacity;
    private final int availableLiquid;
    private boolean open;

    public Bottle(int capacitateaTotala, int lichidulValabil, boolean deschis) {
        totalCapacity = capacitateaTotala;
        availableLiquid = lichidulValabil;
        open = deschis;
    }

    public boolean maxCapacity() {
        return availableLiquid == 0;
    }

    public int getAvailableLiquid() {
        return availableLiquid;
    }

    public int emptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public void isOpen(boolean setOpen) {
        if (setOpen) {
            System.out.println("Sticla este deschisa. ");
            open = true;
        } else {
            System.out.println("Sticla este inchisa. ");
            open = false;
        }
    }

    public void deschideSticla() {
        if (!open) {
            isOpen(true);
        } else {
            System.out.println("Nu poti sa deschizi o sticla deja deschisa!");
        }
    }

    public void inchideSticla() {
        if (open) {
            isOpen(false);
        } else {
            System.out.println("Nu poti sa inchizi o sticla deja inchisa!");
        }
    }

    public void cantitateaConsumata(int lichid) {
        int nouaCantitate = getAvailableLiquid() - lichid;
        if (open) {
            if (lichid <= availableLiquid) {
                System.out.println("Au mai ramas: " + nouaCantitate + "ml");
            } else {
                System.out.println("Nu este suficient lichid in sticla!");
            }
        } else {
            System.out.println("Nu poti sa bei, pentru ca sticla este inchisa!");
        }
    }
}
