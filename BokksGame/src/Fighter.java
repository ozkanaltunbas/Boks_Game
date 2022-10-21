public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int start;


    Fighter(String name,int damage,int health,int weight,int dodge,int start){
        this.name =name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;
        this.start=start;
    }
     int hit(Fighter foe){
         System.out.println(this.name + "==>"+ foe.name + " "+ this.damage + " hasar vurdu.");
         if(foe.isDodge()){
             System.out.println(foe.name + " gelen saldırıyı doodgeladı.");
             System.out.println("-------------------------");
             return foe.health;
         }
         if(foe.health-this.damage <0){
             return 0;
         }
            return foe.health-this.damage;
     }
     boolean isDodge(){
        double randomNumber = Math.random() *100;
        return randomNumber<=this.dodge;
     }
     double isStart(){
        double randomNumber2 = Math.random() *100;
        return  randomNumber2=this.start;

     }


}
