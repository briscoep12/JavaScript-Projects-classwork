import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Zodiac_project {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        DialogBox(args);
   
   }
   public static void  DialogBox(String[] args) {
    
       Object[] options = {"Find", "Learn", "Test compatibility"};

       int choice = JOptionPane.showOptionDialog(null,"Welcome to the Zodiac \n-Find your sign \n-Learn about signs \n-Test your compatibility \n","The Zodiac", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        switch (choice) {
            case 0 :
                Zodiac_Finder(args);
       
            case 1 :
                ZodiacDictionary(args);
            case 2 :
                break;
                
        }
   }//end of method

public static void ZodiacDictionary(String[] args) {
    //Text Box
    String[] options ={"Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagittarius","Capricorn","Aquarius","Pisces"};
    Object select = JOptionPane.showInputDialog(null,
        "<html><div style='width: 200px;'>" + "The 12 zodiac signs are divided into four elements (Fire, Earth, Air, Water) and three modalities (Cardinal, Fixed, Mutable), reflecting distinct personality traits based on birth date. They represent a 360-degree circle of life, starting with Aries (March) and ending with Pisces (February), used to analyze personality, compatibility, and life cycles." + "</div></html>",
        "Learn about Zodiac signs", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);



        String selection = (String) select;

        switch (selection) {
            case "Aries" -> {JOptionPane.showMessageDialog(null, """
                                                               Element: Fire 
                                                               Modality: Cardinal 
                                                               Notable Traits: Courageous, Optimistic, Honest, Independent, Aggressive 
                                                               Symbol: The Ram 
                                                               Known as the first sign of the zodiac, it represents the spark of life and new beginnings. Fueled by passion and energy, they have drive to take risks, though it can also lead to a short temper or impulsive burnout.""","Learn about Zodiac signs",JOptionPane.INFORMATION_MESSAGE);
                                                               ZodiacDictionary(args);

            }
            case "Taurus" ->{JOptionPane.showMessageDialog(null, """
                                                               Element: Earth 
                                                               Modality: Fixed
                                                               Notable Traits: Dependable, patient, artistic, hard-working
                                                               Symbol: The Bull
                                                               Often called the builder, it represents the stage of life where we seek to ground ourselves and find security in the physical world.""","Learn about Zodiac signs",JOptionPane.INFORMATION_MESSAGE);

            }
            case "Gemini" ->{JOptionPane.showMessageDialog(null, """
                                                               Element: Air 
                                                               Modality: Mutable
                                                               Notable Traits:Witty, curious, versatile, very emotional
                                                               Symbol: The Twins
                                                               Referred to as the messenger, Gemini reflects a rapid mental duality.""","Learn about Zodiac signs",JOptionPane.INFORMATION_MESSAGE);

            }

            case "Cancer" ->{JOptionPane.showMessageDialog(null, """
                                                               Element: Water
                                                               Modality: Cardinal
                                                               Notable Traits:initiator of emotion, action oriented, active caretaker,
                                                               Symbol: Crab
                                                               Well known for being deeply emotional, highly intuitive, and nuturing nature.""","Learn about Zodiac signs",JOptionPane.INFORMATION_MESSAGE);

            }
              
            case "Leo" ->{JOptionPane.showMessageDialog(null, """
                                                               Element: Fire
                                                               Modality: Fixed
                                                               Notable Traits:
                                                               Symbol: Lion
                                                        .""","Learn about Zodiac signs",JOptionPane.INFORMATION_MESSAGE);
                                                              

            }
            case "Virgo" ->{

            }
            case "Libra" ->{

            }
            case "Scorpio" ->{

            }
            case "Sagittarius" ->{

            }
            case "Capricorn" ->{

            }
            case "Aquarius" ->{

            }
            case "Pisces" ->{

            }

        
        }//switch end
    
}//method end

public static void Zodiac_Finder(String[] args) {
    //inputs
    JTextField MonthField = new JTextField();
    JTextField DayField = new JTextField();

Object[] window ={
    "Enter your birthday month", MonthField,
    "Enter your birth day", DayField,
};

int option = JOptionPane.showConfirmDialog(null, window, "Find your Zodiac sign",JOptionPane.OK_CANCEL_OPTION);

if(option == JOptionPane.CANCEL_OPTION){
    DialogBox(args);
}



    String MonthF, DayF;
    MonthF = MonthField.getText();
    DayF = DayField.getText();

    int Month, Day;
    Month = Integer.parseInt(MonthF);
    Day = Integer.parseInt(DayF);

    switch(Month){
        //selecting signs
        case 1 -> {       
        if(Day < 20 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Capricorn.");
            Zodiac_Finder(args);
        
        }
        else if(Day >=20 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Aquarius.");
            Zodiac_Finder(args);
        
        }
        }

        case 2 ->{
        if(Day < 20 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Aquarius.");
            Zodiac_Finder(args);
        
        }
        else if(Day >=19 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Pisces.");
            Zodiac_Finder(args);
        
        }
        }

        case 3 ->{
        if(Day < 21 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Pisces.");
            Zodiac_Finder(args);
        }
        else if(Day >=21 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Aries.");
            Zodiac_Finder(args);
        }
        }
        case 4 ->{
                    if(Day < 20 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Aries.");
            Zodiac_Finder(args);
        }
        else if(Day >=20 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Taurus.");
            Zodiac_Finder(args);
        }
        }
        case 5 ->{
        if(Day < 20 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Taurus.");
            Zodiac_Finder(args);
        }
        else if(Day >=21 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Gemini.");
            Zodiac_Finder(args);
        }
        }
        case 6 ->{
        if(Day < 21 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Gemini.");
            Zodiac_Finder(args);
        }
        else if(Day >=21 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Cancer.");
            Zodiac_Finder(args);
        }
        }
        case 7 ->{
        if(Day < 23 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Cancer.");
            Zodiac_Finder(args);
        }
        else if(Day >=23 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Leo.");
            Zodiac_Finder(args);
        }
        }
        case 8 ->{
        if(Day < 20 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Leo.");
            Zodiac_Finder(args);
        }
        else if(Day >=20 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Virgo.");
            Zodiac_Finder(args);
        }
        }
        case 9 ->{
        if(Day < 20 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Virgo.");
            Zodiac_Finder(args);
        }
        else if(Day >=20 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Libra.");
            Zodiac_Finder(args);
        }
        }
        case 10 ->{
            if(Day < 24 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Libra.");
            Zodiac_Finder(args);
        }
        else if(Day >=24 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Scorpio.");
            Zodiac_Finder(args);
        }
        }
        case 11 ->{
        if(Day < 21 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Scorpio.");
            Zodiac_Finder(args);
        }
        else if(Day >=21 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Sagittarius.");
            Zodiac_Finder(args);
        }}

        case 12 ->{
        if(Day < 22 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Sagittarius.");
            Zodiac_Finder(args);
        }
        else if(Day >=22 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Capricorn.");
            Zodiac_Finder(args);
        }
        }
        }
    

    }


            
            
            
        
    
    


}
