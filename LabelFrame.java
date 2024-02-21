
import java.awt.FlowLayout;
import javax.swing.Jframe;
import javax.swing.Jlabel;
import javax.swing.Swingconstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends Jframe{
    private Jlabel label1;
    private Jlabel label2;
    private Jlabel label3;
    
    public newClass(){
        super("testing Jlabel");
        setLayout(new FlowLayout());
        
        label1 = new Jlabel ( "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE MATO GROSSO");
        add (label1);
        
        icon if = new ImageIcon( getClass().getResource("ifmt.png"));
        label2 = new Jlabel ("if", ifmt, SwingConstants.LEFT);
        add(label2);
        
    }
}
