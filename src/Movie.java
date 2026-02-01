public class Movie {
    String name;
    int data;
    boolean includeInPlan;
    double sumRating;
    int ratingCount;


    void showDetails (){
        System.out.println("Ficha Tecnica");
        System.out.println("Nome do Filme: "+ name);
        System.out.println("Data do Filme: "+ data);

    }

    void showRating(double nota){
        sumRating += nota;
        ratingCount++;
        System.out.println("Notas do Filme: " + sumRating);
    }
}
