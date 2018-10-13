public class Main {
    public static void main(String args[]){
         Section[] AB = new Section[3];
         Dot[] dots = new Dot[6];
         dots[1] = new Dot(1,2);
         dots[2] = new Dot(4,7);
         dots[3] = new Dot(10,5);
         dots[4] = new Dot(15,1);
         dots[5] = new Dot(3,21);
         dots[0] = new Dot(2,2);
         for (int j=0; j<3; j++){
             AB[j] = new Section(dots[j], dots[j+1]);
         }
         for (int j=0; j<3; j++){
             System.out.println(AB[j].Long());
         }
    }
}