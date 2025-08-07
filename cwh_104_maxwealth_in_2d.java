public class cwh_104_maxwealth_in_2d {
    public static void main(String[] args){
        int[][] accounts = {
            {1, 2,3},
            {3,2,1},
            {4,5,6}
        };
        int maxWealth=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum += accounts[i][j];

            }
        }      if(sum > maxWealth){
            maxWealth=sum;
        }
        System.out.println("Maximum Wealth: " + maxWealth);
    }
        if(accounts.length==0 || accounts[0].length==0){
            System.out.println("No account information available.");
        }
        
    }
    
    

