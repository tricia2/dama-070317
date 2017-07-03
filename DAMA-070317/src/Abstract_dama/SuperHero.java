package Abstract_dama;
abstract class SuperHero {
    String superPowers[];
        SuperHero(){
            this.superPowers = new String[5];
            this.superPowers[0] = "1stPOWER";
            this.superPowers[1] = "2nd POWER";
            this.superPowers[2] = "3rd POWER";
            this.superPowers[3] = "4th POWER";
            this.superPowers[4] = "5th POWER";
        }
    void setSuperPower(String power, int element){
            this.superPowers[element] = power;
        }
    void setSuperPowers(String superPowers[]){
            this.superPowers = superPowers;
    }
    void printSuperPowers(){
        for(int i =0;i<superPowers.length; i++){
            System.out.println(superPowers[i]);
        }
    }
    abstract void  displayPower();
}

         


