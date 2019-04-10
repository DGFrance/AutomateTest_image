import org.sikuli.script.*;

public class test1 {


    public static void main(String[] args) throws FindFailed {
        Screen s = new Screen();
//        Pattern test1 = new Pattern(image.spotifyImage1);
//        Pattern test2 = new Pattern(image.spotifyImage2);
//        Pattern test3 = new Pattern(image.spotifyImage3);
//        Pattern test4 = new Pattern(image.spotifyImage4);
//        Pattern test5 = new Pattern(image.spotifyImage5);
        Pattern notepad1 = new Pattern(image.image1);
        Pattern notepad2 = new Pattern(image.image2);
//        s.find(test1);
//        s.click(test1);
//        s.find(test2);
//        s.click(test2);
//        s.find(test3);
//        s.click(test3);
//        s.find(test4);
//        s.click(test4);
//        s.find(test5);
//        s.doubleClick(test5);
        s.find(notepad1);
        s.doubleClick(notepad1);
        s.find(notepad2);
        s.type(notepad2,"Donny Gumelar France, Software Quality - Tester (Mitrais, 2/03/2019)");
    }
}
