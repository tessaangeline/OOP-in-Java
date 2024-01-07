import java.io.*;
class Prime{
    public static void main(String args[]){
        try{
        FileInputStream f=new FileInputStream("a.txt");
        InputStreamReader in = new InputStreamReader(f);
        BufferedReader br=new BufferedReader(in);

        FileOutputStream fo=new FileOutputStream("b.txt");
        OutputStreamWriter out = new OutputStreamWriter(fo);
        BufferedWriter buf = new BufferedWriter(out);

        String numString;
        while((numString=br.readLine()) != null ){
            int num=Integer.parseInt(numString);
            int count=0;
            if(num <= 1){
                count=1;
            }
            else{
                for(int i=2;i*i<=num;i++){
                    if(num % i == 0){
                        count=1;
                        break;
                    }
                }
        
        if(count == 0){
            buf.write(String.valueOf(num));
            buf.write("\n");
        }
    
    }
    }
    buf.close();
    out.close();
    fo.close();
    br.close();
    in.close();
    f.close();
}catch( IOException e){
    System.out.println(e);
}

}
}
