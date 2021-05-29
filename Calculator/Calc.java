package Calculator;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
class Calculator extends JFrame implements ActionListener 
{
	JTextField t;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,badd,bsub,bmul,bclr,bdel,beq,bdec;
	int a=0,res=0;
    int operator = 0;
	Calculator()
	{
		super("                        "+"Calculator");
		t=new JTextField();
		t.setBounds(30,40,300,30);
		add(t);
		b7=new JButton("7");
		b7.setBounds(40,100,50,40);
		b8=new JButton("8");
		b8.setBounds(120,100,50,40);
		b9=new JButton("9");
		b9.setBounds(200,100,50,40);
		bdiv=new JButton("/");
		bdiv.setBounds(280,100,50,40);
		
		b4=new JButton("4");
		b4.setBounds(40,160,50,40);
		b5=new JButton("5");
		b5.setBounds(120,160,50,40);
		b6=new JButton("6");
		b6.setBounds(200,160,50,40);
		bmul=new JButton("*");
		bmul.setBounds(280,160,50,40);
		b1=new JButton("1");
		b1.setBounds(40,220,50,40);
		b2=new JButton("2");
		b2.setBounds(120,220,50,40);
		b3=new JButton("3");
		b3.setBounds(200,220,50,40);
		bsub=new JButton("-");
		bsub.setBounds(280,220,50,40);
		b0=new JButton("0");
		b0.setBounds(40,280,50,40);
		bdec=new JButton(".");
		bdec.setBounds(120,280,50,40);
		badd=new JButton("+");
		badd.setBounds(200,280,50,40);
		beq=new JButton("=");
		beq.setBounds(280,280,50,40);
		bdel=new JButton("Delete");
		bdel.setBounds(50,350,110,30);
		bclr=new JButton("Clear");
		bclr.setBounds(190,350,120,30);
		 //add(t);
		 add(b7);
		 add(b8);
		 add(b9);
		 add(bdiv);
		 add(b4);
		 add(b5);
		 add(b6);
		 add(bmul);
		 add(b1);
		 add(b2);
		 add(b3);
		 add(bsub);
		 add(b0);
		 add(bdec);
		 add(badd);
		 add(beq);
		 add(bdel);
		 add(bclr);
		 setLayout(null);
		 setVisible(true);
		 setSize(500,500);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 b7.addActionListener(this);
		 b8.addActionListener(this);
		 b9.addActionListener(this);
		 bdiv.addActionListener(this);
		 b4.addActionListener(this);
		 b5.addActionListener(this);	
		 b6.addActionListener(this);
		 bmul.addActionListener(this);
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 b3.addActionListener(this);
		 bsub.addActionListener(this);
		 b0.addActionListener(this);
		 bdec.addActionListener(this);
		 badd.addActionListener(this);
		 beq.addActionListener(this);
		 bdel.addActionListener(this);
		 bclr.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b7)
		
			t.setText(t.getText().concat("7"));
		
		if(e.getSource()==b8)
			
			t.setText(t.getText().concat("8"));
		
           if(e.getSource()==b9)
			
			   t.setText(t.getText().concat("9"));
           
           if(e.getSource()==b4)
   			
			   t.setText(t.getText().concat("4"));
           
           if(e.getSource()==b5)
   			
			   t.setText(t.getText().concat("5"));
           
           if(e.getSource()==b6)
   			
			   t.setText(t.getText().concat("6"));
           
           if(e.getSource()==b1)
   			
			   t.setText(t.getText().concat("1"));
           
           if(e.getSource()==b2)
   			
			   t.setText(t.getText().concat("2"));
           
           if(e.getSource()==b3)
      			
			   t.setText(t.getText().concat("3"));
           
           
           if(e.getSource()==b0)
   			
			   t.setText(t.getText().concat("0"));
           
           if(e.getSource()==bdec)
      			
			   t.setText(t.getText().concat("."));
           
            if(e.getSource()==badd)
           {
        	   
        	   a=Integer.parseInt(t.getText());
              
               operator=1;
               t.setText(a+"+");
               
            	
           }
           
           if(e.getSource()==bsub)
           {
      			
			   a=Integer.parseInt(t.getText());
               operator=2;
               t.setText(a+"-");
           }
           
           if(e.getSource()==bmul)
           {
      			
			   a=Integer.parseInt(t.getText());
               operator=3;
               t.setText(a+"*");
           }
           
           if(e.getSource()==bdiv)
           {
      			
			   a=Integer.parseInt(t.getText());
               operator=4;
               t.setText(a+"/");
           }
           
           if(e.getSource()==beq)
           {
        	   int fnum,lnum;
        	   String gn=t.getText();
        	   String a1,b1;
        	   
        	   
      			
			   //b=Integer.parseInt(t.getText());
               switch(operator)
               {
               case 1:
            	   a1=gn.substring(0,gn.indexOf("+"));//10
            	   b1=gn.substring(gn.indexOf("+")+1);
            	   fnum=Integer.parseInt(a1);
            	   lnum=Integer.parseInt(b1);
                       res=fnum+lnum;
                       a1="";
                       b1="";
                     break;
               case 2:
            	   a1=gn.substring(0,gn.indexOf("-"));//start,end
            	   b1=gn.substring(gn.indexOf("-")+1);
            	   fnum=Integer.parseInt(a1);
            	   lnum=Integer.parseInt(b1);
            	   res=fnum-lnum;
            	   a1="";
                   b1="";
            	   break;
               case 3:
            	   a1=gn.substring(0,gn.indexOf("*"));
            	   b1=gn.substring(gn.indexOf("*")+1);
            	   fnum=Integer.parseInt(a1);
            	   lnum=Integer.parseInt(b1);
            	   res=fnum*lnum;
            	   a1="";
                   b1="";
            	   break;
               case 4:
            	   a1=gn.substring(0,gn.indexOf("/"));
            	   b1=gn.substring(gn.indexOf("/")+1);
            	   fnum=Integer.parseInt(a1);
            	   lnum=Integer.parseInt(b1);
            	   res=fnum/lnum;
            	   a1="";
                   b1="";
            	   break;
              default:
            	  res=0;
               }
               t.setText(""+res);
           }
           if(e.getSource()==bclr)
        	   t.setText("");
           
           if(e.getSource()==bdel)
           {
        	   String s=t.getText();
        	   t.setText("");
        	   for(int i=0;i<s.length()-1;i++)
        		   t.setText(t.getText()+s.charAt(i));//""+'a'
           }
		
	
	}

}
public class Calc
{
	public static void main(String args[])
	{
		new Calculator();
	}
}
