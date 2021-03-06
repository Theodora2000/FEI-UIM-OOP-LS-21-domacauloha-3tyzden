package sk.stuba.uim.fei.oop;


public class Main {
    public static void main(String[] args){
        Student[] studenti = new Student[4];


        studenti[0] = new Student(2 , "ABC" , "CBD" , 2);
        studenti[1] = new Student(4 , "ACB" , "CDB" , 5);
        studenti[2] = new Student(8 , "BCA" , "DBC" , 7);
        studenti[3] = new Student(6 , "BAC" , "DCBD" , 3);
/*
        for(int i=1;i<10;i++){
            studenti[i] = new Student(10 , "Teodora" , "Simon" , 5);
        }
        */

        String[] smer = new String[2];
        smer[0] = new String("opadajuci");
        smer[1] = new String("rastuci");

        String[] parametar = new String[4];
        parametar[0] = new String("ID");
        parametar[1] = new String("meno");
        parametar[2]= new String("priezvisko");
        parametar[3] = new String("vek");

        ispis(studenti);
        String smer_t ="";
        do{
            smer_t = Zklavesnice.readString("Zadajte smer tredenia:");
        }while(!(smer_t.equals("opadajuci") || smer_t.equals("rastuci") ));

        String parameter_t ="";
        do{
            parameter_t = Zklavesnice.readString("Zadajte parameter tredenia:");
        }while(!(parameter_t.equals("ID") || parameter_t.equals("meno") || parameter_t.equals("priezvisko")|| parameter_t.equals("vek")));



        quick_sort(studenti, smer_t, parameter_t);
        System.out.println("Posle Sorta : \n\n");
        ispis(studenti);
        /*
        String prvi = new String("abd");-
        String drugi = new String("ab");

        System.out.println(prvi.compareTo(drugi));*/


    }

    public static void ispis(Student[] studenti) {
        for(int i=0;i< studenti.length;i++){
            System.out.println(studenti[i]);
        }
    }
    public static void zameni(Student []pole, int i , int j){
        Student pomoc = pole[i];
        pole[i] = pole[j];
        pole[j] = pomoc;
    }

    //vraca true ako treba da se zameni
    public static boolean poredjenje(Student []niz , int an1 ,int an2 , String nacin , String param){
       if(nacin.equals("opadajuci")) {
           if(param.equals("ID")){
               if(niz[an1].getId() <  niz[an2].getId()){
                   return true;
               }else {
                   return false;
               }
           }else if(param.equals("meno")){
               if( niz[an1].getMeno().compareTo(niz[an2].getMeno()) < 0){
                   return true;
               }else {
                   return false;
               }
           }else if(param.equals("priezvisko")){
               if(niz[an1].getPriezvisko().compareTo(niz[an2].getPriezvisko()) < 0){
                   return true;
               }else {
                   return false;
               }
           }else{
               if(niz[an1].getVek() <  niz[an2].getVek()){
                   return true;
               }else {
                   return false;
               }
           }

       }else{
           if(param.equals("ID")){
               if(niz[an1].getId() >  niz[an2].getId()){
                   return true;
               }else {
                   return false;
               }
           }else if(param.equals("meno")){
               if( niz[an1].getMeno().compareTo(niz[an2].getMeno()) > 0){
                   return true;
               }else {
                   return false;
               }
           }else if(param.equals("priezvisko")){
               if(niz[an1].getPriezvisko().compareTo(niz[an2].getPriezvisko()) > 0){
                   return true;
               }else {
                   return false;
               }
           }else{
               if(niz[an1].getVek() >  niz[an2].getVek()){
                   return true;
               }else {
                   return false;
               }
           }

       }
    }

    public static void quick_sort(Student[] studenti , String nacin , String param) {
        quicksort(studenti , 0 , studenti.length - 1 , nacin , param);
    }

    public static void quicksort(Student []niz , int an1 ,int an2 ,String nacin , String param){
        if(an1 >= an2){
            return ;
        }
        if(an1 + 1 == an2){
            if(poredjenje(niz , an1 , an2 , nacin, param)){
                zameni(niz , an1 , an2);
            }
            return;
        }

        int zapamti = particion(niz , an1 , an2 , nacin , param);
        quicksort(niz , an1 ,zapamti-1 , nacin , param);
        quicksort(niz , zapamti+1 , an2 , nacin , param);
    }

    public static int particion(Student []niz , int an1 ,int an2 , String nacin , String param){
        int i,j;
        j = an1;
        for(i = an1+1;i<=an2;i++){
            if(!poredjenje(niz , i , an1 , nacin, param) ){
                j++;
                zameni(niz , i , j);
            }
        }
        zameni(niz , an1 , j);
        return j;
    }




}


