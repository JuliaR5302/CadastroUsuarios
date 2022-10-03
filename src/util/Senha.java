/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Geral
 */
public class Senha {
    public static String gerarSenhaTodos() {
int qtdeMaximaCaracteres = 8;
String[] caracteres = {"0", "1", "b", "2", "4", "5", "6", "7", "8",
"9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
"l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
"x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W",
"X", "Y", "Z", "%", "#", "@", "&", "*"};

StringBuilder senha = new StringBuilder();

for (int i = 0; i < qtdeMaximaCaracteres; i++) {
int posicao = (int) (Math.random() * caracteres.length);
senha.append(caracteres[posicao]);
}
return senha.toString();

}

public static String gerarMinusculo() {
int qtdeMaximaCaracteres = 8;
String[] caracteres = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
"l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
"x", "y", "z"};

StringBuilder senha = new StringBuilder();

for (int i = 0; i < qtdeMaximaCaracteres; i++) {
int posicao = (int) (Math.random() * caracteres.length);
senha.append(caracteres[posicao]);
}
return senha.toString();

}

public static String gerarMaiusculo() {
int qtdeMaximaCaracteres = 8;
String[] caracteres = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
"L", "M", "N"};

StringBuilder senha = new StringBuilder();

for (int i = 0; i < qtdeMaximaCaracteres; i++) {
int posicao = (int) (Math.random() * caracteres.length);
senha.append(caracteres[posicao]);
}
return senha.toString();

}

public static String gerarNumero() {
int qtdeMaximaCaracteres = 8;
String[] caracteres = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",};

StringBuilder senha = new StringBuilder();

for (int i = 0; i < qtdeMaximaCaracteres; i++) {
int posicao = (int) (Math.random() * caracteres.length);
senha.append(caracteres[posicao]);
}
return senha.toString();

}

public static String gerarCaracteres() {
int qtdeMaximaCaracteres = 8;
String[] caracteres = {"%", "#", "@", "&", "*"};

StringBuilder senha = new StringBuilder();

for (int i = 0; i < qtdeMaximaCaracteres; i++) {
int posicao = (int) (Math.random() * caracteres.length);
senha.append(caracteres[posicao]);
}
return senha.toString();

}
}