import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;

import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.io.*;


public class RegisterFrame extends JFrame implements ActionListener
{
    JLabel message;
    JLabel nameLabel, dobLabel, genderLabel,yearofstudyLabel,prevper;
    JTextField nameField;
    JRadioButton genderMale, genderFemale;
    JRadioButton yearofstudyFirst,yearofstudySecond,yearofstudyThird,yearofstudyForth;
    ButtonGroup genderGroup;
    ButtonGroup yearofstudyGroup;
    JComboBox date;
    JComboBox month;
    JComboBox year;
    JLabel mailIdLabel, mobileNoLabel,addressLabel;
    JTextField mailIdField, mobileNoField, fatherField;
    JTextArea addressarea,gpa;
    JLabel fatherLabel, passwordLabel;
    JPasswordField passwordField;
    JLabel programLabel;
    JComboBox<String> programList;
    JLabel branchLabel, semesterLabel;
    JComboBox<String> branchList;
    JComboBox<Integer> semesterList;
    JButton registerButton,resetButton;
    Container container;
    JPanel panel;
    JLabel bg,img;
    ImageIcon image1,image2;
    private String dates[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
        = { "Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sep", "Oct", "Nov", "Dec" };
    private String years[]
        = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019","2020","2021","2022" };
    public RegisterFrame()
    {
        prevper = new JLabel();
// prevper label end
        nameField = new JTextField();
// gpa textfield
 gpa = new JTextArea();
// gpa textfield end
        image1=new ImageIcon("C:\\Users\\harikakushal\\OneDrive\\Desktop\\background1.jpg");
        bg = new JLabel(image1);
        bg.setSize(1700,1080);
        panel = new JPanel();
        image2 = new ImageIcon("C:\\Users\\harikakushal\\OneDrive\\Desktop\\anits22.jpg");
        panel.setSize(1700,100);
        img = new JLabel(image2);
  Border eb = BorderFactory.createEmptyBorder();//For setting the default border 
        message = new JLabel("STUDENT REGISTRATION FORM");
        message.setFont(new Font("Courier", Font.BOLD, 50));
        nameLabel = new JLabel("Student Name: ");
        nameLabel.setFont(new Font("Serif", Font.BOLD, 20));
        nameField = new JTextField();
 nameField.setBorder(eb);
        nameField.setFont(new Font("Serif", Font.BOLD, 20));
        dobLabel = new JLabel("DOB: ");
        dobLabel.setFont(new Font("Serif", Font.BOLD, 20));
        date = new JComboBox(dates);
        date.setFont(new Font("Serif", Font.BOLD, 20));
        month = new JComboBox(months);
        month.setFont(new Font("Serif", Font.BOLD, 20));
        year = new JComboBox(years);
        year.setFont(new Font("Serif", Font.BOLD, 20));
        yearofstudyLabel=new JLabel("Year");
        yearofstudyFirst=new JRadioButton(new AbstractAction("First"){
            public void actionPerformed(ActionEvent e){
                prevper.setVisible(true);
            prevper.setText("Inter Gpa: ");
            gpa.setVisible(true);
            }
            });
                    yearofstudySecond=new JRadioButton(new AbstractAction("Second"){
            public void actionPerformed(ActionEvent e){
                prevper.setVisible(true);
            prevper.setText("First Year Gpa: ");
            gpa.setVisible(true);
            }
            });
                    yearofstudyThird=new JRadioButton(new AbstractAction("Third"){
            public void actionPerformed(ActionEvent e){
                prevper.setVisible(true);
            prevper.setText("Second Year Gpa: ");
            gpa.setVisible(true);
            }
            });
                           yearofstudyForth=new JRadioButton(new AbstractAction("Forth"){
            public void actionPerformed(ActionEvent e){
                prevper.setVisible(true);
            prevper.setText("Third Year Gpa: ");
            gpa.setVisible(true);
            }
            });
            prevper.setFont(new Font("Serif", Font.BOLD, 20));
            gpa.setFont(new Font("Serif", Font.BOLD, 20));
       yearofstudyLabel.setFont(new Font("Serif", Font.BOLD, 20));
       // yearofstudyFirst=new JRadioButton("First");
        yearofstudyFirst.setFont(new Font("Serif", Font.BOLD, 20));
       // yearofstudySecond=new JRadioButton("Second");
        yearofstudySecond.setFont(new Font("Serif", Font.BOLD, 20));
      // yearofstudyThird=new JRadioButton("Third");
        yearofstudyThird.setFont(new Font("Serif", Font.BOLD, 20));
       // yearofstudyForth=new JRadioButton("Forth");
        yearofstudyForth.setFont(new Font("Serif", Font.BOLD, 20));
        yearofstudyGroup=new ButtonGroup();
        yearofstudyGroup.add(yearofstudyFirst);
        
        yearofstudyGroup.add(yearofstudySecond);
        yearofstudyGroup.add(yearofstudyThird);
        yearofstudyGroup.add(yearofstudyForth);
        genderLabel = new JLabel("Gender:");
        genderLabel.setFont(new Font("Serif", Font.BOLD, 20));
        genderMale = new JRadioButton("Male", true);
        genderMale.setFont(new Font("Serif", Font.BOLD, 20));
        genderFemale = new JRadioButton("Female");
        genderFemale.setFont(new Font("Serif", Font.BOLD,20));
        genderGroup = new ButtonGroup();
        genderGroup.add(genderMale);
        genderGroup.add(genderFemale);
        fatherLabel = new JLabel("Father Name:");
        fatherLabel.setFont(new Font("Serif", Font.BOLD,20));
        fatherField = new JTextField();
        fatherField.setFont(new Font("Serif", Font.BOLD, 20));
        fatherField.setBorder(eb);
        mobileNoLabel = new JLabel("Mobile No:");
        mobileNoLabel.setFont(new Font("Serif", Font.BOLD, 20));
        mobileNoField = new JTextField();
 mobileNoField.setFont(new Font("Serif", Font.BOLD, 20));
        mobileNoField.setBorder(eb);
        mailIdLabel = new JLabel("Mail Id:");
        mailIdLabel.setFont(new Font("Serif", Font.BOLD, 20)); 
        mailIdField = new JTextField();
 mailIdField.setFont(new Font("Serif", Font.BOLD, 20));
        mailIdField.setBorder(eb);
        passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Serif", Font.BOLD, 20)); 
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Serif", Font.BOLD, 20));
        passwordField.setBorder(eb);
        programLabel = new JLabel("Courses:");
        programLabel.setFont(new Font("Serif", Font.BOLD, 20)); 
        programList = new JComboBox<String>();
        programList.setFont(new Font("Serif", Font.BOLD, 20)); 
        programList.addItem("ME/M Tech.");
        programList.addItem("BE/B Tech.");   
        branchLabel = new JLabel("Branch:");
        branchLabel.setFont(new Font("Serif", Font.BOLD, 20)); 
        branchList = new JComboBox<String>();
        branchList.setFont(new Font("Serif", Font.BOLD, 20));
        branchList.addItem("Computer Science and Engineering in AI and ML");
        branchList.addItem("Computer Science and Engineering in Data Science");
        branchList.addItem("Computer Science and Engineering");
        branchList.addItem("Electronics and Communications Engineering");
        branchList.addItem("Information Technology");
        branchList.addItem("Electrical and Electronics Engineering");
        branchList.addItem("Civil Engineering");
 branchList.addItem("Chemical Engineering");
        semesterLabel = new JLabel("Semester:");
        semesterLabel.setFont(new Font("Serif", Font.BOLD, 20));
        semesterList = new JComboBox<>();
        semesterList.setFont(new Font("Serif", Font.BOLD, 20));
        semesterList.addItem(1);
        semesterList.addItem(2);
        addressLabel = new JLabel("Address:");
        addressLabel.setFont(new Font("Serif", Font.BOLD, 20));
        addressarea = new JTextArea();
        addressarea.setFont(new Font("Serif", Font.BOLD, 20));
        registerButton = new JButton("Register");
        registerButton.setFont(new Font("Serif", Font.BOLD, 20));
        registerButton.setBackground(Color.green);
        resetButton = new JButton("Reset");
        resetButton.setFont(new Font("Serif", Font.BOLD, 20));
        resetButton.setBackground(Color.orange);
        container = getContentPane();
        container.setLayout(null);
 setBounds();
        addComponents();
 
    }
 
    public void setBounds()
    {// prevper label bounds
 prevper.setBounds(720,600,200,30);
    // prevper label bounds end
    // gpa textfield bounds
        gpa.setBounds(950,600,400,30);
    // gpa textfield bounds end
        message.setBounds(400, 100, 1000, 50);
        nameLabel.setBounds(50, 180, 200, 30);
        nameField.setBounds(280, 180, 400, 30);
        fatherLabel.setBounds(720, 180, 200, 30);
        fatherField.setBounds(950, 180, 400, 30);
        dobLabel.setBounds(50, 240, 200, 30);
        date.setBounds(280,240,100,30);
        month.setBounds(380,240,160,30);
        year.setBounds(540,240,140,30);
        genderLabel.setBounds(720, 240, 200, 30);
        genderMale.setBounds(950, 240, 100, 30);
        genderFemale.setBounds(1080, 240, 200, 30);
        mobileNoLabel.setBounds(50, 300, 200, 30);
        mobileNoField.setBounds(280, 300, 400, 30);
        addressLabel.setBounds(720,300,200,30);
        addressarea.setBounds(950,300,400,150);
        mailIdLabel.setBounds(50, 360, 200, 30);
        mailIdField.setBounds(280, 360, 400, 30);
        passwordLabel.setBounds(50, 420, 200, 30);
        passwordField.setBounds(280, 420, 400, 30);
        programLabel.setBounds(50, 480, 200, 30);
        programList.setBounds(280, 480, 400, 30);
        branchLabel.setBounds(720, 480, 200, 30);
        branchList.setBounds(950, 480, 400, 30);
        yearofstudyLabel.setBounds(50,540,200,30);
        yearofstudyFirst.setBounds(280,540,180,30);
        yearofstudySecond.setBounds(490,540,180,30);
        yearofstudyThird.setBounds(280,600,180,30);
        yearofstudyForth.setBounds(490,600,180,30);
        semesterLabel.setBounds(720, 540, 200, 30);
        semesterList.setBounds(950, 540, 400, 30);
        registerButton.setBounds(480, 680, 200, 30);
        resetButton.setBounds(720, 680, 200, 30);
        registerButton.addActionListener(this);
        resetButton.addActionListener(this);

    }
 
    public void addComponents()
    {// prevper label add
 container.add(prevper);
    // prevper lable add end
    // gpa field add
        container.add(gpa);
        gpa.setVisible(false);
    // gpa field add end
        panel.add(img);
        bg.add(message);
        bg.add(nameLabel);
        bg.add(nameField);
        bg.add(dobLabel);
        bg.add(date);
        bg.add(month);
        bg.add(year);
        bg.add(genderLabel);
        bg.add(genderMale);
        bg.add(genderFemale);
        bg.add(fatherLabel);
        bg.add(fatherField);
        bg.add(mobileNoLabel);
        bg.add(mobileNoField);
        bg.add(mailIdLabel);
        bg.add(mailIdField);
        bg.add(passwordLabel);
        bg.add(passwordField);
        bg.add(programLabel);
        bg.add(programList);
        bg.add(branchLabel);
        bg.add(branchList);
        bg.add(yearofstudyLabel);
        bg.add(yearofstudyFirst);
        bg.add(yearofstudySecond);
        bg.add(yearofstudyThird);
        bg.add(yearofstudyForth);
        bg.add(semesterLabel);
        bg.add(semesterList);
        bg.add(addressLabel);
        bg.add(addressarea);
        bg.add(registerButton);
        bg.add(resetButton);
        bg.add(panel);
        container.add(bg);
    }
//To verify Names
public boolean CheckName(String s){
if(s.length()==0)return false;
char[] c=s.toCharArray();
int d=0;
for(char i:c){
if(i=='.')d++;
if(!Character.isAlphabetic(i))return false;
}
if(d>1)return false;
return true;
}

//To verify Number
public boolean CheckNum(String s){
char[] c=s.toCharArray();
if(s.length()!=10)return false;
for(char i:c){
if(!Character.isDigit(i))return false;
}
return true;
}
//To verify Mail Id using REGEX expression
public boolean CheckMail(String email){
if(email.length()==0)return false;
     else{  String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();}
    }
//To verify Password
   public boolean CheckP(String s1) {
if(s1.length()<8)
return false;
else
return true;}

// To reset Border color for correct Entries
public void resetB(){
Border res = BorderFactory.createEmptyBorder();
nameField.setBorder(res);
fatherField.setBorder(res);
mobileNoField.setBorder(res);
mailIdField.setBorder(res); 
passwordField.setBorder(res);
addressarea.setBorder(res);
}
public boolean Checkg(String gpa){
    if (gpa == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(gpa);
        if(d<0||d>10)return false;
        } catch (NumberFormatException nfe) {
            return false;
        }
        
        return true;
    
    }


public void actionPerformed(ActionEvent e)
 {
// For creating Border for Invalid entries
Border border = BorderFactory.createLineBorder(Color.RED,2);
  if (e.getSource() == registerButton) 
   {
String name=nameField.getText();
String fname=fatherField.getText();
String num=mobileNoField.getText();
String mail=mailIdField.getText();
String pass=new String (passwordField.getPassword());
String add=addressarea.getText();
String g=gpa.getText();
String h;
if(genderMale.isSelected())
    h="male";
else
h="female";
String zf;
if( yearofstudyFirst.isSelected())
    zf="1st year";
else if(yearofstudySecond.isSelected())
zf="2nd year";
else if(yearofstudyThird.isSelected())
zf="3rd year";
else
zf="4th year";
String str=branchList.getSelectedItem().toString();
String mtr= semesterList.getSelectedItem().toString();
String fan= date.getSelectedItem().toString();
String fin =month.getSelectedItem().toString();
String fen= year.getSelectedItem().toString();
String ntr= programList.getSelectedItem().toString();
if(!CheckName(name)){
JOptionPane.showMessageDialog(this ,"Invalid Name");  
resetB();
nameField.setBorder(border);
nameField.requestFocusInWindow();
}else if(!CheckName(fname)){
JOptionPane.showMessageDialog(this ,"Invalid Father Name"); 
resetB();
fatherField.setBorder(border); 
fatherField.requestFocusInWindow();
}else if(!CheckNum(num)){
JOptionPane.showMessageDialog(this ,"Invalid Mobile Number");
resetB();
mobileNoField.setBorder(border); 
mobileNoField.requestFocusInWindow();
}else if(!CheckMail(mail)){
JOptionPane.showMessageDialog(this ,"Invalid email Credentials");
resetB();
mailIdField.setBorder(border); 
//passwordField.setBorder(border);
mailIdField.requestFocusInWindow();
}
else if(!CheckP(pass)){
    JOptionPane.showMessageDialog(this ,"Invalid password Credentials");
resetB();
passwordField.setBorder(border);
passwordField.requestFocusInWindow();
}

else if(add.length()==0){
JOptionPane.showMessageDialog(this ,"Invalid Address");
resetB();
addressarea.setBorder(border); 
} 
else if(!Checkg(g)){
    JOptionPane.showMessageDialog(this ,"Invalid Gpa");
    resetB();
    gpa.setBorder(border);
    gpa.requestFocusInWindow();
    }
else {


try{
    FileWriter w= new FileWriter("Sam.txt",true);
    w.write("Name:"+name+"\n") ;
    w.write("Father Name:"+fname+"\n") ;
    w.write("DOB:"+fan+"\\"+fin+"\\"+fen+"\n");
    w.write("Gender:"+h+"\n");
    w.write("Mobile number:"+num+"\n") ;
    w.write("Address:"+add+"\n") ;
    w.write("Mail id:"+mail+"\n") ;
    w.write("Password"+pass+"\n") ;
    w.write("Course name:"+ntr+"\n");
    w.write("Branch name:"+str+"\n");
   w.write("Year of Study:"+zf+"\n");
   w.write("Semester:"+mtr+"\n");
   w.write("GPA:"+g+"\n");
   w.write("\n");
   
   
   
   
   

w.close();
JOptionPane.showMessageDialog(this ,"Data Saved Successfully");  
resetB();
}
catch(Exception ae)
{
    System.out.println(ae);
}


}
}

   
  if(e.getSource() == resetButton)
   {
    resetB();
    semesterList.setSelectedIndex(0);
    branchList.setSelectedIndex(0);
    programList.setSelectedIndex(0);
    date.setSelectedIndex(0);
    month.setSelectedIndex(0);
    year.setSelectedIndex(0);
    genderGroup.clearSelection();
    yearofstudyGroup.clearSelection();
    nameField.setText("");
    mailIdField.setText("");
    addressarea.setText("");
    mobileNoField.setText("");
    fatherField.setText("");
    passwordField.setText("");
    gpa.setText("");
   }
 }
  public static void main(String[] args)
    {
        RegisterFrame frame = new RegisterFrame();
        frame.setTitle("Student Register Form");
        frame.setVisible(true);
        frame.setBounds(500, 100, 500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
 
    }
}