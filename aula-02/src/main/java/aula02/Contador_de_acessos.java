package aula02;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Contador_de_acessos {

	private static int contador;
	static Date date = new ArrayList<>();
	public static void Acessos(){
		
		contador +=1;
	}
	public static int get_Qtd_acessos() {
		return contador;
	}
	public static Object get_Dta_acesso() {
		ArrayList<String> datas;
		return datas.get(0);
	}
	public static String getHora() {
		DateFormat dateFormat = new SimpleDateFormat ("--/--/---- --:--:--");
		date = date = new Date(contador);
		ArrayList datas;
		datas.add(dateFormat.format(date));
		return dateFormat.format(date);
	}
	public static void main(String[] args){
		Contador_de_acessos.Acessos();
	}
}
