class ArrayAsArgument
  {
     void add (int a[])
        {
          int sum = 0;
            for(int i=0;i<a.length;i++)
               {
                 sum = sum +a[i];
               }
                 System.out.println (sum);
               }
                 public static void main (String args [])
                   {
                     ArrayAsArgument a1 = new ArrayAsArgument ();
                        int x[] = { 10,20,30,40,50,60,70,80,90,100};
                        int y[] = {1,2,3,4,5,6,7,8,9};
                           a1.add(x);
                           a1.add(y);
           }
         }

