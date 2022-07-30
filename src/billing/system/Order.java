/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billing.system;

/**
 *
 * @author Erik
 */
public class Order {
    int Burger;
    int KidsBurger;
    int ChickenNuggets;
    int Water;
    int Coke;
    int AppleJuice;
    
    Order(int Bur, int KM, int CN, int W, int C, int AppJ){
        this.Burger = Bur;
        this.KidsBurger = KM;
        this.ChickenNuggets = CN;
        this.Water = W;
        this.Coke = C;
        this.AppleJuice = AppJ;
    }
    public String toString(){
        String ord;
        int ham= Burger;
        int kyck=ChickenNuggets;
        int kid=KidsBurger;
        int wat=Water;
        int pop=Coke;
        int aj=AppleJuice;
        float hampris=3;
        float kyckpris=2;
        float kidpris=(float) 1.5;
        float watpris=(float) 0.5;
        float poppris=(float) 1.0;
        float ajpris=(float) 1.0;
        float pris=(float) 0.0;

        ord="You ordered: \n";

        if(pop>0 && ham>0){
            if(pop>=ham){
                ord+=ham+" menu á $"+(hampris+poppris/2)+":\n      Hamburgar\n      pop\n";
                pris+=ham*(hampris+poppris/2);
                pop-=ham;
                ham-=ham; 
            } else if(pop<ham){
                ord+=pop+" menu á $"+(hampris+poppris/2)+":\n      Hamburgar\n      pop\n";
                pris+=pop*(hampris+poppris/2);
                ham-=pop;
                pop-=pop;
            }
        }
        if(aj>0 && ham>0){
            if(aj>=ham){
                ord+=ham+" menu á $"+(hampris+ajpris/2)+":\n      Hamburgar\n       juice\n";
                pris+=ham*(hampris+ajpris/2);
                aj-=ham;
                ham-=ham;
            } else if(aj<ham){
                ord+=aj+" menu á $"+(hampris+ajpris/2)+":\n    Hamburgar\n       juice\n";
                pris+=aj*(hampris+ajpris/2);
                ham-=aj;
                aj-=aj;
            }
        }
        if(wat>0 && ham>0){
            if(wat>=ham){
                ord+=ham+" menu á $"+(hampris+watpris/2)+":\n      Hamburgar\n       water\n";
                pris+=ham*(hampris+watpris/2);
                wat-=ham;
                ham-=ham;
            } else if(wat<ham){
                ord+=wat+" menu á $"+(hampris+watpris/2)+":\n    Hamburgar\n       water\n";
                pris+=wat*(hampris+watpris/2);
                ham-=wat;
                wat-=wat;
            }
        
        }
        if(ham>0){
            ord+=ham+" hamburger á $"+hampris+"\n";
            pris+=ham*hampris;
        }
        
        if(pop>0 && kyck>0){
            if(pop>=kyck){
                ord+=kyck+" menu á $"+(kyckpris+poppris/2)+":\n      Chicken Nuggets\n      pop\n";
                pris+=kyck*(kyckpris+poppris/2);
                pop-=kyck;
                kyck-=kyck;
            } else if(pop<kyck){
                ord+=pop+" menu á $"+(kyckpris+poppris/2)+":\n    Chicken Nuggets\n       pop\n";
                pris+=pop*(kyckpris+poppris/2);
                kyck-=pop;
                pop-=pop;
            }
        }
        if(aj>0 && kyck>0){
            if(aj>=kyck){
                ord+=kyck+" menu á $"+(kyckpris+ajpris/2)+":\n      Chicken Nuggets\n       juice\n";
                pris+=kyck*(kyckpris+ajpris/2);
                aj-=kyck;
                kyck-=kyck;
            } else if(aj<kyck){
                ord+=aj+" menu á $"+(kyckpris+ajpris/2)+":\n    Chicken Nuggets\n       juice\n";
                pris+=aj*(kyckpris+ajpris/2);
                kyck-=aj;
                aj-=aj;
            }
        }
        if(wat>0 && kyck>0){
            if(wat>=kyck){
                ord+=kyck+" menu á $"+(kyckpris+watpris/2)+":\n      Chicken Nuggets\n       water\n";
                pris+=kyck*(kyckpris+watpris/2);
                wat-=kyck;
                kyck-=kyck;
            } else if(wat<kyck){
                ord+=wat+" menu á $"+(kyckpris+watpris/2)+":\n    Chicken Nuggets\n       water\n";
                pris+=wat*(kyckpris+watpris/2);
                kyck-=wat;
                wat-=wat;
            }
        }
        

        if(kyck>0){
            ord+=kyck+" Chicken Nuggets á $"+kyckpris+"\n";
            pris+=kyck*kyckpris;
        }
        
        if(pop>0 && kid>0){
            if(pop>=kid){
                ord+=kid+" menu á $"+(kidpris+poppris/2)+":\n      Kids Burger\n      pop\n";
                pris+=kid*(kidpris+poppris/2);
                pop-=kid;
                kid-=kid;
            } else if(pop<kid){
                ord+=pop+" menu á $"+(kidpris+poppris/2)+":\n    Kids Burger\n       pop\n";
                pris+=pop*(kidpris+poppris/2);
                kid-=pop;
                pop-=pop;
            }
        }
        if(aj>0 && kid>0){
            if(aj>=kid){
                ord+=kid+" menu á $"+(kidpris+ajpris/2)+":\n      Kids Burger\n       juice\n";
                pris+=kid*(kidpris+ajpris/2);
                aj-=kid;
                kid-=kid;
            } else if(aj<kid){
                ord+=aj+" menu á $"+(kidpris+ajpris/2)+":\n    Kids Burger\n       juice\n";
                pris+=aj*(kidpris+ajpris/2);
                kid-=aj;
                aj-=aj;
            }
        }
        if(wat>0 && kid>0){
            if(wat>=kid){
                ord+=kid+" menu á $"+(kidpris+watpris/2)+":\n      Kids Burger\n       water\n";
                pris+=kid*(kidpris+watpris/2);
                wat-=kid;
                kid-=kid;
            } else if(wat<kid){
                ord+=wat+" menu á $"+(kidpris+watpris/2)+":\n    Kids Burger\n       water\n";
                pris+=wat*(kidpris+watpris/2);
                kid-=wat;
                wat-=wat;
            }
        }
        if(kid>0){
            ord+=kid+" Kids Burger á $"+kidpris+"\n";
            pris+=kid*kidpris;
        }
        
        if(pop>0){
            ord+=pop+" pop á $"+poppris+"\n";
            pris+=pop*poppris;
        }
        if(aj>0){
            ord+=aj+" juice á $"+ajpris+"\n";
            pris+=aj*ajpris;
        }
        if(wat>0){
            ord+=wat+" water á $"+watpris+"\n";
            pris+=wat*watpris;
        }
        
        return (ord+"Cost: $"+pris+"\n");
    }
}
