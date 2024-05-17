package exercice1;

public class TriTab
{
    private int[] tab;
    int temp;
    public TriTab(int[] tab)
    {
        this.tab=tab;
    }

    public int Min(int i, int j)
    {
        if (this.tab[i] >= this.tab[j])
        {
            return i;
        }
        else
        {
            return j;
        }
    }

    public void triBulle()
    {
        int m;
        boolean flag=true;
        while(flag)
        {
            flag=false;
            for (int i = 1; i < this.tab.length; i++)
            {
                if (i != Min(i, i-1))
                {
                    m=this.tab[i];
                    this.tab[i]=tab[i-1];
                    tab[i-1]=m;
                    flag=true;
                }
            }
        }
    }
    public void triSelection()
    {
        for (int i = 0; i < tab.length-1; i++)
        {
            int indice = i;
            for (int j = 1; j < tab.length; j++) {
                if (j != Min(indice, j)) {
                    indice=j;
                }
            }
            temp=tab[indice];
            tab[indice]=tab[i];
            tab[i]=temp;
        }
    }
    public void Afficher()
    {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            if (i != tab.length-1)
            {
                System.out.print(" - ");
            }
        }
    }
}
