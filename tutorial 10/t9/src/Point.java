public class Point {
    int x;
    int y;

    public Point(int a, int b){
        this.x = a;
        this.y = b;
    }
    public String displayPoint(){
        return "Coordinates: ("+x+","+y+")";
    }

    public String distance(int a, int b){
        return "Distance Between 2 point is : "+
                Math.sqrt(Math.pow(Math.abs(x-a),2)+Math.pow(Math.abs(y-b),2));
    }

    public String distance(){
        return "Distance Between 2 point is : "+(Math.sqrt((x*x)+(y*y)));
    }





}
