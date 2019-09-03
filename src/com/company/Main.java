package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Bienvenue dans le jeux!!!");
        System.out.println("Veuillez choisir l'option:");
        System.out.println("1. Lancer un De");
        System.out.println("2. Question");



        // Je declare mes cartes avec des questions et les reponses

        String q1 = "Parmi ces constructeurs automobiles, lesquels sont originaires d'Europe ?\n"
                + "[a]Ford\n[b]Nissan\n[c]Citroën\n[d]Hundai\n";
                //+ "Geography\n"
                //+ "Bleu";

        String q2 = "Quel pays reçoit le plus grand nombre de demandes d'immigration de français ? \n"
                + "[a]La Russie\n[b] La Belgique\n[c]Les Etats-Unis\nv[d]Le Canada\n";
                //+ "Geography\n"
                //+ "Bleu";

        String q3 = "Dans l'histoire du cinéma, combien de films ont remporté 11 Oscars ? \n"
                +"[a] 1\n[b]2\n[c] 3\n[d]4";
        String q4 = "Dans quelle station de sports d'hiver les Bronzés ont-ils fait du ski ? \n"
                +"[a] Alpe d'Huez\nb] Tignes [c]\nLa Plagne\n[d] Val-d'Isere ";

        String q5 ="En 1936, combien de semaines de congés payés ont-elles été accordées aux Français ? \n"
                +"[a] 1 semaine\n[b] 2 semaines\n[c] 3 semaines\n[d] 4 semaines";
        String q6 = "Quelle île fut l'enjeu d'une lutte incessante entre les couronnes d'Angleterre et de France, de 1294 à 1630 ?\n"
                +"[a] Ouessant\nb] Belle-île\nc] Re\n[4] Croix";

        String q7 = "Quel personnage de la mythologie grecque est l'héroïne d'une tragédie composée par Sophocle et modernisée par Anouilh ? \n"
                +"[a] Andromede\n[b] Atalante\n[c] Medeee\n[d] Antigone";
        String q8 = "A quel célèbre portrait Marcel Duchamps a-t-il ajouté une moustache et une barbichette en 1919 ? \n"
                +"[a] La Joconde \n[b] La jeune fille à la perle \n[c] Portrait de Martin Luther \n[d] La Vénus d'Urbin";

        String q9 = "Comment appelle-t-on les jeunes moules élevées en mytiliculture ?\n"
                +"[a] Le barget \n[b] Le bouillon \n[c] Le naissain \n[d] Le vuttal";
        String q10 = "Dans quel pays africain le virus de la grippe aviaire a-t-il fait son apparition sur ce continent ? \n"
                +"[a] Congo [\nb] Kenya \n[c] Somalie \n[d] Nigeria";

        String q11 = "Dans quelle ville s'est déroulée la finale du Mondial de football 2002 ? \n"
                +"[a] Shanghai \n[b] Seoul \n[c] Manille \n[d] Tokyo ";
        String q12 = "Quelle partie du stade de Berlin a été vendue aux supporters après la finale de la Coupe du Monde de football 2006 ?\n"
                +"[a] Les sièges \n[b] Les filets des buts \n[c] La pelouse \n[d] Les éclairages";



        // je crée un scanner






        /* if (choixUtil == 1){
            System.out.println(a);
        }else{
            System.out.println("1.Gegraphy\n" +"2.Histoire\n"+"3.Divvertissement\n"+"4.Arts et Littérature\n"+"5.Sciences et Nature\n"+"6.Sports et Loisirs");
        }*/


        // je cree un tableau où je vais stocker mes cartes avec les questions,themes, couleurs et reponses

        Question[] questions = { // je cree un tableau

                new Question(q1,"c", "Geography", "Blue"),// je stock mes carte
                new Question(q2,"c", "Geography", "Bleu"),// "virgule" pour passer à la carte suivante
                new Question(q3,"a","Divertissement","Rose"),
                new Question(q4,"a","Divertissement","Rose"),
                new Question(q5,"d","Histoire","Jaune"),
                new Question(q6,"a","Histoire","Jaune"),
                new Question(q7,"b","Arts et Littérature","Violet"),
                new Question(q8,"a","Arts et Littérature","Violet"),
                new Question(q9,"d","Sciences et Nature","Vert"),
                new Question(q10,"a","Sciences et Nature","Vert"),
                new Question(q11,"b","Sport set Loisirs","Orange"),
                new Question(q12,"a","Sports et Loisirs","Orange")

        };

        test(questions);// j'appelle la méthode "test"*/





    }
    // je cree un nouveau methode pour afficher mes carte à l'utilisateur

    public static void test(Question[] questions){ // mes parrametres pour qu'il passe par le tableau des cartes
        int score = 0;// je declare ma variable "score" où je vais stocker les résultats

        Scanner clavier = new Scanner(System.in);// je crée le scanner


        System.out.print("Entrer : ");
        int choixUtil = clavier.nextInt();

        Random r = new Random(); //Fonction alléatoire
        int a = 1 + r.nextInt(7 - 1); // choisir un nombre alléatoir entre 1 et 6

        if (choixUtil == 1){
            System.out.println(a);
        }else{
            System.out.println("1.Gegraphy\n" +"2.Histoire\n"+"3.Divvertissement\n"+"4.Arts et Littérature\n"+"5.Sciences et Nature\n"+"6.Sports et Loisirs\n");

        }

        clavier = new Scanner(System.in);
        int choixTheme = clavier.nextInt();

        if (choixTheme ==1){
        }

        for (int i = 0; i<questions.length; i++){// je crée un boucle "for" pour qu'il passe à toutes les question
            System.out.println("Votre theme est:\n"+questions[i].theme);// j'affiche le théme
            System.out.println("Votre couleur est:\n"+questions[i].couleur);// j'affiche la couleur

            System.out.println("Votre question est:\n"+questions[i].question);// j'affiche la question
            String reponse = clavier.nextLine();// je stock l'entrée clavier utilisateur dans ma variable "réponse"

            if (reponse.equals(questions[i].reponse)){// si la réponse est égale à la bonne réponse question donnée
                score++;// le score passe à +1
            }
        }
        System.out.println("Vous avez repandu corectement à "+score+ "/"+questions.length);// si l'utilisateur répond correctement, j'affiche ........
    }
}
