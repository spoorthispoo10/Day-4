class method5{
    public static int add (int x,int y){
        int ans=x+y;
        return ans; 
    }
    public static void add(int x,int y,int z){
        int  a =x+y+z;
        System.out.println("Sum is"+a);
    }
    
    public static void main(String[]args){
        int ans=add(20,30);
        System.out.println("Sum is"+ans);
        add(10,20,0);
    }
    }


