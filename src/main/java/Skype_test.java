import org.sikuli.script.*;

import static org.sikuli.script.Commands.exists;

public class Skype_test {
    public static void main (String[] args) throws FindFailed {
    Screen s = new Screen();
//    do{s.click(image.Skype_DropDown);}
    while(s.exists(image.Skype_User) == null){s.doubleClick(image.Skype_DropDown);}
//    while(s.exists(image.Skype_User) == null);{s.type(Key.PAGE_UP);}
    if(exists(image.email_type)!=null){s.doubleClick(image.email_type);}
    else{ s.find(image.Skype_User); s.doubleClick(image.Skype_User);}
    }
}
