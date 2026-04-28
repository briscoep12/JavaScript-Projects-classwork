import java.awt.Image;
import java.io.*;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Zodiac_project {
    
   
    


    static final ImageIcon customIcon = new ImageIcon("C:\\Users\\ender\\Downloads\\Zodiac symbol.png");
    static Image scaledImage = customIcon.getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
    static Icon scaledIcon = new ImageIcon(scaledImage);
    static ImageIcon SagImage = new ImageIcon(new ImageIcon("C:\\Users\\ender\\Downloads\\download.png").getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH));
    static ImageIcon AquImage = new ImageIcon(new ImageIcon("C:\\Users\\ender\\Downloads\\Aquarius.png").getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH));
    static ImageIcon CapImage = new ImageIcon(new ImageIcon("C:\\Users\\ender\\Downloads\\Capricorn.png").getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH));
    static ImageIcon PisImage = new ImageIcon(new ImageIcon("C:\\Users\\ender\\Downloads\\Pisces.png").getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH));
    static ImageIcon AriImage = new ImageIcon(new ImageIcon("C:\\Users\\ender\\Downloads\\Aries.png").getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH));
    static ImageIcon TauImage = new ImageIcon(new ImageIcon("C:\\Users\\ender\\Downloads\\Taurus.png").getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH));
    static ImageIcon GemImage = new ImageIcon(new ImageIcon("C:\\Users\\ender\\Downloads\\Gemini.png").getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH));
    static ImageIcon CanImage = new ImageIcon(new ImageIcon("C:\\Users\\ender\\Downloads\\Cancer.png").getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH));
    static ImageIcon LeoImage =new ImageIcon(new ImageIcon("C:\\Users\\ender\\Downloads\\Leo.png").getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH));
    static ImageIcon VirImage = new ImageIcon(new ImageIcon("C:\\Users\\ender\\Downloads\\Virgo.png").getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH));
    static ImageIcon LibImage = new ImageIcon(new ImageIcon("C:\\Users\\ender\\Downloads\\Libra.png").getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH));
    static ImageIcon ScoImage = new ImageIcon(new ImageIcon("C:\\Users\\ender\\Downloads\\Scorpio.png").getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH));   
    

    
    public static void main(String[] args) throws IOException {
        DialogBox(args);

    }
    public static void DialogBox(String[] args) throws IOException {
    
       Object[] options = {"Find", "Learn", "Test compatibility","Print Backend Data"};

       int choice = JOptionPane.showOptionDialog(null,
        "Welcome to the Zodiac \n-Find your sign \n-Learn about signs \n-Test your compatibility \n",
        "The Zodiac", 
        JOptionPane.DEFAULT_OPTION, 
        JOptionPane.PLAIN_MESSAGE, (Icon) scaledIcon, 
        options, options[0]);

        if(choice == -1){
            System.out.println("You exited the program.");
            System.exit(0); 
        }

    switch (choice) {
            case 0 -> Zodiac_Finder(args);
            case 1 -> ZodiacDictionary(args);
            case 2 -> CompatibilityTest(args);
            case 3 -> BackendInformation(args);
                
        }
   }//end of method

public static void ZodiacDictionary(String[] args) throws IOException {
    //Backend handling
            PrintWriter backend = null;
        try {
            backend = new PrintWriter(new FileWriter("C:\\Users\\ender\\OneDrive\\Desktop\\Python Projects\\JavaScript-Projects-classwork\\Zodiac_Data", true));
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file could not be created or opened.");
        } 
    //Text Box
    String[] options ={"Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagittarius","Capricorn","Aquarius","Pisces"};
    Object select = JOptionPane.showInputDialog(null,
        "<html><div style='width: 200px;'>" + "The 12 zodiac signs are divided into four elements (Fire, Earth, Air, Water) and three modalities (Cardinal, Fixed, Mutable), reflecting distinct personality traits based on birth date. They represent a 360-degree circle of life, starting with Aries (March) and ending with Pisces (February), used to analyze personality, compatibility, and life cycles." + "</div></html>",
        "Learn about Zodiac signs", JOptionPane.INFORMATION_MESSAGE, (Icon) scaledIcon, options, options[0]);

        if(select == null){
        DialogBox(args);
        return;
    }
        String selection = (String) select;
    //Switch for information about signs
        switch (selection) {
            case "Aries" -> {
                JOptionPane.showMessageDialog(null, """
                                                               Element: Fire 
                                                               Modality: Cardinal 
                                                               Notable Traits: Courageous, Optimistic, Honest, Independent, Aggressive 
                                                               Symbol: The Ram 
                                                               Known as the first sign of the zodiac, it represents the spark of life and new beginnings. \nFueled by passion and energy, they have drive to take risks, though it can also lead to a short temper or impulsive burnout.""","Learn about Zodiac signs",JOptionPane.INFORMATION_MESSAGE, (Icon) AriImage);
            if(backend != null){
                backend.println("You looked up information on: " + selection);
                backend.close();
            }
                                                               ZodiacDictionary(args);


            }

            case "Taurus" ->{JOptionPane.showMessageDialog(null, """
                                                               Element: Earth 
                                                               Modality: Fixed
                                                               Notable Traits: Dependable, patient, artistic, hard-working
                                                               Symbol: The Bull
                                                               Often called the builder, it represents the stage of life where we seek to ground ourselves and find security in the physical world.""","Learn about Zodiac signs",JOptionPane.INFORMATION_MESSAGE, (Icon)TauImage);
                                                                    if(backend != null){
                backend.println("You looked up information on: " + selection);
            }
                ZodiacDictionary(args);
            }

            case "Gemini" ->{JOptionPane.showMessageDialog(null, """
                                                               Element: Air 
                                                               Modality: Mutable
                                                               Notable Traits:Witty, curious, versatile, very emotional
                                                               Symbol: The Twins
                                                               Referred to as the messenger, Gemini reflects a rapid mental duality.""","Learn about Zodiac signs",JOptionPane.INFORMATION_MESSAGE, (Icon) GemImage);
                                                                    if(backend != null){
                backend.println("You looked up information on: " + selection);
            }
                                                               ZodiacDictionary(args);


            }

            case "Cancer" ->{JOptionPane.showMessageDialog(null, """
                                                               Element: Water
                                                               Modality: Cardinal
                                                               Notable Traits:initiator of emotion, action oriented, active caretaker,
                                                               Symbol: Crab
                                                               Well known for being deeply emotional, highly intuitive, and nuturing nature.""","Learn about Zodiac signs",JOptionPane.INFORMATION_MESSAGE, (Icon) CanImage);
                                                                   if(backend != null){
                backend.println("You looked up information on: " + selection);
            }
                                                               ZodiacDictionary(args);

            } 
            case "Leo" ->{JOptionPane.showMessageDialog(null, """
                                                               Element: Fire
                                                               Modality: Fixed
                                                               Notable Traits: Confident, generous, creative, dramatic
                                                               Symbol: Lion
                                                               Known for their bold leadership and charismatic nature.""","Learn about Zodiac signs",JOptionPane.INFORMATION_MESSAGE, (Icon) LeoImage);
                                                                    if(backend != null){
                backend.println("You looked up information on: " + selection);
            }
                                                               ZodiacDictionary(args);

            }
            case "Virgo" ->{JOptionPane.showMessageDialog(null, """
                                                               Element: Earth
                                                               Modality: Mutable
                                                               Notable Traits: Analytical, practical, reliable, detail-oriented
                                                               Symbol: The Maiden
                                                               Known for their methodical approach and focus on perfection.""","Learn about Zodiac signs",JOptionPane.INFORMATION_MESSAGE, (Icon) VirImage);
                                                                    if(backend != null){
                backend.println("You looked up information on: " + selection);
            }
                                                               ZodiacDictionary(args);

            }
            case "Libra" ->{JOptionPane.showMessageDialog(null, """
                                                               Element: Air
                                                               Modality: Cardinal
                                                               Notable Traits: Diplomatic, fair-minded, balanced, social
                                                               Symbol: The Scales
                                                               Known for their quest for harmony and justice.""","Learn about Zodiac signs",JOptionPane.INFORMATION_MESSAGE, (Icon) LibImage);
                                                                   if(backend != null){
                backend.println("You looked up information on: " + selection);
            }
                                                               ZodiacDictionary(args);

            }
            case "Scorpio" ->{JOptionPane.showMessageDialog(null, """
                                                               Element: Water
                                                               Modality: Fixed
                                                               Notable Traits: Passionate, secretive, determined, powerful
                                                               Symbol: The Scorpion
                                                               Known for their intense emotions and magnetic personality.""","Learn about Zodiac signs",JOptionPane.INFORMATION_MESSAGE, (Icon) ScoImage);
                                                                    if(backend != null){
                backend.println("You looked up information on: " + selection);
            }
                                                               ZodiacDictionary(args);

            }
            case "Sagittarius" ->{JOptionPane.showMessageDialog(null, """
                                                               Element: Fire
                                                               Modality: Mutable
                                                               Notable Traits: Optimistic, adventurous, honest, philosophical
                                                               Symbol: The Archer
                                                               Known for their love of freedom and exploration.""","Learn about Zodiac signs",JOptionPane.INFORMATION_MESSAGE, (Icon) SagImage);
                                                                   if(backend != null){
                backend.println("You looked up information on: " + selection);
            }
                                                               ZodiacDictionary(args);

            }
            case "Capricorn" ->{JOptionPane.showMessageDialog(null, """
                                                               Element: Earth
                                                               Modality: Cardinal
                                                               Notable Traits: Ambitious, disciplined, responsible, self-control
                                                               Symbol: The Goat
                                                               Known for their determination and practical wisdom.""","Learn about Zodiac signs",JOptionPane.INFORMATION_MESSAGE, (Icon) CapImage);
                                                                   if(backend != null){
                backend.println("You looked up information on: " + selection);
            }
                                                               ZodiacDictionary(args);

            }
            case "Aquarius" ->{JOptionPane.showMessageDialog(null, """
                                                               Element: Air
                                                               Modality: Fixed
                                                               Notable Traits: Independent, humanitarian, intellectual, eccentric
                                                               Symbol: The Water Bearer
                                                               Known for their innovative thinking and progressive vision.""","Learn about Zodiac signs",JOptionPane.INFORMATION_MESSAGE, (Icon) AquImage);
                                                                   if(backend != null){
                backend.println("You looked up information on: " + selection);
            }
                                                               ZodiacDictionary(args);

            }
            case "Pisces" ->{JOptionPane.showMessageDialog(null, """
                                                               Element: Water
                                                               Modality: Mutable
                                                               Notable Traits: Compassionate, artistic, sensitive, intuitive
                                                               Symbol: The Fish
                                                               Known for their empathy and imaginative nature.""","Learn about Zodiac signs",JOptionPane.INFORMATION_MESSAGE, (Icon) PisImage);
                                                                   if(backend != null){
                backend.println("You looked up information on: " + selection);
            }
                                                               ZodiacDictionary(args);
            }
        }//switch end
        
                    if(backend != null){
                backend.println("You looked up information on: " + selection);
                backend.close();
            }
}//method end

public static void Zodiac_Finder(String[] args) throws IOException {
        //Backend handling
            PrintWriter backend = null;
        try {
            backend = new PrintWriter(new FileWriter("C:\\Users\\ender\\OneDrive\\Desktop\\Python Projects\\JavaScript-Projects-classwork\\Zodiac_Data", true));
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file could not be created or opened.");
        } 
    //inputs and dialog box
    JTextField MonthField = new JTextField();
    JTextField DayField = new JTextField();

Object[] window ={
    "Enter your birthday month", MonthField,
    "Enter your birth day", DayField,
};

int option = JOptionPane.showConfirmDialog(null, window, "Find your Zodiac sign", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, (Icon) scaledIcon);

if(option == JOptionPane.CANCEL_OPTION){
    DialogBox(args);
}


    //inputs and parsing
    String MonthF, DayF;
    MonthF = MonthField.getText();
    DayF = DayField.getText();

    int Month, Day;
    Month = Integer.parseInt(MonthF);
    Day = Integer.parseInt(DayF);


    switch(Month){
        //selecting signs logic
        case 1 -> {       
        if(Day < 20 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Capricorn.");
            if(backend != null){
                backend.println("You found a Capricorn");
                backend.close();
            }
            Zodiac_Finder(args);
        
        }
        else if(Day >=20 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Aquarius.");
            if(backend != null){
                backend.println("You found a Aquarius");
                backend.close();
            }
            Zodiac_Finder(args);
        
        }
        else {
            JOptionPane.showMessageDialog(null,"Invalid day. Please enter a number between 1 and 31.","Error", JOptionPane.ERROR_MESSAGE);
            Zodiac_Finder(args);
        }
        }

        case 2 -> {
        if(Day < 20 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Aquarius.");
            if(backend != null){
                backend.println("You found a Aquarius");
                backend.close();
            }
            Zodiac_Finder(args);
        
        }
        else if(Day >=19 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Pisces.");
            if(backend != null){
                backend.println("You found a Pisces");
                backend.close();
            }
            Zodiac_Finder(args);
        
        }
        else {
            JOptionPane.showMessageDialog(null,"Invalid day. Please enter a number between 1 and 31.","Error", JOptionPane.ERROR_MESSAGE);
            Zodiac_Finder(args);
        }
    }

        case 3 ->{
        if(Day < 21 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Pisces.");
            if(backend != null){
                backend.println("You found a Pisces");
                backend.close();
            }
            Zodiac_Finder(args);
        }
        else if(Day >=21 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Aries.");
            if(backend != null){
                backend.println("You found a Aries");
                backend.close();
            }
            Zodiac_Finder(args);
        }
        else {
            JOptionPane.showMessageDialog(null,"Invalid day. Please enter a number between 1 and 31.","Error", JOptionPane.ERROR_MESSAGE);
            Zodiac_Finder(args);
        }
    }
        case 4 ->{
                    if(Day < 20 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Aries.");
            if(backend != null){
                backend.println("You found an Aries");
                backend.close();
            }
            Zodiac_Finder(args);
        }
        else if(Day >=20 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Taurus.");
            if(backend != null){
                backend.println("You found a Taurus");
                backend.close();
            }
            Zodiac_Finder(args);
        }
        else {
            JOptionPane.showMessageDialog(null,"Invalid day. Please enter a number between 1 and 31.","Error", JOptionPane.ERROR_MESSAGE);
            Zodiac_Finder(args);
        }
    }
        case 5 ->{
        if(Day < 20 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Taurus.");
            if(backend != null){
                backend.println("You found a Taurus");
                backend.close();
            }
            Zodiac_Finder(args);
        }
        else if(Day >=21 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Gemini.");
           if(backend != null){
                backend.println("You found a Gemini");
                backend.close();
            }
            Zodiac_Finder(args);
        }
        else {
            JOptionPane.showMessageDialog(null,"Invalid day. Please enter a number between 1 and 31.","Error", JOptionPane.ERROR_MESSAGE);
            Zodiac_Finder(args);
        }
    }
        case 6 ->{
        if(Day < 21 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Gemini.");
            if(backend != null){
                backend.println("You found a Gemini");
                backend.close();
            }
            Zodiac_Finder(args);
        }
        else if(Day >=21 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Cancer.");
            if(backend != null){
                backend.println("You found a Cancer");
                backend.close();
            }
            Zodiac_Finder(args);
        }
        else {
            JOptionPane.showMessageDialog(null,"Invalid day. Please enter a number between 1 and 31.","Error", JOptionPane.ERROR_MESSAGE);
            Zodiac_Finder(args);
        }
    }
        case 7 ->{
        if(Day < 23 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Cancer.");
            if(backend != null){
                backend.println("You found a Cancer");
                backend.close();
            }
            Zodiac_Finder(args);
        }
        else if(Day >=23 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Leo.");
            if(backend != null){
                backend.println("You found a Leo");
                backend.close();
            }
            Zodiac_Finder(args);
        }
        else {
            JOptionPane.showMessageDialog(null,"Invalid day. Please enter a number between 1 and 31.","Error", JOptionPane.ERROR_MESSAGE);
            Zodiac_Finder(args);
        }
    }
        case 8 ->{
        if(Day < 20 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Leo.");
            if(backend != null){
                backend.println("You found a Leo");
                backend.close();
            }
            Zodiac_Finder(args);
        }
        else if(Day >=20 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Virgo.");
            if(backend != null){
                backend.println("You found a Virgo");
                backend.close();
            }
            Zodiac_Finder(args);
        }
        else {
            JOptionPane.showMessageDialog(null,"Invalid day. Please enter a number between 1 and 31.","Error", JOptionPane.ERROR_MESSAGE);
            Zodiac_Finder(args);
        }
    }
        case 9 ->{
        if(Day < 20 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Virgo.");
            if(backend != null){
                backend.println("You found a Virgo");
                backend.close();
            }
            Zodiac_Finder(args);
        }
        else if(Day >=20 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Libra.");
            if(backend != null){
                backend.println("You found a Libra");
                backend.close();
            }
            Zodiac_Finder(args);
        }
        else {
            JOptionPane.showMessageDialog(null,"Invalid day. Please enter a number between 1 and 31.","Error", JOptionPane.ERROR_MESSAGE);
            Zodiac_Finder(args);
        }
    }
        case 10 ->{
            if(Day < 24 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Libra.");
            if(backend != null){
                backend.println("You found a Libra");
                backend.close();
            }
            Zodiac_Finder(args);
        }
        else if(Day >=24 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Scorpio.");
            if(backend != null){
                backend.println("You found a Scorpio");
                backend.close();
            }
            Zodiac_Finder(args);
        }
        else {
            JOptionPane.showMessageDialog(null,"Invalid day. Please enter a number between 1 and 31.","Error", JOptionPane.ERROR_MESSAGE);
            Zodiac_Finder(args);
        }
    }
        case 11 ->{
        if(Day < 21 && Day > 0){
            JOptionPane.showMessageDialog(null,"You're a Scorpio.");
            if(backend != null){
                backend.println("You found a Scorpio");
                backend.close();
            }
            Zodiac_Finder(args);
        }
        else if(Day >=21 && Day <=31){
            JOptionPane.showMessageDialog(null,"You're a Sagittarius.");
            if(backend != null){
                backend.println("You found a Sagittarius");
                backend.close();
            }
            Zodiac_Finder(args);
        }
        else {
            JOptionPane.showMessageDialog(null,"Invalid day. Please enter a number between 1 and 31.","Error", JOptionPane.ERROR_MESSAGE);
            Zodiac_Finder(args);
        }
    }

        case 12 ->{
        if(Day < 22 && Day > 0){
                    JOptionPane.showMessageDialog(null,"You're a Sagittarius.");
                    if(backend != null){
                backend.println("You found a Sagittarius");
                backend.close();
            }
                    Zodiac_Finder(args);
             }
        else if(Day >=22 && Day <=31){
                    JOptionPane.showMessageDialog(null,"You're a Capricorn.");
                    if(backend != null){
                backend.println("You found a Capricorn");
                backend.close();
            }
                    Zodiac_Finder(args);
                }
            else{
                JOptionPane.showMessageDialog(null,"Invalid day. Please enter a number between 1 and 31.","Error", JOptionPane.ERROR_MESSAGE);
                Zodiac_Finder(args);
            }

                }
      
            }//switch end
        }
        

    public static void CompatibilityTest(String[] args) throws IOException {
        //Backend handling
            PrintWriter backend = null;
        try {
            backend = new PrintWriter(new FileWriter("C:\\Users\\ender\\OneDrive\\Desktop\\Python Projects\\JavaScript-Projects-classwork\\Zodiac_Data", true));
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file could not be created or opened.");
        } 
            //Dialog box
      String[] options = new String[]{"Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn", "Aquarius", "Pisces"};
      JComboBox<String> Sign1 = new JComboBox<>(options);
      JComboBox<String> Sign2 = new JComboBox<>(options);
      Object[] window = new Object[]{"Enter your zodiac sign", Sign1, "Enter your partner's zodiac sign", Sign2};
      int option = JOptionPane.showConfirmDialog(null, window, "See how compatible you are with your partner!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, (Icon) scaledIcon);

      //Return to main menu
      if (option == 2 || option == -1) {
         DialogBox(args);
      }

      //inputs
      String sign1 = (String) Sign1.getSelectedItem();
      String sign2 = (String) Sign2.getSelectedItem();
      
      //Compatibility test logic
      switch (sign1) {
          case "Aries" -> {
          switch (sign2) {
              case "Leo", "Sagittarius", "Gemini", "Aquarius" -> {
                  JOptionPane.showMessageDialog(null,"Your signs are very compatible!");
                     if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                  CompatibilityTest(args);
              }
              case "Aries", "Libra", "Cancer", "Capricorn" -> {
                  JOptionPane.showMessageDialog(null,"Your signs are somewhat compatible.");
                      if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                  CompatibilityTest(args);
              }
              default -> {
                  JOptionPane.showMessageDialog(null,"Your signs are not compatible.");
                      if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                  CompatibilityTest(args);
              }
          }//inner switch end
          }//case end
          case "Taurus" -> {
              switch (sign2) {
                  case "Virgo", "Capricorn", "Cancer", "Pisces" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are very compatible!");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  case "Taurus", "Scorpio", "Leo", "Aquarius" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are somewhat compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  default -> {
                      JOptionPane.showMessageDialog(null,"Your signs are not compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
              }//inner switch end
          }//case end
          case "Gemini" -> {
              switch (sign2) {
                  case "Libra", "Aquarius", "Aries", "Leo" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are very compatible!");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  case "Gemini", "Sagittarius", "Virgo", "Capricorn" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are somewhat compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  default -> {
                      JOptionPane.showMessageDialog(null,"Your signs are not compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
              }//inner switch end
          }//case end
          case "Cancer" -> {
              switch (sign2) {
                  case "Taurus", "Virgo", "Pisces", "Scorpio" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are very compatible!");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  case "Cancer", "Leo", "Libra", "Aquarius" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are somewhat compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  default -> {
                      JOptionPane.showMessageDialog(null,"Your signs are not compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
              }//inner switch end
          }//case end
          case "Leo" -> {
              switch (sign2) {
                  case "Aries", "Sagittarius", "Gemini", "Libra" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are very compatible!");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  case "Leo", "Virgo", "Scorpio", "Pisces" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are somewhat compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  default -> {
                      JOptionPane.showMessageDialog(null,"Your signs are not compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
              }//inner switch end
          }//case end
          case "Virgo" -> {
              switch (sign2) {
                  case "Taurus", "Capricorn", "Cancer", "Scorpio" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are very compatible!");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  case "Virgo", "Aquarius", "Gemini", "Pisces" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are somewhat compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  default -> {
                      JOptionPane.showMessageDialog(null,"Your signs are not compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
              }//inner switch end
          }//case end
          case "Libra" -> {
              switch (sign2) {
                  case "Gemini", "Aquarius", "Leo", "Sagittarius" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are very compatible!");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  case "Libra", "Scorpio", "Aries", "Cancer" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are somewhat compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  default -> {
                      JOptionPane.showMessageDialog(null,"Your signs are not compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
              }//inner switch end
          }//case end
          case "Scorpio" -> {
              switch (sign2) {
                  case "Cancer", "Pisces", "Taurus", "Capricorn" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are very compatible!");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  case "Scorpio", "Gemini", "Leo", "Aquarius" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are somewhat compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  default -> {
                      JOptionPane.showMessageDialog(null,"Your signs are not compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
              }//inner switch end
          }//case end
          case "Sagittarius" -> {
              switch (sign2) {
                  case "Aries", "Leo", "Libra", "Aquarius" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are very compatible!");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  case "Sagittarius", "Virgo", "Gemini", "Pisces" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are somewhat compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  default -> {
                      JOptionPane.showMessageDialog(null,"Your signs are not compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
              }//inner switch end
          }//case end
          case "Capricorn" -> {
              switch (sign2) {
                  case "Taurus", "Virgo", "Scorpio", "Pisces" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are very compatible!");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  case "Capricorn", "Libra", "Cancer", "Aries" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are somewhat compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  default -> {
                      JOptionPane.showMessageDialog(null,"Your signs are not compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
              }//inner switch end
          }//case end
          case "Aquarius" -> {
              switch (sign2) {
                  case "Gemini", "Libra", "Aries", "Sagittarius" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are very compatible!");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  case "Aquarius", "Taurus", "Leo", "Scorpio" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are somewhat compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  default -> {
                      JOptionPane.showMessageDialog(null,"Your signs are not compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
              }//inner switch end
          }//case end
          case "Pisces" -> {
              switch (sign2) {
                  case "Cancer", "Scorpio", "Taurus", "Capricorn" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are very compatible!");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  case "Pisces", "Aries", "Libra", "Gemini" -> {
                      JOptionPane.showMessageDialog(null,"Your signs are somewhat compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
                  default -> {
                      JOptionPane.showMessageDialog(null,"Your signs are not compatible.");
                           if(backend != null){
                backend.println("You tested the compatibility of: "+ sign1 + sign2);
                backend.close();
            }
                      CompatibilityTest(args);
                  }
              }//inner switch end
          }//case end

          }//main switch end

                   


    

    //method
}

    public static void BackendInformation(String[] args)throws FileNotFoundException, IOException {
        try(Scanner infile = new Scanner(new FileReader("C:\\Users\\ender\\OneDrive\\Desktop\\Python Projects\\JavaScript-Projects-classwork\\Zodiac_Data"))){
            while(infile.hasNextLine()){
                String Data =infile.nextLine();
                System.out.println(Data);
            }
            JOptionPane.showMessageDialog(null,"Data has been printed to the terminal.");
            DialogBox(args);

        }
    }

    public static Icon getScaledIcon() {
        return scaledIcon;
    }

    public static void setScaledIcon(Icon scaledIcon) {
        Zodiac_project.scaledIcon = scaledIcon;
    }


}//class end
