public class Program {

    public static void main(String[] args) {

        final int x=10;


        int  array [] ={4,5,2,10,3,8,7,6,9,1};

        for(int i=0;i<x;i=i+2)
        {
            System.out. println(array[i]);
        }


        for(int i=0;i<x;i++)
        {
            if(array[i]%2==0)
            {

                System.out. println(array[i]);
            }
        }


        for(int i=x-1;i>=0;i--)
        {

            System.out. println(array[i]);
        }





        System.out. println(array[0]+","+array[x-1]);



    }
}


