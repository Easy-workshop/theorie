using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace winform2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        
        
        //--------------------------------------
    void remplir_matrice(int[] list)
    {
    
    int colonne=1;
    int[,] histo = new int[24, 4];
    histo[]=


    }
        
        
        void Commencer(int[] list)
        {
            travaille(list, 0, list.Length - 1);
        }


        void echange(ref int a, ref int b)
        {
            if (a == b) return;
            a ^= b;
            b ^= a;
            a ^= b;
        }


        void travaille(int[] list, int current, int max)
        {
            int i;
            if (current == max)
            {

                foreach (var item in list)
                {
                  //  Console.Write(Convert.ToString(item));
                remplir_matrice(list);
                }
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
        
        
        //-------------------------------------
        
      private void button1_Click(object sender, EventArgs e)
        {
            Commencer(new int[] { 1, 2, 3, 4, 5 }); 
         
 


        }//fin bout
    }
}
