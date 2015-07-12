import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CalcularImc{

private int verificador = 0;
private double massa = 0;

public void calcularImc(){

try{

double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso, com casas decimais separadas por ponto"));
double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
verificador = Integer.parseInt(JOptionPane.showInputDialog("Digite um para 1 se você for homem e 2 se for mulher"));
DecimalFormat df = new DecimalFormat ("##.00");

massa = peso/(altura*altura);

if(verificador == 1){
if(massa < 20){ 
	JOptionPane.showMessageDialog(null, "CUIDADO!! Você está abaixo do peso.\n IMC:" + df.format(massa));
}
else if(massa >= 20 && massa <= 25.9){
	JOptionPane.showMessageDialog(null, "PARABÉNS!! Você está no peso ideal\n IMC:" + df.format(massa));
}
else if(massa >= 25 && massa < 29.9){
	JOptionPane.showMessageDialog(null, "CUIDADO!! Você está com sobrepeso, ou obesidade leve.\n IMC:" +df.format(massa));
}
else if(massa >= 30 && massa <= 42.9){
	JOptionPane.showMessageDialog(null, "CUIDADO!! Você esta com obesidade moderada\n IMC:" + df.format(massa));
}
else{
	JOptionPane.showMessageDialog(null, "CUIDADO!! Você está com obesidade morbida\n IMC:" + df.format(massa));
}
}

else {
if(massa < 19){ 
	JOptionPane.showMessageDialog(null, "CUIDADO!! Você está abaixo do peso.\n IMC:" + df.format(massa));
}
else if(massa >= 19 && massa <= 23.9){
	JOptionPane.showMessageDialog(null, "PARABÉNS!! Você está no peso ideal\n IMC:" + df.format(massa));
}
else if(massa >= 24 && massa < 28.9){
	JOptionPane.showMessageDialog(null, "CUIDADA!! Você está com sobrepeso, ou obesidade leve.\n IMC:" +df.format(massa));
}
else if(massa >= 29 && massa <= 38.9){
	JOptionPane.showMessageDialog(null, "CUIDADO!! Você esta com obesidade moderada\n IMC:" + df.format(massa));
}
else{
	JOptionPane.showMessageDialog(null, "CUIDADO!! Você está com obesidade morbida\n IMC:" + df.format(massa));
}


}
}catch(NumberFormatException exception){
JOptionPane.showMessageDialog(null,"No número inválido!\nEx: Use '.' ao invés de ',' para separar as casas decimais.","ERROR FATAL!!!",JOptionPane.ERROR_MESSAGE);
}
}
public static void main(String args[]){
CalcularImc imc = new CalcularImc();
imc.calcularImc();
} 

}




