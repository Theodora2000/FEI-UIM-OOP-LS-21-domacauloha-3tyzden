package sk.stuba.uim.fei.oop;

public class Student {
    private int id;
    private String meno;
    private String priezvisko;
    private int vek;

    public int getId() {
        return id;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public String getMeno() {
        return meno;
    }

    public int getVek() {
        return vek;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public Student(int id, String meno, String priezvisko, int vek) {
        this.id = id;
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.vek = vek;
    }

    @Override
    public String toString(){
        String Str = "Student sa info:";
        Str += "\n id :" + id + " \n meno : " + meno + " \n priezvisko: " + priezvisko + "\n vek : " + vek + "\n";
        return Str;
    }


}
