public class myName {
    public static void main(String[] args) {
        int n=9;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
if(j==0 || j==n-1|| i==j &&i<=(n-1)/2 || i+j==n-1&& i<=(n-1)/2) //logic for M
{
    System.out.print("*");
}
            
            else{
System.out.print(" ");
            }
        }

        for(int j=0;j<n;j++)
        {
            System.out.print(" ");

if(j==0 || i==0&&j<(n-1)/2 || j==(n-1)/2 && i>0 && i<n-1 || i==n-1 && j<(n-1)/2) //logic for D
{
System.out.print("*");
}
        
        else{
System.out.print(" ");
        }
    }
 
     
for(int j=0;j<n;j++)
        {
            //System.out.print(" ");
            
if(j==0 &&i>0 || i==0 && j>0 && j<n-1 || j==n-1&& i>0 ||i==(n-1)/2) //logic for A

{
System.out.print("*");
}
        
        else{
System.out.print(" ");
        }
    }

System.out.print("  ");
    for(int j=0;j<n;j++)
    {
        //System.out.print(" ");
        
if(i==0|| j==0 || i==(n-1)/2) //logic for F

{
System.out.print("*");
}
    
    else{
System.out.print(" ");
    }
}

System.out.print("  ");
for(int j=0;j<n;j++)
    {
       //System.out.print("  ");
        
if(i==0 && j>0 && j<n-1|| j==(n-1)/2 && i<n-1 ||j==0&& i>(n-1)/2 &&i<n-1|| i==n-1&&j<(n-1)/2 &&j>0) //logic for J

{
System.out.print("*");
}
    
    else{
System.out.print(" ");
    }
}

for(int j=0;j<n;j++)
        {
           // System.out.print(" ");
            
if(j==0 &&i>0 || i==0 && j>0 && j<n-1 || j==n-1&& i>0 ||i==(n-1)/2) //logic for A

{
System.out.print("*");
}
        
        else{
System.out.print(" ");
        }
    }
System.out.print("  ");
    for(int j=0;j<n;j++)
    {
       // System.out.print(" ");
        
if(j==0 || i==n-1) //logic for L

{
System.out.print("*");
}
    
    else{
System.out.print(" ");
    }
}



        System.out.println();
    }
    
}
}