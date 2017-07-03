package Abstract_dama;
public class FlyingSuperHero extends SuperHero{
       /**
     * this method will display power
     *@param 
     * this method does not have a parameter
     * @return 
     * this method does not return any value
     */
    @Override
    void displayPower(){
        System.out.println("Fly...");
    }
    void setSp(String superPowers[]){
            super.setSuperPowers(superPowers);
     }
}
