public class FirstDupChar {
    public static void main(String[] args){
        String r ="Roshani Wagh";
        char w[] = r.toCharArray();
        boolean end = false;

        for(int i=0; i<=w.length; i++){
            for (int j=i+1; j< w.length; j++){
                if(w[j]==w[i])
                {
                    System.out.print(w[i]);
                    end= true;
                }
            }
            if (end==true){
                break;
            }
        }
    }
}
