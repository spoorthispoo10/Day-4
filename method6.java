class method6{
    public static int add (int x,int y){
        int ans=x+y;
        return ans; 
    }
    public static int add(int x,int y,int z){
        int ans =x+y+z;
        System.out.println("Sum is"+ans);
        return ans;
    }
    
    public static void main(String[]args){
        int res1=add(10,20);
        int res2=add(10,20,70);
        System.out.println(res1);
        System.out.println( res2);

    }
    }
