public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int a =5;
    int b =10;


    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;
    }
    void run(){
        if(isCheck()){
            while (this.f1.health>0 && this.f2.health>0){
                System.out.println(f1.name + "==>" + " canı : "+ f1.health);
                System.out.println(f2.name + "==>" + " canı : "+ f2.health);
                System.out.println(f1.isStart());
                System.out.println(f2.isStart());
                System.out.println("=======NEW ROUND=======");
                if (f1.isStart()< f2.isStart()){
                    this.f2.health=this.f1.hit(f2);
                    if(iswin()){
                        break;
                    }
                    this.f1.health=this.f2.hit(f1);
                    if (iswin()){
                        break;
                    }
                }else {
                    this.f1.health=this.f2.hit(f1);
                    if(iswin()){
                        break;
                    }
                    this.f2.health=this.f1.hit(f2);
                    if (iswin()){
                        break;
                    }
                }
            }
        }else{
            System.out.println("Dövüşçülerin sikletleri uyuşmuyor.");
        }
    }
    boolean isCheck(){
        return (this.f1.weight >=minWeight &&this.f1.weight<=maxWeight) &&(this.f2.weight>=minWeight&&this.f2.weight<=maxWeight); //--> uyarsa true çevirir.
    }
    boolean iswin(){
        if(this.f1.health==0){
            System.out.println("KAZANAN UZAK DOĞULU USTAAAA ==>"+ this.f2.name);
            return true;
        }
        if(this.f2.health==0){
            System.out.println("KAZANAN AMERİKAN MAKİNESİİ ==> "+ this.f1.name);
            return true;
        }
        return false;
        }

    }




