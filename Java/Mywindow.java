import javax.swing.JFrame;

class Mywindow extends JFrame{

//constructor
    public Mywindow(){
        super.setTitle("My First form");
        super.setSize(400,400);
        super.setLocation(100,100);
        super.setVisible(true);
        System.out.println("this is constructor");
    } 
}
