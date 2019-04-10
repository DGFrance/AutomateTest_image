import org.sikuli.script.*;

public class auto_coding {

    public static void main(String[] args) throws FindFailed{

        Screen s = new Screen();
        Pattern Automating1 = new Pattern(image.Automate1);
        Pattern Automating2 = new Pattern(image.Automate2);
        Pattern Automating3 = new Pattern(image.Automate3);
        //Pattern Automating4 = new Pattern(image.PythonCode);
        s.doubleClick(Automating1);
        s.find(Automating2);
        s.paste(image.PythonCode);
        s.click(Automating3);
    }
}

