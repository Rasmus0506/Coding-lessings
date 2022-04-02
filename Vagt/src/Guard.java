import java.sql.SQLOutput;

public class Guard {
    private String name;
    private int salary;
    private int kills;
    private int jails;
    private int money;
    private String rank;
    private int pvAmount;
    private int level;

    public Guard(String name, int salary, int kills, int jails, int money, String rank, int pvAmount, int level) {
        this.name = name;
        this.salary = salary;
        this.kills = kills;
        this.jails = jails;
        this.money = money;
        this.rank = rank;
        this.pvAmount = pvAmount;
        this.level = level;
    }
       public void printstats(){
           System.out.println("dit navn: " + name);
           System.out.println("dit rank: " + rank);
           System.out.println("dine penge: " + money);
           System.out.println("dit level: " + level);
           System.out.println("din løn: " + salary);
           System.out.println("dine kills: " + kills);
           System.out.println("Dine jails: " + jails);
           System.out.println("dine pv's: " + pvAmount);
       }
}
