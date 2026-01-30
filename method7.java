class method7{
    public static double add (double x,double y){
        double ans=x+y;
        System.out.println(ans);
        return ans; 
    }
    public static int add(int x,int y,int z){
        int ans =x+y+z;
        System.out.println("Sum is"+ans);
        return ans;
    }
    
    public static void main(String[]args){
        add(10,20);
        add(10,20,70);
        
    }
    }