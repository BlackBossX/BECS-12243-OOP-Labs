public class Movie {
    String name;
    int duration;

    Movie(String name,int duration){
        this.name = name;
        this.duration = duration;
    }

    public String getName(){
        return name;
    }

    public int getDuration(){
        return duration;
    }

    public void displayMovieDetails(){
        System.out.println("Movie Name: "+name+" ,Duration: "+duration);
    }

}
