package charactor;

public class ADAPHero extends Hero implements AD,AP {

    public  ADAPHero(){
    }

    public ADAPHero(String heroName, float heroHP, float heroArmor, int heroMoveSpeed){
        super(heroName, heroHP, heroArmor, heroMoveSpeed);
    }

    @Override
    public void physicAttack(){
        System.out.println("进行物理攻击");
    }

    @Override
    public void magicAttack(){
        System.out.println("进行魔法攻击");
    }
}
