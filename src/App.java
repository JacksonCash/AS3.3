public class App {
    public abstract class Skill {       //Creates abstract class "Skill"

        String name;        //Instantiates the "name" variable
        String type;        //Instantiates the "type" variable
        int skillLevel;     //Instantiates the "skillLevel" variable

        public Skill(String name, String type, int skillLevel) {        //Constructor for abstract class "Skill"
            this.name = name;       //Initializes "name" variable
            this.type = type;       //Initializes "type" variable
            this.skillLevel = skillLevel;       //Initializes "skillLevel" variable
        }

        public String getName() {       //Getter for "name"
            return name;
        }
        public String getType() {       //Getter for "type"
            return type;
        }
        public int getSL() {        //Getter for "skillLevel"
            return skillLevel;
        }

        abstract String identifySkill();        //Creates abstract method "identifySkill"
    }
    public class HardSkill extends Skill {
        HardSkill() {       //Creates concrete class "HardSkill"
            super("Programming", "Hard Skill", 10);
        }

        public String identifySkill() {     //Sets the message that's output when "identifySkill" is called upon
            String temp = (type + " of " + name + " has a level of " + skillLevel);
            return temp;
        }
    }
    public class SoftSkill extends Skill {
        SoftSkill() {       //Creates concrete class "SoftSkill"
            super("Communication", "SoftSkill", 3);
        }

        public String identifySkill() {     //Sets the message that's output when "identifySkill" is called upon
            String temp = (type + " of " + name + " has a level of " + skillLevel);
            return temp;
        }
    }
    public class GiftSkill extends Skill {
        GiftSkill() {       //Creates concrete class "GiftSkill"
            super("Mercy", "GiftSkill", 6);
        }

        public String identifySkill() {     //Sets the message that's output when "identifySkill" is called upon
            String temp = (type + " of " + name + " has a level of " + skillLevel);
            return temp;
        }
    }
    public class TalentSkill extends Skill {
        TalentSkill() {     //Creates concrete class "TalentSkill"
            super("Organization", "TalentSkill", 8);
        }

        public String identifySkill() {     //Sets the message that's output when "identifySkill" is called upon
            String temp = (type + " of " + name + " has a level of " + skillLevel);
            return temp;
        }
    }
    public static void main(String[] args) {

        App app = new App();

        HardSkill HS = app.new HardSkill();     //Creates instance of the "HardSkill" class
        SoftSkill SS = app.new SoftSkill();     //Creates instance of the "SoftSkill" class
        GiftSkill GS = app.new GiftSkill();     //Creates instance of the "GiftSkill" class
        TalentSkill TS = app.new TalentSkill();     //Creates instance of the "TalentSkill" class

        System.out.println(HS.identifySkill());     //Outputs message set by "identifySkill" in "HardSkill"
        System.out.println(SS.identifySkill());     //Outputs message set by "identifySkill" in "SoftSkill"
        System.out.println(GS.identifySkill());     //Outputs message set by "identifySkill" in "GiftSkill"
        System.out.println(TS.identifySkill());     //Outputs message set by "identifySkill" in "TalentSkill"
    }
}
