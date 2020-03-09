package id.ac.polinema.recyclerview.models;

public class Exercise {
    public String logo;
    public  String name;
    public String teks;

    public Exercise() {
    }

    public Exercise(String logo, String name, String teks) {
        this.logo = logo;
        this.name = name;
        this.teks = teks;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeks() {
        return teks;
    }

    public void setTeks(String teks) {
        this.teks = teks;
    }
}
