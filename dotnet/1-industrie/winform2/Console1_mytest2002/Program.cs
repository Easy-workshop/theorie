using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Console1_mytest2002
{
    class Program
    {
       
        static void Main(string[] args)
        {
            double[] t1 = { 0.1, 1.6, 2.7, 3.5, 4.7, 5.7 };
            double somme = 0.0;
            int[] tabind = new int[6];
            int k=0;
            int nbr_barre = 0;
            int i = 0;
            while (i<=5)// foreach (int i in t1)
            {
               somme = somme + t1[i];
               if (somme <= 3.5)
               {

                   tabind[k] = i;
                   k++;
               }
               else
               {
                   i--;
                   somme = 0;
                   for (int p = 0; p <= k; p++)
                   {
                       t1[tabind[p]] = 0;

                   }//fin foreach p
                               
                   //nbr_barre++;
               }//fin else
               i++;
            }// fin boucle i globale

           
        }//fin static
    }
}
