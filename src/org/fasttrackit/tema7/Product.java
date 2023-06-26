package org.fasttrackit.tema7;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;

    private String categoryVerifier;

    public Product(String nume, double pret, int cantitate, String categorie, String categorieVerificatoare) {
        name = nume;
        price = pret;
        quantity = cantitate;
        category = categorie;
        categoryVerifier = categorieVerificatoare;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public String getCategoryVerifier() {
        return categoryVerifier;
    }

    public boolean hasStock() {
        if (getQuantity() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isCategory() {
        if (getCategoryVerifier() == getCategory()) {
            return true;
        } else {
            return false;
        }
    }

    public String stoculProdusului() {
        if (hasStock()) {
            return "Produsul acesta este in stoc!";
        } else {
            return "Din pacate acest produs nu mai este in stoc!";
        }
    }

    public String categoriaEgala() {
        if (isCategory()) {
            return "Adevarat, produsul " + getName() + " este din categoria " + getCategoryVerifier();
        } else {
            return "Gresit, produsul " + getName() + " nu face parte din categoria " + getCategoryVerifier();
        }
    }

    public String toString() {
        return "Produsul " + getName() + " este " + getPrice() + " RON. " +
                stoculProdusului() + " Acest produs face parte din categoria " + getCategory() + ". " +
                categoriaEgala() + "!";
    }
}
