using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace testindustrie
{


    public class Permute
    {
        public static int p = 0;
        public static int[,] matcombinaision = new int[24, 4];//matrice des combinaisons
        public static int[,] matsommeinit = new int[24, 4];//matrice des sommes intials
        public static int[,] matsommebarre = new int[24, 4];//matrice des barres
       
        public static int nbrpermutation=0;
        //------------my traitement----------------------------------------------
        public static void initiale()
        {

            int nbrelement;
            int largeur;
            int Hauteur;
            string saisie;

            Console.WriteLine("NBR ELEMENT : ");
            saisie = Console.ReadLine();
            int.TryParse(saisie, out nbrelement);

            Console.WriteLine("L : ");
            saisie = Console.ReadLine();
            int.TryParse(saisie, out largeur);
            Console.WriteLine("H : ");
            saisie = Console.ReadLine();
            int.TryParse(saisie, out Hauteur);



        }

        public static void afficher_somme_barre()
        {
            for (int p = 0; p < 24; p++)
            {
                for (int element = 0; element < 4; element++)
                {
                    Console.Write(matsommebarre[p, element]);

                }
                Console.WriteLine(" ");
            }
            Console.Read();
        }// fin affichier


        public static void calcul_somme_barre()
        {
            for (int i = 0; i < 24; i++)
            {

                int nbrdesommeparligne = 0;
                int k = 0;
                int l = 0;

                for (int j = 0; j < 4/*nbr d element d'une ligne ou combinaison*/; j++)
                {
                    while (nbrdesommeparligne < 2)//(4%2))
                    {
                        int partieimpaire = 0;
                        int partiepaire = 0;
                        int sommeelement = 0;
                        partieimpaire = matsommeinit[i, l];
                        l++;
                        partiepaire = matsommeinit[i, l];
                        sommeelement = partieimpaire + partiepaire;

                        if (sommeelement <= 6 /* précision 1 barre */ && sommeelement != 0)
                        {
                            matsommebarre[i, k] = sommeelement;
                        }//fin if
                        else
                        {
                            if (sommeelement != 0)
                            {
                                matsommebarre[i, k] = partieimpaire;
                                matsommebarre[i, k + 1] = partiepaire;
                            }//fin if
                        }// fin else
                        k++;
                        l++;
                        nbrdesommeparligne++;
                    }//fin while 

                    nbrdesommeparligne = 0;
                    k = 0;
                    l = 0;
                }//for j

            }// fin i

        }// fin calcul

        public static void afficher_matricedessommes()//matrice des sommes
        {
            for (int p = 0; p < 24; p++)
            {
                for (int element = 0; element < 4; element++)
                {
                    Console.Write(matsommeinit[p, element]);

                }
                Console.WriteLine(" ");
            }
            // Console.Read();
        }//fin
        public static void calcul_somme_intial()
        {

            for (int i = 0; i < 24; i++)
            {

                int nbrdesommeparligne = 0;
                int k = 0;
                int l = 0;
                while (nbrdesommeparligne < 2)//(4%2))
                {
                    int partieimpaire = 0;
                    int partiepaire = 0;

                    partieimpaire = matcombinaision[i, l];
                    l++;
                    partiepaire = matcombinaision[i, l];

                    matsommeinit[i, k] = partieimpaire + partiepaire;
                    k++;
                    l++;
                    nbrdesommeparligne++;
                }//fin while 


            }// fin i
        }//fin calcul_somme()
        public static void afficher_matricecombinaison()
        {
            for (int p = 0; p < 24; p++)
            {
                for (int element = 0; element < 4; element++)
                {
                    Console.Write(matcombinaision[p, element]);

                }
                Console.WriteLine(" ");
            }
            //      Console.Read();
        }//fin
        //--------------------------------------fin my traitement----------------

        public static void Commencer(int[] list)
        {
            travaille(list, 0, list.Length - 1);
        }
        public static void echange(ref int a, ref int b)
        {
            if (a == b) return;
            a ^= b;
            b ^= a;
            a ^= b;
            
        }
        public static void travaille(int[] list, int current, int max)
        {
            int i;
            if (current == max)
            {
                nbrpermutation++;
                int w = 0;
                foreach (var item in list)
                {
                    Console.Write(Convert.ToString(item));
                    //matcombinaision[p, w] = item;
                    w++;
                 }
                p++;

                Console.WriteLine(" ");
            }
            else
                for (i = current; i <= max; i++)
                {
                    echange(ref list[current], ref list[i]);
                    travaille(list, current + 1, max); // on descend
                    echange(ref list[current], ref list[i]);
                    
                }
        }
    }// fin classe Permute


    class Program
    {


        static void Main(string[] args)
        {

            //      Permute.initiale();



            //Permute.Commencer(new int[] { 1, 2, 3, 4,1,2,3,4,1,2,3,3});
            Permute.Commencer(new int[] { 1, 2, 3, 4, 5,6,7,8,9,10,11,12});
            Console.WriteLine("nbr de permutation est : ");
            Console.WriteLine(Permute.nbrpermutation.ToString());
            Permute.afficher_matricecombinaison();//mat des combinaison matcombinaision.
            /*
                Console.WriteLine();
                Console.WriteLine("---Matricedessommes---- ");
                Permute.calcul_somme_intial();
                Permute.afficher_matricedessommes();
                Permute.calcul_somme_barre();
                Console.WriteLine("---MatricedessommesBarre---- ");
                Permute.afficher_somme_barre();
            */
            Console.Read();
        }
    } // fin class
}
