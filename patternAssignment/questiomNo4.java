

public class questiomNo4 {
    public static void main(String[] args) {
        
    
    int n=9;
    for(int i=0;i<n;i++)
    {
        
    for(int j=0;j<n;j++){
        if(j==0 || i==0 &&j<(n-1)/2 || j==(n-1)/2&& i<(n-1)/2 ||i==(n-1)/2&&j<(n-1)/2){
            System.out.print("*"); //for p logic
        }
        else{
            System.out.print(" ");
        }
    }
    

    for(int j=0;j<n;j++){
        if(j==0 || j==n-1 || i+j==n-1 && i>=(n-1)/2 ||i==j &&i>=(n-1)/2){
            System.out.print("*"); // for w logic
        }
        else{
            System.out.print(" ");
        }
    }
System.out.print("        "); //for s logic
    for(int j=0;j<n;j++){
        if(i==0 &&j<n-1 ||j==0&& i>0 && i<(n-1)/2 || i==(n-1)/2 && j<n-1 || j==n-1 &&i>=(n-1)/2 || i==n-1&&j<n-1){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    System.out.print("   ");
    for(int j=0;j<n;j++){
        if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2){
            System.out.print("*"); //logic for k
        }
        else{
            System.out.print(" ");
        }
    }

    
    
    for(int j=0;j<n;j++){


        if(i==0 || j==(n-1)/2 || i==n-1) //logic for I
        {
            System.out.print("*");
        }
        else{

            System.out.print(" ");
        }
    }

    System.out.print(" ");
    for(int j=0;j<n;j++){


        if(j==0 ||  i==n-1) //logic for L
        {
            System.out.print("*");
        }
        else{

            System.out.print(" ");
        }
    }

    System.out.print(" ");
 for(int j=0;j<n;j++){


        if(j==0 ||  i==n-1) //logic for L
        {
            System.out.print("*");
        }
        else{

            System.out.print(" ");
        }
    }
    System.out.print(" ");
    for(int j=0;j<n;j++){
        if(i==0 &&j<n-1 ||j==0&& i>0 && i<(n-1)/2 || i==(n-1)/2 && j<n-1 || j==n-1 &&i>=(n-1)/2 || i==n-1&&j<n-1){
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
